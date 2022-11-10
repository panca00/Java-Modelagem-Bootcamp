package desafio.dominio;

public class Curso {

    private String titulo;
    private String descricao;
    private int cargaHoraria;

    public String getTitulo() {
        return titulo;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Mentoria{"+"titulo='"+titulo+'\''+", descricao='"+descricao+'\''+", cargaHoraria="+cargaHoraria+'}';
    }


}
