package model;

import java.util.ArrayList;

public class ShopInitializer {
    public ArrayList<ShopItem> getStock(){
        ArrayList<ShopItem> stonk = new ArrayList();
        
        // Cabbage
        ShopItem cabbage = new ShopItem();                
        cabbage.itemPrice = 120.00;
        cabbage.itemName = "Cabbage (~1kg)";
        cabbage.imgSource = "cabbage.jpg";
        cabbage.itemID = "cabbage";
        stonk.add(cabbage);

        // Carrots
        ShopItem carrot = new ShopItem(); 
        carrot.itemPrice = 110.50;
        carrot.itemName = "Carrots (~1kg)";
        carrot.imgSource = "carrots.png";
        carrot.itemID = "carrot";
        stonk.add(carrot);
        
        // Potatoes
        ShopItem potat = new ShopItem(); 
        potat.itemPrice = 125.00;
        potat.itemName = "White Potatoes (~1kg)";
        potat.imgSource = "potatoes.jpg";
        potat.itemID = "potato";
        stonk.add(potat);
        
        // Tomatoes
        ShopItem tomat = new ShopItem(); 
        tomat.itemPrice = 50.35;
        tomat.itemName = "Tomatoes (~1/2 kg)";
        tomat.imgSource = "tomatoes.jpg";
        tomat.itemID = "tomato";
        stonk.add(tomat);
        
        // Rice
        ShopItem wice = new ShopItem(); 
        wice.itemPrice = 410.50;
        wice.itemName = "Well-Milled Rice (10 kgs)";
        wice.imgSource = "rice.jpg";
        wice.itemID = "rice";
        stonk.add(wice);
        
        // Melons
        ShopItem owo = new ShopItem();
        owo.itemPrice = 170.50;
        owo.itemName = "Melons (~2 kgs)";
        owo.imgSource = "melon.jpg";
        owo.itemID = "melon";
        stonk.add(owo);
        
        // Watermelons
        ShopItem watame = new ShopItem();
        watame.itemPrice = 230.30;
        watame.itemName = "Watermelons (~3 kgs)";
        watame.imgSource = "watermelon.jpg";
        watame.itemID = "watermelon";
        stonk.add(watame);
        
        // Pomelo
        ShopItem pamela = new ShopItem();
        pamela.itemPrice = 229.80;
        pamela.itemName = "Pomelo (~1.3 kgs)";
        pamela.imgSource = "pomelo.jpg";
        pamela.itemID = "pomelo";
        stonk.add(pamela);
        
        // Chico
        ShopItem choco = new ShopItem();
        choco.itemPrice = 179.10;
        choco.itemName = "Chicos (~1.4 kgs)";
        choco.imgSource = "chico.jpg";
        choco.itemID = "chico";
        stonk.add(choco);
        
        return stonk;
    }
}