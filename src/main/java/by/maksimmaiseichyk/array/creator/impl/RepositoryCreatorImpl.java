package by.maksimmaiseichyk.array.creator.impl;

import by.maksimmaiseichyk.array.creator.RepositoryCreator;
import by.maksimmaiseichyk.array.entity.MainCustomArray;
import by.maksimmaiseichyk.array.repository.Repository;
import by.maksimmaiseichyk.array.repository.impl.RepositoryImpl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;

public class RepositoryCreatorImpl implements RepositoryCreator {
    private static final Logger LOGGER = LogManager.getLogger();

    public Repository createRepository(ArrayList<MainCustomArray> customArrays) {
        LOGGER.info("create new Repository method called");
        Repository repository = RepositoryImpl.getInstance();
        repository.addAll(customArrays);
        return repository;
    }
}
