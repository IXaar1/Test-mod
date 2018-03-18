package ru.xuttctep.tutorialmod.item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import ru.xuttctep.tutorialmod.TutorialMod;

public class ModItems {

    public static Item tutorialItem;
    public static ItemSword tutorialSword;

    public static void preInit(){

        tutorialItem = new ItemTutorialItem("tutorial_item");
        tutorialSword = new ItemTutorialSword(EnumHelper.addToolMaterial("TUTORIAL", 3, 1999999997, 8.0F, 1000.0F, 30), "tutorial_sword");

        registerItems();
    }

    public static void registerItems(){
        GameRegistry.register(tutorialItem, new ResourceLocation(TutorialMod.MODID, "tutorial_item"));
        GameRegistry.register(tutorialSword, new ResourceLocation(TutorialMod.MODID, "tutorial_sword"));
    }

    public static void registerRenders(){

        registerRender(tutorialItem);
        registerRender(tutorialSword);

    }

    public static void registerRender(Item item){

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(TutorialMod.MODID + ":" + item.getUnlocalizedName().substring(5),"inventory"));

    }


}
