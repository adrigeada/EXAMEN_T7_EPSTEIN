package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Estadistica implements Informes{

    private Map<String,String> estadisticas;

    public Estadistica(Set<Famoso> famoso){
        estadisticas = new HashMap<>();
    }

    public Map<String, String> getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(Map<String, String> estadisticas) {
        this.estadisticas = estadisticas;
    }

    @Override
    public String toString() {
        return "Estadistica{" +
                "estadisticas=" + estadisticas +
                '}';
    }

    @Override
    public void verPoliticos() {

    }

    @Override
    public void informeJuzgado() {

    }

    @Override
    public void verRanking() {

    }
}
