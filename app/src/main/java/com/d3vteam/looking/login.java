package com.d3vteam.looking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    Button button, button2;

    EditText editText, editText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editText = (EditText) findViewById(R.id.editText);
        editText3 = (EditText) findViewById(R.id.editText3);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (!editText.getText().toString().equals("admin")) {
                    editText.setError("Invalid User Name");
                    editText.setText("");
                } else if (!editText3.getText().toString().equals("admin")) {
                    editText3.setError("Invalid Password");
                    editText3.setText("");
                } else {
                    Intent intent = new Intent(login.this, menu.class);
                    startActivity(intent);
                    Toast.makeText(login.this, "Login Succes", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
