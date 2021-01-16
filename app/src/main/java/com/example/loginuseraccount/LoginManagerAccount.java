package com.example.loginuseraccount;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
;

public class LoginManagerAccount extends AppCompatActivity {

    private EditText edit_ID;
    private EditText edit_pass;
    private TextView error;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // activity_main.xml にUIコンポーネントを配置する
        setContentView(R.layout.activity_main);

        //　ボタンの設定
        Button button_log = findViewById(R.id.button_log);
        Button button_reg = findViewById(R.id.button_reg);

        // テキストの設定　
        error = findViewById(R.id.error);

        // エディットテキストの設定
        edit_ID = findViewById(R.id.edit_ID);
        edit_pass = findViewById(R.id.edit_pass);


        // ログインボタンを押した時の画面遷移
        button_log.setOnClickListener(v -> {
            //  エディットテキストのテキストを取得
            String ID = edit_ID.getText().toString();
            String pass = edit_pass.getText().toString();

            if (ID.equals("12345") && pass.equals("12345")) {
                Intent login = new Intent(getApplication(), RegUserAccount.class);
                startActivity(login);
            } else {
                error.setText("メールアドレスまたはパスワードが正しくありません");
            }
        });

        // 新規アカウント作成画面へ遷移
        button_reg.setOnClickListener(v -> {
            Intent reg = new Intent(getApplication(), RegUserAccount.class);
            startActivity(reg);
        });
    }
}