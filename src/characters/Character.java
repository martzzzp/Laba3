package characters;
import exceptions.InvalidDataCharacterDataException;

public abstract class Character { // Определение абстрактного класса Character
    protected String name;
    protected String position;
    protected String state;
    public Character(String name, String position, String state){ // Конструктор для инициализации полей
        setName(name);
        this.position = position;
        this.state = state;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) throws InvalidDataCharacterDataException {
        if (name==null || name.trim().isEmpty()){
            throw new InvalidDataCharacterDataException("Имя не может быть пустым");
        }
        this.name = name;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public abstract void observe(); // Абстрактный метод observe (без реализации)
    public void move(String newPosition){ // Реализованный метод move
        System.out.println(name + " переместился в " + newPosition);
    }
}
