package com.example.user.myapplication;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PasswordsScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passwords_screen);
    }
    public void sendMessage2(View view)
    {
        finish();
    }

    public void btn3click(View v)
    {
        MessageBox("password:SecretPassword1");
    }
    public void btn4click(View v)
    {
        MessageBox("password:SecretPassword2");
    }
    public void btn5click(View v)
    {
        MessageBox("password:SecretPassword3");
    }

    public void MessageBox(String message)
    {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}