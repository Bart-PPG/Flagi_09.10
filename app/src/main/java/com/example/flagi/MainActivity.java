package com.example.flagi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private int licznik = 0;
private TextView textView;
private int pomylki = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
    }

    public void ZlaOdpowiedz(View view) {
        Toast.makeText(this, "Ten kolor jest w fladze polski", Toast.LENGTH_SHORT).show();
        pomylki++;
    }

    public void DobraOdpowiedz(View view) {
        view.setVisibility(View.INVISIBLE);
        licznik++;
        if(licznik == 4){
            textView.setText(R.string.podsumowanie);
        }
    }
}