package entity;

public class Generator {

    Integer generationRate;

    public Generator() {
    }

    public Generator(Integer generationRate) {
        this.generationRate = generationRate;
    }

    public Integer getGenerationRate() {
        return generationRate;
    }

    public void setGenerationRate(Integer generationRate) {
        this.generationRate = generationRate;
    }

    @Override
    public String toString() {
        return "Generator{" + "generationRate=" + generationRate + '}';
    }

}
