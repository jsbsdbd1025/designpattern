package com.jiang.designpattern.mvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.jiang.designpattern.R;
import com.jiang.designpattern.mvp.contract.RegisterContract;
import com.jiang.designpattern.mvp.presenter.RegisterPresenter;

public class MVPMainActivity extends AppCompatActivity implements RegisterContract.View {

    private EditText edtAccount;
    private EditText edtPassword;
    private Button btnRegister;

    private RegisterPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //绑定视图
        initView();

        //绑定点击监听事件
        initEvent();

        //初始化presenter
        initPresenter();
    }

    private void initView() {
        edtAccount = (EditText) findViewById(R.id.edt_account);
        edtPassword = (EditText) findViewById(R.id.edt_password);
        btnRegister = (Button) findViewById(R.id.btn_login);
    }

    private void initEvent() {
        btnRegister.setOnClickListener(onClickListener);
    }

    private void initPresenter() {
        mPresenter = new RegisterPresenter(this);
    }


    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mPresenter.doRegister(edtAccount.getText().toString()
                    , edtPassword.getText().toString());
        }
    };

    @Override
    public void showSuccessToast() {
        Toast.makeText(this, "注册成功", Toast.LENGTH_SHORT);
    }

    @Override
    public void showErrorMsg(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT);
    }

}
