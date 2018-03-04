/*
 * Copyright (c) 2017. All rights reserved. 
 *
 * @autor Mair Eva
 * 12.10.2017
 *
 */
package at.jku.dke.OTanalyse;


import java.util.ArrayList;

import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;
import org.apache.jena.query.ResultSetFormatter;
import org.apache.jena.rdf.model.InfModel;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.riot.RDFDataMgr;
import org.apache.log4j.Logger;

import at.jku.dke.Model.Factor;

/**
 * The Class QueryExecuter.
 */
public class QueryExecuter {
	
	private static final Logger logger = Logger.getLogger(QueryExecuter.class);
	public static ArrayList<Factor> factors = new ArrayList<Factor>();
	public static String actor;

	/**
	 * Execute SPARQL query.
	 */
	public static void executeSPARQLQuery() {
		
		logger.info("Setting up and executing SPARQL query");
		
		String graphPath = CommandLineOptionHandler.cmd.getOptionValue("graphPath");
		actor = ":" + CommandLineOptionHandler.cmd.getOptionValue("actor");
		//String graphPath = "C:\temp\file_test.ttl";
		
		//String iStarSchemaPath = "C:\\temp\\schema\\iStarSchema.ttl";
		//String pestelSchemaPath= "C:\\temp\\schema\\pestelSchema.ttl";
		
				
		String pestelSchemaPath = "C:\\Users\\metaedit\\Documents\\MetaEdit+ 5.5\\PESTEListar\\schema\\pestelSchema.ttl";
		String iStarSchemaPath = "C:\\Users\\metaedit\\Documents\\MetaEdit+ 5.5\\PESTEListar\\schema\\iStarSchema.ttl";
		
		/*
		try {
			pestelSchemaPath = URLDecoder.decode(QueryExecuter.class.getResource("pestelSchema.ttl").getPath(), "UTF-8");
			iStarSchemaPath = URLDecoder.decode(QueryExecuter.class.getResource("iStarSchema.ttl").getPath(), "UTF-8");
			
		} catch (UnsupportedEncodingException e) {
			logger.info(e.getMessage());
		}
		*/
		
		//Load model (RDF graph and schema)
		Model model = RDFDataMgr.loadModel(graphPath);
		Model iStarSchema = RDFDataMgr.loadModel(iStarSchemaPath);
		Model pestelSchema = RDFDataMgr.loadModel(pestelSchemaPath);
		
		//Generate inference model
		InfModel schema = ModelFactory.createRDFSModel(iStarSchema, pestelSchema);		
		InfModel infModel = ModelFactory.createRDFSModel(schema, model);   		
		
		//Define query
		String queryString = "PREFIX rdf:   <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" +
				"PREFIX istar: <http://xmlns.com/istar/0.1/>" +
				"PREFIX swot: <http://xmlns.com/swot/0.1/>" +
				"PREFIX pestel: <http://xmlns.com/pestel/0.1/>" +
				"PREFIX : <http://example.org/>" +
				"SELECT ?elementInFactor ?classification " +
				"WHERE {" +
				"	?actor istar:relatedWith*/istar:wants ?goal." +
				"	?quality istar:qualifies ?goal." +
				"	{" +
				"	" + actor + " istar:relatedWith*/istar:wants ?hurtingElems." +
				"	?hurtingElems istar:hurts+ ?quality." +
				"	?hurtingElems istar:dependerOf+/istar:refines* ?elementInFactor." +
				"	?factor istar:wants ?elementInFactor." +
				"	BIND(swot:Threat AS ?classification)" +
				"	} UNION {" +
				"	" + actor + " istar:relatedWith*/istar:wants ?hurtingElems." +
				"	?hurtingElems istar:helps+ ?quality." +
				"	?hurtingElems istar:dependerOf+/istar:refines* ?elementInFactor." +
				"	?factor istar:wants ?elementInFactor." +
				"	BIND(swot:Opportunity AS ?classification)" +
				"	}" +
				"	" +
				"}	";
		
		//Execute SPARQL query
		Query query = QueryFactory.create(queryString);
		QueryExecution qexec = QueryExecutionFactory.create(query, infModel);
		ResultSet results = qexec.execSelect();
		//ResultSetFormatter.out(System.out, results, query);
				
		while(results.hasNext()){
			QuerySolution set = results.nextSolution();
			Factor f = new Factor(extractNameFromURI(set.get("elementInFactor").toString()), extractNameFromURI(set.get("classification").toString()));
			
			factors.add(f);
			
		}
		
		//printFactors();
		      
	}
	
	/**
	 * Prints the factors.
	 */
	public static void printFactors(){
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("For the actor \"" + actor + "\" the following factors have been found: " );
		System.out.println("-------------------------------------------------------------------------");
		
		for(Factor f : QueryExecuter.factors){
			System.out.printf("%-40s%s%n",f.getName(),f.getClassification());
		}
	}
	
	/**
	 * Extract name from URI.
	 *
	 * @param uri
	 *            the URI
	 * @return extracted name
	 */
	public static String extractNameFromURI(String uri){		
		int i = uri.lastIndexOf("/");		
		return uri.substring(i+1, uri.length()).replace('_', ' ');
	}
	

}
