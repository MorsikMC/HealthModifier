package me.morsik.hm;

import org.bukkit.plugin.java.JavaPlugin;

import lombok.Getter;
import me.morsik.hm.config.Settings;
import me.morsik.hm.events.HealthListener;

public class HealthModifier extends JavaPlugin {

	@Getter
	private static HealthModifier instance;

	@Override
	public void onEnable() {
		instance = this;

		Settings.init();

		getServer().getPluginManager().registerEvents(new HealthListener(), this);
	}

	@Override
	public void onDisable() {
		instance = null;
	}
}
