package com.tunay.physiotheraphyapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;

import com.tunay.physiotheraphyapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    DBHelper DB;
    ArrayList<Menu> Menu;
    Mainmenuadapter mainmenuadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        DB = new DBHelper(this);
        
        //Bitmap bmp = BitmapFactory.decodeResource(getResources(),R.drawable.diz_5);
        //Bitmap image = makeSmallerImage(bmp);
        //DB.add_data_diz(5,"Ayaklarınızı omuz hizasında birbirine paralel bakacak şekilde açın, sırtınızı bir duvara yaslayarak yavaşça çömelin. Dizleriniz en fazla 90 derece büküldükten sonra, 5’e kadar sayın ve kendinizi yukarı doğru itin.",image);



        Menu = DB.get_data_menu();


        binding.RecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mainmenuadapter = new Mainmenuadapter(Menu);
        binding.RecyclerView.setAdapter(mainmenuadapter);





    }

    public Bitmap makeSmallerImage(Bitmap image){
        int width = 300;
        int height = 200;


        return image.createScaledBitmap(image,width,height,true);

    }




}