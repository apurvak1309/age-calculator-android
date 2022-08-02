package com.ak.agecalculator;

import android.app.DatePickerDialog;
import android.os.Build;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
DatePickerDialog dp1,dp2;
EditText e1,e2;
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.editText1);
        e2=(EditText)findViewById(R.id.editText2);
        b1=(Button)findViewById(R.id.button);
       e1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               final Calendar cldr = Calendar.getInstance();
               int day = cldr.get(Calendar.DAY_OF_MONTH);
               int month = cldr.get(Calendar.MONTH);
               int year = cldr.get(Calendar.YEAR);
               dp1=new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                   @Override
                   public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                       e1.setText(dayOfMonth + "/" + (month + 1) + "/" + year);
                   }
               }, year, month, day);
               dp1.show();
           }
       });
       e2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               final Calendar cldr1 = Calendar.getInstance();
               int day = cldr1.get(Calendar.DAY_OF_MONTH);
               int month = cldr1.get(Calendar.MONTH);
               int year = cldr1.get(Calendar.YEAR);
               dp2=new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                   @Override
                   public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                       e2.setText(dayOfMonth + "/" + (month + 1) + "/" + year);
                   }
               }, year, month, day);
           }
       });
    }
}
