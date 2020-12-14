package com.learning.androidbottomnavigation;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity  {

    private TextView forgotAccount;
    private Button signIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        forgotAccount = findViewById(R.id.textForgotAccount);

        forgotAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });

        signIn = findViewById(R.id.buttonSignIn);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void openDialog() {
        ForgotDialog forgotDialog = new ForgotDialog();
        forgotDialog.show(getSupportFragmentManager(), "forgot dialog");

//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setTitle("Email");
//
//        LinearLayout linearLayout = new LinearLayout(this);
//        EditText forgotEmail = new EditText(this);
            }
}