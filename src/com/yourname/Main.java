package com.yourname.morphplugin;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class MorphPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("MorphPlugin has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("MorphPlugin has been disabled!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            if (cmd.getName().equalsIgnoreCase("morph") && args.length > 0) {
                String mobName = args[0];
                // Logic to morph the player into the mob
                player.sendMessage("You morphed into " + mobName);
            } else if (cmd.getName().equalsIgnoreCase("player")) {
                // Logic to revert the player to normal
                player.sendMessage("You are now a normal player.");
            }
        }
        return false;
    }
}
