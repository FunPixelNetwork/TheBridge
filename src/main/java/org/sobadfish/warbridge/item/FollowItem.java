package org.sobadfish.warbridge.item;

import cn.nukkit.item.Item;
import cn.nukkit.item.enchantment.Enchantment;
import cn.nukkit.nbt.tag.CompoundTag;
import cn.nukkit.utils.TextFormat;

/**
 * 跟随玩家
 *
 * @author SoBadFish
 * 2022/8/10
 */
public class FollowItem {



    public static int getIndex(){
        return 5;
    }

    public static Item get(){
        Item item = Item.get(345);
        item.addEnchantment(Enchantment.get(9));
        CompoundTag tag = item.getNamedTag();
        tag.putString("WarBridge","follow");
        item.setNamedTag(tag);
        item.setCustomName(TextFormat.colorize('&',"&r&l&e点我传送到玩家"));
        return item;

    }
}
