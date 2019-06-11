package baway.com.sqp0611.mvp;

import baway.com.sqp0611.net.NetUtil;

public interface IMainContract {
    public interface IMainView{
        void showList(String s);
    }
    public interface IMainModel{
        void doHttpGet(String url, NetUtil.CallBackTask backTask);
    }
    public interface IMainPresenter{
        void formList(String url);

        void onAttch(IMainView view);
        void onDeatch();
    }
}
