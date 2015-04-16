package com.recylerview.recylerviewtest;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ViewHolder extends RecyclerView.ViewHolder{

    public TextView mSite;

    public ViewHolder(View itemView) {
        super(itemView);
        mSite = (TextView) itemView.findViewById(R.id.item_label);
    }
}
