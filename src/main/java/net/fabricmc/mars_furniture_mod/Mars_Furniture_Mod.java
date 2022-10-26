package net.fabricmc.mars_furniture_mod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.mars_furniture_mod.block.custom.ChairBlock;
import net.fabricmc.mars_furniture_mod.block.custom.TableBlock;
import net.minecraft.block.Material;
import net.minecraft.client.render.RenderLayer;
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
	public static final ChairBlock ACACIA_CHAIR = new ChairBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque());

	//BIRCH
	public static final TableBlock BIRCH_TABLE = new TableBlock(FabricBlockSettings.of(Material.WOOD));
	public static final ChairBlock BIRCH_CHAIR = new ChairBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque());

	//CRIMSON
	public static final ChairBlock CRIMSON_CHAIR = new ChairBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque());
	public static final TableBlock CRIMSON_TABLE = new TableBlock(FabricBlockSettings.of(Material.WOOD));

	//DARK OAK
	public static final ChairBlock DARK_OAK_CHAIR = new ChairBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque());
	public static final TableBlock DARK_OAK_TABLE = new TableBlock(FabricBlockSettings.of(Material.WOOD));

	//JUNGLE
	public static final ChairBlock JUNGLE_CHAIR = new ChairBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque());
	public static final TableBlock JUNGLE_TABLE = new TableBlock(FabricBlockSettings.of(Material.WOOD));

	//MANGROVE
	public static final ChairBlock MANGROVE_CHAIR = new ChairBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque());
	public static final TableBlock MANGROVE_TABLE = new TableBlock(FabricBlockSettings.of(Material.WOOD));


	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.

		//ACACIA
		Registry.register(Registry.BLOCK, new Identifier("mars_furniture_mod", "acacia_table"), ACACIA_TABLE);
        Registry.register(Registry.ITEM, new Identifier("mars_furniture_mod", "acacia_table"), new BlockItem(ACACIA_TABLE, new Item.Settings().group(ItemGroup.DECORATIONS)));

		Registry.register(Registry.BLOCK, new Identifier("mars_furniture_mod", "acacia_chair"), ACACIA_CHAIR);
        Registry.register(Registry.ITEM, new Identifier("mars_furniture_mod", "acacia_chair"), new BlockItem(ACACIA_CHAIR, new Item.Settings().group(ItemGroup.DECORATIONS)));
		BlockRenderLayerMap.INSTANCE.putBlock(Mars_Furniture_Mod.ACACIA_CHAIR, RenderLayer.getCutout());

		//BIRCH
		Registry.register(Registry.BLOCK, new Identifier("mars_furniture_mod", "birch_table"), BIRCH_TABLE);
        Registry.register(Registry.ITEM, new Identifier("mars_furniture_mod", "birch_table"), new BlockItem(BIRCH_TABLE, new Item.Settings().group(ItemGroup.DECORATIONS)));
		
		Registry.register(Registry.BLOCK, new Identifier("mars_furniture_mod", "birch_chair"), BIRCH_CHAIR);
        Registry.register(Registry.ITEM, new Identifier("mars_furniture_mod", "birch_chair"), new BlockItem(BIRCH_CHAIR, new Item.Settings().group(ItemGroup.DECORATIONS)));
		BlockRenderLayerMap.INSTANCE.putBlock(Mars_Furniture_Mod.BIRCH_CHAIR, RenderLayer.getCutout());

		//CRIMSON
		Registry.register(Registry.BLOCK, new Identifier("mars_furniture_mod", "crimson_table"), CRIMSON_TABLE);
        Registry.register(Registry.ITEM, new Identifier("mars_furniture_mod", "crimson_table"), new BlockItem(CRIMSON_TABLE, new Item.Settings().group(ItemGroup.DECORATIONS)));

		Registry.register(Registry.BLOCK, new Identifier("mars_furniture_mod", "crimson_chair"), CRIMSON_CHAIR);
        Registry.register(Registry.ITEM, new Identifier("mars_furniture_mod", "crimson_chair"), new BlockItem(CRIMSON_CHAIR, new Item.Settings().group(ItemGroup.DECORATIONS)));
		BlockRenderLayerMap.INSTANCE.putBlock(Mars_Furniture_Mod.CRIMSON_CHAIR, RenderLayer.getCutout());

		//DARK OAK
		Registry.register(Registry.BLOCK, new Identifier("mars_furniture_mod", "dark_oak_table"), DARK_OAK_TABLE);
        Registry.register(Registry.ITEM, new Identifier("mars_furniture_mod", "dark_oak_table"), new BlockItem(DARK_OAK_TABLE, new Item.Settings().group(ItemGroup.DECORATIONS)));

		Registry.register(Registry.BLOCK, new Identifier("mars_furniture_mod", "dark_oak_chair"), DARK_OAK_CHAIR);
        Registry.register(Registry.ITEM, new Identifier("mars_furniture_mod", "dark_oak_chair"), new BlockItem(DARK_OAK_CHAIR, new Item.Settings().group(ItemGroup.DECORATIONS)));
		BlockRenderLayerMap.INSTANCE.putBlock(Mars_Furniture_Mod.DARK_OAK_CHAIR, RenderLayer.getCutout());

		//JUNGLE
		Registry.register(Registry.BLOCK, new Identifier("mars_furniture_mod", "jungle_table"), JUNGLE_TABLE);
        Registry.register(Registry.ITEM, new Identifier("mars_furniture_mod", "jungle_table"), new BlockItem(JUNGLE_TABLE, new Item.Settings().group(ItemGroup.DECORATIONS)));

		Registry.register(Registry.BLOCK, new Identifier("mars_furniture_mod", "jungle_chair"), JUNGLE_CHAIR);
        Registry.register(Registry.ITEM, new Identifier("mars_furniture_mod", "jungle_chair"), new BlockItem(JUNGLE_CHAIR, new Item.Settings().group(ItemGroup.DECORATIONS)));
		BlockRenderLayerMap.INSTANCE.putBlock(Mars_Furniture_Mod.JUNGLE_CHAIR, RenderLayer.getCutout());

		//MANGROVE
		Registry.register(Registry.BLOCK, new Identifier("mars_furniture_mod", "mangrove_table"), MANGROVE_TABLE);
        Registry.register(Registry.ITEM, new Identifier("mars_furniture_mod", "mangrove_table"), new BlockItem(MANGROVE_TABLE, new Item.Settings().group(ItemGroup.DECORATIONS)));

		Registry.register(Registry.BLOCK, new Identifier("mars_furniture_mod", "mangrove_chair"), MANGROVE_CHAIR);
        Registry.register(Registry.ITEM, new Identifier("mars_furniture_mod", "mangrove_chair"), new BlockItem(MANGROVE_CHAIR, new Item.Settings().group(ItemGroup.DECORATIONS)));
		BlockRenderLayerMap.INSTANCE.putBlock(Mars_Furniture_Mod.MANGROVE_CHAIR, RenderLayer.getCutout());
		LOGGER.info("Hello Fabric world!");
	}
}
