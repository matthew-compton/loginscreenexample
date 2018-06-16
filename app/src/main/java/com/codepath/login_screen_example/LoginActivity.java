package com.codepath.login_screen_example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setupUI();
    }

    private void setupUI() {
        TextView tvForgotPassword = findViewById(R.id.tvForgotPassword);
        String text = "Forgot Password?";
        SpannableString content = new SpannableString(text);
        content.setSpan(new UnderlineSpan(), 0, text.length(), 0);
        tvForgotPassword.setText(content);
    }


    public void onClickForgotPassword(View view) {
        Toast.makeText(this, "Forgetting password...", Toast.LENGTH_SHORT).show();
    }

    public void onClickLogin(View view) {
        Toast.makeText(this, "Logging in...", Toast.LENGTH_SHORT).show();
    }

}
