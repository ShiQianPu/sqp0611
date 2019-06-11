package baway.com.sqp0611.holder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import baway.com.sqp0611.R;

public class ItemHolder extends RecyclerView.ViewHolder {

    public ImageView img;
    public TextView ttt;

    public ItemHolder(@NonNull View itemView) {
        super(itemView);
        img = itemView.findViewById(R.id.img);
        ttt = itemView.findViewById(R.id.ttt);
    }
}
