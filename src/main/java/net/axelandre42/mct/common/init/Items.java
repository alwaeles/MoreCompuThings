package net.axelandre42.mct.common.init;

import net.axelandre42.mct.MoreCompuThings;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class Items {
	
	public static void construct() {
	}
	
	private static void simpleRegister(Item item) {
		GameRegistry.registerItem(item, MoreCompuThings.MODID + ":" + item.getUnlocalizedName().substring(5));
	}
	
	public static void register() {
		
	}
}
