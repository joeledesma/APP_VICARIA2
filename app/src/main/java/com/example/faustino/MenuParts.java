package com.example.faustino.app_vicaria;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MenuParts extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_parts);
//        holder.noItemImageView.setImageResource(R.drawable.ic_menu_gallery);
//        holder.noItemImageView.setImageResource(R.drawable.ic_menu_manage);
//        holder.noItemImageView.setImageResource(R.drawable.ic_menu_share);
//        holder.noItemImageView.setImageResource(R.drawable.ic_menu_send);

        String[] file = {"R.drawable.ic_menu_gallery", "R.drawable.ic_menu_manage",
                "R.drawable.ic_menu_share", "R.drawable.ic_menu_send"};
        RecyclerView rv = (RecyclerView) findViewById(R.id.RecyclerObjectMenu);
        rv.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false));

        rv.setAdapter(new RecyclerAdapter(this, file, "Mons. Antonio Camilo", "Mons. Juan Antonio Flores",
                "Mons. Francísco Panal"));
    }
}
