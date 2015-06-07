package cn.nukkit.entity;

import cn.nukkit.level.Location;
import cn.nukkit.metadata.MetadataValue;
import cn.nukkit.metadata.Metadatable;
import cn.nukkit.plugin.Plugin;

import java.util.List;

/**
 * author: MagicDroidX
 * Nukkit Project
 */
public abstract class Entity extends Location implements Metadatable {

    protected int id;

    public int getId() {
        return this.id;
    }

    @Override
    public void setMetadata(String metadataKey, MetadataValue newMetadataValue) {
        //todo
    }

    @Override
    public List<MetadataValue> getMetadata(String metadataKey) {
        //todo
        return null;
    }

    @Override
    public boolean hasMetadata(String metadataKey) {
        //todo
        return false;
    }

    @Override
    public void removeMetadata(String metadataKey, Plugin owningPlugin) {
        //todo
    }

}