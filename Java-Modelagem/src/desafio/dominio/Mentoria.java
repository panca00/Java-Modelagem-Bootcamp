package desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
   
    LocalDate data;

    public LocalDate getData() {
        return data;
    }
 
    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Mentoria{"+"titulo='"+getTitulo()+'\''+", descricao='"+getDescricao()+'\''+", data="+data+'}';
    }
    @Override
    public double calcularxp() {
        // TODO Auto-generated method stub
        return XP_PADRAO+20d;
    }
}
