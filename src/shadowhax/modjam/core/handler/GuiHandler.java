package shadowhax.modjam.core.handler;

import shadowhax.modjam.block.Blocks;
import shadowhax.modjam.client.gui.RefinedTableGui;
import shadowhax.modjam.inventory.ContainerRefiningTable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {

		TileEntity tile_entity = world.getBlockTileEntity(x, y, z);

		switch (id) {

		case 1:
			return id == 1 && world.getBlockId(x, y, z) == Blocks.refiningTable.blockID ? new ContainerRefiningTable(player.inventory, world, x, y, z) : null;
		}
		return false;
	}

	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {

		TileEntity tile_entity = world.getBlockTileEntity(x, y, z);

		switch (id) {

		case 1:
			return id == 1 && world.getBlockId(x, y, z) == Blocks.refiningTable.blockID ? new RefinedTableGui(player.inventory, world, x, y, z) : null;
		}
		return null;
	}
}