package fr.alasdiablo.woolarmor.item;

import fr.alasdiablo.woolarmor.init.WoolTags;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.contents.TranslatableContents;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.living.LivingFallEvent;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;

@ParametersAreNonnullByDefault
public class WoolArmorBoots extends ArmorItem {
    public WoolArmorBoots(ArmorMaterial material, EquipmentSlot equipmentSlot, Properties properties) {
        super(material, equipmentSlot, properties);
    }

    public static void onLivingFall(LivingFallEvent event) {
        var entityLiving = event.getEntity();
        var itemStack    = entityLiving.getItemBySlot(EquipmentSlot.FEET);
        var item         = itemStack.getItem();
        if (itemStack.is(WoolTags.FALL_DAMAGE_REDUCERS)) {
            event.setDamageMultiplier(0.5f);
            if (calculateFallDamage(entityLiving, event.getDistance(), event.getDamageMultiplier()) >= 1) {
                item.setDamage(itemStack, item.getDamage(itemStack) + 1);
            }
        }
    }

    private static int calculateFallDamage(LivingEntity livingEntity, float distance, float damageMultiplier) {
        var jumpEffect               = livingEntity.getEffect(MobEffects.JUMP);
        var heightBeforeTakingDamage = 3f;
        var actualFallingDistance    = distance - heightBeforeTakingDamage;
        if (jumpEffect != null) {
            var jumpHeight = jumpEffect.getAmplifier() + 1f;
            return Mth.ceil((actualFallingDistance - jumpHeight) * damageMultiplier);
        }
        return Mth.ceil(actualFallingDistance * damageMultiplier);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> tooltip, TooltipFlag tooltipFlag) {
        tooltip.add(Component.translatable("wool.armor.boots.hover.text").withStyle(ChatFormatting.GRAY));
    }
}
