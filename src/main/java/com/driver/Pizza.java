package com.driver;

public class Pizza {


    private int price; //final price
    private Boolean isVeg;
    private String bill;
    private int basePrice;

    private Boolean isCheeseAdded;
    private Boolean isToppingsAdded;
    private Boolean takeaway;
    private int toppingPrice;
    private int cheesePrice = 80;
    private int vegToppingsPrice = 70;
    private int nonVegToppingsPrice = 120;
    private int takeawayPrice = 20;

    private int vegBasePrice = 300;
    private int nonVegBasePrice = 400;
//    private BillGenerator billGenerator;


    public Boolean getVeg() {
        return isVeg;
    }

    public Boolean getCheeseAdded() {
        return isCheeseAdded;
    }

    public Boolean getToppingsAdded() {
        return isToppingsAdded;
    }

    public Boolean getTakeaway() {
        return takeaway;
    }

    public boolean isCheeseAdded() {
        return isCheeseAdded;
    }

    public boolean isToppingsAdded() {
        return isToppingsAdded;
    }

    public boolean isTakeaway() {
        return takeaway;
    }

    public int getToppingPrice() {
        return toppingPrice;
    }

    public int getCheesePrice() {
        return cheesePrice;
    }

    public int getVegToppingsPrice() {
        return vegToppingsPrice;
    }

    public int getNonVegToppingsPrice() {
        return nonVegToppingsPrice;
    }

    public int getTakeawayPrice() {
        return takeawayPrice;
    }

    public int getVegBasePrice() {
        return vegBasePrice;
    }

    public int getNonVegBasePrice() {
        return nonVegBasePrice;
    }

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        basePrice = getBasePrice();
        price = basePrice;
        isCheeseAdded = false;
        isToppingsAdded = false;
        takeaway = false;
//        this.billGenerator = new BillGeneratorImplementation()
        // your code goes here
    }
    public int getBasePrice(){
        if(isVeg == true){
            price = vegBasePrice;
        }
        else{
            price = nonVegBasePrice;
        }
        return price;
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded == false){
            isCheeseAdded = true;
            price = price + cheesePrice;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingsAdded == false){
            isToppingsAdded = true;
            if(isVeg == true){
                toppingPrice = vegToppingsPrice;
                price = price + toppingPrice;
            }
            else{
                toppingPrice = nonVegToppingsPrice;
                price = price + toppingPrice;
            }
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(takeaway == false){
            takeaway = true;
            price = price + takeawayPrice;
        }
    }

    public String getBill(){
        // your code goes here
        String var = "";
        var = var + "Base Price Of The Pizza: " + basePrice + "\n";
        if(isCheeseAdded == true){
            var = var + "Extra Cheese Added: " + cheesePrice + "\n";
        }
        if(isToppingsAdded == true){
            var = var + "Extra Toppings Added: " +  toppingPrice + "\n";
        }
        if(takeaway == true){
            var = var + "Paperbag price: " + takeawayPrice + "\n";
        }
        var = var + "Total Price: " + price + "\n";

        this.bill = var;

        return this.bill;
    }
}
