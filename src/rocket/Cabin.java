package rocket;

import exceptions.ObservationException;

public class Cabin {
    private int illuminators;

    public Cabin(int illuminators) {
        this.illuminators = illuminators;
    }

    public void provideView() { //Метод для предоставления обзора через все иллюминаторы.
        System.out.println("Обзор через иллюминаторы:");
    }
}
