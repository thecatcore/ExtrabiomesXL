package net.minecraft.src;

public class BiomeGenForestedIsland extends BiomeGenBase
{

    public BiomeGenForestedIsland(int i)
    {
        super(i);
        biomeDecorator.treesPerChunk = 7;
        biomeDecorator.grassPerChunk = 3;
    }
}