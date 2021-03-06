package cn.nukkit.block;

/**
 * Created on 2015/11/23 by xtypr.
 * Package cn.nukkit.block in project Nukkit .
 */
public class FenceGateBirch extends FenceGate {
    public FenceGateBirch() {
        this(0);
    }

    public FenceGateBirch(int meta) {
        super(FENCE_GATE_BIRCH, meta);
    }

    @Override
    public String getName() {
        return "Birch Fence Gate";
    }
}
