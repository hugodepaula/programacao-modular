public enum CodigoPagamento implements CodigoErro {
	TIMEOUT_SERVICO(101) {
		@Override
		public int getCodigo() {
			return 1;
		}
	},
	CARTAO_EXPIRADO(102) {
		@Override
		public int getCodigo() {
			return 2;
		}
	},
	LIMITE_EXCEDIDO(104) {
		@Override
		public int getCodigo() {
			return 4;
		}
	},
	SEM_FUNDOS(108) {
		@Override
		public int getCodigo() {
			return 8;
		}
	};

	  private final int numero;
	  
	  private CodigoPagamento(int numero) {
	    this.numero = numero;
	  }
	 
	  @Override
	  public int getNumero() {
	    return numero;
	  }
	 

}
