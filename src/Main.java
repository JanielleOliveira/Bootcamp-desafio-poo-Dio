import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("CURSO JAVA");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("CURSO JS");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Desafio desafio1 = new Desafio();
        desafio1.setTitulo("1º Desafio de Código Java Poo");
        desafio1.setDescricao("Abstraindo um Bootcamp Usando Orientação a Objetos em Java");
        desafio1.setRequisitos("\n✅ Conhecer a sintaxe da Java\n" + "✅ Java JDK 11\n" + "✅ IDE para desenvolvimento Java (usarei IntelliJ)\n" + "✅ Git\n" + "✅ Conta no GitHub");
        desafio1.setNivelDificuldade("Intermediário");
        desafio1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
        System.out.println(desafio);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(desafio1);


        Dev devCamila = new Dev();
        devCamila.setNome("CAMILA");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("-");
        System.out.println("Certificados obtidos por Camila: " + devCamila.listarCertificados());
        System.out.println("-");
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("------------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("JOÃO");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João :" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João :" + devJoao.getConteudosConcluidos());
        System.out.println("-");
        System.out.println("Certificados obtidos por João: " + devJoao.listarCertificados());
        System.out.println("-");
        System.out.println("XP:" + devJoao.calcularTotalXp());


    }


}
