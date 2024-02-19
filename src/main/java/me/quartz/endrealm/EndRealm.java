package me.quartz.endrealm;

import org.bukkit.plugin.java.JavaPlugin;

public final class EndRealm extends JavaPlugin {

    private static EndRealm instance;

    @Override
    public void onEnable() {
        instance = this;
    }

    @Override
    public void onDisable() {
    }

    public static EndRealm getInstance() {
        return instance;
    }
}
