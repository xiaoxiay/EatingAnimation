package ru.tpsd.eatinganimationmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.resources.Identifier;

public class EatingAnimationClientMod implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        FabricLoader.getInstance().getModContainer("eatinganimationid").ifPresent(mod ->
                ResourceManagerHelper.registerBuiltinResourcePack(
                        Identifier.withDefaultNamespace("supporteatinganimation"),
                        mod,
                        ResourcePackActivationType.DEFAULT_ENABLED
                ));
    }
}
