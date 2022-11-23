package entity;

public class Propeller {

    private Integer energyUsage;

    public Propeller() {
    }

    public Propeller(Integer energyUsage) {
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
        return "Propeller{" + "energyUsage=" + energyUsage + '}';
    }

}
