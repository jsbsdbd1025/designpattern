package com.jiang.designpattern.mvp.contract;

/**
 * Created by jiang on 2017/7/3.
 */

public interface RegisterContract {
    interface View {

        void showSuccessToast();

        void showErrorMsg(String msg);

    }

    interface Presenter {

        void doRegister(String account, String password);

    }

}
