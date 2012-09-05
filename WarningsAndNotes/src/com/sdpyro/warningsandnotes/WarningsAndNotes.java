package com.sdpyro.warningsandnotes;

import org.bukkit.plugin.java.JavaPlugin;

public class WarningsAndNotes extends JavaPlugin {
	@Override
	public void onEnable(){
		//TODO Insert logic to be performed when plugin is enabled.
		getLogger().info("WarningsAndNotes onEnable invoked!");
	}
	
	@Override
	public void onDisable(){
		//TODO Insert loic to be performed when plugin is disabled.
		getLogger().info("WarningsAndNotes on Disabled invoked!");
	}

}
