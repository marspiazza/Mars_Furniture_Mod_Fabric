package net.fabricmc.mars_furniture_mod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.mars_furniture_mod.block.custom.ChairBlock;
import net.fabricmc.mars_furniture_mod.block.custom.TableBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mars_Furniture_Mod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("mars_furniture_mod");

	//BLOCKS
	//ACACIA
	public static final TableBlock ACACIA_TABLE = new TableBlock(FabricBlockSettings.of(Material.WOOD));
	public static final ChairBlock ACACIA_CHAIR = new ChairBlock(FabricBlockSettings.of(Material.WOOD));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.

		//ACACIA
		Registry.register(Registry.BLOCK, new Identifier("mars_furniture_mod", "acacia_table"), ACACIA_TABLE);
        Registry.register(Registry.ITEM, new Identifier("mars_furniture_mod", "acacia_table"), new BlockItem(ACACIA_TABLE, new Item.Settings().group(ItemGroup.DECORATIONS)));

		Registry.register(Registry.BLOCK, new Identifier("mars_furniture_mod", "acacia_chair"), ACACIA_CHAIR);
        Registry.register(Registry.ITEM, new Identifier("mars_furniture_mod", "acacia_chair"), new BlockItem(ACACIA_CHAIR, new Item.Settings().group(ItemGroup.DECORATIONS)));

		LOGGER.info("Hello Fabric world!");
	}
}
