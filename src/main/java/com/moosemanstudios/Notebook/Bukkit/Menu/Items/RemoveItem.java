package com.moosemanstudios.Notebook.Bukkit.Menu.Items;

import ninja.amp.ampmenus.events.ItemClickEvent;
import ninja.amp.ampmenus.items.MenuItem;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 * Created by Chris on 1/19/2015.
 */
public class RemoveItem extends MenuItem {
	private static final String DISPLAY_NAME = ChatColor.RED + "Remove Note";
	private static final ItemStack ICON = new ItemStack(Material.PAPER);

	public RemoveItem() {
		super(DISPLAY_NAME, ICON);
	}

	@Override
	public void onItemClick(ItemClickEvent event) {
		if (event.getPlayer().hasPermission("notebook.remove")) {
			event.getPlayer().sendRawMessage("Open sub menu here");
			// TODO: open sub menu
		}
	}

	@Override
	public ItemStack getFinalIcon(Player player) {
		ItemStack finalIcon = super.getFinalIcon(player);
		if (!player.hasPermission("notebook.remove")) {
			finalIcon.setType(Material.AIR);
		}
		return finalIcon;
	}
}