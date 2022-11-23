package entity;

public class Helmet extends Equipment {

    private Console console;
    private Synthetizer synthetizer;

    public Helmet() {

        console = new Console();
        synthetizer = new Synthetizer();
    }

    public Helmet(Console console, Synthetizer synthetizer, Integer hardness,
            Integer health, Integer energyUsage, String material,
            String primaryColor, String secondaryColor) {
        super(hardness, health, energyUsage, material, primaryColor, secondaryColor);
        this.console = console;
        this.synthetizer = synthetizer;
    }

    public Console getConsole() {
        return console;
    }

    public void setConsole(Console console) {
        this.console = console;
    }

    public Synthetizer getSynthetizer() {
        return synthetizer;
    }

    public void setSynthetizer(Synthetizer synthetizer) {
        this.synthetizer = synthetizer;
    }

    @Override
    public String toString() {
        return "Helmet{" + "console=" + console + ", synthetizer=" + synthetizer + '}';
    }

}
