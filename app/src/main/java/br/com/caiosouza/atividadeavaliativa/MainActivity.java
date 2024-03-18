package br.com.caiosouza.atividadeavaliativa;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {
    EditText texto;
    Button botao;
    TextView visual;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        texto = findViewById(R.id.editTextName);
        botao = findViewById(R.id.buttonMessage);
        visual = findViewById(R.id.tvMesssage);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String recebe = texto.getText().toString();
                visual.setText("Bem vindx! " + recebe);

            }
        });
    }
}