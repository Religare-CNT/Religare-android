package cursoandroid.religare.com.br.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import cursoandroid.religare.com.br.R;

public class AutenticacaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R. layout.activity_autenticacao);
        getSupportActionBar().hide();
    }
}
