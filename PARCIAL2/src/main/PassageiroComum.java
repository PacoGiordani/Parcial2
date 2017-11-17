package main;

public class PassageiroComum extends Passageiro implements IPassageiro{
    
    public PassageiroComum(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public boolean reservaPassagem(Voo voo) {
        if(voo.validaCPF(voo, this.getCpf())){
            if(voo.verificaLugarPC(voo)){
                voo.aeronave.listaPassageirosComum.add(this);
                setNumPoltrona(voo.aeronave.listaPassageirosComum.size());
                return true;
            }else {
                return false;
            }
        }else{
            return false;
        }
    }
} 

