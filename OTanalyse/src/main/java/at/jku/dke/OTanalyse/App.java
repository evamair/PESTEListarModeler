/*
 * Copyright (c) 2017. All rights reserved. 
 *
 * @autor Mair Eva
 * 12.10.2017
 *
 */
package at.jku.dke.OTanalyse;


import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * The Class with Main Method.
 */
public class App{
	
	private static final Logger logger = Logger.getLogger(App.class);	
	
    /**
	 * The main method.
	 *
	 * @param args
	 *            tree arguments needed:
	 *            -g graph path to RDF file
	 *            -a actor for analysis
	 *            -d delete only
	 *            
	 */
	public static void main( String[] args ){  	
		BasicConfigurator.configure();
		Logger.getRootLogger().setLevel(Level.INFO);

		//https://stackoverflow.com/questions/4281068/turn-off-the-output-stream
		PrintStream out = System.out;
		System.setOut(new PrintStream(new OutputStream() {
		    @Override public void write(int b) throws IOException {}
		}));
		try {
	    	logger.info("Command line will be assessed and handeled");   	
	    	CommandLineOptionHandler.setUpCommandLineOptionHandler(args);
	    	
	    	boolean deleteOnly = Boolean.valueOf(CommandLineOptionHandler.cmd.getOptionValue("deleteOnly"));
	    	
	    	if(!deleteOnly){
	    		logger.info("SPARQL Query will be executed");
	    		QueryExecuter.executeSPARQLQuery();
	    	}
	    	
	    	logger.info("Connecting to MetaEdit and Manipulate Graph");
	        MetaEditConnector.connectAndManipulateMetaEdit(deleteOnly);	        
		} finally {
		    System.setOut(out);
		}   	
    }

}
