public abstract class Telephone implements Printable {
    private String model;
    private int years;
    private Color color;

    public Telephone(String model, int years, Color color) {
        this.model = model;
        this.years = years;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public int getYears() {
        return years;
    }

    public Color getColor() {
        return color;
    }
}

