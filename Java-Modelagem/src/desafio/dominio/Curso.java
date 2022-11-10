package desafio.dominio;

public class Curso extends Conteudo {


    private int cargaHoraria;


    public int getCargaHoraria() {
        return cargaHoraria;
    }
  
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
  


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Curso{"+"titulo='"+getTitulo()+'\''+", descricao='"+getDescricao()+'\''+", cargaHoraria="+cargaHoraria+'}';
    }

    @Override
    public double calcularxp() {
        // TODO Auto-generated method stub
        return XP_PADRAO*cargaHoraria;
    }


}
