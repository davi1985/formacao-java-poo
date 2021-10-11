package br.com.alura.tdd.service;

import java.math.BigDecimal;

public enum Performance {

	NOT_GOOD_ENOUGH {
		@Override
		public BigDecimal percentReadjustment() {
			return new BigDecimal("0.03");
		}
	},

	GOOD {
		@Override
		public BigDecimal percentReadjustment() {
			return new BigDecimal("0.1");
		}
	},

	EXCELLENT {
		@Override
		public BigDecimal percentReadjustment() {
			return new BigDecimal("0.2");
		}
	};

	public abstract BigDecimal percentReadjustment();

}
