package baway.com.sqp0611.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(initLayout());
        bindView();
        initData();
    }

    protected abstract void initData();

    protected abstract void bindView();

    protected abstract int initLayout();
}
