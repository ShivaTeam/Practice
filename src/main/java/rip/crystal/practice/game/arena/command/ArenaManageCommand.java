package rip.crystal.practice.game.arena.command;

import rip.crystal.practice.game.arena.menu.ArenaManagementMenu;
import rip.crystal.practice.api.command.BaseCommand;
import rip.crystal.practice.api.command.Command;
import rip.crystal.practice.api.command.CommandArgs;
import org.bukkit.entity.Player;


public class ArenaManageCommand extends BaseCommand {

    @Command(name = "arena.manage", permission = "cpractice.arena.admin")
    @Override
    public void onCommand(CommandArgs commandArgs) {
        Player player = commandArgs.getPlayer();
        String[] args = commandArgs.getArgs();

        new ArenaManagementMenu().openMenu(player);
    }
}
