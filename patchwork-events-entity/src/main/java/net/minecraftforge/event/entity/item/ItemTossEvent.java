/*
 * Minecraft Forge, Patchwork Project
 * Copyright (c) 2016-2020, 2019-2020
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation version 2.1
 * of the License.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */

package net.minecraftforge.event.entity.item;

import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;

/**
 * Event that is fired whenever a player tosses (Q) an item or drag-n-drops a
 * stack of items outside the inventory GUI screens. Canceling the event will
 * stop the items from entering the world, but will not prevent them being
 * removed from the inventory - and thus removed from the system.
 */
// TODO: Call Location - ForgeHook#onPlayerTossEvent -> PlayerEntity#dropSelectedItem + PlayerEntity#dropItem
public class ItemTossEvent extends ItemEvent {
	private final PlayerEntity player;

	/**
	 * Creates a new event for ItemEntities tossed by a player.
	 *
	 * @param entityItem The ItemEntity being tossed.
	 * @param player The player tossing the item.
	 */
	public ItemTossEvent(ItemEntity entityItem, PlayerEntity player) {
		super(entityItem);
		this.player = player;
	}

	/**
	 * The player tossing the item.
	 */
	public PlayerEntity getPlayer() {
		return player;
	}
}
