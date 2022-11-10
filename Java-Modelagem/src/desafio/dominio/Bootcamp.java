package desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicio=LocalDate.now();
    private final LocalDate dataFinal= dataInicio.plusDays(45);//45 dias de bootcamps
    private Set<Dev> devsInscritos= new HashSet<>();
    private Set<Conteudo> conteudos=new LinkedHashSet<>();

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }
    public LocalDate getDataFinal() {
        return dataFinal;
    }
    public LocalDate getDataInicio() {
        return dataInicio;
    }
    public String getDescricao() {
        return descricao;
    }
    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }
    public String getNome() {
        return nome;
    }
    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if(obj==null||getClass()!=obj.getClass()) return false;
        Bootcamp bootcamp =(Bootcamp) obj;
        return Objects.equals(nome,bootcamp.nome)&& Objects.equals(descricao,bootcamp.descricao) && Objects.equals(dataInicio,bootcamp.dataInicio)&& Objects.equals(dataFinal,bootcamp.dataFinal)&&
        Objects.equals(devsInscritos,bootcamp.devsInscritos)&&Objects.equals(conteudos,bootcamp.conteudos);
    }
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return Objects.hash(nome,descricao,dataInicio,dataFinal,devsInscritos,conteudos);
    }
    

}
