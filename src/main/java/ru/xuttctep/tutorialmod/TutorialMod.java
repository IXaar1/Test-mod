package ru.xuttctep.tutorialmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ru.xuttctep.tutorialmod.item.ModItems;
import ru.xuttctep.tutorialmod.proxy.CommonProxy;
import ru.xuttctep.tutorialmod.tab.CreativeTabTutorial;


@Mod(modid = TutorialMod.MODID, version = TutorialMod.VERSION, name=TutorialMod.NAME)
public class TutorialMod
{
    public static final String MODID = "tutorialmod";
    public static final String VERSION = "1.0";
    public static final String NAME = "Tutorial Mod";

    @SidedProxy(clientSide = "ru.xuttctep.tutorialmod.proxy.ClientProxy", serverSide = "ru.xuttctep.tutorialmod.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static TutorialMod instance;

    public static CreativeTabTutorial tabTutorial;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        tabTutorial = new CreativeTabTutorial(CreativeTabs.getNextID(), "tab_tutorial");
        ModItems.preInit();
        proxy.preInit(event);

    }

    @EventHandler
    public void init(FMLInitializationEvent event){

       proxy.init(event);

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){

        proxy.postInit(event);

    }
}