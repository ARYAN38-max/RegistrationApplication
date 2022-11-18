package com.example.registrationapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.nio.charset.StandardCharsets;

public class MainActivity extends AppCompatActivity
{
    //Declaring all the components universally
    private EditText userName, userEmail,userPassword, conformPassword;
    private Button registerBTN;
    private String name, email, password, userconformpassword;

    private LinearLayout parent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initiating all the components with their id
        userName = findViewById(R.id.userName);
        userEmail = findViewById(R.id.userEmail);
        userPassword = findViewById(R.id.userPassword);

        conformPassword = findViewById(R.id.conformPassword);
        registerBTN = findViewById(R.id.registerBTN);

        parent = findViewById(R.id.parent);
        //Setting private Strings to access all components
        name = userName.getText().toString();
        email = userEmail.getText().toString();
        password = userPassword.getText().toString();
        userconformpassword = conformPassword.getText().toString();


        registerBTN.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                    if(name.equals("") || email.equals("") || password.equals("") || userconformpassword.equals(""))
                    {
                        showIncompleteSnackBar();
                    }
                    else
                    {
                        //Move to next Application
                    }
            }
        });
    }

    private void showIncompleteSnackBar()
    {
        Snackbar.make(parent, "Please Fill all The Information", Snackbar.LENGTH_SHORT).show();
    }
}