/*
    Example
    Author: MCLegoMan
    Github: https://github.com/MCLegoMan/example-mod
    License: CC-BY 4.0
*/

package com.mclegoman.example.common.data;

import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExampleData {
    public static final String NAME = "Example";
    public static final String ID = "example";
    public static final Integer MAJOR_VERSION = 1;
    public static final Integer MINOR_VERSION = 0;
    public static final Integer PATCH_VERSION = 0;
    public static final String RELEASE_TYPE = "RELEASE";
    public static final Integer BUILD_VERSION = 1;
    public static final Boolean IS_DEVELOPMENT = RELEASE_TYPE != "RELEASE";
    public static final String VERSION = MAJOR_VERSION + "." + MINOR_VERSION + "." + PATCH_VERSION + "-" + RELEASE_TYPE.toLowerCase() + "." + BUILD_VERSION;
    public static final String PREFIX = "[" + NAME + " " + VERSION + "] ";
    public static final Logger LOGGER = LogManager.getLogger(NAME);
    public static final ModContainer MOD_CONTAINER = FabricLoader.getInstance().getModContainer(ID).get();
}