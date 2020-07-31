public enum CodigoValidacao implements CodigoErro {
	VALOR_REQUERIDO(201) {
		@Override
		public int getCodigo() {
			return 1;
		}
	},
	FORMATO_INVALIDO(202) {
		@Override
		public int getCodigo() {
			return 2;
		}
	},
	VALOR_CURTO(204) {
		@Override
		public int getCodigo() {
			return 4;
		}
	},
	VALOR_LONGO(208) {
		@Override
		public int getCodigo() {
			return 8;
		}
	};

	  private final int numero;
	  
	  private CodigoValidacao(int numero) {
	    this.numero = numero;
	  }
	 
	  @Override
	  public int getNumero() {
	    return numero;
	  }

}
