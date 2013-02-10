package com.sdpyro.warningsandnotes;
/**
 * A Warnings and Notes plugin for the Bukkit family of Minecraft servers.
 * @author balshazar
 * @author SDpyro
 * @version .01
 */
import org.bukkit.command.*;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.configuration.file.FileConfiguration;

public class WarningsAndNotes extends JavaPlugin {
		
	private FileConfiguration customConfig = null;
//	private File customConfigFile = null;
	
	
	@Override
	public void onEnable(){
		//TODO Insert logic to be performed when plugin is enabled.
		
		//We probably WANt to read values from the configuration file here.
		parseConfig();
		
		getLogger().info("WarningsAndNotes successfully started.");
		
		// Save a copy of the default config.yml if one is not there
		this.saveDefaultConfig();
	}//onEnable
	
	@Override
	public void onDisable(){
		//TODO Insert logic to be performed when plugin is disabled.
		getLogger().info("WarningsAndNotes successfully stopped.");
	}//onDisable
	/**
	 * onCommand at present only implements the /WAN command, a simple HelloWorld print statement.
	 * 
	 * @param sender The user or object initiating the command.
	 * @param cmd The command being sent to the plugin.
	 * @param label 
	 * @param args The arguments passed with the command.
	 */
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		boolean WAN = cmd.getName().equalsIgnoreCase("WAN");
		//Print help message
		if((WAN) && (args.length == 0)) {
			sender.sendMessage("WarningsAndNotes Command List\n" +
					   "/WAN - print this help message\n" +
					   "/WAN reload	- reload the WAN plugin\n" +
					   "/WAN stats [warnings|notes] - print total statistics, prints either warnings or notes statistics if given\n" +
					   "/twarns - Toggle the ability for users to view their warnings\n" +
					   "/warn user reason - Give user a warning because of reason\n" +
					   "/warnings [user] - If no arguments are given, view your own warnings. Otherwise view warnings of given user\n" +
					   "/notes [user] [delete] - View notes of either self or given user. If delete option is present then delete note for self or user\n" +
					   "/clearwarns user [id] - Clear warnings for user, or clear warning specified by id.\n" +
					   "/modifywarn user id - Modify user's warning given by id.\n\n" +
					   "For more help visit https://github.com/sdpyro/WarningsAndNotes !\n");
			return true;
		} else if((WAN) && (args.length == 1)){
			//Reload the plugin
			if (args[0].equalsIgnoreCase("reload")){
			    this.reloadConfig();
				sender.sendMessage("WarningsAndNotes reloaded.");
				return true;
			}
			
			if (args[0].equalsIgnoreCase("stats")){
				sender.sendMessage(aggregateStatistics());
				return true;
			}
			
			sender.sendMessage("Invalid command argument");
			return false;
			
		} else if((WAN && (args.length == 2))){
			if(args[0].equalsIgnoreCase("stats")){
				if(args[1].equalsIgnoreCase("warnings")){
					sender.sendMessage("This triggers warning statistics. Not Implemented yet.");
					return true;
				} else if (args[1].equalsIgnoreCase("notes")){
					sender.sendMessage("This triggers note statistics. Not Implemented Yet.");
					return true;
				}
				
				sender.sendMessage("Invalid command argument");
				return false;
			}//if stats with args
			
			sender.sendMessage("Invalid command argument");
			return false;
		}//if WAN with 3 args
		
		return false;
	}//onCommand
	
	private void parseConfig() {
		//TODO Parse the configuration file.
	}//praseConfig
	
	private String aggregateStatistics() {
		//TODO Grab statistics from both the Warnings and Notes YAML files.
		// This function should return a pretty printed string that we can
		// send to the command initiator.
		return "This functionality has not been implemented yet.";
	}

}//WarningsAndNotes
