package me.roman3349.mitronethon;

import java.io.File;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import me.frostbitecz.frameworks.jcommands.CommandContext;
import me.frostbitecz.frameworks.jcommands.CommandHandler;
import me.roman3349.mitronethon.Main;

public class Commands {

	private Main plugin;

	public Commands(Main plugin) {
		this.plugin = plugin;
	}

	FileConfiguration config;
	File cfile;

	@CommandHandler(name = "event", minimumArgs = 0, maximumArgs = 0, description = "Teleport to warp event.", usage = "Write /event to teleport to warp event.", permission = "mitronethon.player", permissionMessage = "You do not have permissions.")
	public void eventCommand(Player player, CommandContext args) {
		player.chat("/warp event");
	}

	@CommandHandler(name = "mitro", minimumArgs = 0, maximumArgs = 0, description = "Teleport to warp mitro.", usage = "Write /mitro to teleport to warp mitro.", permission = "mitronethon.player", permissionMessage = "You do not have permissions.")
	public void mitroCommand(Player player, CommandContext args) {
		player.chat("/warp mitro");
	}

	@CommandHandler(name = "nethon", minimumArgs = 0, maximumArgs = 0, description = "Teleport to warp nethon.", usage = "Write /nethon to teleport to warp nethon.", permission = "mitronethon.player", permissionMessage = "You do not have permissions.")
	public void nethonCommand(Player player, CommandContext args) {
		player.chat("/warp nethon");
	}

	@CommandHandler(name = "admin", minimumArgs = 0, maximumArgs = 0, description = "Teleport to warp admin.", usage = "Write /admin to teleport to warp admin.", permission = "mitronethon.player", permissionMessage = "You do not have permissions.")
	public void adminCommand(Player player, CommandContext args) {
		player.chat("/warp admin");
	}

	@CommandHandler(name = "pvp", minimumArgs = 0, maximumArgs = 0, description = "Teleport to warp pvp.", usage = "Write /pvp to teleport to warp pvp.", permission = "mitronethon.player", permissionMessage = "You do not have permissions.")
	public void pvpCommand(Player player, CommandContext args) {
		player.chat("/warp pvp");
	}

	@CommandHandler(name = "doly", minimumArgs = 0, maximumArgs = 0, description = "Teleport to warp doly.", usage = "Write /doly to teleport to warp doly.", permission = "mitronethon.player", permissionMessage = "You do not have permissions.")
	public void dolyCommand(Player player, CommandContext args) {
		player.chat("/warp doly");
	}

	@CommandHandler(name = "obchod", minimumArgs = 0, maximumArgs = 0, description = "Teleport to warp obchod.", usage = "Write /obchod to teleport to warp obchod.", permission = "mitronethon.player", permissionMessage = "You do not have permissions.")
	public void obchodCommand(Player player, CommandContext args) {
		player.chat("/warp obchod");
	}

	@CommandHandler(name = "info", minimumArgs = 0, maximumArgs = 0, description = "Teleport to warp info.", usage = "Write /info to teleport to warp info.", permission = "mitronethon.player", permissionMessage = "You do not have permissions.")
	public void infoCommand(Player player, CommandContext args) {
		player.chat("/warp info");
	}

	@CommandHandler(name = "rush", minimumArgs = 0, maximumArgs = 0, description = "Teleport to warp rush.", usage = "Write /rush to teleport to warp rush.", permission = "mitronethon.player", permissionMessage = "You do not have permissions.")
	public void rushCommand(Player player, CommandContext args) {
		player.chat("/warp rush");
	}

	@CommandHandler(name = "server", minimumArgs = 0, maximumArgs = 0, description = "Teleport to warp server.", usage = "Write /server to teleport to warp server.", permission = "mitronethon.player", permissionMessage = "You do not have permissions.")
	public void serverCommand(Player player, CommandContext args) {
		player.chat("/warp server");
	}

	@CommandHandler(name = "vip", minimumArgs = 0, maximumArgs = 0, description = "Teleport to warp vip.", usage = "Write /vip to teleport to warp vip.", permission = "mitronethon.player", permissionMessage = "You do not have permissions.")
	public void vipCommand(Player player, CommandContext args) {
		player.chat("/warp vip");
	}

	@CommandHandler(name = "nabor", minimumArgs = 0, maximumArgs = 0, description = "Teleport to warp nabor.", usage = "Write /nabor to teleport to warp nabor.", permission = "mitronethon.player", permissionMessage = "You do not have permissions.")
	public void naborCommand(Player player, CommandContext args) {
		player.chat("/warp nabor");
	}

	@CommandHandler(name = "web", minimumArgs = 0, maximumArgs = 0, description = "Display website adress", usage = "Write /web to display webstite adress.", permission = "mitronethon.player", permissionMessage = "You do not have permissions.")
	public void webCommand(Player player, CommandContext args) {
		player.sendMessage(ChatColor.GREEN + "Nas web je: " + ChatColor.YELLOW
				+ plugin.getConfig().getString("website"));
	}

	@CommandHandler(name = "facebook", aliases = { "fb" }, minimumArgs = 0, maximumArgs = 0, description = "Display website adress", usage = "Write /web to display webstite adress.", permission = "mitronethon.player", permissionMessage = "You do not have permissions.")
	public void facebookCommand(Player player, CommandContext args) {
		player.sendMessage(ChatColor.BLUE + "Nas facebook je: "
				+ ChatColor.WHITE + plugin.getConfig().getString("website"));
	}

	@CommandHandler(name = "mitronethon", aliases = { "mn" }, minimumArgs = 0, maximumArgs = 0, description = "Display plugin info.", usage = "Write /event to display plugin info.", permission = "mitronethon.player", permissionMessage = "You do not have permissions.")
	public void mitronethonnethon(Player player, CommandContext args) {
		if (args.getArgs().size() == 0) {
			player.sendMessage(ChatColor.GRAY + "***** " + ChatColor.GREEN
					+ "MitroNethon plugin" + ChatColor.GRAY + " ****");
			player.sendMessage(ChatColor.GREEN + "Vytvoril: "
					+ ChatColor.YELLOW + "Roman3349");
			player.sendMessage(ChatColor.GREEN + "Verze: " + ChatColor.YELLOW
					+ plugin.getDescription().getVersion());
			if (player.hasPermission("mitronethon.admin")) {
				player.sendMessage(ChatColor.YELLOW + "Prikazy:");
				player.sendMessage(ChatColor.YELLOW + "/mn rl "
						+ ChatColor.AQUA + "- Reloaduje config");
				player.sendMessage(ChatColor.YELLOW + "/mn setweb "
						+ ChatColor.AQUA + "- Nastavi web");
				player.sendMessage(ChatColor.YELLOW + "/mn setfb "
						+ ChatColor.AQUA + "- Nastavi facebook stranku");
			}
		} else if (args.getArgs().get(0).equalsIgnoreCase("rl")
				|| args.getArgs().get(0).equalsIgnoreCase("reload")) {
			config = YamlConfiguration.loadConfiguration(cfile);
			player.sendMessage(ChatColor.GREEN + "Config byl uspesne");
		} else if (args.getArgs().get(0).equalsIgnoreCase("setweb")) {
			plugin.getConfig().set("website", args.getArgs().get(1));
			plugin.saveConfig();
		} else if (args.getArgs().get(0).equalsIgnoreCase("setfb")) {
			plugin.getConfig().set("facebook", args.getArgs().get(1));
			plugin.saveConfig();
		}
	}

}
