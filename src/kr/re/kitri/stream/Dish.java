package kr.re.kitri.stream;

public class Dish {
    private String name;
    private boolean vegeterian;
    private int calrories;
    private String type;

    public Dish() {}
    public Dish(String name, boolean vegeterian, int calrories, String type) {
        this.name = name;
        this.vegeterian = vegeterian;
        this.calrories = calrories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVegeterian() {
        return vegeterian;
    }

    public void setVegeterian(boolean vegeterian) {
        this.vegeterian = vegeterian;
    }

    public int getCalrories() {
        return calrories;
    }

    public void setCalrories(int calrories) {
        this.calrories = calrories;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", vegeterian=" + vegeterian +
                ", calrories=" + calrories +
                ", type='" + type + '\'' +
                '}';
    }
}
