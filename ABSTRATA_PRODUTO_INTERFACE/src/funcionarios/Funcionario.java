package funcionarios;

/*
 * Interface que determina dois métodos a serem utilizados pelas
 * classes que a implementam, sendo o método de calcular bônus e 
 * o método de exibição dos dados do salário.
 */
public interface Funcionario {
	double calcularBonus();
	String exibirSalario();
}
