package com.shatteredpixel.shatteredpixeldungeon.items.rings;

import com.shatteredpixel.shatteredpixeldungeon.items.Item;

public class RingOfSearching  extends Ring {

    {
        name = "Ring of Searching";
        cursed = false;
    }

    @Override
    protected RingBuff buff( ) {
        return new EasySearch();
    }

    @Override
    public String desc() {
        return isKnown() ?
                "When wearing this ring brings out of place things into focus "+
                        "making searches easier. "+
                        "A degraded ring makes it tougher to find things." :
                super.desc();
    }

    public class EasySearch extends RingBuff {
    }
}