package com.mtstream.reverseplacement.event;

import com.mtstream.reverseplacement.ModTags;
import com.mtstream.reverseplacement.ReversePlacement;

import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraftforge.event.world.BlockEvent.EntityPlaceEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ReversePlacement.MOD_ID)
public class PlaceEvent {
	@SubscribeEvent
	public static void placeEvent(EntityPlaceEvent evt) {
		Level lev = (Level)evt.getWorld();
		BlockState state = evt.getState();
		if(!evt.getPlacedBlock().is(ModTags.Blocks.REVERSE_BLACK_LIST)) {
			for(Property<?> prop : evt.getPlacedBlock().getProperties()) {
				if(prop instanceof DirectionProperty&&evt.getEntity().isCrouching()&&!lev.isClientSide) {
					lev.setBlock(evt.getPos(), state.setValue((DirectionProperty)prop, state.getValue((DirectionProperty)prop).getOpposite()), 2);
					break;
				}
			}
		}
	}
}
