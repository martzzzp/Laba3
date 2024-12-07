package characters;

public class Ponchik extends Character {
    private int fearLevel; // Уровень страха
    private boolean reluctance; // Нежелание наблюдать

    public Ponchik(String name, String position, String state, int FearLevel) {
        super(name, position, state);
        this.fearLevel = FearLevel;
        this.reluctance = false; // Изначально наблюдает без нежелания
    }

    public int getFearLevel() {
        return fearLevel;
    }

    public void setFearLevel(int FearLevel) {
        this.fearLevel = FearLevel;
    }

    public boolean getReluctance() {
        return reluctance;
    }

    public void setReluctance(boolean reluctance) {
        this.reluctance = reluctance;
    }

    @Override
    public void observe() {
        if (reluctance) {
            System.out.println(name + " неохотно наблюдает из позиции " + position);
        } else {
            System.out.println(name + " наблюдает из позиции " + position);
        }
    }

    public void observeReluctantly() {
        System.out.println(name + " наблюдает, хотя ему это очень не нравится");
    }

    public void expressFear() {
        System.out.println(name + " выражает страх. Уровень страха: " + fearLevel);
    }
}