package com.recylerview.recylerviewtest;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rec = ( RecyclerView) findViewById(R.id.view);
        rec.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        rec.addItemDecoration(new RecyclerDecorator(this));
        rec.setLayoutManager(layoutManager);
        rec.setAdapter(new RecyclerAdapter());
    }

}
