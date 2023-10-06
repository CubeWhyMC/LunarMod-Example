package org.example.hooks;

import org.cubewhy.lunarcn.loader.api.Hook;
import org.jetbrains.annotations.NotNull;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodInsnNode;

public class HookMinecraft extends Hook {

    public HookMinecraft() {
        super("net/minecraft/client/Minecraft"); // The target class
    }

    @Override
    public void transform(@NotNull ClassNode classNode, @NotNull AssemblerConfig assemblerConfig) {
        // like ASM
        classNode.methods.stream()
                .filter(m -> m.name.equals("startGame"))
                .findFirst().orElseThrow()
                .instructions.insert(
                        new MethodInsnNode(
                                Opcodes.INVOKESTATIC,
                                Type.getInternalName(HookMinecraft.class),
                                "onStartGame",
                                "()V"
                        )
                );
    }

    public static void onStartGame() {
        System.out.println("Minecraft Hook!");
    }
}
