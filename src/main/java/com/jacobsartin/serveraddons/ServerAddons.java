package com.jacobsartin.serveraddons;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServerAddons implements ModInitializer{
    public static final Logger LOGGER = LoggerFactory.getLogger("deepslategen");

    @Override
    public void onInitialize() {
        //runs as soon as minecraft is ready to load mods

        LOGGER.info("Server Addons Printed This");


    }
}
