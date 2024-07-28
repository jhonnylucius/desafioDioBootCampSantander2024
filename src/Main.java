import br.com.dio.desafio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("Do 0 ao Avançado");
        curso1.setCargaHoraria(86);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(35);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        BootCamp bootcamp = new BootCamp();
        bootcamp.setNome("Bootcamp Java Kotlin");
        bootcamp.setDescricao("Descrição Bootcamp Kotlin Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLuciano = new Dev();
        devLuciano.setNome("Luciano");
        devLuciano.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Luciano: " + devLuciano.getConteudosInscritos());

        devLuciano.progredir();
        devLuciano.progredir();
        devLuciano.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Luciano: " + devLuciano.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Luciano: " + devLuciano.getConteudosConcluidos());
        System.out.println("XP: " + devLuciano.calcularTotalXp());

        System.out.println("-----------");

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Lucas: " + devLucas.getConteudosInscritos());

        devLucas.progredir();
        devLucas.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Lucas: " + devLucas.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Lucas: " + devLucas.getConteudosConcluidos());
        System.out.println("XP: " + devLucas.calcularTotalXp());

    }
}