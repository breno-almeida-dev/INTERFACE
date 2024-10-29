package main;

import funcionarios.*;

public class Main {

    public static void main(String[] args) {

        /*
         * Aqui é criado um objeto de cada classe de funcioário.
         * Sendo um para funcionário assalariado e outra para funcionário
         * horista.
         */
    	FuncionarioAssalariado funcionarioAssalariado1 = new FuncionarioAssalariado(60000.00);  // Exemplo de salário anual
        FuncionarioHorista funcionarioHorista1 = new FuncionarioHorista(30000.00);  // Exemplo de total anual recebido

        /*
         * Retorno no terminal com a chamada do método da interface
         * para mostrar o cálculo realizado.
         */        
        System.out.println(funcionarioAssalariado1.exibirSalario());
        
        System.out.println("\n\n"); //Quebra de linha para melhorar a legibilidade.
        
        System.out.println(funcionarioHorista1.exibirSalario());

    }
}
