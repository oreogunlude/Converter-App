package model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Model class
 **/
public class ValueToConvert implements Subject {

    /*Store all values entered by user*/
    private final List<Double> values = new LinkedList<>();
    /*Store all observers which subscribe the model state's change*/
    private final List<Observer> observers = new ArrayList<>();

    /**
     * store the input value from the yellow view and automatically notifies the green and orange views
     *
     * @param centimeters the input value from the yellow view
     */
    public void update(String centimeters) {
        values.clear();
        String[] dataArray = centimeters.split("\n");
        for (int i = 0; i < dataArray.length; i++) {
            values.add(Double.parseDouble(dataArray[i]));
        }
        notifyObservers();
    }

    /**
     * store an observer
     *
     * @param observer given observer
     * @return true/false
     */
    @Override
    public boolean register(Observer observer) {
        return observers.add(observer);
    }

    /**
     * notify all observers after it has been changed
     */
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(values);
        }
    }
}
