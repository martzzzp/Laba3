package skyObjects;

public class Position {
    private float x;
    private float y;
    private float z;

    public Position(float x, float y,float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    public float getZ() {
        return z;
    }

    public float calculateDistance(Position other){ // Метод для вычисления дистанции до другой позиции
        return (float) Math.sqrt (Math.pow(other.x - this.x, 2) + Math.pow(other.y - this.y, 2) + Math.pow(other.z - this.z, 2));
    }
    public void move(float deltaX, float deltaY, float deltaZ){  // Метод для перемещения на заданное расстояние
        this.x = deltaX;
        this.y = deltaY;
        this.z = deltaZ;
        System.out.println("Позиция перемещена на (" + deltaX + ", " + deltaY + ", " + deltaZ + ")");
    }
    public String toString(){ // Метод для отображения позиции в строковом формате. В Java, если явно не указывать наследование, каждый класс неявно наследуется от базового класса Object, предоставляющего базовые методы (например, toString(), equals(), hashCode()).
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
