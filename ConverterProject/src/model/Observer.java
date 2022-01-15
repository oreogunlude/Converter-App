package model;

import java.util.List;

/**
 * The Observer interface
 **/
public interface Observer {

    /**
     * update its value when the observer object receive a notification from subject
     *
     * @param values new values
     */
    void update(List<Double> values);
}
