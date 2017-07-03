package com.jiang.designpattern.mvc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.jiang.designpattern.R;

public class MVCMainActivity extends AppCompatActivity {

    private EditText edtAccount;
    private EditText edtPassword;
    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();

        initEvent();
    }

    private void initView() {
        edtAccount = (EditText) findViewById(R.id.edt_account);
        edtPassword = (EditText) findViewById(R.id.edt_password);
        btnRegister = (Button) findViewById(R.id.btn_login);
    }

    private void initEvent() {
        btnRegister.setOnClickListener(onClickListener);
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            doRegister();
        }
    };

    private void doRegister() {
        if (checkInput()) {
            if (doHttp()) {
                showSuccess();
            } else {
                Toast.makeText(this, "注册失败", Toast.LENGTH_SHORT);
            }
        }
    }

    private boolean doHttp() {
        return true;
    }

    private boolean checkInput() {
        if (TextUtils.isEmpty(edtAccount.getText().toString())) {
            showErrorMsg("帐号不能为空");
            return false;
        }

        if (TextUtils.isEmpty(edtPassword.getText().toString())) {
            showErrorMsg("密码不能为空");
            return false;
        }
        return checkPassword();
    }

    private boolean checkPassword() {
        String password = edtPassword.getText().toString();
        if (password.length() >= 6 && password.length() <= 18)
            return true;

        showErrorMsg("请确认密码为6-18位");

        return false;

    }

    private void showErrorMsg(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT);
    }

    private void showSuccess() {
        Toast.makeText(this, "注册成功", Toast.LENGTH_SHORT);
    }
}
