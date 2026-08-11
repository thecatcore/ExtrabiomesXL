package net.minecraft.src;

public class BiomeGenIceWasteland extends BiomeGenBase
{

    public BiomeGenIceWasteland(int i)
    {
        super(i);
        spawnableCreatureList.clear();
        topBlock = (byte)Block.ice.blockID;
        fillerBlock = (byte)Block.ice.blockID;
        biomeDecorator.treesPerChunk = -999;
    }
}