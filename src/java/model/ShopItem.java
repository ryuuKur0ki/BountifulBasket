package model;

public class ShopItem {
    double itemPrice;
    double totalPrice;
    int quantity = 1;
    String itemName;
    String imgSource;
    String itemID;
    
    // Setters
    public void setQuantity(int setQuantity){
        this.quantity = setQuantity;
    }
    
    public void setPrice(double givenPrice){
        this.itemPrice = givenPrice;
    }
    
    public void setName(String itemInfo){
        this.itemName = itemInfo;
    }
    
    public void setSource(String givenImg){
        this.imgSource = givenImg;
    }
    
    public void setTotal() {
        this.totalPrice = this.itemPrice * this.quantity;
    }
    
    // Getters
    public double getTotal(){
        return totalPrice;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public String getPrice() {
        return Double.toString(itemPrice);
    }
    
    public String getID() {
        return itemID;
    }
    
    public String getName() {
        return itemName;
    }
    
    public String getPic() {
        return imgSource;
    }    
}