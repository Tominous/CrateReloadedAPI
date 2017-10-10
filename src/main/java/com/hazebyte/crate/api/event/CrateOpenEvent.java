package com.hazebyte.crate.api.event;

import com.hazebyte.crate.api.crate.Crate;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class CrateOpenEvent extends CrateActionEvent {

    public CrateOpenEvent(Crate crate, Player player) {
        super(crate, player);
    }

    public CrateOpenEvent(Crate crate, Player player, Location location) {
        super(crate, player, location);
    }
}
