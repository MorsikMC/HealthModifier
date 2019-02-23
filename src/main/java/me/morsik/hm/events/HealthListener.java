package me.morsik.hm.events;

import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerJoinEvent;

import me.morsik.hm.config.Settings;

@SuppressWarnings("deprecation")
public class HealthListener implements Listener {

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		final Player pl = e.getPlayer();
		final World w = pl.getWorld();

		pl.setMaxHealth(w.getName().equals(Settings.WORLD_NAME) ? Settings.HEARTS : Settings.DEFAULT);
	}

	@EventHandler
	public void onWorldChange(PlayerChangedWorldEvent e) {
		final Player pl = e.getPlayer();
		final World w = pl.getWorld();

		pl.setMaxHealth(w.getName().equals(Settings.WORLD_NAME) ? Settings.HEARTS : Settings.DEFAULT);
	}
}
