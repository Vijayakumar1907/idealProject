package com.example.intern_sample.User_helperClasses;

public class YourOrder_helperClass {

    int YourOrderImage;
    String BuyAgainText;

    public YourOrder_helperClass(int yourOrderImage, String buyAgainText) {
        this.YourOrderImage = yourOrderImage;
        this.BuyAgainText = buyAgainText;
    }

    public int getYourOrderImage() {
        return YourOrderImage;
    }

    public String getBuyAgainText() {
        return BuyAgainText;
    }
}
