package desafio.dominio;

public abstract class Conteudo {//Impede que seja instanciada
    
    final protected static double XP_PADRAO=10d;

    private String titulo;
    private String descricao;

    public abstract double calcularxp();//me obriga a sempre implementar esse metodo

    public String getDescricao() {
        return descricao;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
