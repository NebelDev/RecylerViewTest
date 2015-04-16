package com.recylerview.recylerviewtest;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView mSite;
    public int position = 0;

    public ViewHolder(View itemView) {
        super(itemView);
        mSite = (TextView) itemView.findViewById(R.id.item_label);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(),"asd: "+position,Toast.LENGTH_SHORT).show();
    }
}
