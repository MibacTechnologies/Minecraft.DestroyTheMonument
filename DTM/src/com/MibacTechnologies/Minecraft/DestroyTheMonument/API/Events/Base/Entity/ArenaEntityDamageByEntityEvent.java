package com.MibacTechnologies.Minecraft.DestroyTheMonument.API.Events.Base.Entity;

import org.bukkit.entity.Entity;

import com.MibacTechnologies.Minecraft.DestroyTheMonument.Arena.Arena;

/**
 * @author Michał "mibac138" Bączkowski
 * @since Creation date: 31 Jan 2015 (16:09:30)
 */
public class ArenaEntityDamageByEntityEvent extends
		CancellableArenaTwoEntitiesEvent {
	public ArenaEntityDamageByEntityEvent( final Entity entity,
			final Entity entity2, final Arena arena ) {
		this( entity, entity2, arena, false );
	}

	public ArenaEntityDamageByEntityEvent( final Entity entity,
			final Entity entity2, final Arena arena, final boolean cancelled ) {
		super( entity, entity2, arena, cancelled );
	}
}
