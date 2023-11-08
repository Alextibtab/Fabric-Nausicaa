package alextabitha.nausicaa;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import alextabitha.nausicaa.item.NausicaaItemGroups;
import alextabitha.nausicaa.item.NausicaaItems;

public class Nausicaa implements ModInitializer {
	public static final String MOD_ID = "nausicaa-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		NausicaaItemGroups.registerItemGroups();
		NausicaaItems.registerModItems();
	}
}