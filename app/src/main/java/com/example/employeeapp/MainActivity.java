package com.example.employeeapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.employeeapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4,ed5,ed6;
    AppCompatButton b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText)findViewById(R.id.emp);
        ed2=(EditText)findViewById(R.id.name);
        ed3=(EditText)findViewById(R.id.desig);
        ed4=(EditText)findViewById(R.id.cname);
        ed5=(EditText)findViewById(R.id.sal);
        ed6=(EditText)findViewById(R.id.num);
        b1=(AppCompatButton) findViewById(R.id.regbtn);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"welcome",Toast.LENGTH_LONG).show();
            }
        });
    }

}