package org.example;

import org.cubewhy.lunarcn.loader.api.ModInitializer;

public class ModEntry implements ModInitializer {
    @Override
    public void preInit() {
        System.out.println("Init mod!");
    }
}
