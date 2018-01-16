package com.ja0ck5.dp.abstractFactory;

import java.util.ArrayList;
import java.util.List;

public abstract class Tray extends Item {
    protected List tray = new ArrayList();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        tray.add(item);
    }

}
