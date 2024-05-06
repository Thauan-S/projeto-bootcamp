package desafio_dio_poo.model;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		
		Conteudo mentoria=new Mentoria("mentoria de java","Mentoria realizada para sanar as dúvidas em java",LocalDate.now());
		Conteudo curso=new Curso("Java","Curso de java",1);
		Conteudo curso2=new Curso("Javascript","Curso de Javascript",50);
		System.out.println(mentoria.toString());
		System.out.println(curso.toString());
		Bootcamp bootcamp=new Bootcamp();
		bootcamp.setNome("Bootcamp Santander");
		bootcamp.setDescricao("descrição bootcamp");
		bootcamp.getConteudos().add(curso);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		Dev dev=new Dev();
		dev.setNome("teste");
		Dev dev2=new Dev();
		dev.setNome("teste2");
		dev.inscreverBootcamp(bootcamp);
		dev2.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos"+dev.getConteudosInscritos());
		System.out.println("Conteudos inscritos"+dev2.getConteudosInscritos());
		dev.progredir();
		dev2.progredir();
		System.out.println("Conteudos concluidos"+dev.getConteudosConcluidos());
		System.out.println("Conteudos concluidos"+dev2.getConteudosConcluidos());
		
		System.out.println("Conteudos inscritos depos de progredir"+dev.getConteudosInscritos());
		System.out.println("Conteudos inscritos"+dev2.getConteudosInscritos());
	}

}
