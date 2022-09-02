package com.example.intern_sample.Cart_helperClasses;

public class TopPics_helperClass {


    int ImageTop;
    String Top_MainText,Top_Price,Top_AddToCart;

    public TopPics_helperClass(int imageTop, String top_MainText, String top_Price, String top_AddToCart) {
        this.ImageTop = imageTop;
        this.Top_MainText = top_MainText;
        this.Top_Price = top_Price;
        this.Top_AddToCart = top_AddToCart;
    }

    public int getImageTop() {
        return ImageTop;
    }

    public String getTop_MainText() {
        return Top_MainText;
    }

    public String getTop_Price() {
        return Top_Price;
    }

    public String getTop_AddToCart() {
        return Top_AddToCart;
    }
}
