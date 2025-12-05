package h3;

public class Mensch {
    private String name;
    private int gebJahr;
    private int alter;

    public void setName(String name) {
        this.name = name;
    }

    public void setGebJahr(int gebJahr) {
        this.gebJahr = gebJahr;
    }

    public void setAlter() {
        int aktuellesJahr = 2025;
        this.alter = aktuellesJahr - this.gebJahr;
    }

    public String getName() {
        return this.name;
    }

    public int getGebJahr() {
        return this.gebJahr;
    }

    public int getAlter() {
        return this.alter;
    }
}

