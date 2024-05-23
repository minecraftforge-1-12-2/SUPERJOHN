package net.minecraftforge.superjohn.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.superjohn.SUPERJOHN;
import net.minecraftforge.superjohn.block.custom.IriosBlock;
import net.minecraftforge.superjohn.block.custom.JohnBlock;
import net.minecraftforge.superjohn.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SUPERJOHN.MODID);

    public static final RegistryObject<Block> JOHN_BLOCK = registerBlock("john_block", () -> new JohnBlock(BlockBehaviour.Properties.copy(Blocks.STONE).dynamicShape().noOcclusion()));
    public static final RegistryObject<Block> IRIOS_BLOCK = registerBlock("irios_block", () -> new IriosBlock(BlockBehaviour.Properties.copy(Blocks.STONE).dynamicShape().noOcclusion()));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
