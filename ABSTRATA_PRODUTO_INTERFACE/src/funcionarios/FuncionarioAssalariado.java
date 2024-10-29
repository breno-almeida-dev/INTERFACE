package funcionarios;

/*
 * Classe de funcionario assalariados que implementa a interface
 * "Funcionario". E determina seus atributo privado "salario" para
 * ser utilizado dentro da classe.
 */
public class FuncionarioAssalariado implements Funcionario {
    private double salario;

    /*
     * Construtor da classe que inicializa o atributo a partir
     * do parâmetro.
     */
    public FuncionarioAssalariado(double salarioAnual) {
        this.salario = salarioAnual;
    }

    /*
     * Esse método de calcular bônus sobrescreve o método vindo da
     * interface, por se tratar de um funcionário assalariado, esse
     * método retorna o bônus fixo de 5000.00 reais.
     */
    @Override
    public double calcularBonus() {
    	return 5000.00;  // Bônus fixo de R$ 5.000,00
    }
    
    /*
     * Esse método é utilizado para informar os dados do salário do
     * funcionário de acordo com o salário informado, o resultado do cálculo
     * e o sálario final a ser recebido.
     */
    @Override
    public String exibirSalario() {
    	return
    			"Funcionário Assalariado: \n" +
    			"Salário Anual: R$ " + getSalarioAnual() + "\n" +
    			"Bônus salarial: R$ " + calcularBonus() + "\n" +
    			"Salário final: R$ " + (getSalarioAnual() + calcularBonus()) + "\n"; 
    }

    /*
     * Um setter e um getter para atribuir valor ao atributo salaria
     * e retornar o valor do atributo.
     */
    public void setSalarioAnual(double salario) {
        this.salario = salario;
    }
    
    public double getSalarioAnual() {
        return salario;
    }
    
}
