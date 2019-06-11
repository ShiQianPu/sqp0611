package baway.com.sqp0611.mvp;

import baway.com.sqp0611.net.NetUtil;

public class MainPresenterImpl implements IMainContract.IMainPresenter {
    private IMainContract.IMainView view;
    private IMainContract.IMainModel model;
    @Override
    public void onAttch(IMainContract.IMainView view) {
            this.view = view;
            model = new MainModelImpl();
    }

    @Override
    public void onDeatch() {
        if (view!=null){
            view = null;
        }
        if (model!=null){
            model = null;
        }
    }
    @Override
    public void formList(String url) {
        model.doHttpGet(url, new NetUtil.CallBackTask() {
            @Override
            public void onSuccess(String s) {
                view.showList(s);
            }

            @Override
            public void onError(int code, String msg) {

            }
        });
    }
}
