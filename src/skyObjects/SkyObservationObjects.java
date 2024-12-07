package skyObjects;

public record SkyObservationObjects(String object1, String object2) {
    @Override
    public String toString() {
        return "Object 1: " + (object1 == null || object1.isEmpty() ? "None" : object1) + ", Object 2: " + (object2 == null || object2.isEmpty() ? "None" : object2);
    }
}
