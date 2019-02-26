package com.example.practicingandroidstudio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String USERNAME = "Nabab Khan";
    private static final String PASSWORD = "SubahanAllah";

    private EditText nameEt, passwordEt;
    private TextView showNameTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEt = findViewById(R.id.nameEtId);
        passwordEt = findViewById(R.id.passwordEtId);
        showNameTv = findViewById(R.id.textView);
    }

    public void showText(View view) {
        String userName = nameEt.getText().toString();
        String password = passwordEt.getText().toString();

        if(TextUtils.isEmpty(userName)){
            nameEt.setError("Enter a userName");
            nameEt.requestFocus();
            return;

        }else if(!userName.equals(USERNAME)) {
            showNameTv.setText("please enter valid userName");

        }else if(TextUtils.isEmpty(password)){
             passwordEt.setError("Enter a password");
             passwordEt.requestFocus();
             return;

        }else if(!password.equals(PASSWORD)){
             showNameTv.setText("please enter valid password");

        }else{
            showNameTv.setText("Logged in!");
            Toast.makeText(this, "Login", Toast.LENGTH_SHORT).show();

        }
    }
}
