
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ch.netquick.easysurvival.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EasysurvivalModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> SPAWNERSACTIVE = GameRules.register("spawnersActive", GameRules.Category.SPAWNING, GameRules.BooleanValue.create(false));
}
