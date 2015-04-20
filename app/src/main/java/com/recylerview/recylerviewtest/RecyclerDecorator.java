package com.recylerview.recylerviewtest;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class RecyclerDecorator extends RecyclerView.ItemDecoration {

    private static final int[] ATTRS = new int[]{
            android.R.attr.listDivider
    };

    private Drawable draw;

    public RecyclerDecorator(Context context){
        final TypedArray a = context.obtainStyledAttributes(ATTRS);
        draw = a.getDrawable(0);
        a.recycle();
    }


    @Override
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.State state) {
        final int left = parent.getPaddingLeft();
        final int right = parent.getWidth() - parent.getPaddingRight();

        final int childCount = parent.getChildCount();
        for (int i = 0; i < childCount; i++) {
            final View child = parent.getChildAt(i);
            final RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) child.getLayoutParams();
            final int top = child.getBottom() + params.bottomMargin;
            final int bottom = top + draw.getIntrinsicHeight();
            draw.setBounds(left, top, right, bottom);
            draw.draw(c);
        }
    }
}
