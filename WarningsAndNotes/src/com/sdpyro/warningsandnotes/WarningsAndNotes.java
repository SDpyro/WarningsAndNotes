package com.sdpyro.warningsandnotes;
/**
 * A Warnings and Notes plugin for the Bukkit family of Minecraft servers.
 * @author balshazar
 * @author sdpyro
 * @version .01
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
		getLogger().info("WarningsAndNotes on Enable invoked!");
	}
	
	@Override
	public void onDisable(){
		//TODO Insert logic to be performed when plugin is disabled.
		getLogger().info("WarningsAndNotes on Disabled invoked!");
	}
	/**
	 * @param sender The user or object initiating the command.
	 * @param cmd The command being sent to the plugin.
	 */
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("wan")) {
			//If this command was not executed on the console then deny access
			if (!(sender instanceof ConsoleCommandSender)){
				sender.sendMessage("This command can only be run in the console.");
				getLogger().info("User "+sender+" attempted to use /wan in game.");
				return false;
			}
			sender.sendMessage("Hello World!");
			getLogger().info("User "+sender+" executed the /wan command");
			return false;
		}
		return false;
	}

}
