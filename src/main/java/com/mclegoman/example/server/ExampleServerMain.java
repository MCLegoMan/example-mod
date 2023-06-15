/*
    Example
    Author: MCLegoMan
    Github: https://github.com/MCLegoMan/example-mod
    License: CC-BY 4.0
*/

package com.mclegoman.example.server;

import com.mclegoman.example.common.data.ExampleData;
import net.fabricmc.api.DedicatedServerModInitializer;

public class ExampleServerMain implements DedicatedServerModInitializer {
	@Override
	public void onInitializeServer() {
		ExampleData.LOGGER.info(ExampleData.PREFIX + "Initializing Example Server");
	}
}