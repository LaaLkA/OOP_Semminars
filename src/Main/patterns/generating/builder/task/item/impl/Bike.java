package Main.patterns.generating.builder.task.item.impl;

import Main.patterns.generating.builder.task.item.Characteristic;
import Main.patterns.generating.builder.task.item.Item;

public class Bike extends Item {

    public Bike(Characteristic characteristic) {
        super(characteristic);
    }


    @Override
    public Characteristic getCharacteristic() {
        return characteristic;
    }
}
