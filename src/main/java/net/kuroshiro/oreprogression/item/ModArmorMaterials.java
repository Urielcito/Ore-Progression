package net.kuroshiro.oreprogression.item;

import net.kuroshiro.oreprogression.OreProgression;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    //TERRARIA

    TIN("tin", 14, new int[]{2, 4, 5, 2}, 9, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
        return Ingredient.of(ModItems.TIN_INGOT.get());
    }),

    QUALITY_COPPER("quality_copper", 13, new int[]{2, 4, 4, 1}, 8, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
        return Ingredient.of(ModItems.QUALITY_COPPER_INGOT.get());
    }),

    LEAD("lead", 16, new int[]{3, 6, 6, 2}, 15, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
        return Ingredient.of(ModItems.LEAD_INGOT.get());
    }),

    QUALITY_IRON("quality_iron", 17, new int[]{2, 6, 6, 2}, 12, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
        return Ingredient.of(ModItems.QUALITY_IRON_INGOT.get());
    }),

    SILVER("silver", 18, new int[]{3, 6, 6, 3}, 30, SoundEvents.ARMOR_EQUIP_IRON, 1.5F, 0.0F, () -> {
        return Ingredient.of(ModItems.SILVER_INGOT.get());
    }),
    TUNGSTEN("tungsten", 19, new int[]{3, 7, 6, 3}, 17, SoundEvents.ARMOR_EQUIP_IRON, 2.0F, 0.0F, () -> {
        return Ingredient.of(ModItems.TUNGSTEN_INGOT.get());
    }),

    PLATINUM("platinum", 21, new int[]{4, 7, 7, 4}, 22, SoundEvents.ARMOR_EQUIP_IRON, 3.0F, 0.1F, () -> {
        return Ingredient.of(ModItems.PLATINUM_INGOT.get());
    }),
    QUALITY_GOLD("quality_gold", 20, new int[]{3, 7, 6, 4}, 19, SoundEvents.ARMOR_EQUIP_IRON, 2.5F, 0.1F, () -> {
        return Ingredient.of(ModItems.QUALITY_GOLD_INGOT.get());
    }),

    CRIMTANE("crimtane", 25, new int[]{5, 8, 7, 5}, 35, SoundEvents.ARMOR_EQUIP_IRON, 4.0F, 0.15F, () -> {
        return Ingredient.of(ModItems.CRIMTANE_INGOT.get());
    }),
    DEMONITE("demonite", 26, new int[]{5, 7, 8, 5}, 35, SoundEvents.ARMOR_EQUIP_IRON, 4.0F, 0.15F, () -> {
        return Ingredient.of(ModItems.DEMONITE_INGOT.get());
    }),

    HELLSTONE("hellstone", 40, new int[]{7, 9, 9, 7}, 50, SoundEvents.ARMOR_EQUIP_IRON, 10.0F, 0.2F, () -> {
        return Ingredient.of(ModItems.HELLSTONE_INGOT.get());
    });

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    ModArmorMaterials(String p_40474_, int p_40475_, int[] p_40476_, int p_40477_, SoundEvent p_40478_, float p_40479_, float p_40480_, Supplier<Ingredient> p_40481_) {
        this.name = p_40474_;
        this.durabilityMultiplier = p_40475_;
        this.slotProtections = p_40476_;
        this.enchantmentValue = p_40477_;
        this.sound = p_40478_;
        this.toughness = p_40479_;
        this.knockbackResistance = p_40480_;
        this.repairIngredient = new LazyLoadedValue<>(p_40481_);
    }

    public int getDurabilityForSlot(EquipmentSlot p_40484_) {
        return HEALTH_PER_SLOT[p_40484_.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlot p_40487_) {
        return this.slotProtections[p_40487_.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return OreProgression.MOD_ID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }


}
