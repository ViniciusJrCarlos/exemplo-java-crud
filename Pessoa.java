package Cadastros;

public class Pessoa {

	
		// TODO Auto-generated method stub
		
		private int idPessoa;
		private String nomePessoa;
		private String email;
		
		public Pessoa() {
			
		}
		//classe para fazer uma alteracao 
		public Pessoa(String nomePessoa, String email) {
			
			super();
			this.nomePessoa = nomePessoa;
			this.email = email;
		}
		
		//classe para fazer uma inclusao
		
		public Pessoa(int idPessoa, String nomePessoa, String email) {
			
			super();
			this.idPessoa = idPessoa;
			this.nomePessoa = nomePessoa;
			this.email = email;
			
		}
		
		
		

		@Override
		public String toString() {
			return "Pessoa [idPessoa=" + idPessoa + ", nomePessoa=" + nomePessoa + ", email=" + email + "]";
		}
		
		public int getIdPessoa() {
			return idPessoa;
		}

		public void setIdPessoa(int idPessoa) {
			this.idPessoa = idPessoa;
		}

		public String getNomePessoa() {
			return nomePessoa;
		}

		public void setNomePessoa(String nomePessoa) {
			this.nomePessoa = nomePessoa;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		
		
		
		
		


}
