package info.avanish.allexamplesofandroid.observer;

/**
 * Created by kunwa on 3/14/2018.
 */
public interface Subject {
    void registerObserver(RepositoryObserver repositoryObserver);
    void removeObserver(RepositoryObserver repositoryObserver);
    void notifyObservers();
}
