package fr.alasdiablo.mods.wool.armor.data;

import fr.alasdiablo.mods.wool.armor.WoolArmorCommon;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class WoolArmorBlocksTagsProvider extends BlockTagsProvider {
    public WoolArmorBlocksTagsProvider(
            PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
            @Nullable ExistingFileHelper existingFileHelper
    ) {
        super(output, lookupProvider, WoolArmorCommon.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(@NotNull HolderLookup.Provider pProvider) {
    }
}
