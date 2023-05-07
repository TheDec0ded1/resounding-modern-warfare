package com.vicmatskiv.mw;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.models.UMP45mag;
import com.vicmatskiv.mw.models.UMP9Mag;
import com.vicmatskiv.weaponlib.ItemBullet;
import com.vicmatskiv.weaponlib.ItemMagazine;
import com.vicmatskiv.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.vicmatskiv.weaponlib.compatibility.CompatibleItems;
import com.vicmatskiv.weaponlib.config.ConfigurationManager;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class Magazines {

    public static ItemMagazine AUG9mmMag;
    public static ItemMagazine S710TricunMag;
    public static ItemMagazine M4A1Mag;
    public static ItemMagazine NGSWRMag;
    public static ItemMagazine FamasF1Mag;
    public static ItemMagazine BeowulfMag;
    public static ItemMagazine M4AsiimovMag;
    public static ItemMagazine M38Mag;
    public static ItemMagazine SOCOM_Mag;
    public static ItemMagazine HK417Mag;
    public static ItemMagazine C8Mag;
    public static ItemMagazine SA80Mag;
    public static ItemMagazine Stanag50;
    public static ItemMagazine Stanag60;
    public static ItemMagazine Stanag100;
    public static ItemMagazine AK101Mag;
    public static ItemMagazine AK74Mag;
    public static ItemMagazine AK74BlackMag;
    public static ItemMagazine AK74GreenMag;
    public static ItemMagazine AK74PearlMag;
    public static ItemMagazine AK74PlumMag;
    public static ItemMagazine AK74WhiteMag;
    public static ItemMagazine AK74Mag60;
    public static ItemMagazine AKMVulcanMag;
    public static ItemMagazine AK60Mag;
    public static ItemMagazine AK15Mag;
    public static ItemMagazine AK12Mag;
    public static ItemMagazine AK12Mag545x39;
    public static ItemMagazine AK75Mag545x39;
    public static ItemMagazine AK47PMAGTan;
    public static ItemMagazine AK47Mag;
    public static ItemMagazine AKMMag;
    public static ItemMagazine AKMGreenMag;
    public static ItemMagazine AK103Mag;
    public static ItemMagazine DragunovMag;
    public static ItemMagazine AK50Mag;
    public static ItemMagazine AK75Mag;
    public static ItemMagazine AK100Mag;
    public static ItemMagazine M9A1Mag;
    public static ItemMagazine FiveSevenMag;
    public static ItemMagazine SamuraiEdgeMag;
    public static ItemMagazine SCCYCPX2Mag;
    public static ItemMagazine SCCYCPX2MagExt;
    public static ItemMagazine M9Mag30;
    public static ItemMagazine M9DrumMag;
    public static ItemMagazine MP443Mag;
    public static ItemMagazine M45A1Mag;
    public static ItemMagazine M45A1Mag14;
    public static ItemMagazine M1911_44Mag;
    public static ItemMagazine M17Mag;
    public static ItemMagazine MakarovMag;
    public static ItemMagazine USP45Mag;
    public static ItemMagazine P2022Mag;
    public static ItemMagazine HiPowerMag;
    public static ItemMagazine APSMag;
    public static ItemMagazine AS50Mag;
    public static ItemMagazine M82Mag;
    public static ItemMagazine NTW20Mag;
    public static ItemMagazine FrommerStopMag;
    public static ItemMagazine G36CMag;
    public static ItemMagazine GlockMag13;
    public static ItemMagazine Glock18CMag;
    public static ItemMagazine GlockMag50;
    public static ItemMagazine L131A1Mag;
    public static ItemMagazine KBP9A91Mag;
    public static ItemMagazine KedrMag;
    public static ItemMagazine L96A1Mag;
    public static ItemMagazine DSR1Mag;
    public static ItemMagazine DSR1MagExt;
    public static ItemMagazine InterventionMag;
    public static ItemMagazine M110Mag;
    public static ItemMagazine Z10Mag;
    public static ItemMagazine M1928Mag;
    public static ItemMagazine M1A1Mag;
    public static ItemMagazine M40A6Mag;
    public static ItemMagazine AX50Mag;
    public static ItemMagazine R700Mag;
    public static ItemMagazine R700Mag10rnd;
    public static ItemMagazine SSG08Mag;
    public static ItemMagazine HecateIIMag;
    public static ItemMagazine M712Mag;
    public static ItemMagazine DP28Mag;
    public static ItemMagazine MG42Mag;
    public static ItemMagazine M1CarbineMag;
    public static ItemMagazine FNFALMag;
    public static ItemMagazine G3Mag;
    public static ItemMagazine Mk14EBRMag;
    public static ItemMagazine M14Drum50;
    public static ItemMagazine MP40Mag;
    public static ItemMagazine MP5A5Mag;
    public static ItemMagazine HK50Drum;
    public static ItemMagazine MP7Mag;
    public static ItemMagazine MP7Mag20;
    public static ItemMagazine UMP45Mag;
    public static ItemMagazine UMP9Mag;
    public static ItemMagazine MPXMag;
    public static ItemMagazine APC9Mag;
    public static ItemMagazine ScorpionMag;
    public static ItemMagazine P90Mag;
    public static ItemMagazine MAC10Mag;
    public static ItemMagazine P90TerminatorMag;
    public static ItemMagazine G11Mag;
    public static ItemMagazine SaigaMag;
    public static ItemMagazine Origin12Mag;
    public static ItemMagazine Origin12DrumMag;
    public static ItemMagazine ScarHMag;
    public static ItemMagazine Scar40Mag;
    public static ItemMagazine Scar60Mag;
    public static ItemMagazine VSSVintorezMag;
    public static ItemMagazine ASValMag;
    public static ItemMagazine STG44Mag;
    public static ItemMagazine G43GewehrMag;
    public static ItemMagazine BrenMag;
    public static ItemMagazine JohnsonMAG;
    public static ItemMagazine SV98Mag;
    public static ItemMagazine UziMag;
    public static ItemMagazine VP70Mag;
    public static ItemMagazine HoneyBadgerMag;
    public static ItemMagazine VectorMag;
    public static ItemMagazine VectorDrumMag;
    public static ItemMagazine DesertEagleMag;
    public static ItemMagazine M60Mag;
    public static ItemMagazine M249Mag;
    public static ItemMagazine StonerMag;
    public static ItemMagazine M134Mag;
    public static ItemMagazine FuelCell;
    public static ItemMagazine NinthSinMag;

    public static void init(Object mod, ConfigurationManager configurationManager, CompatibleFmlPreInitializationEvent event) {
    	
        Magazines.FuelCell = new ItemMagazine.Builder().withAmmo(1000)
                .withName("FuelCell")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.ChainsawFuel(), "ChainsawFuel.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.5F, -0F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                })
                .withMaxStackSize(6)
//                .withCrafting(CraftingComplexity.MEDIUM,
//                          Ores.INGOT_STEEL,
//                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.NinthSinMag = new ItemMagazine.Builder()
        		.withAmmo(100)
                .withName("NinthSinMag")
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.NinthSinMagazine(), "ninthsin.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.5F, -0F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                })
                .withMaxStackSize(6)
//                .withCrafting(CraftingComplexity.MEDIUM,
//                          Ores.INGOT_STEEL,
//                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.BrenMag = new ItemMagazine.Builder()
        		.withAmmo(30)
        		.withCompatibleBullet(Bullets.Bullet762x51)
        		.withName("BrenMag")
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.BrenMkIIMag(), "gun.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 1F, 0.3F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(0.8F, 0.8F, 0.8f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.JohnsonMAG = new ItemMagazine.Builder()
                .withAmmo(20)
                .withCompatibleBullet(Bullets.Bullet3006Springfield)
                .withName("JohnsonMAG")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.JohnsonLMGMAG(), "gun.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, -1.4F, 1.1F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(10F, 0f, 0f, 1f);
                    GL11.glScaled(0.8F, 0.8F, 0.8f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.VectorMag = new ItemMagazine.Builder()
        		.withAmmo(25)
        		.withCompatibleBullet(Bullets.Bullet45ACP)
        		.withName("VectorMag")
        		.withRotationPoint(-0.12000000357627871, 1.0400000309944155, -2.0400000607967383)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.KrissVectorMagazine(), "krissvector.png")
                .withRequiredAttachments(Attachments.KrissVectorReceiver)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.7F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-1F, -1.3F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.2F, 0F, -1.3F);
                    GL11.glRotatef(-130F, 0f, 1f, 0f);
                    GL11.glRotatef(20F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                })
                .withMaxStackSize(5)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.VectorDrumMag = new ItemMagazine.Builder()
        		.withAmmo(50)
        		.withCompatibleBullet(Bullets.Bullet45ACP)
        		.withName("VectorDrumMag")
        		.withRotationPoint(-0.12000000357627871, 1.0400000309944155, -2.0400000607967383)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.KrissVectorMagazineDrum(), "krissvector.png")
                .withRequiredAttachments(Attachments.KrissVectorReceiver)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.7F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-1F, -1.3F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.2F, 0F, -1.3F);
                    GL11.glRotatef(-130F, 0f, 1f, 0f);
                    GL11.glRotatef(20F, 1f, 0f, 0f);
                    GL11.glRotatef(-30F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                })
                .withMaxStackSize(5)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.M4A1Mag = new ItemMagazine.Builder()
        		.withAmmo(30)
        		.withCompatibleBullet(Bullets.Bullet556x45)
        		.withName("M4A1Mag_2")
        		.withRotationPoint(-0.16000000476837162, -0.16000000476837162, -1.5200000452995304)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.M4A1Mag(), "M4A1Magazine.png")
                .withRequiredAttachments(Attachments.Placeholder, Attachments.M4Receiver, Attachments.VLTORReceiver, 
                        Attachments.AUGDefaultKit, Attachments.Vector556Handguard, Attachments.M4AsiimovStock,
                        Attachments.M16A1RearSights, Attachments.CZ805BrenReceiver, Attachments.HK416Receiver,
                        Attachments.ScarLReceiver, Attachments.SIG556Grip)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.6F, -0.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1.1F, 1.1F, 1.1f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.NGSWRMag = new ItemMagazine.Builder()
        		.withAmmo(20)
        		.withCompatibleBullet(Bullets.Bullet556x45)
        		.withName("NGSWR_Mag")
        		.withRotationPoint(-0.16000000476837162, -0.44000001311302195, -1.4800000441074375)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.NGSWRMag(), "ngswr.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 1.3F, -2.8F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.FamasF1Mag = new ItemMagazine.Builder()
        		.withAmmo(30)
        		.withCompatibleBullet(Bullets.Bullet556x45)
        		.withName("FamasF1Mag")
        		.withRotationPoint(-0.12000000357627871, 1.0400000309944155, -2.0400000607967383)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withRequiredAttachments(Attachments.FamasPlaceholder, Attachments.Vector556Handguard)
                .withModel(new com.vicmatskiv.mw.models.FamasF1Mag(), "famasf1.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, -0.2F, 1.1F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.BeowulfMag = new ItemMagazine.Builder()
        		.withAmmo(13)
        		.withCompatibleBullet(Bullets.Bullet50Beowulf)
        		.withName("BeowulfMag")
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.Beowulf50CalMagazine(), "Beowulf50CalMagazine.png")
                .withRequiredAttachments(Attachments.Placeholder, Attachments.M4Receiver, Attachments.VLTORReceiver, 
                        Attachments.AUGDefaultKit, Attachments.Vector556Handguard, Attachments.M4AsiimovStock,
                        Attachments.M16A1RearSights, Attachments.Beowulf50CalReceiver)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.9F, -2.5F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.M4AsiimovMag = new ItemMagazine.Builder()
        		.withAmmo(30)
        		.withCompatibleBullet(Bullets.Bullet556x45)
        		.withName("M4AsiimovMag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.M4AsiimovMag(), "M4AsiimovMag.png")
                .withRequiredAttachments(Attachments.Placeholder, Attachments.M4Receiver, Attachments.VLTORReceiver, 
                        Attachments.AUGDefaultKit, Attachments.Vector556Handguard, Attachments.M4AsiimovStock)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.6F, -0.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1.1F, 1.1F, 1.1f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.SA80Mag = new ItemMagazine.Builder()
        		.withAmmo(60)
        		.withCompatibleBullet(Bullets.Bullet556x45)
        		.withName("SA80Mag")
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.NATOMag60rnd(), "M4A1Mag.png")
                .withRequiredAttachments(Attachments.Placeholder, Attachments.M4Receiver, Attachments.VLTORReceiver, 
                        Attachments.AUGDefaultKit, Attachments.Vector556Handguard)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.6F, -0.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1.1F, 1.1F, 1.1f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.AUG9mmMag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet9x19mm).withName("AUG9mmMag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.AUG9mmConvMAG(), "gun.png")
                .withRequiredAttachments(Attachments.AUGParaConversion)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, -0.8F, 1F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1.1F, 1.1F, 1.1f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.S710TricunMag = new ItemMagazine.Builder()
        		.withAmmo(30)
        		.withCompatibleBullet(Bullets.Bullet10mm)
        		.withName("S710TricunMag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.S710TricunMag(), "S710Tricun.png")
                .withRequiredAttachments(Attachments.S710Receiver)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.6F, -1.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(0.7F, 0.7F, 0.7f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.M134Mag = new ItemMagazine.Builder().withAmmo(1000).withCompatibleBullet(Bullets.Bullet762x51).withName("M134Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.M134Mag(), "gun.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, -0.5F, -0F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.M60Mag = new ItemMagazine.Builder().withAmmo(100).withCompatibleBullet(Bullets.Bullet762x51).withName("M60Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.M60Mag(), "m60.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, -2.9F, 4F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.M249Mag = new ItemMagazine.Builder()
        		.withAmmo(100)
        		.withCompatibleBullet(Bullets.Bullet556x45)
        		.withName("M249Mag")
        		.withRotationPoint(0.8812000082910061, 0.8648000418066975, -1.40640004143715)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.M249Mag(), "m249.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.95F, -2.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(0.8F, 0.8F, 0.8f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.StonerMag = new ItemMagazine.Builder().withAmmo(100).withCompatibleBullet(Bullets.Bullet556x45).withName("StonerMag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.StonerA1MAG(), "m249.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, -2.2F, 3.7F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(0.8F, 0.8F, 0.8f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.HoneyBadgerMag = new ItemMagazine.Builder()
        		.withAmmo(30)
        		.withCompatibleBullet(Bullets.Bullet762x35)
        		.withName("HoneyBadgerMag_2")
        		.withRotationPoint(-0.16000000476837162, -0.16000000476837162, -1.5200000452995304)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.M4A1Mag(), "M4A1Mag.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.6F, -0.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1.1F, 1.1F, 1.1f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.M38Mag = new ItemMagazine.Builder()
        		
        		.withAmmo(30)
        		.withCompatibleBullet(Bullets.Bullet556x45)
        		.withName("M38Mag_2")
        		.withRotationPoint(-0.16000000476837162, -0.16000000476837162, -1.5200000452995304)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.M38Mag(), "M38Mag.png")
                .withRequiredAttachments(Attachments.Placeholder, Attachments.M4Receiver, Attachments.VLTORReceiver, 
                        Attachments.AUGDefaultKit, Attachments.Vector556Handguard,
                        Attachments.M16A1RearSights, Attachments.CZ805BrenReceiver,
                        Attachments.HK416Receiver, Attachments.ScarLReceiver, 
                        Attachments.SIGMCXHandguardShort, Attachments.SIG556Grip)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.6F, -0.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1.1F, 1.1F, 1.1f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.SOCOM_Mag = new ItemMagazine.Builder()
        		.withAmmo(30)
        		.withCompatibleBullet(Bullets.Bullet556x45)
        		.withName("socom_mag")
        		.withRotationPoint(-0.16000000476837162, -0.16000000476837162, -1.5200000452995304)
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.SOCOM_Mag(), "socom_mag.png")
                .withRequiredAttachments(Attachments.Placeholder, Attachments.M4Receiver, Attachments.VLTORReceiver, 
                        Attachments.AUGDefaultKit, Attachments.Vector556Handguard, Attachments.C8SFWReceiver, 
                        Attachments.HK416Receiver, Attachments.ScarLReceiver,
                        Attachments.SIGMCXHandguardShort, Attachments.SIG556Grip)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.6F, -0.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1.1F, 1.1F, 1.1f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.HK417Mag = new ItemMagazine.Builder()
        		.withAmmo(20)
        		.withCompatibleBullet(Bullets.Bullet762x51)
        		.withName("hk417_mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.HK417Mag(), "HK417mag.png")
                .withRequiredAttachments(Attachments.HK417Receiver, Attachments.HK417ReceiverTan)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 1.2F, -3F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1.1F, 1.1F, 1.1f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.C8Mag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet556x45).withName("C8Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.C8Mag(), "c8mag.png")
                .withRequiredAttachments(Attachments.Placeholder, Attachments.M4Receiver, Attachments.VLTORReceiver, 
                        Attachments.AUGDefaultKit, Attachments.Vector556Handguard, Attachments.C8SFWReceiver)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.6F, -0.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1.1F, 1.1F, 1.1f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.Stanag50 = new ItemMagazine.Builder()
        		.withAmmo(50)
        		.withCompatibleBullet(Bullets.Bullet556x45)
        		.withName("Stanag50")
        		.withRotationPoint(-0.16000000476837162, -0.16000000476837162, -1.5200000452995304)
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.Stanag50(), "gun.png")
                .withRequiredAttachments(Attachments.Placeholder, 
                        Attachments.M4Receiver, Attachments.VLTORReceiver, 
                        Attachments.AUGDefaultKit, Attachments.Vector556Handguard,
                        Attachments.M16A1RearSights, Attachments.CZ805BrenReceiver, Attachments.HK416Receiver,
                        Attachments.ScarLReceiver, Attachments.SIG556Grip)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 1.2F, -2.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.Stanag60 = new ItemMagazine.Builder()
        		.withAmmo(60)
        		.withCompatibleBullet(Bullets.Bullet556x45)
        		.withName("Stanag60")
        		.withRotationPoint(-0.16000000476837162, -0.16000000476837162, -1.5200000452995304)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.Stanag60(), "gun.png")
                .withRequiredAttachments(Attachments.Placeholder, Attachments.M4Receiver, Attachments.VLTORReceiver, 
                        Attachments.AUGDefaultKit, Attachments.Vector556Handguard,
                        Attachments.M16A1RearSights, Attachments.CZ805BrenReceiver, Attachments.HK416Receiver,
                        Attachments.ScarLReceiver, Attachments.SIG556Grip)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 1.2F, -2.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.Stanag100 = new ItemMagazine.Builder()
        		.withAmmo(100)
        		.withCompatibleBullet(Bullets.Bullet556x45)
        		.withName("Stanag100")
        		.withRotationPoint(-0.16000000476837162, -0.16000000476837162, -1.5200000452995304)
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.NATODrum100(), "gun.png")
                .withRequiredAttachments(Attachments.Placeholder, Attachments.M4Receiver, Attachments.VLTORReceiver, 
                        Attachments.AUGDefaultKit, Attachments.Vector556Handguard,
                        Attachments.M16A1RearSights, Attachments.CZ805BrenReceiver, Attachments.HK416Receiver,
                        Attachments.ScarLReceiver, Attachments.SIG556Grip)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 1.2F, -0.6F);
                    GL11.glRotatef(-160F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1.2F, 1.2F, 1.2f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.G36CMag = new ItemMagazine.Builder()
        		.withAmmo(30)
        		.withCompatibleBullet(Bullets.Bullet556x45)
        		.withName("G36CMag_2")
        		.withRotationPoint(-0.040000001192092904, -0.28000000834465033, -1.4400000429153446)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.G36CMag(), "g36c.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 1F, -2.5F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(0.8F, 0.8F, 0.8f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.AK101Mag = new ItemMagazine.Builder()
        		.withAmmo(30)
        		.withCompatibleBullet(Bullets.Bullet556x45)
        		.withName("AK101Mag_2")
        		.withRotationPoint(-0.12000000357627871, 0.28000000834465033, -1.8800000560283665)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.AK101Mag(), "ak101mag.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.7F, -2.7F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.8F, 0.8F, 0.8f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.AK74Mag = new ItemMagazine.Builder()
        		.withAmmo(30)
        		.withCompatibleBullet(Bullets.Bullet545x39)
        		.withName("AK74Mag")
        		.withRotationPoint(-0.12000000357627871, 0.28000000834465033, -1.8800000560283665)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.AK74Mag(), "ak74mag.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.7F, -2.7F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.8F, 0.8F, 0.8f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.AK74BlackMag = new ItemMagazine.Builder()
        		.withAmmo(30)
        		.withCompatibleBullet(Bullets.Bullet545x39)
        		.withName("AK74BlackMag")
        		.withRotationPoint(-0.12000000357627871, 0.28000000834465033, -1.8800000560283665)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.AK74Mag(), "ak74blackmag.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.7F, -2.7F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.8F, 0.8F, 0.8f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.AK74GreenMag = new ItemMagazine.Builder()
        		.withAmmo(30)
        		.withCompatibleBullet(Bullets.Bullet545x39)
        		.withName("AK74GreenMag")
        		.withRotationPoint(-0.12000000357627871, 0.28000000834465033, -1.8800000560283665)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.AK74Mag(), "ak74greenmag.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.7F, -2.7F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.8F, 0.8F, 0.8f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.AK74PearlMag = new ItemMagazine.Builder()
        		.withAmmo(30)
        		.withCompatibleBullet(Bullets.Bullet545x39)
        		.withName("AK74PearlMag")
        		.withRotationPoint(-0.12000000357627871, 0.28000000834465033, -1.8800000560283665)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.AK74Mag(), "ak74pearlmag.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.7F, -2.7F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.8F, 0.8F, 0.8f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.AK74PlumMag = new ItemMagazine.Builder()
        		.withAmmo(30)
        		.withCompatibleBullet(Bullets.Bullet545x39)
        		.withName("AK74PlumMag")
        		.withRotationPoint(-0.12000000357627871, 0.28000000834465033, -1.8800000560283665)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.AK74Mag(), "ak74plummag.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.7F, -2.7F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.8F, 0.8F, 0.8f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.AK74WhiteMag = new ItemMagazine.Builder()
        		.withAmmo(30)
        		.withCompatibleBullet(Bullets.Bullet545x39)
        		.withName("AK74WhiteMag")
        		.withRotationPoint(-0.12000000357627871, 0.28000000834465033, -1.8800000560283665)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.AK74Mag(), "ak74whitemag.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.7F, -2.7F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.8F, 0.8F, 0.8f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.AK74Mag60 = new ItemMagazine.Builder()
        		.withAmmo(60)
        		.withCompatibleBullet(Bullets.Bullet545x39)
        		.withName("AK74Mag60")
        		.withRotationPoint(-0.12000000357627871, 0.28000000834465033, -1.8800000560283665)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.AK60Mag(), "gun.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.5F, -2.4F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.6F, 0.6F, 0.6f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.AKMVulcanMag = new ItemMagazine.Builder()
        		.withAmmo(30)
        		.withCompatibleBullet(Bullets.Bullet545x39)
        		.withName("AKMVulcanMag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.AK74VulcanMag(), "ak74vulcanmag.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.7F, -2.7F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.8F, 0.8F, 0.8f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.AK60Mag = new ItemMagazine.Builder()
        		.withAmmo(60)
        		.withCompatibleBullet(Bullets.Bullet556x45)
        		.withName("AK60Mag")
        		.withRotationPoint(-0.12000000357627871, 0.28000000834465033, -1.8800000560283665)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.AK60Mag(), "gun.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.5F, -2.4F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.6F, 0.6F, 0.6f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.AK15Mag = new ItemMagazine.Builder()
        		.withAmmo(30)
        		.withCompatibleBullet(Bullets.Bullet762x39)
        		.withName("AK15Mag_2")
        		.withRotationPoint(-0.12000000357627871, 0.28000000834465033, -1.8800000560283665)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.AK15Mag(), "gun.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.7f, -2.7F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.7F, 0.7F, 0.7f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.AK12Mag545x39 = new ItemMagazine.Builder()
        		.withAmmo(30)
        		.withCompatibleBullet(Bullets.Bullet545x39)
        		.withName("AK12Mag_2")
        		.withRotationPoint(-0.12000000357627871, 0.28000000834465033, -1.8800000560283665)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.AK15Mag(), "gun.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.7f, -2.7F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.7F, 0.7F, 0.7f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.AK75Mag545x39 = new ItemMagazine.Builder()
        		.withAmmo(75)
        		.withCompatibleBullet(Bullets.Bullet545x39)
        		.withName("AK75Mag545x39")
        		.withRotationPoint(-0.12000000357627871, 0.28000000834465033, -1.8800000560283665)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.Mag75rnd(), "gun.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 1.2f, -3.2F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.AK12Mag = new ItemMagazine.Builder()
        		.withAmmo(31)
        		.withCompatibleBullet(Bullets.Bullet545x39)
        		.withName("AK12Mag")
        		.withRotationPoint(-0.12000000357627871, 0.36000001072883614, -1.9200000572204599)
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.AK12Magazine(), "gun.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.9f, -2.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.AK47PMAGTan = new ItemMagazine.Builder()
        		.withAmmo(30)
        		.withCompatibleBullet(Bullets.Bullet762x39)
        		.withName("AK47PMAGTan")
        		.withRotationPoint(-0.12000000357627871, 0.28000000834465033, -1.8800000560283665)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.AK15Mag(), "tan.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.7f, -2.7F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.7F, 0.7F, 0.7f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.AK47Mag = new ItemMagazine.Builder()
        		.withAmmo(30)
        		.withCompatibleBullet(Bullets.Bullet762x39)
        		.withName("AK47Mag")
        		.withRotationPoint(-0.12000000357627871, 0.28000000834465033, -1.880000056028367)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.Magazine762x39(), "ak47mag.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.7f, -2.7F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.7F, 0.7F, 0.7f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.AKMMag = new ItemMagazine.Builder()
        		.withAmmo(30)
        		.withCompatibleBullet(Bullets.Bullet762x39)
        		.withName("AKMMag")
        		.withRotationPoint(-0.12000000357627871, 0.28000000834465033, -1.880000056028367)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.AKMmag(), "ak74mag.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.7f, -2.7F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.7F, 0.7F, 0.7f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.AKMGreenMag = new ItemMagazine.Builder()
        		.withAmmo(30)
        		.withCompatibleBullet(Bullets.Bullet762x39)
        		.withName("AKMGreenMag")
        		.withRotationPoint(-0.12000000357627871, 0.28000000834465033, -1.880000056028367)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.AKMmag(), "akmmag.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.7f, -2.7F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.7F, 0.7F, 0.7f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        Magazines.AK103Mag = new ItemMagazine.Builder()
        		.withAmmo(30)
        		.withCompatibleBullet(Bullets.Bullet762x39)
        		.withName("AK103Mag")
        		.withRotationPoint(-0.12000000357627871, 0.28000000834465033, -1.880000056028367)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.AKMmag(), "ak74blackmag.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.7f, -2.7F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.7F, 0.7F, 0.7f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.AK50Mag = new ItemMagazine.Builder()
        		.withAmmo(50)
        		.withCompatibleBullet(Bullets.Bullet762x39)
        		.withName("AK50Mag")
        		.withRotationPoint(-0.12000000357627871, 0.28000000834465033, -1.8800000560283665)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.Drum50AK(), "gun.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.8f, -2.7F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.AK75Mag = new ItemMagazine.Builder()
        		.withAmmo(75)
        		.withCompatibleBullet(Bullets.Bullet762x39)
        		.withName("AK75Mag")
        		.withRotationPoint(-0.12000000357627871, 0.28000000834465033, -1.8800000560283665)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.Mag75rnd(), "gun.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 1.2f, -3.2F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.AK100Mag = new ItemMagazine.Builder()
        		.withAmmo(100)
        		.withCompatibleBullet(Bullets.Bullet762x39)
        		.withName("AK100Mag")
        		.withRotationPoint(-0.12000000357627871, 0.28000000834465033, -1.8800000560283665)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.AKDrum100(), "gun.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.6f, -2.4F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.8F, 0.8F, 0.8f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.DragunovMag = new ItemMagazine.Builder()
        		.withAmmo(10)
        		.withCompatibleBullet(Bullets.Bullet762x39)
        		.withName("DragunovMag")
        		.withRotationPoint(-0.12000000357627871, 0.28000000834465033, -1.880000056028367)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.DragunovMag(), "dragunov.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.7f, -2.7F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.7F, 0.7F, 0.7f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.SaigaMag = new ItemMagazine.Builder().withAmmo(5).withCompatibleBullet(Bullets.Shotgun12Guage).withName("SaigaMag_2")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.Saiga12mag(), "gun.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.7f, -2.7F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.7F, 0.7F, 0.7f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.Origin12Mag = new ItemMagazine.Builder()
        		.withAmmo(5)
                .withCompatibleBullet(Bullets.Shotgun12Guage)
                .withName("Origin12Mag")
                .withRotationPoint(-0.12000000357627871, 1.0000000298023226, -1.9200000572204607)
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.Origin12Mag(), "Origin12.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.7f, -2.7F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.7F, 0.7F, 0.7f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.Origin12DrumMag = new ItemMagazine.Builder()
        		.withAmmo(20)
                .withCompatibleBullet(Bullets.Shotgun12Guage)
                .withName("Origin12DrumMag")
                .withRotationPoint(-0.12000000357627871, 1.0000000298023226, -1.9200000572204607)
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.Origin12DrumMag(), "Origin12DrumMag.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.7f, -2.7F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.7F, 0.7F, 0.7f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.M9A1Mag = new ItemMagazine.Builder()
        		.withAmmo(15)
        		.withCompatibleBullet(Bullets.Bullet9x19mm)
        		.withName("M9Mag_2")
        		.withRotationPoint(-0.16000000476837162, 0.5600000166893007, 0.040000001192092904)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.M9A1mag(), "m9a1.png")
                .withRequiredAttachments(Attachments.M9A1Body, Attachments.P226Slide)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.5f, -1F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.FiveSevenMag = new ItemMagazine.Builder()
        		.withAmmo(20)
        		.withCompatibleBullet(Bullets.Bullet57x28mm)
        		.withName("FiveSevenMag")
        		.withRotationPoint(-0.16000000476837162, 0.5600000166893007, 0.040000001192092904)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.FiveSevenMagazine(), "fiveseven.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.5f, -1F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.SamuraiEdgeMag = new ItemMagazine.Builder().withAmmo(15).withCompatibleBullet(Bullets.Bullet40SW)
        		.withName("SamuraiEdgeMag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.M9A1mag(), "m9a1.png")
                .withRequiredAttachments(Attachments.SamuraiEdgeBody)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.5f, -1F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.SCCYCPX2Mag = new ItemMagazine.Builder()
        		.withAmmo(10)
        		.withCompatibleBullet(Bullets.Bullet9x19mm)
        		.withName("sccycpx2mag")
        		.withRotationPoint(-0.16000000476837162, 0.5600000166893007, 0.040000001192092904)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.SCCYCPX2Mag(), "sccycpx2.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.5f, -1F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.SCCYCPX2MagExt = new ItemMagazine.Builder()
        		.withAmmo(15)
        		.withCompatibleBullet(Bullets.Bullet9x19mm)
        		.withName("sccycpx2magext")
        		.withRotationPoint(-0.16000000476837162, 0.5600000166893007, 0.040000001192092904)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.SCCYCPX2MagExt(), "sccycpx2.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.5f, -1F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.DesertEagleMag = new ItemMagazine.Builder()
        		.withAmmo(7)
        		.withCompatibleBullet(Bullets.Bullet50AE)
        		.withName("DesertEagleMag")
        		.withRotationPoint(-0.16000000476837162, 0.5600000166893007, 0.040000001192092904)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.DesertEagleMag(), "deagle.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.5f, -1F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.M9Mag30 = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet9x19mm).withName("M9Mag30")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.M9Mag30(), "gun.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, -0.1f, -0.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.75F, 0.75F, 0.75f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.M9DrumMag = new ItemMagazine.Builder().withAmmo(65).withCompatibleBullet(Bullets.Bullet9x19mm).withName("M9DrumMag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.M9DrumMag(), "gun.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, -0.1f, -0.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.75F, 0.75F, 0.75f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.MP443Mag = new ItemMagazine.Builder()
        		.withAmmo(18)
        		.withCompatibleBullet(Bullets.Bullet9x19mm)
        		.withName("MP443Mag_2")
        		.withRotationPoint(-0.20000000596046452, 0.48000001430511485, 0.040000001192092904)
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.MP443Magazine(), "MP443.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.4f, -0F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.7F, 0.7F, 0.7f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.M45A1Mag = new ItemMagazine.Builder().withAmmo(7).withCompatibleBullet(Bullets.Bullet45ACP).withName("M45A1Mag_2")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.GlockMagazine(), "gun.png")
                .withRequiredAttachments(Attachments.M1911Body)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.7f, -0.9F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.M1911_44Mag = new ItemMagazine.Builder().withAmmo(7).withCompatibleBullet(Bullets.Bullet44).withName("M1911_44Mag")
                .withRequiredAttachments(Attachments.M191144MagBody)
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.GlockMagazine(), "gun.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.7f, -0.9F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.M45A1Mag14 = new ItemMagazine.Builder().withAmmo(14).withCompatibleBullet(Bullets.Bullet45ACP).withName("M45A1Mag14")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.M9Mag30(), "gun.png")
                .withRequiredAttachments(Attachments.M1911Body)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, -0.1f, -0.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.75F, 0.75F, 0.75f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        
        Magazines.M17Mag = new ItemMagazine.Builder()
        		.withAmmo(17)
        		.withCompatibleBullet(Bullets.Bullet9x19mm)
        		.withName("M17Mag")
        		.withRotationPoint(-0.16000000476837162, 0.5600000166893007, 0.040000001192092904)
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.M17Mag(), "m17.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.7f, -0.9F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.MakarovMag = new ItemMagazine.Builder().withAmmo(8)
        		.withCompatibleBullet(Bullets.Bullet9x18mm)
        		.withName("MakarovMag")
        		.withRequiredAttachments(Attachments.MakarovSlide, Attachments.MakarovPBBody)
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.MakarovMag(), "makarovmag.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.7f, -0.9F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.P2022Mag = new ItemMagazine.Builder().withAmmo(15).withCompatibleBullet(Bullets.Bullet9x19mm).withName("P2022Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.P2022Mag(), "p2022.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.7f, -0.9F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.USP45Mag = new ItemMagazine.Builder().withAmmo(8).withCompatibleBullet(Bullets.Bullet45ACP).withName("USP45Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.USP45Mag(), "USP45.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.7f, -0.9F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.HiPowerMag = new ItemMagazine.Builder().withAmmo(13).withCompatibleBullet(Bullets.Bullet9x19mm).withName("HiPowerMag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.GlockMagazine(), "gun.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.7f, -0.9F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.FrommerStopMag = new ItemMagazine.Builder().withAmmo(8).withCompatibleBullet(Bullets.Bullet380ACP).withName("FrommerStopMag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.M9A1mag(), "gun.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.5f, -0.8F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.8F, 0.8F, 0.8f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.APSMag = new ItemMagazine.Builder()
        		.withAmmo(20)
        		.withCompatibleBullet(Bullets.Bullet9x19mm)
        		.withName("APSMag_2")
        		.withRotationPoint(-0.12000000357627871, 0.48000001430511485, 0.0)
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.APSmag(), "aps.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.5f, -0.9F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.8F, 0.8F, 0.8f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.GlockMag13 = new ItemMagazine.Builder().withAmmo(13).withCompatibleBullet(Bullets.Bullet9x19mm).withName("GlockMag13")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.Glock13rndMagazine(), "glock18c.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.3f, -0.7F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.8F, 0.8F, 0.8f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.L131A1Mag = new ItemMagazine.Builder().withAmmo(17).withCompatibleBullet(Bullets.Bullet9x19mm).withName("L131A1Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.L131A1Mag(), "L131A1.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.3f, -0.7F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.8F, 0.8F, 0.8f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.Glock18CMag = new ItemMagazine.Builder().withAmmo(20).withCompatibleBullet(Bullets.Bullet9x19mm).withName("Glock18Cmag_2")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.Glock18Cmag(), "glock18c.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.1f, -0.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.6F, 0.6F, 0.6f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.GlockMag50 = new ItemMagazine.Builder().withAmmo(50).withCompatibleBullet(Bullets.Bullet9x19mm).withName("GlockMag50")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.M9DrumMag(), "gun.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, -0.1f, -0.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.75F, 0.75F, 0.75f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.AS50Mag = new ItemMagazine.Builder().withAmmo(10).withCompatibleBullet(Bullets.Bullet50BMG).withName("AS50Mag_2")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.AS50mag(), "M4A1Mag.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 1.8f, -3F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.8F, 0.8F, 0.8f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.M82Mag = new ItemMagazine.Builder()
        		.withAmmo(10)
        		.withCompatibleBullet(Bullets.Bullet50BMG)
        		.withName("M82Mag_2")
        		.withRotationPoint(-0.12000000357627871, 0.40000001192092904, -2.4800000739097605)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.M82Mag(), "m82.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 1.3f, -3.3F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.NTW20Mag = new ItemMagazine.Builder().withAmmo(3).withCompatibleBullet(Bullets.Bullet20x82mm).withName("NTW20Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.NTW20MAG(), "gun.png")
                
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, -1.2f, 3F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.KBP9A91Mag = new ItemMagazine.Builder()
        		.withAmmo(20)
        		.withCompatibleBullet(Bullets.Bullet9x39mm)
        		.withName("KBP9A91Mag_2")
        		.withRotationPoint(-0.12000000357627871, 0.36000001072883614, -1.9600000584125523)
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.KBP9A91Mag(), "kbp9a91.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.8f, -2.8F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.8F, 0.8F, 0.8f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.KedrMag = new ItemMagazine.Builder().withAmmo(20).withCompatibleBullet(Bullets.Bullet9x19mm).withName("KedrMag_2")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.KedrMag(), "kedr.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.8f, -2.2F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.8F, 0.8F, 0.8f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.L96A1Mag = new ItemMagazine.Builder().withAmmo(10).withCompatibleBullet(Bullets.Bullet762x54).withName("L96A1Mag_2")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.L115Mag(), "gun.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 1.3f, -0.9F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(1.4F, 1.4F, 1.4f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.DSR1Mag = new ItemMagazine.Builder()
        		.withAmmo(5)
        		.withCompatibleBullet(Bullets.Bullet762x54)
        		.withName("DSR1Mag")
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.DSR1Mag(), "dsr1.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.3f, 1.3F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(1.4F, 1.4F, 1.4f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.DSR1MagExt = new ItemMagazine.Builder()
        		.withAmmo(10)
        		.withCompatibleBullet(Bullets.Bullet762x54)
        		.withName("DSR1MagExt")
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.DSR1MagExt(), "dsr1.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                	GL11.glTranslatef(0.3F, 0.1f, 1.3F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(1.4F, 1.4F, 1.4f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.InterventionMag = new ItemMagazine.Builder()
        		.withAmmo(7)
        		.withCompatibleBullet(Bullets.Bullet408CT)
        		.withName("InterventionMag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.InterventionMag(), "Intervention.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 1.5f, -1.9F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(1.1F, 1.1F, 1.1f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.M40A6Mag = new ItemMagazine.Builder()
        		.withAmmo(7)
        		.withCompatibleBullet(Bullets.Bullet308Winchester)
        		.withName("M40A6Mag_2")
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.M40A6Mag(), "gunwerkshamr.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 1.4f, -1.9F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(1.1F, 1.1F, 1.1f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.AX50Mag = new ItemMagazine.Builder().withAmmo(5).withCompatibleBullet(Bullets.Bullet50BMG).withName("AX50Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.AX50Mag(), "ax50.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 1.3f, -3.4F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(0.8F, 0.8F, 0.8f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.R700Mag = new ItemMagazine.Builder().withAmmo(5).withCompatibleBullet(Bullets.Bullet762x54).withName("R700Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.Remington700Mag(), "remington700.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0f, -0.8F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(1.5F, 1.5F, 1.5f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.R700Mag10rnd = new ItemMagazine.Builder().withAmmo(10).withCompatibleBullet(Bullets.Bullet762x54).withName("R700Mag10rnd")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.Remington700Mag10rnd(), "remington700.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0f, -0.8F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(1.5F, 1.5F, 1.5f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.SSG08Mag = new ItemMagazine.Builder()
        		.withAmmo(8)
        		.withCompatibleBullet(Bullets.Bullet308Winchester)
        		.withName("SSG08Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.SSG08Magazine(), "gun.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 2.6f, -4.7F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(1.5F, 1.5F, 1.5f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.HecateIIMag = new ItemMagazine.Builder()
        		.withAmmo(7)
        		.withCompatibleBullet(Bullets.Bullet50BMG)
        		.withName("HecateIIMag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.PGMHecateIIMagazine(), "pgmhecateii.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 1.8f, -3.9F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 1f, 0f, 0f);
                    GL11.glRotatef(-5F, 0f, 0f, 1f);
                    GL11.glScaled(1.1F, 1.1F, 1.1f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.M110Mag = new ItemMagazine.Builder()
        		.withAmmo(10)
        		.withCompatibleBullet(Bullets.Bullet762x51)
        		.withName("M110Mag_2")
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.M110Mag(), "m110.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 1.2F, -2.7F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.Z10Mag = new ItemMagazine.Builder()
        		.withAmmo(10)
        		.withCompatibleBullet(Bullets.Bullet762x51)
        		.withName("Z10Mag")
        		.withRotationPoint(-0.1, 0.0, -1.4000000000000001)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.Z10Mag(), "z10.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 1.2F, -2.7F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.M1928Mag = new ItemMagazine.Builder().withAmmo(50).withCompatibleBullet(Bullets.Bullet45ACP).withName("M1928Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.M1928ThompsonMag(), "gun.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.5F, -1.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.M1A1Mag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet45ACP)
                .withName("M1A1Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.M1A1mag(), "gun.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.5F, -1.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(0.8F, 0.8F, 0.8f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.M712Mag = new ItemMagazine.Builder().withAmmo(20).withCompatibleBullet(Bullets.Bullet763x25).withName("M712mag_2")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.M712mag(), "m712.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 1F, -2F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(0.6F, 0.6F, 0.6f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.MG42Mag = new ItemMagazine.Builder().withAmmo(50).withCompatibleBullet(Bullets.Bullet792x57).withName("MG42Mag_2")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.MG42mag(), "mg42mag.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 1F, -0.5F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.DP28Mag = new ItemMagazine.Builder().withAmmo(47).withCompatibleBullet(Bullets.Bullet762x54).withName("DP28Mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.DP28Mag(), "gun.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.7F, -1.3F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-50F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.M1CarbineMag = new ItemMagazine.Builder()
        		.withAmmo(15)
        		.withCompatibleBullet(Bullets.Bullet762x51)
        		.withName("M1CarbineMag")
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.Mk14EBRmag(), "m14dmr.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 1.7F, -4.2F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.FNFALMag = new ItemMagazine.Builder()
        		.withAmmo(20)
        		.withCompatibleBullet(Bullets.Bullet762x51)
        		.withName("FNFALMag")
        		.withRotationPoint(-0.12000000357627871, -0.6800000202655794, -2.36000007033348)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.FNFALMag(), "fnfal.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 1.4F, -3F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(0.8F, 0.8F, 0.8f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.G3Mag = new ItemMagazine.Builder()
        		.withAmmo(20)
        		.withCompatibleBullet(Bullets.Bullet762x51)
        		.withName("G3Mag")
        		.withRotationPoint(0.0, -0.6400000190734865, -1.4000000417232517)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.G3Mag(), "G3.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 1.4F, -3F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(0.8F, 0.8F, 0.8f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.Mk14EBRMag = new ItemMagazine.Builder()
        		.withAmmo(20)
        		.withCompatibleBullet(Bullets.Bullet762x51)
        		.withName("Mk14EBRmag_2")
        		.withRotationPoint(-0.12000000357627871, 0.5600000166893007, -3.000000089406967)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.Mk14EBRmag(), "m14dmr.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 1.7F, -4.2F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.M14Drum50 = new ItemMagazine.Builder()
        		.withAmmo(50)
        		.withCompatibleBullet(Bullets.Bullet762x51)
        		.withName("M14Drum50")
        		.withRotationPoint(-0.12000000357627871, 0.5600000166893007, -3.000000089406967)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.M14Drum50(), "gun.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 1.2F, -3F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1.2F, 1.2F, 1.2f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.MP40Mag = new ItemMagazine.Builder().withAmmo(32).withCompatibleBullet(Bullets.Bullet9x19mm).withName("MP40Mag_2")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.MP40MagACTUAL(), "gun.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.8F, -2.2F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.MP5A5Mag = new ItemMagazine.Builder()
        		.withAmmo(30)
        		.withCompatibleBullet(Bullets.Bullet9x19mm)
        		.withName("MP5A5Mag")
        		.withRotationPoint(0.0, 0.20000000596046452, -1.5600000464916233)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.HKMP5Mag(), "mp5.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.9F, -2.2F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(0.7F, 0.7F, 0.7f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.HK50Drum = new ItemMagazine.Builder()
        		.withAmmo(50)
        		.withCompatibleBullet(Bullets.Bullet9x19mm)
        		.withName("HK50Drum")
        		.withRotationPoint(0.0, 0.20000000596046452, -1.5600000464916233)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.HK50Drum(), "mp5.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.9F, -2.9F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.MP7Mag = new ItemMagazine.Builder()
        		.withAmmo(40)
        		.withCompatibleBullet(Bullets.Bullet46x30mm)
        		.withName("MP7Mag")
        		.withRotationPoint(-0.12000000357627871, 0.6400000190734865, -0.08000000238418581)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.MP7Mag(), "mp7.png")
//                .withRequiredAttachments(Attachments.VeprDustCover)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, -0.2F, -0.7F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.MP7Mag20 = new ItemMagazine.Builder()
        		.withAmmo(20)
        		.withCompatibleBullet(Bullets.Bullet46x30mm)
        		.withName("MP7Mag20")
        		.withRotationPoint(-0.12000000357627871, 0.6400000190734865, -0.08000000238418581)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.MP7Mag20(), "mp7.png")
//                .withRequiredAttachments(Attachments.VeprDustCover)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                	GL11.glTranslatef(0.3F, -0.0F, -0.7F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.UMP45Mag = new ItemMagazine.Builder()
        		.withAmmo(25)
        		.withCompatibleBullet(Bullets.Bullet45ACP)
        		.withName("UMP45Mag")
        		.withRotationPoint(-0.12000000357627871, 0.32000000953674324, -1.280000038146973)
        		.withRequiredAttachments(Attachments.UMP45Receiver)
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new UMP45mag(), "ump45.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.9F, -2.2F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(0.7F, 0.7F, 0.7f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.UMP9Mag = new ItemMagazine.Builder()
        		.withAmmo(30)
        		.withCompatibleBullet(Bullets.Bullet9x19mm)
        		.withName("UMP9Mag")
        		.withRotationPoint(-0.12000000357627871, 0.32000000953674324, -1.280000038146973)
        		.withRequiredAttachments(Attachments.UMP9Receiver)
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new UMP9Mag(), "ump45.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.9F, -2.2F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(0.7F, 0.7F, 0.7f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.MPXMag = new ItemMagazine.Builder()
        		.withAmmo(30)
        		.withCompatibleBullet(Bullets.Bullet9x19mm)
        		.withName("MPXMag")
        		.withRotationPoint(-0.040000001192092904, 0.44000001311302195, -1.24000003695488)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.MPXMag(), "mpx.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.8F, -2.5F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(0.7F, 0.7F, 0.7f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.APC9Mag = new ItemMagazine.Builder().withAmmo(30)
        		.withCompatibleBullet(Bullets.Bullet9x19mm)
        		.withName("APC9Mag")
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.APC9Mag(), "apc9.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.8F, -2.5F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(0.7F, 0.7F, 0.7f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.ScorpionMag = new ItemMagazine.Builder()
        		.withAmmo(30)
        		.withCompatibleBullet(Bullets.Bullet9x19mm)
        		.withName("ScorpionMag")
        		.withRotationPoint(-0.12000000357627871, 1.0000000298023226, -1.680000050067902)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.ScorpionEVO3A1Magazine(), "scorpionevo3a1.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.9F, -2.2F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(0.7F, 0.7F, 0.7f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.P90Mag = new ItemMagazine.Builder()
        		.withAmmo(50)
        		.withCompatibleBullet(Bullets.Bullet57x28mm)
        		.withName("P90Mag")
        		.withRotationPoint(-0.12000000357627871, -1.1200000333786013, 1.8400000548362736)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.P90Mag(), "p90.png")
                .withRequiredAttachments(Attachments.P90DefaultKit, Attachments.AR57Receiver)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.8F, -0.3F);
                    GL11.glRotatef(-160F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glRotatef(5F, 0f, 0f, 1f);
                    GL11.glScaled(0.5F, 0.5F, 0.5f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.P90TerminatorMag = new ItemMagazine.Builder().withAmmo(65).withCompatibleBullet(Bullets.Bullet46x30mm)
                .withName("P90TerminatorMag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.M4A1Mag(), "M4A1Mag.png")
                .withRequiredAttachments(Attachments.P90Terminator)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.6F, -0.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1.1F, 1.1F, 1.1f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.MAC10Mag = new ItemMagazine.Builder()
        		.withAmmo(30)
        		.withCompatibleBullet(Bullets.Bullet45ACP)
        		.withName("MAC10Mag")
        		.withRotationPoint(0.08000000238418581, 0.5200000154972078, -0.5600000166893007)
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.MAC10Mag(), "mac10.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.2F, -1F);
                    GL11.glRotatef(-160F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glRotatef(5F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.G11Mag = new ItemMagazine.Builder().withAmmo(50)
        		.withCompatibleBullet(Bullets.Bullet473x33mm)
                .withName("G11Mag")
                .withRotationPoint(-0.12000000357627871, -1.5200000452995304, -3.8800001156330115)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.G11Mag(), "gun.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 1.8F, -2.3F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(0.5F, 0.5F, 0.5f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.ScarHMag = new ItemMagazine.Builder()
        		.withAmmo(20)
        		.withCompatibleBullet(Bullets.Bullet762x51)
        		.withName("ScarHMag_2")
        		.withRotationPoint(-0.16000000476837162, -0.16000000476837162, -1.5200000452995304)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.ScarHMag(), "scarh.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 1.3F, -3F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1.0F, 1.0F, 1.0f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.Scar40Mag = new ItemMagazine.Builder()
        		.withAmmo(40)
        		.withCompatibleBullet(Bullets.Bullet762x51)
        		.withName("Scar40Mag")
        		.withRotationPoint(-0.16000000476837162, -0.16000000476837162, -1.5200000452995304)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.Scar40Mag(), "gun.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.6F, -0.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1.1F, 1.1F, 1.1f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.Scar60Mag = new ItemMagazine.Builder()
        		.withAmmo(60)
        		.withCompatibleBullet(Bullets.Bullet762x51)
        		.withName("Scar60Mag")
        		.withRotationPoint(-0.16000000476837162, -0.16000000476837162, -1.5200000452995304)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.Stanag50(), "gun.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 1.2F, -2.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.VSSVintorezMag = new ItemMagazine.Builder()
        		.withAmmo(10)
        		.withCompatibleBullet(Bullets.Bullet9x39mm)
        		.withName("VSSVintorezMag_2")
        		.withRotationPoint(-0.040000001192092904, -0.28000000834465033, -1.3600000405311587)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.VSSVintorezMag(), "vssvintorez.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                	 GL11.glTranslatef(0.3F, 1.2F, -2.6F);
                     GL11.glRotatef(-150F, 0f, 1f, 0f);
                     GL11.glRotatef(-6F, 1f, 0f, 0f);
                     GL11.glRotatef(-15F, 0f, 0f, 1f);
                     GL11.glScaled(0.75F, 0.75F, 0.75f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.ASValMag = new ItemMagazine.Builder()
        		.withAmmo(20)
        		.withCompatibleBullet(Bullets.Bullet9x39mm)
        		.withName("ASValMag")
        		.withRotationPoint(-0.040000001192092904, -0.28000000834465033, -1.3600000405311587)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.ASValMag(), "vssvintorez.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.8F, -2.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(0.75F, 0.75F, 0.75f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.STG44Mag = new ItemMagazine.Builder().withAmmo(30).withCompatibleBullet(Bullets.Bullet792x33Kurz).withName("STG44Mag_2")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.STG44Mag(), "gun.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.7F, -2.3F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(0.6F, 0.6F, 0.6f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.G43GewehrMag = new ItemMagazine.Builder().withAmmo(10).withCompatibleBullet(Bullets.Bullet792x57).withName("g43_gewehr_mag")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.G43GewehrMag(), "gun.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.9F, -2F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1.4F, 1.4F, 1.4f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.SV98Mag = new ItemMagazine.Builder().withAmmo(10).withCompatibleBullet(Bullets.Bullet762x54).withName("SV98Mag_2")
                .withModId(ModernWarfareMod.MODID).withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.SV98Mag(), "sv98.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 2.2F, -3.7F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1.2F, 1.2F, 1.2f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.UziMag = new ItemMagazine.Builder()
        		.withAmmo(32)
        		.withCompatibleBullet(Bullets.Bullet9x19mm)
        		.withName("UziMag_2")
        		.withRotationPoint(-0.040000001192092904, 0.7200000214576723, -0.40000001192092904)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.UziMag(), "gun.png")

                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.3F, -0.8F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(0.9F, 0.9F, 0.9f);
                })
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                          Ores.INGOT_STEEL,
                          Ores.GunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        Magazines.VP70Mag = new ItemMagazine.Builder()
        		.withAmmo(18)
        		.withCompatibleBullet(Bullets.Bullet9x19mm)
        		.withName("VP70mag_2")
        		.withRotationPoint(-0.12000000357627871, 0.24000000715255743, 0.08000000238418581)
                .withModId(ModernWarfareMod.MODID)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.vicmatskiv.mw.models.VP70mag(), "gun.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.5F, -0.8F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(0.7F, 0.7F, 0.7f);
                })
                .withMaxStackSize(6)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

    }


}
