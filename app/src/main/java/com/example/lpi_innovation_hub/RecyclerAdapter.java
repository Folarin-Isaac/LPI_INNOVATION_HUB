package com.example.lpi_innovation_hub;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
    Context context;
    List<All> listData;

    //create a constructor for the Adpater class
    public RecyclerAdapter(Context ct, List<All> listData){
        this.context = ct;
        this.listData = listData;
         }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.chat_name.setText(listData.get(position).getName());
        holder.chat_email.setText(listData.get(position).getEmail());
        holder.profile_image.setImageResource(listData.get(position).getPhoto());

    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView chat_name, chat_email;
        ImageView profile_image;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            chat_name = itemView.findViewById(R.id.chat_name);
            chat_email = itemView.findViewById(R.id.chat_email);
            profile_image = itemView.findViewById(R.id.profile_image);


        }


    }
}
