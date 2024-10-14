package com.example.t1;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import com.example.t1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private IncrementarViewModel incrementarViewModel;
    private int res = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        incrementarViewModel = new ViewModelProvider(this).get(IncrementarViewModel.class);

        Log.d("TAG1", "onCreate()");

        // Configurar los textos iniciales
        binding.tvRescon.setText("con view model : " + incrementarViewModel.getResultado());
        binding.tvRessin.setText("sin view model : " + res);

        tarea();
    }

    public void tarea() {

        binding.bttIncrementarSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res = Incrementar.incrementar(res);
                binding.tvRessin.setText("sin view model : " + res);  // Actualizar el texto con el valor incrementado
            }
        });


        binding.bttIncrementar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                incrementarViewModel.setResultado(Incrementar.incrementar(incrementarViewModel.getResultado()));
                binding.tvRescon.setText("con view model : " + incrementarViewModel.getResultado());  // Actualizar el texto con el valor del ViewModel
            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("TAG1","onStart()" );
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("TAG1","onResume()" );
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("TAG1","onStop()" );
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("TAG1","onPause()" );
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("TAG1","onDestroy()" );
    }
}
