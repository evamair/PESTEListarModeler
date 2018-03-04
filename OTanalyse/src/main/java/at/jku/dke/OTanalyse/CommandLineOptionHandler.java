/*
 * Copyright (c) 2017. All rights reserved. 
 *
 * @autor Mair Eva
 * 12.10.2017
 *
 */
package at.jku.dke.OTanalyse;

import org.apache.commons.cli.*;
import org.apache.log4j.Logger;


/**
 * The Class CommandLineOptionHandler.
 */
public class CommandLineOptionHandler {
	
	
	private static final Logger logger = Logger.getLogger(CommandLineOptionHandler.class);
	public static CommandLine cmd;
	
	/**
	 * @param args
	 * 		arguments
	 */
	public static void setUpCommandLineOptionHandler(String [] args){
		
		logger.info("Setting up command line options");
		
		
		Options options = new Options();
		
		Option graphPath = new Option("g", "graphPath", true, "RDF graph path");
		graphPath.setRequired(true);		
		options.addOption(graphPath);
		
		Option actor = new Option("a", "actor", true, "Actr for analyse");
		actor.setRequired(true);		
		options.addOption(actor);
		Option deleteOnly = new Option("d", "deleteOnly", true, "Only deleting the visualized Opportunities and Threats");
		deleteOnly.setRequired(true);		
		options.addOption(deleteOnly);
		
		
		CommandLineParser parser = new DefaultParser();
        HelpFormatter formatter = new HelpFormatter();
        cmd = null;
        
        try {
            cmd = parser.parse(options, args);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            formatter.printHelp("utility-name", options);

            System.exit(1);
  
        }
        

		
	}
	
	

}
