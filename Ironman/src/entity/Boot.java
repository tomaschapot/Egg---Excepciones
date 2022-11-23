package entity;

public class Boot extends Equipment {

    private Propeller propeller;

    public Boot() {

        propeller = new Propeller();
    }

    public Boot(Propeller propeller, Integer hardness, Integer health, Integer energyUsage, String material, String primaryColor, String secondaryColor) {
        super(hardness, health, energyUsage, material, primaryColor, secondaryColor);
        this.propeller = propeller;
    }

    public Propeller getPropeller() {
        return propeller;
    }

    public void setPropeller(Propeller propeller) {
        this.propeller = propeller;
    }

    @Override
    public String toString() {
        return "Boot{" + "propeller=" + propeller + '}';
    }

}
