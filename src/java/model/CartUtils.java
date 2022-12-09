package model;

import java.util.ArrayList;

public class CartUtils {
    public ShopItem retrieveItemByID(ArrayList<ShopItem> stock, String ID){
        for (ShopItem item : stock) {
            if (item.getID().equals(ID)) {
                return item;
            }
        }
        return null;
    }
    
    public boolean inList(ArrayList<ShopItem> list, String itemID) {
        for (ShopItem item : list) {
            if (item.getID().equals(itemID)) {
                return true;                
            }
        }
        return false;
    }
}