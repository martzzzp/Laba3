package skyObjects;
import exceptions.ObservationException;

public interface ObservableObject {
    SkyObservationObjects observe() throws ObservationException; //Любой класс, реализующий этот интерфейс, должен содержать метод observe(), который возвращает описание наблюдаемого объекта и может выбрасывать исключение exceptions.ObservationException.
}
