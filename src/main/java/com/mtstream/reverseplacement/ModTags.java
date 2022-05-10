package com.mtstream.reverseplacement;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
	public static class Blocks{
		public static final TagKey<Block> REVERSE_BLACK_LIST = tag("reverse_black_list");
		private static TagKey<Block> tag(String name){
			return BlockTags.create(new ResourceLocation(ReversePlacement.MOD_ID, name));
		}
	}
}
