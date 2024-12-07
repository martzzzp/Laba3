package skyObjects;

import exceptions.ObservationException;

public class Moon extends CosmicObject {
    private MoonSurfaceType surfaceDetails; // Тип поверхности (ENUM)
    private Position position;

    public Moon(String name, String type, MoonSurfaceType surfaceDetails, Position position){
        super(name, type);
        this.surfaceDetails = surfaceDetails;
        this.position = position;
    }
    public MoonSurfaceType getSurfaceDetails(){
        return surfaceDetails;
    }
    public void setSurfaceDetails(MoonSurfaceType surfaceDetails) {
        this.surfaceDetails = surfaceDetails;
    }
    public Position getPosition() {
        return position;
    }
    public void setPosition(Position position){
        this.position = position;
    }
    @Override
    public String describe(String newDescribe){ // Метод для описания текущего состояния Луны
        return "Луна с типом поверхности: " + surfaceDetails + " находится в позиции: " + position.toString();
    }
    public float calculateDistanceToPosition(Position otherPosition) { // Используем метод calculateDistance из класса skyObjects.Position
        return this.position.calculateDistance(otherPosition);
    }
    public void approach(Position targetPosition) { // Метод для приближения Луны к новой позиции
        float deltaX = targetPosition.getX() - this.position.getX();// Используем метод move из класса skyObjects.Position
        float deltaY = targetPosition.getY() - this.position.getY();
        float deltaZ = targetPosition.getZ() - this.position.getZ();
        this.position.move(deltaX, deltaY, deltaZ); // Перемещаем Луну на новое положение
        System.out.println("Луна приблизилась к новой позиции: " + this.position); // Сообщаем, что Луна приближена
    }
    public String observe() throws ObservationException { // Реализация метода observe() из интерфейса skyObjects.ObservableObject
        if (surfaceDetails == null) {
            throw new ObservationException("Не удалось определить поверхность Луны");
        }
        return "Луна наблюдается с поверхностью: " + surfaceDetails.name();
    }
}