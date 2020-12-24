package com.example.android_studio_15_alertdialogANDtoast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn_toast(View v){
        Toast.makeText(this, "Hello World",
                Toast.LENGTH_SHORT).show();
    }

    public void btn_alertDialog(View v){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("對話框測試");
        builder.setMessage("這是一個對話視窗");
        builder.setCancelable(true);
        builder.setPositiveButton("關閉視窗", null);
        builder.show();
    }
}