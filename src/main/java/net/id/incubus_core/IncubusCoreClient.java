package net.id.incubus_core;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.id.incubus_core.dev.DevInit;
import net.id.incubus_core.devel.IncubusDevel;
import net.id.incubus_core.util.Config;

import static net.id.incubus_core.IncubusCore.locate;

public class IncubusCoreClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        if(FabricLoader.getInstance().isDevelopmentEnvironment()) {
            IncubusDevel.initClient();
            if (Config.getBoolean(locate("devtools"), true))
                DevInit.clientInit();
        }
    }
    
}
