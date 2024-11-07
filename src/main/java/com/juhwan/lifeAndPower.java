package com.juhwan;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class LifeAndPower extends JavaPlugin {

    @Override
    public void onEnable() {
        // 플러그인이 켜질 때 실행되는 부분
        getLogger().info("LifeAndPower 플러그인이 활성화되었습니다!");
    }

    @Override
    public void onDisable() {
        // 플러그인이 꺼질 때 실행되는 부분
        getLogger().info("LifeAndPower 플러그인이 비활성화되었습니다!");
    }

    @Override
    public  boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("골드")) {
            if (sender instanceof  Player) {
                Player player = (Player) sender;
                int gold = getPlayerGold(player); //플레이어의 소지금을 가져오는 메서드 (임시로 고정값 사용가능)
                player.sendMessage("소지금: " + gold + " 골드");
            } else {
                sender.sendMessage("이 명령어는 플레이어만 사용할 수 있습니다.");
            }
            return true;
        }
        return false;
    }

    //임시로 플레이어의 소지금을 반환하는 메서드 (예시로 1000골드 설정)
    private int getPlayerGold(Player player) {
        return 1000;
    }
}
