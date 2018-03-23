package ru.xuttctep.tutorialmod.item;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import ru.xuttctep.tutorialmod.TutorialMod;

import java.util.List;

public class ItemSwords extends ItemSword {

    public ItemSwords(ToolMaterial material, String name) {

        super(material);
        setUnlocalizedName(name);
        setCreativeTab(TutorialMod.tabTutorial);


    }

    @Override
    public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState state, BlockPos pos, EntityLivingBase entityLiving) {
        return true;
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        return true;
    }

    @Override
    public EnumRarity getRarity(ItemStack stack) {
        return EnumRarity.UNCOMMON;
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        tooltip.add("Это просто меч, который посох, который бесконечный, который просто меч");
        super.addInformation(stack, playerIn, tooltip, advanced);
    }

}
