package us.shirecraft.warptours;

import org.bukkit.plugin.java.JavaPlugin;
import us.shirecraft.warptours.commands.TourCommand;

public class WarpTours extends JavaPlugin {
    @Override
    public void onEnable() {
        setUpCommands();
        getLogger().info("Warp tours plugin has been enabled");
    }

    @Override
    public void onDisable() {
        getLogger().info("Warp tours plugin has been disabled");
    }

    private void setUpCommands() {
        var sgCommand = getCommand(Constants.TOUR_COMMAND);
        if(sgCommand != null) {
            sgCommand.setExecutor(new TourCommand(this));
        }
    }
}
