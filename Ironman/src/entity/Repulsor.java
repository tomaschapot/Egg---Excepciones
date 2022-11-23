package entity;

public class Repulsor {

    private Integer energyUsage;

    public Repulsor() {
    }

    public Repulsor(Integer energyUsage) {
        this.energyUsage = energyUsage;
    }

    public Integer getEnergyUsage() {
        return energyUsage;
    }

    public void setEnergyUsage(Integer energyUsage) {
        this.energyUsage = energyUsage;
    }

    @Override
    public String toString() {
        return "Repulsor{" + "energyUsage=" + energyUsage + '}';
    }

}
