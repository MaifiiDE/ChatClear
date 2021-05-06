package de.maifii.chatclear.commands;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ClearCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;
            if(player.hasPermission("cc")) {
                if(args.length == 0) {
                    for(int i = 0; i <= 150; i++) {
                        Bukkit.broadcastMessage("");
                    }
                    player.playSound(player.getLocation(), Sound.ANVIL_BREAK, 1f, 1f);
                    Bukkit.broadcastMessage("§e»ChatClear §7| der Chat wurde von §e" + player.getName() + " §7geleert!");
                }else
                    player.sendMessage("§e»ChatClear §7| Bitte benutze §e/cc §7statt §e/cc " +args[0]);
            }else
                player.sendMessage("§e»ChatClear §7| Dazu hast du keine Berechtigung!");
        }else
            sender.sendMessage("§e»ChatClear §7| der Chat kann nur von einem Spieler geleert werden!");
        return false;
    }
}
