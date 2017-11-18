package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Voo {
    Aeronave aeronave;
    Overbooking overbooking;
   private int id;
   private int capacidadeAviao;
   private int capacidadeReservas;
   private int capacidadeVip;
   

    public Voo(Aeronave aeronave) {
        this.aeronave = aeronave;
        this.capacidadeAviao = aeronave.getCapacidade();
        overbooking = new Overbooking();
        politicas();
    }
    
    void politicas(){
        capacidadeReservas = overbooking.politica1ReservaPadrao(capacidadeAviao);
        capacidadeVip = overbooking.politica2ReservaVip(capacidadeAviao);
    }
    
    boolean verificaLugarPC(Voo voo){
        if(voo.aeronave.listaPassageirosComum.size() < capacidadeReservas){
            return true;
        }else{
            return false;
        }
    }
    
    boolean verificaLugarPV(Voo voo){
        if(voo.aeronave.listaPassageirosVip.size() < capacidadeVip){
            return true;
        }else{
            return false;
        }
    }
    
        
    public List<Passageiro> listaPassageirosExcluidos(){
        Collections.sort(aeronave.listaPassageirosComum);
       return aeronave.listaPassageirosComum.subList((capacidadeAviao - aeronave.listaPassageirosVip.size()), capacidadeReservas);
       //Os passageiros que embarcarão no voo é a soma da lista vip mais aeronave.listaPassageirosComum.subList(0, (capacidadeAviao - aeronave.listaPassageirosVip.size()));
       
   }
        
    
    
    boolean validaCPF(Voo voo, String cpf){
        for(int i = 0; i < voo.aeronave.listaPassageirosComum.size(); i++){
            if(voo.aeronave.listaPassageirosComum.get(i).getCpf() == cpf 
                    || voo.aeronave.listaPassageirosVip.get(i).getCpf() == cpf){
                return false;
            }
        }
        return true;
    }
    
    public Aeronave getAeronave() {
        return aeronave;
    }

    public void setAeronave(Aeronave aeronave) {
        this.aeronave = aeronave;
    }

    public Overbooking getOverbooking() {
        return overbooking;
    }

    public void setOverbooking(Overbooking overbooking) {
        this.overbooking = overbooking;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacidadeAviao() {
        return capacidadeAviao;
    }

    public void setCapacidadeAviao(int capacidadeAviao) {
        this.capacidadeAviao = capacidadeAviao;
    }

    public int getCapacidadeReservas() {
        return capacidadeReservas;
    }

    public void setCapacidadeReservas(int capacidadeReservas) {
        this.capacidadeReservas = capacidadeReservas;
    }

    public int getCapacidadeVip() {
        return capacidadeVip;
    }

    public void setCapacidadeVip(int capacidadeVip) {
        this.capacidadeVip = capacidadeVip;
    }

    
}
