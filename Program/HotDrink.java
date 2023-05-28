package Program;

public class HotDrink extends Product{
    private int temperature;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    public int getTemperature() {
        return temperature;
    }

    public HotDrink(String name, int volume, int temperature) {
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Горячий напиток: " + name + ", объем: " + volume + ", температура: " + temperature;
    }
}