package ru.twistofthemyth.windriverprototype.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources("classpath:config.properties")
public interface AppiumConfig extends Config {

    @Key("appium.app.name")
    String appName();

    @Key("appium.url")
    String url();
}
