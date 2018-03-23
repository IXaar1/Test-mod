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

    public static Item sixItem;
    public static ItemSword itemSword;

    public static void preInit(){

        sixItem = new ItemSixItem("six_item");
        itemSword = new ItemSwords(EnumHelper.addToolMaterial("TUTORIAL", 3, 1999999997, 8.0F, 1000.0F, 30), "item_sword");

        registerItems();
    }

    public static void registerItems(){
        GameRegistry.register(sixItem, new ResourceLocation(TutorialMod.MODID, "six_item"));
        GameRegistry.register(itemSword, new ResourceLocation(TutorialMod.MODID, "item_sword"));
    }

    public static void registerRenders(){

        registerRender(sixItem);
        registerRender(itemSword);

    }

    public static void registerRender(Item item){

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(TutorialMod.MODID + ":" + item.getUnlocalizedName().substring(5),"inventory"));

    }


}
