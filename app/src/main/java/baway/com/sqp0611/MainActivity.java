package baway.com.sqp0611;


import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.List;

import baway.com.sqp0611.adapter.NewsAdapter;
import baway.com.sqp0611.base.BaseActivity;
import baway.com.sqp0611.bean.NewsBean;
import baway.com.sqp0611.mvp.IMainContract;
import baway.com.sqp0611.mvp.MainPresenterImpl;

public class MainActivity extends BaseActivity implements IMainContract.IMainView {
    private IMainContract.IMainPresenter presenter;
    private RecyclerView recyclerView;

    @Override
    protected void initData() {
        presenter.formList("https://www.apiopen.top/satinApi");
    }

    @Override
    protected void bindView() {
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this,LinearLayoutManager.VERTICAL,false));
        presenter = new MainPresenterImpl();
        presenter.onAttch(this);
    }

    @Override
    public void showList(String s) {
        Gson gson = new Gson();
        NewsBean newsBean = gson.fromJson(s, NewsBean.class);
        List<NewsBean.DataBean> data = newsBean.getData();
        NewsAdapter adapter = new NewsAdapter(MainActivity.this,data);
        recyclerView.setAdapter(adapter);
    }

    @Override
    protected int initLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDeatch();
    }
}
