package us.shirecraft.warptours.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import us.shirecraft.warptours.Constants;
import us.shirecraft.warptours.WarpTours;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TourCommand implements TabExecutor {
    public TourCommand(WarpTours plugin) {
        _plugin = plugin;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, Command cmd, @NotNull String label, String[] arguments) {
        if (!cmd.getName().equalsIgnoreCase(Constants.TOUR_COMMAND)) {
            return false;
        }

        return true;
    }

    @Override
    public @Nullable List<String> onTabComplete(
            @NotNull CommandSender sender,
            @NotNull Command command,
            @NotNull String label,
            @NotNull String[] args
    ) {
        if (command.getName().equalsIgnoreCase(Constants.TOUR_COMMAND)
                && args.length <= 1) {
            if(sender instanceof Player) {
                return Arrays.asList("list", "reset");
            }
        }
        return Collections.emptyList();
    }

    private final WarpTours _plugin;
}
