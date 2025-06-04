package com.example.suicideclean;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class SuicideClean extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin enabled
    }

    @Override
    public void onDisable() {
        // Plugin disabled
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            return true;
        }

        Player player = (Player) sender;
        String name = cmd.getName().toLowerCase();

        if (name.equals("suicide") || name.equals("kill") || name.equals("die") || name.equals("4") || name.equals("514")) {
            player.setHealth(0);
            return true;
        }

        return false;
    }
}