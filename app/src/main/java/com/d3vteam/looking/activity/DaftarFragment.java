package com.d3vteam.looking.activity;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.d3vteam.looking.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DaftarFragment extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_rental);

        Button button = ((Button)findViewById(R.id.button));
        button.setOnClickListener(this);
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);
        Button button4 = (Button) findViewById(R.id.button4);
        button3.setOnClickListener(this);
        Button button5 = (Button) findViewById(R.id.button5);
        button3.setOnClickListener(this);
        Button button6 = (Button) findViewById(R.id.button6);
        button3.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.button:
                Intent tes = new Intent(view.getContext().getApplicationContext(), DaftarMobil.class);
                startActivity(tes);
                break;
            case R.id.button2:
                Intent set = new Intent(getApplicationContext(), Daftarmobil1.class);
                startActivity(set);
                break;
            case R.id.button3:
                Intent tet = new Intent(getApplicationContext(), Daftarmobil2.class);
                startActivity(tet);
                break;
            case R.id.button4:
                Intent tee = new Intent(getApplicationContext(), ExploreFragment.class);
                startActivity(tee);
                break;
            case R.id.button5:
                Intent ter = new Intent(getApplicationContext(), ExploreFragment.class);
                startActivity(ter);
                break;
            case R.id.button6:
                Intent tey = new Intent(getApplicationContext(), ExploreFragment.class);
                startActivity(tey);
                break;
        }

    }


}


