package baway.com.sqp0611.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;

import java.util.List;

import baway.com.sqp0611.R;
import baway.com.sqp0611.bean.NewsBean;
import baway.com.sqp0611.holder.ItemHolder;

public class NewsAdapter extends RecyclerView.Adapter<ItemHolder> {
    private Context context;
    private List<NewsBean.DataBean> datas;

    public NewsAdapter(Context context, List<NewsBean.DataBean> datas) {
        this.context = context;
        this.datas = datas;
    }

    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(context);
        return new ItemHolder(inflater.inflate(R.layout.item_list,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ItemHolder itemHolder, int i) {
        itemHolder.ttt.setText(datas.get(i).getText());
        Glide.with(context).load(datas.get(i).getProfile_image()).into(itemHolder.img);
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }
}
