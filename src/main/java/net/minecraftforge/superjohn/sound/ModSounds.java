package net.minecraftforge.superjohn.sound;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.superjohn.SUPERJOHN;

import static net.minecraftforge.registries.ForgeRegistries.SOUND_EVENTS;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, SUPERJOHN.MODID);


    public static final RegistryObject<SoundEvent> JOHN_SOUND = registerSoundEvents("john_sound");
    public static final RegistryObject<SoundEvent> IRIOS_SOUND = registerSoundEvents("irios_sound");

    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(SUPERJOHN.MODID, name)));
    }


    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
