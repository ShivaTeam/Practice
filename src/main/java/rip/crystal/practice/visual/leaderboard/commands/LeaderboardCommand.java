package rip.crystal.practice.visual.leaderboard.commands;

import rip.crystal.practice.visual.leaderboard.menu.LeaderBoardMenu;
import rip.crystal.practice.api.command.BaseCommand;
import rip.crystal.practice.api.command.Command;
import rip.crystal.practice.api.command.CommandArgs;
import org.bukkit.entity.Player;

public class LeaderboardCommand extends BaseCommand {

    @Command(name = "topelo", aliases = {"leaderboard"})
    @Override
    public void onCommand(CommandArgs commandArgs) {
        Player player = commandArgs.getPlayer();

        new LeaderBoardMenu(player).openMenu(player);
    }
}
