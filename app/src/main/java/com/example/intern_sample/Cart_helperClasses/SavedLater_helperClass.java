package com.example.intern_sample.Cart_helperClasses;

public class SavedLater_helperClass {

    int MainImage;
    String ProductNameCart,ProductPriceCart,FreeShippingCart,InStockCart,ColorQue,ColorAns,StyleQue,StyleAns,Delete,Move_to_Cart;

    public SavedLater_helperClass(int mainImage, String productNameCart, String productPriceCart, String freeShippingCart, String inStockCart, String colorQue, String colorAns, String styleQue, String styleAns, String delete, String move_to_Cart) {
        this.MainImage = mainImage;
        this.ProductNameCart = productNameCart;
        this.ProductPriceCart = productPriceCart;
        this.FreeShippingCart = freeShippingCart;
        this.InStockCart = inStockCart;
        this.ColorQue = colorQue;
        this.ColorAns = colorAns;
        this.StyleQue = styleQue;
        this.StyleAns = styleAns;
        this.Delete = delete;
        this.Move_to_Cart = move_to_Cart;
    }

    public int getMainImage() {
        return MainImage;
    }

    public String getProductNameCart() {
        return ProductNameCart;
    }

    public String getProductPriceCart() {
        return ProductPriceCart;
    }

    public String getFreeShippingCart() {
        return FreeShippingCart;
    }

    public String getInStockCart() {
        return InStockCart;
    }

    public String getColorQue() {
        return ColorQue;
    }

    public String getColorAns() {
        return ColorAns;
    }

    public String getStyleQue() {
        return StyleQue;
    }

    public String getStyleAns() {
        return StyleAns;
    }

    public String getDelete() {
        return Delete;
    }

    public String getMove_to_Cart() {
        return Move_to_Cart;
    }
}
