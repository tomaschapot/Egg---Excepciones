package entity;

import enums.GloveMode;

public class Glove extends Equipment {

    private Repulsor repulsor;
    private GloveMode gloveMode;

    public Glove() {

        repulsor = new Repulsor();
        gloveMode = gloveMode.PROPELL;
    }

    public Glove(Repulsor repulsor, GloveMode gloveMode, Integer hardness, Integer health, Integer energyUsage, String material, String primaryColor, String secondaryColor) {
        super(hardness, health, energyUsage, material, primaryColor, secondaryColor);
        this.repulsor = repulsor;
        this.gloveMode = gloveMode;
    }

    public Repulsor getRepulsor() {
        return repulsor;
    }

    public void setRepulsor(Repulsor repulsor) {
        this.repulsor = repulsor;
    }

    public GloveMode getGloveMode() {
        return gloveMode;
    }

    public void setGloveMode(GloveMode gloveMode) {
        this.gloveMode = gloveMode;
    }

    @Override
    public String toString() {
        return "Glove{" + "repulsor=" + repulsor + ", gloveMode=" + gloveMode + '}';
    }

}
