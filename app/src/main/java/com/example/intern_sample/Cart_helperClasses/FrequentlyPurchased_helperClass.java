package com.example.intern_sample.Cart_helperClasses;

public class FrequentlyPurchased_helperClass {

    int ImageRepurchased;
    String Repurchased_MainText,Repurchased_Price,Repurchased_AddToCart;

    public FrequentlyPurchased_helperClass(int imageRepurchased, String repurchased_MainText, String repurchased_Price, String repurchased_AddToCart) {
        this.ImageRepurchased = imageRepurchased;
        this.Repurchased_MainText = repurchased_MainText;
        this.Repurchased_Price = repurchased_Price;
        this.Repurchased_AddToCart = repurchased_AddToCart;
    }

    public int getImageRepurchased() {
        return ImageRepurchased;
    }

    public String getRepurchased_MainText() {
        return Repurchased_MainText;
    }

    public String getRepurchased_Price() {
        return Repurchased_Price;
    }

    public String getRepurchased_AddToCart() {
        return Repurchased_AddToCart;
    }
}
