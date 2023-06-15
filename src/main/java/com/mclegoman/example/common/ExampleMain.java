/*
    Example
    Author: MCLegoMan
    Github: https://github.com/MCLegoMan/example-mod
    License: CC-BY 4.0
*/

package com.mclegoman.example.common;

import com.mclegoman.example.common.data.ExampleData;
import net.fabricmc.api.ModInitializer;

public class ExampleMain implements ModInitializer {
	@Override
	public void onInitialize() {
		ExampleData.LOGGER.info(ExampleData.PREFIX + "Initializing Example Common");
	}
}