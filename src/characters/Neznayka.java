package characters;

public class Neznayka extends Character {
    private int curiosityLevel; // Уровень любопытства
    private String observationDetails; // Детали наблюдений

    public Neznayka(String name, String position, String state, int CuriosityLevel){
        super(name, position, state);
        this.curiosityLevel = CuriosityLevel;
        this.observationDetails = " "; // Изначально пусто
    }
    public int getCuriosityLevel(){
        return curiosityLevel;
    }
    public void setCuriosityLevel(int CuriosityLevel){
        this.curiosityLevel = CuriosityLevel;
    }
    public String getObservationDetails(){
        return observationDetails;
    }
    public void setObservationDetails(String ObservationDetails){
        this.observationDetails = ObservationDetails;
    }
    @Override
    public void observe(){
        System.out.println(name + " внимательно наблюдает из позиции " + position);
    }
    public void observeDetailed(String SurfaceDetails){ // Метод для подробного наблюдения за поверхностью
        observationDetails = "подробное наблюдение за" + SurfaceDetails;
        System.out.println(name + " делает подробное наблюдение: " + observationDetails);
    }
}
