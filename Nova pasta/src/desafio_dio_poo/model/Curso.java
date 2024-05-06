package desafio_dio_poo.model;

public class Curso extends Conteudo{
	
	private int cargaHoraria;
	public Curso(String titulo,String descricao,int cargaHoraria) {
		super.titulo=titulo;
		super.descricao=descricao;
		this.cargaHoraria=cargaHoraria;
		
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	@Override
	public double calcularXp() {
		
		return XP_PADRAO*cargaHoraria;
	}
	@Override
	public String toString() {
		return "Curso [cargaHoraria=" + cargaHoraria + ", titulo=" + titulo + ", descricao=" + descricao
				+ ", getCargaHoraria()=" + getCargaHoraria() + ", calcularXp()=" + calcularXp() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
