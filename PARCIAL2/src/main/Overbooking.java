package main;

public class Overbooking {
    
    public int politica1ReservaPadrao(int capacidade){
        return  (int) Math.floor(capacidade + (capacidade * 0.1));        
    }
    
    public int politica2ReservaVip(int capacidade){
            return (int) Math.floor(capacidade * 0.05); 
    }
    
}
