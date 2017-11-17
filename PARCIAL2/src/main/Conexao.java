package main;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.ArrayList;
import java.util.List;

public class Conexao {
    
     private ObjectContainer db = null;
    
    private void abrirBanco(){
        db = Db4oEmbedded.openFile("banco");
    }
    private void fecharBanco(){
        db.close();
    }
    
    //Insere um voo ao banco de dados
    public void insertVoo(Voo v){
        abrirBanco();
        db.store(v);
        fecharBanco();
    }
    
    // Seleciona todos os objetos Voos
    public List<Voo> selectAllVoo(){
        abrirBanco();
        ObjectSet listVoo = db.queryByExample(Passageiro.class);
        List<Voo> lp = new ArrayList<>();
        for(Object listPessoa1 : listVoo){
            lp.add((Voo)listPessoa1);
        }
        fecharBanco();
        return lp;
    }
    
    // Seleciona apenas um voo
    public Voo selectVoo(Voo v ){
        abrirBanco();
        ObjectSet result = db.queryByExample(v);
        Voo voo = (Voo) result.next();
        fecharBanco();
        return voo;
        
    }

}
    

