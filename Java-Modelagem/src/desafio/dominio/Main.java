package desafio.dominio;

import java.time.LocalDate;

public class Main{
    public static void main(String[] args) {
        Curso curso1= new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2= new Curso();
        curso1.setTitulo("Curso js");
        curso1.setDescricao("Descricao curso js");
        curso1.setCargaHoraria(4);
        

        Mentoria mentoria1 = new Mentoria();
        Mentoria mentoria2 = new Mentoria();

        mentoria1.setTitulo("Mentoria de java");
        mentoria1.setDescricao("Descricao Mentoria de java");
        mentoria1.setData(LocalDate.now());

      
    }
}