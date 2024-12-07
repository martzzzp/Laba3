package rocket;

import skyObjects.Position;

public class Rocket {
    public final String name;
    public final Position position;

    public Rocket(String name, Position position){
        this.name = name;
        this.position = position;
    }
    public void move(float deltaX, float deltaY, float deltaZ) { // Используем метод move() из класса skyObjects.Position
        position.move(deltaX, deltaY, deltaZ);
        System.out.println("Ракета '" + name + "' перемещена на новую позицию: " + position);
    }
}
