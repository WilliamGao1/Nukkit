package cn.nukkit.level.generator.normal.biome;

import cn.nukkit.block.Sapling;
import cn.nukkit.level.generator.populator.PopulatorTallGrass;
import cn.nukkit.level.generator.populator.PopulatorTree;

/**
 * author: MagicDroidX
 * Nukkit Project
 */
public class TaigaBiome extends SnowyBiome {

    public TaigaBiome() {
        super();

        PopulatorTree trees = new PopulatorTree(Sapling.SPRUCE);
        trees.setBaseAmount(10);
        this.addPopulator(trees);

        PopulatorTallGrass tallGrass = new PopulatorTallGrass();
        tallGrass.setBaseAmount(1);

        this.addPopulator(tallGrass);

        this.setElevation(63, 81);

        this.temperature = 0.05;
        this.rainfall = 0.8;
    }

    @Override
    public String getName() {
        return "Taiga";
    }
}
