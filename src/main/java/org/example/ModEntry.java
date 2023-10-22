package org.example;

import net.minecraft.crash.CrashReport;
import org.cubewhy.lunarcn.loader.api.ModInitializer;
import org.jetbrains.annotations.NotNull;

public class ModEntry implements ModInitializer {

    @Override
    public void onCrash(@NotNull CrashReport crashReport) {
        System.out.println("OOPS, game crashed, LOG = " + crashReport.getFile().getPath());
    }

    @Override
    public void onInit() {
        System.out.println("Lunar init!");
    }

    @Override
    public void onPreInit() {
        System.out.println("Init mod!");
    }

    @Override
    public void onStart() {
        System.out.println("Game started!");
    }

    @Override
    public void onStop() {
        System.out.println("See you again");
    }
}
