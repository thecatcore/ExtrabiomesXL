package net.minecraft.src;

public class BiomeGenMeadow extends BiomeGenBase
{

    protected BiomeGenMeadow(int i)
    {
        super(i);
        biomeDecorator.flowersPerChunk = 9;
        biomeDecorator.grassPerChunk = 12;
        biomeDecorator.treesPerChunk = -999;
    }
}