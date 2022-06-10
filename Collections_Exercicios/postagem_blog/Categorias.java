public enum Categorias {

   
	DEVOPS("Devops"),
	DESENVOLVIMENTO("Desenvolvimento"),
	DATA_SCIENCE("Data_Science");

	    private String descricao;

		Categorias(String string) {
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

	 
	
}