package com.example.examenjava2021;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CalidadAire {
    // Hora local Gandia Epoch del 7.10.2021 de las 8:00 am a las 17:00 pm
    static long FECHA[]={1633586400000L, 1633590000000L, 1633593600000L, 1633597200000L, 1633600800000L, 1633604400000L, 1633608000000L,1633611600000L, 1633615200000L, 1633618800000L};

    // Mediciones de la concentración de CO2 (calidad del aire en partículas por millón, ppm) en las aulas
    static int LELECTRONICA[] = {500, 650, 700, 850, 875, 600, 550, 650, 850, 600};
    static int LTELEMATICA[] = {450, 500, 675, 875, 850, 700, 750, 880, 700, 600};
    static int AULA9[] = {450, 500, 550, 650, 700, 800, 750, 600, 650, 600};

    public static void main(String[] args) {
        List<MedidaCO2> medidasc02 = new ArrayList<>();
        for (int i = 0; i<FECHA.length; i++){
            medidasc02.add(new MedidaCO2(FECHA[i], LELECTRONICA[i], LTELEMATICA[i],AULA9[i]));
        }
        Set<Integer> conjuntoValores = new HashSet<>();
        for (int i = 0; i<medidasc02.size(); i++){
            conjuntoValores.add(medidasc02.get(i).getCo2Aula9());
            conjuntoValores.add(medidasc02.get(i).getCo2Electronica());
            conjuntoValores.add(medidasc02.get(i).getCo2Telematica());
        }
        System.out.println(conjuntoValores.toString());
        System.out.println(conjuntoValores.size() + " medidas diferentes ppm de CO2 en las aulas");

        Map<String, Integer> mapa = new HashMap<>();
        int contadorAula9 = 0, contadorElectronica = 0, contadorTelematica= 0;
        for (int i = 0; i<medidasc02.size(); i++){
            if (medidasc02.get(i).getCo2Aula9() >= 800){
                contadorAula9++;
                mapa.put("Aula9", contadorAula9);
            }
            if (medidasc02.get(i).getCo2Electronica() >= 800){
                contadorElectronica++;
                mapa.put("LElectronica", contadorElectronica);
            }
            if (medidasc02.get(i).getCo2Telematica() >= 800){
                contadorTelematica++;
                mapa.put("LTelematica", contadorTelematica);
            }
        }
        System.out.println(mapa.toString());
    }
}