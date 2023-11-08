package alextabitha.nausicaa;

import net.fabricmc.api.ClientModInitializer;

public class NausicaaClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        Nausicaa.LOGGER.info("Hello Fabric world!");
    }
}
