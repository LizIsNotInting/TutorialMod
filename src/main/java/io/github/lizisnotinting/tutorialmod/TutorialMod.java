package io.github.lizisnotinting.tutorialmod;

import io.github.lizisnotinting.tutorialmod.init.ModItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static io.github.lizisnotinting.tutorialmod.TutorialMod.MOD_ID;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MOD_ID)
public class TutorialMod {
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "tutorialmod";

    public TutorialMod() {
        ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
