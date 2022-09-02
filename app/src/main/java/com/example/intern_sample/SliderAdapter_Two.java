package com.example.intern_sample;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.smarteist.autoimageslider.SliderViewAdapter;

public class SliderAdapter_Two extends SliderViewAdapter<SliderAdapter_Two.SliderViewHolder_Two> {

    private int[] images_two;
    private String[] Product_desc;
    private String[] Product_price;
    private String[] Timer_text;
    private String[] Timer_number;

    public SliderAdapter_Two(){

    }

    public SliderAdapter_Two(int[] images2,String[] desc,String[] price,String[] text,String[] number){

        this.images_two = images2;
        this.Product_desc = desc;
        this.Product_price = price;
        this.Timer_text = text;
        this.Timer_number = number;

    }

    @Override
    public SliderViewHolder_Two onCreateViewHolder(ViewGroup parent) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.slider_image_second,null);
        return new SliderViewHolder_Two(view);
    }

    @Override
    public void onBindViewHolder(SliderViewHolder_Two viewHolder, int position) {

        viewHolder.imageView.setImageResource(images_two[position]);
        viewHolder.ProductDesc.setText(Product_desc[position]);
        viewHolder.ProductPrice.setText(Product_price[position]);
        viewHolder.TimeTextV.setText(Timer_text[position]);
        viewHolder.TextTimer.setText(Timer_number[position]);
    }

    @Override
    public int getCount() {
        return images_two.length;
    }

    public class SliderViewHolder_Two extends SliderViewAdapter.ViewHolder{

        private ImageView imageView;
        private TextView ProductDesc,ProductPrice,TimeTextV,TextTimer;

        public SliderViewHolder_Two(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.Slider_Image_two);
            ProductDesc = itemView.findViewById(R.id.Product_description);
            ProductPrice = itemView.findViewById(R.id.Product_Price);
            TimeTextV = itemView.findViewById(R.id.Product_Timer_Text);
            TextTimer = itemView.findViewById(R.id.Product_Timer_TimeRunner);

        }
    }
}
