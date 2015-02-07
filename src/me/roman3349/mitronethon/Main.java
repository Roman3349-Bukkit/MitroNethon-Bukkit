package me.roman3349.mitronethon;

import java.util.logging.Level;
import java.util.logging.Logger;

import me.frostbitecz.frameworks.jcommands.CommandManager;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	Logger logger = Logger.getLogger("Minecraft");

	@Override
	public void onEnable() {
		CommandManager.registerCommands(this, new Commands(this));
		logger.log(Level.INFO, "[MitroNethon] Plugin byl aktivovan! ");
	}

	@Override
	public void onDisable() {
		logger.log(Level.INFO, "[MitroNethon] Plugin byl deaktivovan! ");
	}

}
