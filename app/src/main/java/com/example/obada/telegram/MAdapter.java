package com.example.obada.telegram;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;


 class MAdapter extends RecyclerView.Adapter<MAdapter.UserViewHolder> {
    private LayoutInflater inflater;
    private ArrayList<Model> users;
    private UserViewHolder userViewHolder;
    private Context context;

     MAdapter(LayoutInflater inflater, ArrayList<Model> users,Context context) {
        this.inflater = inflater;
        this.users=users;
        this.context=context;

    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View item = inflater.inflate(R.layout.user_raw, parent, false);
         userViewHolder = new UserViewHolder(item);
        userViewHolder.view = item;
        userViewHolder.name = (TextView) item.findViewById(R.id.user_name);
        userViewHolder.mail = (TextView) item.findViewById(R.id.user_mail);
        userViewHolder.image=(CircleImageView)item.findViewById(R.id.user_image);
        userViewHolder.date=(TextView)item.findViewById(R.id.date);

        return userViewHolder;
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {

        Model model=users.get(position);
        holder.name.setText(model.getName());
        holder.mail.setText(model.getMail());
        holder.date.setText(model.getDate());
        Glide.with(context).load(model.getImage())
                .into(holder.image);
        holder.position = position;
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

     static class UserViewHolder extends RecyclerView.ViewHolder {
        View view;
        TextView name,mail,date;
        CircleImageView image;
        int position;

         UserViewHolder(View itemView) {
            super(itemView);
            this.view = itemView;
        }
    }
}