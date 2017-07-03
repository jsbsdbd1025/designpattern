package com.jiang.designpattern.mvp.presenter;

import android.text.TextUtils;

import com.jiang.designpattern.mvp.contract.RegisterContract;

/**
 * Created by jiang on 2017/7/3.
 */

public class RegisterPresenter implements RegisterContract.Presenter {
    RegisterContract.View mView;

    public RegisterPresenter(RegisterContract.View view) {
        mView = view;
    }

    @Override
    public void doRegister(String account, String password) {
        if (checkInput(account, password)) {
            if (doHttp(account, password)) {
                mView.showSuccessToast();
            } else {
                mView.showErrorMsg("注册失败");
            }
        }
    }

    private boolean doHttp(String account, String password) {
        return true;
    }

    private boolean checkInput(String account, String password) {
        if (TextUtils.isEmpty(account)) {
            mView.showErrorMsg("帐号不能为空");
            return false;
        }

        if (TextUtils.isEmpty(password)) {
            mView.showErrorMsg("密码不能为空");
            return false;
        }
        return checkPassword(password);
    }

    private boolean checkPassword(String password) {
        if (password.length() >= 6 && password.length() <= 18)
            return true;

        mView.showErrorMsg("请确认密码为6-18位");

        return false;

    }
}
