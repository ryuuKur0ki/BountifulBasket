package model;

public class ShopItem {
    double itemPrice;
    int quantity = 1;
    String itemName;
    String imgSource;
    
    public double getTotal() {
        return this.itemPrice * this.quantity;
    }
    
    public void setQuantity(int setQuantity){
        this.quantity = setQuantity;
    }    
    
    public String getPrice() {
        return Double.toString(itemPrice);
    }
    
    public String getName() {
        return itemName;
    }
    
    public String getPic() {
        return imgSource;
    }
}