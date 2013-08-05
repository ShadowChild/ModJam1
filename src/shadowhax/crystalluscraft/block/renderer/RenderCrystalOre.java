package shadowhax.crystalluscraft.block.renderer;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import shadowhax.crystalluscraft.block.model.ModelCrystalStage1;

public class RenderCrystalOre extends TileEntitySpecialRenderer {

    private ModelCrystalStage1 crystalStage1;

    public RenderCrystalOre() {

        crystalStage1 = new ModelCrystalStage1();
    }

    @Override
    public void renderTileEntityAt(TileEntity tileentity, double d0, double d1, double d2, float f) {

        this.func_110628_a(new ResourceLocation("crystalluscraft:/textures/tileentity/crystalStage1.png"));
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d0 + 0.5F, (float)d1 + 1.5F, (float)d2 + 0.5F);
        GL11.glScalef(1.0F, -1F, -1F);
        crystalStage1.render(0.0625F);
        GL11.glPopMatrix();
    }
}
