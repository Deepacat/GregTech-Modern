package com.gregtechceu.gtceu.integration.kjs.block;

import com.gregtechceu.gtceu.api.block.ICoilType;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import lombok.Getter;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.StringRepresentable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.annotation.Nonnull;

public class KJSCoilType implements StringRepresentable, ICoilType {

    @Getter
    private final String name;
    //electric blast furnace properties
    @Getter
    private final int coilTemperature;
    //multi smelter properties
    @Getter
    private final int level;
    @Getter
    private final int tier;
    @Getter
    private final int energyDiscount;
    @Getter
    private final Material material;
    @Getter
    private final ResourceLocation texture;

    public KJSCoilType(String name, int coilTemperature, int level, int energyDiscount, int tier, Material material, ResourceLocation texture) {
        this.name = name;
        this.coilTemperature = coilTemperature;
        this.level = level;
        this.energyDiscount = energyDiscount;
        this.tier = tier;
        this.material = material;
        this.texture = texture;
    }

    @Nonnull
    @Override
    public String toString() {
        return getName();
    }

    @Override
    @Nonnull
    public String getSerializedName() {
        return name;
    }
}