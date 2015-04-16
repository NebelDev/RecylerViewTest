package com.recylerview.recylerviewtest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class RecyclerAdapter extends RecyclerView.Adapter<ViewHolder> {

    String[] mDataSet = {"Ciao"};

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mSite.setText(mDataSet[0]);
        holder.position = position;
    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
