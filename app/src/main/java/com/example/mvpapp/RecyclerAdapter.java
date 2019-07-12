package com.example.mvpapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mvpapp.data.model.Names;

import java.util.List;

/**
 * Created by csa on 16-May-17.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.Myholder> {


    List<Names> list;

    public RecyclerAdapter(List<Names> list) {
        this.list = list;

    }

    @Override
    public Myholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        Myholder myHolder = new Myholder(view);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(Myholder holder, int position) {

        Names product = list.get(position);
        holder.pname.setText(product.getName_ar());
        holder.pcolor.setText(product.getName_meaning());
       // String image1 = product.getImageurl();
       // imageLoader.displayImage(image1, holder.pimage);
        holder.price.setText(product.getName_type());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Myholder extends RecyclerView.ViewHolder{
     //   ImageView pimage;
        TextView pname,pcolor,price;

        public Myholder(View itemView) {
            super(itemView);
            //pimage = (ImageView) itemView.findViewById(R.id.productimage);
            pname = (TextView) itemView.findViewById(R.id.name);
            pcolor = (TextView) itemView.findViewById(R.id.desc);
            price = (TextView) itemView.findViewById(R.id.level2);
        }
    }
}