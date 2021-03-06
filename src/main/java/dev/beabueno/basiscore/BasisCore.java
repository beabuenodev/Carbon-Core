package dev.beabueno.basiscore;

import dev.beabueno.basiscore.Commands.FeedCommand;
import dev.beabueno.basiscore.Commands.GamemodeCommand;
import dev.beabueno.basiscore.Commands.HealCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class BasisCore extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Basis Core has loaded! BETA ");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Basis Core has shut down successfully!");
    }

    public void registerCommands() {
        getCommand("gm").setExecutor(new GamemodeCommand());
        getCommand("feed").setExecutor(new FeedCommand());
        getCommand("heal").setExecutor(new HealCommand());
    }
}
