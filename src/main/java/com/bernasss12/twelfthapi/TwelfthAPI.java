package com.bernasss12.tweltfthapi;

import com.bernasss12.tweltfthapi.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = TweltfthAPI.MODID, version = TweltfthAPI.VERSION, name = TweltfthAPI.NAME)
public class TweltfthAPI
{
    public static final String MODID = "tweltfthapi";
    public static final String VERSION = "0.1";
    public static final String NAME = "Tweltfth API";

    @SidedProxy(clientSide = "com.bernasss12.tweltfthapi.proxy.ClientProxy", serverSide = "com.bernasss12.tweltfthapi.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static TweltfthAPI instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}
