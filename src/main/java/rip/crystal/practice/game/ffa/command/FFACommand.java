package rip.crystal.practice.game.ffa.command;
/* 
   Made by cpractice Development Team
   Created on 27.11.2021
*/

import rip.crystal.practice.game.ffa.command.subcommands.FFAJoinCommand;
import rip.crystal.practice.game.ffa.command.subcommands.FFALeaveCommand;
import rip.crystal.practice.utilities.chat.CC;
import rip.crystal.practice.api.command.BaseCommand;
import rip.crystal.practice.api.command.Command;
import rip.crystal.practice.api.command.CommandArgs;
import org.bukkit.entity.Player;

public class FFACommand extends BaseCommand {

    public FFACommand() {
        new FFALeaveCommand();
        new FFAJoinCommand();
    }

    @Command(name = "ffa")
    @Override
    public void onCommand(CommandArgs commandArgs) {
        Player player = commandArgs.getPlayer();
        String[] args = commandArgs.getArgs();
        if (args.length == 0) {
            player.sendMessage(CC.translate(("&4/ffa leave &7- &fLeave FFA")));
            player.sendMessage(CC.translate(("&4/ffa join &7- &fJoin FFA")));
        }
    }
}
