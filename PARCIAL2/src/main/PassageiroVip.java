package main;

public class PassageiroVip extends Passageiro implements IPassageiro{

    public PassageiroVip(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public boolean reservaPassagem(Voo voo) {
        if(voo.validaCPF(voo, this.getCpf())){
            if(voo.verificaLugarPV(voo)){
                voo.aeronave.listaPassageirosVip.add(this);
                setNumPoltrona(voo.aeronave.listaPassageirosVip.size());
                return true;
            }else {
                return false;
            }
        }else{
            return false;
        }
    }
}