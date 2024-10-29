package funcionarios;

/*
 * Classe de funcionario horista que implementa a interface
 * "Funcionario". E determina seus atributo privado "salario" para
 * ser utilizado dentro da classe.
 */
public class FuncionarioHorista implements Funcionario {
    private double salario;

    /*
     * Construtor da classe que inicializa o atributo a partir
     * do parâmetro.
     */
    public FuncionarioHorista(double totalAnualRecebido) {
        this.salario = totalAnualRecebido;
    }

    /*
     * Esse método de calcular bônus sobrescreve o método vindo da
     * interface, por se tratar de um funcionário horista, esse
     * método retorna o salário informado vezes 0.10 que representa os
     * 10% de bônus que ele tem direito.
     */
    @Override
    public double calcularBonus() {
    	return salario * 0.10;
    }
    
    /*
     * Esse método é utilizado para informar os dados do salário do
     * funcionário de acordo com o salário informado, o resultado do cálculo
     * e o sálario final a ser recebido.
     */
    @Override
    public String exibirSalario() {
    	return
    			"Funcionário Horista: \n" +
    			"Salário Anual: R$ " + getTotalAnualRecebido() + "\n" +
    			"Bônus salarial: R$ " + calcularBonus() + "\n" +
    			"Salário final: R$ " + (getTotalAnualRecebido() + calcularBonus()) + "\n"; 
    }

    /*
     * Um setter e um getter para atribuir valor ao atributo salaria
     * e retornar o valor do atributo.
     */
    public void setTotalAnualRecebido(double salario) {
        this.salario = salario;
    }

    public double getTotalAnualRecebido() {
        return salario;
    }
}
