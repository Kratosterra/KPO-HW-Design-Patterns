package Observer;

import java.util.ArrayList;

public class StateTrafficInspectorate implements Subject {
    private final ArrayList<Observer> observers;
    private String violation;
    private String area;
    private int carNumber;

    public StateTrafficInspectorate() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);
        if (index >= 0) {
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update(violation, area, carNumber);
        }
    }

    public void setViolation(String violation, String area, int carNumber) {
        this.violation = violation;
        this.area = area;
        this.carNumber = carNumber;
        displayNewViolation();
        notifyObservers();
    }

    private void displayNewViolation() {
        System.out.println("!!!\nГлавное управление по обеспечению безопасности дорожного движения выдаёт новое распоряжение по нарушению " +
                "'" + violation + "' " +
                "в зоне '" + area + "' " +
                "с номером автомобиля: " + carNumber + "\n");
    }
}
