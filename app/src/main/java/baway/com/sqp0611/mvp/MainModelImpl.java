package baway.com.sqp0611.mvp;

import baway.com.sqp0611.net.NetUtil;

public class MainModelImpl implements IMainContract.IMainModel {
    private NetUtil util;

    public MainModelImpl() {
        util = NetUtil.getInstance();
    }

    @Override
    public void doHttpGet(String url, NetUtil.CallBackTask backTask) {
        util.doHttpGet(url,backTask);
    }
}
