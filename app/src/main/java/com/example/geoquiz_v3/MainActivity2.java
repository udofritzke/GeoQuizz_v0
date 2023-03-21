package com.example.geoquiz_v3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public static Intent novoIntent(Context packageContext, boolean respostaEVderdadeira) {
        Intent intent = new Intent(packageContext, MainActivity2.class);
        intent.putExtra("NOME_INTENT", respostaEVderdadeira);
        return intent;
    }
}