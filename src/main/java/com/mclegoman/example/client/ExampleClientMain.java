/*
    Example
    Author: MCLegoMan
    Github: https://github.com/MCLegoMan/example-mod
    License: CC-BY 4.0
*/

package com.mclegoman.example.client;

import com.mclegoman.example.common.data.ExampleData;
import net.fabricmc.api.ClientModInitializer;

public class ExampleClientMain implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		ExampleData.LOGGER.info(ExampleData.PREFIX + "Initializing Example Client");
	}
}