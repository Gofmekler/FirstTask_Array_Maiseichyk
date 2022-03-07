package by.maksimmaiseichyk.array.observer;

import by.maksimmaiseichyk.array.entity.MainCustomArray;

import java.util.EventObject;

public class ArrayEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public ArrayEvent(MainCustomArray source) {
        super(source);
    }
    public MainCustomArray getSource() {
        return (MainCustomArray) super.getSource();
    }
}
