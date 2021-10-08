package com.example.examenjava2021;

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


}
