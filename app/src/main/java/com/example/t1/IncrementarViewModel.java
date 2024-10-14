package com.example.t1;

import androidx.lifecycle.ViewModel;

public class IncrementarViewModel extends ViewModel {

    private Integer resultado = 0;

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
}
