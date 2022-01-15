package model;

/**
 * The Subject interface
 **/
public interface Subject {

    /**
     * register a given observer object which subscribe this subject
     *
     * @param observer given observer
     * @return true if register successfully, otherwise false
     */
    boolean register(Observer observer);

    /**
     * notify all observers when this subject has changed
     */
    void notifyObservers();
}
