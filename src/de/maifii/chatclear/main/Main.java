package de.maifii.chatclear.main;

import de.maifii.chatclear.commands.ClearCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("");
        Bukkit.getConsoleSender().sendMessage("<------------------------------------------------------------------>");
        Bukkit.getConsoleSender().sendMessage("");
        Bukkit.getConsoleSender().sendMessage("§eChatClear §7| Das §ePlugin §7wurde erfolgreich geladen!");
        Bukkit.getConsoleSender().sendMessage("");
        Bukkit.getConsoleSender().sendMessage("§eChatClear");
        Bukkit.getConsoleSender().sendMessage("§eCoder: §7Maifii");
        Bukkit.getConsoleSender().sendMessage("§eVersion: §71.0");
        Bukkit.getConsoleSender().sendMessage("§eDiscord: §7MaifiiDE#3511");
        Bukkit.getConsoleSender().sendMessage("");
        Bukkit.getConsoleSender().sendMessage("<------------------------------------------------------------------>");
        Bukkit.getConsoleSender().sendMessage("");

        getCommand("cc").setExecutor(new ClearCommand());
    }


    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("");
        Bukkit.getConsoleSender().sendMessage("<------------------------------------------------------------------>");
        Bukkit.getConsoleSender().sendMessage("");
        Bukkit.getConsoleSender().sendMessage("§eChatClear §7| Das §ePlugin §7wurde deakktiviert!!");
        Bukkit.getConsoleSender().sendMessage("");
        Bukkit.getConsoleSender().sendMessage("§eChatClear");
        Bukkit.getConsoleSender().sendMessage("§eCoder: §7Maifii");
        Bukkit.getConsoleSender().sendMessage("§eVersion: §71.0");
        Bukkit.getConsoleSender().sendMessage("§eDiscord: §7MaifiiDE#3511");
        Bukkit.getConsoleSender().sendMessage("");
        Bukkit.getConsoleSender().sendMessage("<------------------------------------------------------------------>");
        Bukkit.getConsoleSender().sendMessage("");
    }
}
