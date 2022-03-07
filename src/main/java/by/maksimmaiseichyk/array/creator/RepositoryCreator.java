package by.maksimmaiseichyk.array.creator;

import by.maksimmaiseichyk.array.entity.MainCustomArray;
import by.maksimmaiseichyk.array.repository.Repository;

import java.util.ArrayList;

public interface RepositoryCreator {
    Repository createRepository(ArrayList<MainCustomArray> customArrays);
}
