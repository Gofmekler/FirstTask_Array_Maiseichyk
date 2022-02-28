package by.maksimmaiseichyk.array.repository;

import by.maksimmaiseichyk.array.entity.MainCustomArray;
import com.sun.tools.javac.Main;

import java.util.Collection;
import java.util.List;

public interface Repository {
    void addObjectToRepository(MainCustomArray someArray);
    void removeObjectFromRepository(MainCustomArray someArray);
    void addAll(Collection<MainCustomArray> someArray);
    void removeAll(Collection<MainCustomArray> someArray);
    List<MainCustomArray> query(Specifications specification);

    }