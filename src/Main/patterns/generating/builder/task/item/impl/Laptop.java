package Main.patterns.generating.builder.task.item.impl;

import Main.patterns.generating.builder.task.item.Characteristic;
import Main.patterns.generating.builder.task.item.Item;

public class Laptop extends Item {

    public Laptop(Characteristic characteristic) {
        super(characteristic);
    }

    @Override
    public Characteristic getCharacteristic() {
        return characteristic;
    }
}
