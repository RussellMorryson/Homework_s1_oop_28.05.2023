package Program;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine extends VendingMachine{
    private List <HotDrink> drinks;

    public HotDrinkVendingMachine() {
        this.drinks = new ArrayList<>();
    }

    public void addDrink (HotDrink drink) {
        drinks.add(drink);
    }

    public String getProduct(String name, int volume, int temperature) {       
        for (HotDrink drink : drinks) {
            if (drink.getName() == name && drink.getVolume() == volume && drink.getTemperature() == temperature) {
                System.out.println("Найдено!");
                return drink.toString();
            }
        }
        return "Не найдено3!";
    }
}