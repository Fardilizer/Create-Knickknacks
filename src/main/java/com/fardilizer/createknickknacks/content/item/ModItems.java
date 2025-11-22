package com.fardilizer.createknickknacks.content.item;

import com.fardilizer.createknickknacks.createknickknacks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(createknickknacks.MOD_ID);


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
