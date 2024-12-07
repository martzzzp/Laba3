package skyObjects;

public class CosmicObject {
    protected String name;
    protected String type;

    public CosmicObject(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String describe(String newDescribe) {
        System.out.println(newDescribe);
        return newDescribe;
    }
}
