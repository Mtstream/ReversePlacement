package com.mtstream.reverseplacement;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("reverse_placement")
public class ReversePlacement {
	
	public static final String MOD_ID = "reverse_placement";
	
	public ReversePlacement() {
		MinecraftForge.EVENT_BUS.register(this);
	}
}
