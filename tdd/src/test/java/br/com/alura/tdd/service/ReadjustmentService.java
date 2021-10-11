package br.com.alura.tdd.service;

import java.math.BigDecimal;

import br.com.alura.tdd.modelo.Funcionario;

public class ReadjustmentService {

	public void giveReadjustment(Funcionario funcionario, Performance performance) {
		BigDecimal valuePercentual = performance.percentReadjustment();
		
		BigDecimal bonus = funcionario.getSalario().multiply(valuePercentual);

		funcionario.readjustment(bonus);
	}

}
