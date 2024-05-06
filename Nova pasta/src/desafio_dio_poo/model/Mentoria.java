package desafio_dio_poo.model;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
	
	private LocalDate data;
	
	public Mentoria(String titulo,String descricao,LocalDate data) {
		super.titulo=titulo;
		super.descricao=descricao;
		this.data = data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}


	public LocalDate getData() {
		return data;
	}

	@Override
	public double calcularXp() {
		return XP_PADRAO+20d;
	}

	@Override
	public String toString() {
		return "Mentoria [data=" + data + ", titulo=" + titulo + ", descricao=" + descricao + ", getData()=" + getData()
				+ ", calcularXp()=" + calcularXp() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
	
	
	
}
