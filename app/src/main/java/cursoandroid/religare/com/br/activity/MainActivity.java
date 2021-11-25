package cursoandroid.religare.com.br.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import cursoandroid.religare.com.br.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                abrirAutenticacao();

            }
        },1000);


    }

    private void abrirAutenticacao(){
        Intent i = new Intent(MainActivity.this, AutenticacaoActivity.class);
        startActivity(i);
        finish();
    }
}
