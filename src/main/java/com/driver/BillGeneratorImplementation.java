package com.driver;

public class BillGeneratorImplementation implements BillGenerator {

    @Override
    public String getBill(Pizza pizza) {
        String var = "";
        var = var + "Base Price Of The Pizza: " + pizza.getBasePrice() + "\n";
        if(pizza.getCheeseAdded() == true){
            var = var + "Extra Cheese Added: " + pizza.getCheesePrice() + "\n";
        }
        if(pizza.getToppingsAdded() == true){
            var = var + "Extra Toppings Added: " +  pizza.getToppingPrice() + "\n";
        }
        if(pizza.getTakeaway() == true){
            var = var + "Paperbag price: " + pizza.getTakeawayPrice() + "\n";
        }
        var = var + "Total Price: " + pizza.getPrice() + "\n";

        return var;
    }
}
