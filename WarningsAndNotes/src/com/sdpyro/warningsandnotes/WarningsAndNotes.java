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
	}
	
	@Override
	public void onDisable(){
		//TODO Insert logic to be performed when plugin is disabled.
		getLogger().info("WarningsAndNotes successfully stopped.");
	}
	/**
	 * onCommand at present only implements the /wan command, a simple HelloWorld print statement.
	 * 
	 * @param sender The user or object initiating the command.
	 * @param cmd The command being sent to the plugin.
	 */
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if((cmd.getName().equalsIgnoreCase("wan")) && (args==null)) {
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
		} /*else if((cmd.getName().equalsIgnoreCase("wan")) && (args[0].equalsIgnoreCase("reload"))){
			sender.sendMessage("Yes, this makes sense.");
			return true;
		}*/
		if(cmd.getName().equalsIgnoreCase("wan") && !(args==null)){
			for(int i=0;i<args.length;i++){
				sender.sendMessage(args[0]);
			}
		}
		return false;
	}

}
