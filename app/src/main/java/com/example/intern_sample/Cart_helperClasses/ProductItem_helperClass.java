package com.example.intern_sample.Cart_helperClasses;

public class ProductItem_helperClass {

    int MainImage,PlusImage,MinusImage;
    String ProductNameCart,ProductPriceCart,FreeShippingCart,InStockCart,ColorQue,ColorAns,StyleQue,StyleAns,Delete,SaveLater;



    public ProductItem_helperClass(int mainImage, int plusImage, int minusImage, String productNameCart, String productPriceCart, String freeShippingCart, String inStockCart, String colorQue, String colorAns, String styleQue, String styleAns, String delete, String saveLater) {
        this.MainImage = mainImage;
        this.PlusImage = plusImage;
        this.MinusImage = minusImage;
        this.ProductNameCart = productNameCart;
        this.ProductPriceCart = productPriceCart;
        this.FreeShippingCart = freeShippingCart;
        this.InStockCart = inStockCart;
        this.ColorQue = colorQue;
        this.ColorAns = colorAns;
        this.StyleQue = styleQue;
        this.StyleAns = styleAns;
        this.Delete = delete;
        this.SaveLater = saveLater;
        //this.etNumm = etNumm;
    }

    public int getMainImage() {
        return MainImage;
    }

    public int getPlusImage() {
        return PlusImage;
    }

    public int getMinusImage() {
        return MinusImage;
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

    public String getSaveLater() {
        return SaveLater;
    }
    //public String getEtNumm() {
       // return etNumm;
    //}

}
