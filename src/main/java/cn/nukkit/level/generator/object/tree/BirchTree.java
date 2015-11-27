package cn.nukkit.level.generator.object.tree;

import cn.nukkit.block.Block;
import cn.nukkit.block.Wood;
import cn.nukkit.level.ChunkManager;

import java.util.Random;

/**
 * author: MagicDroidX
 * Nukkit Project
 */
public class BirchTree extends ObjectTree {
    protected int treeHeight = 7;

    @Override
    public int getTrunkBlock() {
        return Block.LOG;
    }

    @Override
    public int getLeafBlock() {
        return Block.LEAVES;
    }

    @Override
    public int getType() {
        return Wood.BIRCH;
    }

    @Override
    public int getTreeHeight() {
        return this.treeHeight;
    }

    @Override
    public void placeObject(ChunkManager level, int x, int y, int z, Random random) {
        this.treeHeight = random.nextInt(3) + 5;
        super.placeObject(level, x, y, z, random);
    }
}
