package com.example.examenjava2021;

import java.util.List;
import java.util.Objects;

public class MedidaCO2 {
    //Atributos
    private long tiempoMilisegundos;
    private int co2Electronica, co2Telematica, co2Aula9;

    //Getters and Setters


    public long getTiempoMilisegundos() {
        return tiempoMilisegundos;
    }

    public void setTiempoMilisegundos(long tiempoMilisegundos) {
        this.tiempoMilisegundos = tiempoMilisegundos;
    }

    public int getCo2Electronica() {
        return co2Electronica;
    }

    public void setCo2Electronica(int co2Electronica) {
        this.co2Electronica = co2Electronica;
    }

    public int getCo2Telematica() {
        return co2Telematica;
    }

    public void setCo2Telematica(int co2Telematica) {
        this.co2Telematica = co2Telematica;
    }

    public int getCo2Aula9() {
        return co2Aula9;
    }

    public void setCo2Aula9(int co2Aula9) {
        this.co2Aula9 = co2Aula9;
    }

    //Constructor
    public MedidaCO2(long tiempoMilisegundos, int co2Electronica, int co2Telematica, int co2Aula9){
        this.tiempoMilisegundos = tiempoMilisegundos;
        this.co2Electronica = co2Electronica;
        this.co2Telematica = co2Telematica;
        this.co2Aula9 = co2Aula9;
    }

    //Metodos
    public boolean registrado(List<MedidaCO2> lista){
        for (int i = 0; i<lista.size()-1; i++){
            if (lista.get(i).equals(this)){
                return true;
            }
        }
        return false;
    }

    //Sobreescribo el metodo equals para esta clase en concreto
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MedidaCO2 medidaCO2 = (MedidaCO2) o;
        return tiempoMilisegundos == medidaCO2.tiempoMilisegundos && co2Electronica == medidaCO2.co2Electronica && co2Telematica == medidaCO2.co2Telematica && co2Aula9 == medidaCO2.co2Aula9;
    }

}
