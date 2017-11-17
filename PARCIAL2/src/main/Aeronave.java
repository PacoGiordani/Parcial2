package main;

import java.util.ArrayList;
import java.util.List;

abstract class Aeronave {
    List<Passageiro> listaPassageirosComum = new ArrayList<Passageiro>();
    List<Passageiro> listaPassageirosVip = new ArrayList<Passageiro>();
    
    abstract int getCapacidade();

}

