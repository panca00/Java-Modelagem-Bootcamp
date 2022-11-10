package desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudosInscritos=new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos= new LinkedHashSet<>();

    public void inscreverBootcamps(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir(){
        Optional<Conteudo> conteudo=this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
            
        }else{
            System.err.println("Voce nao esta matriculao em nenhum conteudo!");
        }
        
    }

    public double calcularTotalXp(){
       //return this.conteudosConcluidos.stream().mapToDouble(conteudo->conteudo.calcularxp).sum();
        return this.conteudosConcluidos.stream().mapToDouble(Conteudo::calcularxp).sum();
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }
    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }
    public String getNome() {
        return nome;
    }
    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }
    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if(obj==null||getClass()!=obj.getClass()) return false;
        Dev dev =(Dev) obj;
        return Objects.equals(nome,dev.nome)&& Objects.equals(conteudosConcluidos,dev.conteudosConcluidos) && Objects.equals(conteudosInscritos,dev.conteudosInscritos);
    }
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return Objects.hash(nome,conteudosInscritos,conteudosConcluidos);
    }
}
