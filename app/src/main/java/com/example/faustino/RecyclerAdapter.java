package com.example.faustino.app_vicaria;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * //Created by faustino on 31/08/17.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyRecyclerViewHolder> {

    public static final String FEED_URL = "feed_url";
    private final String[] items;
    private final String[] direction;
    private final Context context;


    public RecyclerAdapter(Context context,  String[] direction, String... items) {
        this.direction = direction;
        this.items = items;
        this.context = context;
    }

    @Override
    public MyRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item, parent, false);

        MyRecyclerViewHolder holder = new MyRecyclerViewHolder(view);

        TextView noItemTextView = view.findViewById(R.id.imageName);
        ImageView image = view.findViewById(R.id.imageResources);
        holder.noItemTextView = noItemTextView;
        holder.noItemImageView = image;

        return holder;
    }

    @Override
    public void onBindViewHolder(MyRecyclerViewHolder holder, int position) {
        final String string = items[position];
        final String draw = direction[position];

        holder.noItemTextView.setText(string);
        holder.noItemImageView.setImageResource(R.drawable.ic_menu_camera);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, InformationActivity.class);
                intent.putExtra(FEED_URL, string);
                context.startActivity(intent);

                Toast.makeText(context, string, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.length;
    }

    public static class MyRecyclerViewHolder extends RecyclerView.ViewHolder {
        public TextView noItemTextView;
        public ImageView noItemImageView;

        public MyRecyclerViewHolder(View itemView) {
            super(itemView);
        }
    }
}
