package desafio.dominio;

import java.time.LocalDate;

public class Main{
    public static void main(String[] args) {
        Curso curso1= new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2= new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descricao curso js");
        curso2.setCargaHoraria(4);
        

        Mentoria mentoria1 = new Mentoria();
 

        mentoria1.setTitulo("Mentoria de java");
        mentoria1.setDescricao("Descricao Mentoria de java");
        mentoria1.setData(LocalDate.now());

       Bootcamp bootcamp = new Bootcamp();
       bootcamp.setNome("Bootcamp Java Developer");
       bootcamp.setDescricao("Descricao Bootcamp Java Developer");
       bootcamp.getConteudos().add(curso1);
       bootcamp.getConteudos().add(curso2);
       bootcamp.getConteudos().add(mentoria1);
      

       Dev dev1=new Dev();
       dev1.setNome("Hugo Henrique");
       dev1.inscreverBootcamps(bootcamp);
       dev1.progredir();
       System.out.println("Conteudos inscritos: "+dev1.getConteudosInscritos());
       System.out.println("-");
       System.out.println("Conteudos concluidos: "+dev1.getConteudosConcluidos());
      
       System.out.println( dev1.calcularTotalXp());

       Dev dev2=new Dev();
       dev2.setNome("José Dantas");
       dev2.inscreverBootcamps(bootcamp);
       System.out.println("Conteudos inscritos: "+dev2.getConteudosInscritos());
       System.out.println("-");
       System.out.println("Conteudos concluidos: "+dev2.getConteudosConcluidos());


    }
}