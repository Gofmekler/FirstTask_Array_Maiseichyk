package by.maksimmaiseichyk.array.observer;

import by.maksimmaiseichyk.array.entity.MainCustomArray;

public interface ArrayObserver {
    void arrayParametersChanged(ArrayEvent event);
}
