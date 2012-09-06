package com.sdpyro.warningsandnotes;
/**
 * A Warnings and Notes plugin for the Bukkit family of Minecraft servers.
 * @author balshazar
 * @author sdpyro
 * @version .01
 * 
 * 
 */
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class WarningsAndNotes extends JavaPlugin {
	@Override
	public void onEnable(){
		//TODO Insert logic to be performed when plugin is enabled.
		getLogger().info("WarningsAndNotes successfully started.");
	}//onEnable
	
	@Override
	public void onDisable(){
		//TODO Insert logic to be performed when plugin is disabled.
		getLogger().info("WarningsAndNotes successfully stopped.");
	}//onDisable
	/**
	 * onCommand at present only implements the /wan command, a simple HelloWorld print statement.
	 * 
	 * @param sender The user or object initiating the command.
	 * @param cmd The command being sent to the plugin.
	 */
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		//Print help message
		if((cmd.getName().equalsIgnoreCase("wan")) && (args.length == 0)) {
			sender.sendMessage("WarningsAndNotes Command List\n" +
					   "/wan - print this help message\n" +
					   "/wan reload	- reload the wan plugin\n" +
					   "/wan stats [warnings|notes] - print total statistics, prints either warnings or notes statistics if given\n" +
					   "/twarns - Toggle the ability for users to view their warnings\n" +
					   "/warn user reason - Give user a warning because of reason\n" +
					   "/warnings [user] - If no arguments are given, view your own warnings. Otherwise view warnings of given user\n" +
					   "/notes [user] [delete] - View notes of either self or given user. If delete option is present then delete note for self or user\n" +
					   "/clearwarns user [id] - Clear warnings for user, or clear warning specified by id.\n" +
					   "/modifywarn user id - Modify user's warning given by id.\n\n" +
					   "For more help visit https://github.com/sdpyro/WarningsAndNotes !\n");
			return true;
		} else if((cmd.getName().equalsIgnoreCase("wan")) && (args.length == 1)){
			//Reload the plugin
			if (args[0].equalsIgnoreCase("reload")){
				sender.sendMessage("This triggers a plugin reload. Not implemented yet.");
				return true;
			}
			
			if (args[0].equalsIgnoreCase("stats")){
				sender.sendMessage("This triggers plugin statistics. Not implemented yet.");
				return true;
			}
			
			sender.sendMessage("Invalid command argument");
			return false;
			
		} else if((cmd.getName().equalsIgnoreCase("wan") && (args.length == 2))){
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
		}//if wan with 3 args
		
		return false;
	}//onCommand

}//WarningsAndNotes
