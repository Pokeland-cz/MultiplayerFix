package cz.pokeland.multiplayerfix.mixin.client;

import com.mojang.patchy.BlockedServers;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BlockedServers.class)
public class BlockedServersMixin {
    @Inject(method = "isBlockedServer", cancellable=true, at=@At("HEAD"), remap = false)
    private static void isBlockedServer(String server, CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(false);
    }
    @Inject(method = "isBlockedServerHostName", cancellable=true, at=@At("HEAD"), remap = false)
    private static void isBlockedServerHostName(String server, CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(false);
    }
}
