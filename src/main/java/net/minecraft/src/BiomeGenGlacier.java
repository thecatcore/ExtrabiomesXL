package net.minecraft.src;

public class BiomeGenGlacier extends BiomeGenBase
{

    public BiomeGenGlacier(int i)
    {
        super(i);
        spawnableCreatureList.clear();
        topBlock = (byte)Block.blockSnow.blockID;
        fillerBlock = (byte)Block.ice.blockID;
        biomeDecorator.treesPerChunk = -999;
    }
}