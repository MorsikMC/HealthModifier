package me.morsik.hm.config;

public class Settings extends SimpleConfig {

	public Settings(String fileName) {
		super(fileName);
	}

	public static String WORLD_NAME;
	public static int HEARTS;
	public static int DEFAULT;

	private void onLoad() {
		WORLD_NAME = getString("world-name");
		HEARTS = getInt("hearts");
		DEFAULT = getInt("default");
	}

	public static void init() {
		new Settings("settings.yml").onLoad();
	}
}
