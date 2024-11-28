package com.example.zad6;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText email;
    private EditText haslo;
    private EditText phaslo;
    private TextView info;
    private Button button;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.emial);
        haslo = findViewById(R.id.haslo);
        phaslo = findViewById(R.id.phaslo);
        info = findViewById(R.id.info);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String mail = email.getText().toString().trim();
                String hasloo = haslo.getText().toString().trim();
                String phasloo = phaslo.getText().toString().trim();
                if(mail.isEmpty()){
                    info.setText("Nie podano emailu");

                } else if (hasloo.isEmpty()){
                info.setText("Prosze Wpisać Hasło");
                }else if (phasloo.isEmpty()){
                info.setText("Prosze Powtórzyć hasło");
                }else if (!hasloo.equals(phasloo)){
                info.setText("Hasła się różnią");
                }else {
                info.setText("Witaj "+mail);
        }

        };
    });
    }
}
