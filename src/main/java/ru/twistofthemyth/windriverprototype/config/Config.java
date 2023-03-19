package ru.twistofthemyth.windriverprototype.config;

import lombok.Getter;
import lombok.experimental.Accessors;
import org.aeonbits.owner.ConfigFactory;


public class Config {
    private Config() {
        throw new IllegalAccessError();
    }

    @Getter
    @Accessors(fluent = true)
    private static final AppiumConfig APPIUM = ConfigFactory.create(AppiumConfig.class);
}
