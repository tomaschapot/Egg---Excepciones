package entity;

public class Armor extends Equipment {

    private Boot rightBoot;
    private Boot leftBoot;
    private Glove rightGlove;
    private Glove leftGlove;
    private Generator generator;
    private Helmet helmet;
    private Integer energy;
    
    //Basic Armor Generator

    public Armor() {
        
        super(100,100,500,"Steel","Red","Yellow");
        
        rightBoot = new Boot();
        leftBoot = new Boot();
        rightGlove = new Glove();
        leftGlove = new Glove();
        generator = new Generator();
        helmet = new Helmet();
        energy = 100;

    }
    
    //Custom Armor Generator

    public Armor(Boot rightBoot, Boot leftBoot, Glove rightGlove, Glove leftGlove, 
            Generator generator, Helmet helmet, Integer energy, Integer hardness, 
            Integer health, Integer energyUsage, String material, String primaryColor, 
            String secondaryColor) {
        
        super(hardness, health, energyUsage, material, primaryColor, secondaryColor);
        
        this.rightBoot = rightBoot;
        this.leftBoot = leftBoot;
        this.rightGlove = rightGlove;
        this.leftGlove = leftGlove;
        this.generator = generator;
        this.helmet = helmet;
        this.energy = energy;
    }

    public Boot getRightBoot() {
        return rightBoot;
    }

    public void setRightBoot(Boot rightBoot) {
        this.rightBoot = rightBoot;
    }

    public Boot getLeftBoot() {
        return leftBoot;
    }

    public void setLeftBoot(Boot leftBoot) {
        this.leftBoot = leftBoot;
    }

    public Glove getRightGlove() {
        return rightGlove;
    }

    public void setRightGlove(Glove rightGlove) {
        this.rightGlove = rightGlove;
    }

    public Glove getLeftGlove() {
        return leftGlove;
    }

    public void setLeftGlove(Glove leftGlove) {
        this.leftGlove = leftGlove;
    }

    public Generator getGenerator() {
        return generator;
    }

    public void setGenerator(Generator generator) {
        this.generator = generator;
    }

    public Helmet getHelmet() {
        return helmet;
    }

    public void setHelmet(Helmet helmet) {
        this.helmet = helmet;
    }

    public Integer getEnergy() {
        return energy;
    }

    public void setEnergy(Integer energy) {
        this.energy = energy;
    }

    @Override
    public String toString() {
        return "Armor{" + "rightBoot=" + rightBoot + ", leftBoot=" + leftBoot + 
                ", rightGlove=" + rightGlove + ", leftGlove=" + leftGlove + 
                ", generator=" + generator + ", helmet=" + helmet + ", energy=" +
                energy + '}';
    }
    
    
    
    

}
