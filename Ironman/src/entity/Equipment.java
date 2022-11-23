package entity;

public abstract class Equipment {

    protected Integer hardness;
    protected Integer health;
    protected Integer energyUsage;
    protected String material;
    protected String primaryColor;
    protected String secondaryColor;

    public Equipment() {
    }

    public Equipment(Integer hardness, Integer health, Integer energyUsage,
            String material, String primaryColor, String secondaryColor) {
        this.hardness = hardness;
        this.health = health;
        this.energyUsage = energyUsage;
        this.material = material;
        this.primaryColor = primaryColor;
        this.secondaryColor = secondaryColor;
    }

    public Integer getHardness() {
        return hardness;
    }

    public void setHardness(Integer hardness) {
        this.hardness = hardness;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getEnergyUsage() {
        return energyUsage;
    }

    public void setEnergyUsage(Integer energyUsage) {
        this.energyUsage = energyUsage;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getPrimaryColor() {
        return primaryColor;
    }

    public void setPrimaryColor(String primaryColor) {
        this.primaryColor = primaryColor;
    }

    public String getSecondaryColor() {
        return secondaryColor;
    }

    public void setSecondaryColor(String secondaryColor) {
        this.secondaryColor = secondaryColor;
    }

    @Override
    public String toString() {
        return "Equipment{" + "hardness=" + hardness + ", health="
                + health + ", energyUsage=" + energyUsage + ", material="
                + material + ", primaryColor=" + primaryColor + ", secondaryColor="
                + secondaryColor + '}';
    }

}
