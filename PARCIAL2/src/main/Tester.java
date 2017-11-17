package main;

public class Tester {
    public static void main(String[] args) {
    Conexao c = new Conexao(); 
    Passageiro p1 = new PassageiroComum("Gilmar", "06542728910");
    Passageiro p3 = new PassageiroVip("Gilmar2", "06542728910");
    Passageiro p2 = new PassageiroComum("Pedro", "09101339883");
    Aeronave aviao1 = new Airbus330();
    Aeronave aviao2 = new Boeing727();
//    ReservaPassagem reservaPassagem = new ReservaPassagem();
    Voo voo1 = new Voo(aviao1);
    Voo voo2 = new Voo(aviao2);
     
    p1.reservaPassagem(voo1);
    c.insertVoo(voo2);
    
    
    
    
   
    
   
       
    
    
    } 
}
