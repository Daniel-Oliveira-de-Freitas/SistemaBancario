

public class Cliente {
		private String nome;
		private long CPF;
		private String telefone;
		private String endereco;
		private String senha;
	
		
	public Cliente(String nome, long CPF, String senha ) {
		this.senha = senha;
	 	this.nome = nome;
	   this.CPF = CPF;
	   endereco = "";
	   telefone = "";
	   
	}
	
	public String getNome() {return nome;}
	public long getCPF() {return CPF;}
	public String getEndereco() { return endereco;}
	public String getTelefone() { return telefone;}
	public String getSenha() {return senha;}
	
	public void setNome(String nome) {this.nome = nome;}
	public void setCPF (long CPF) { this.CPF = CPF;}
	public void setEndereco(String endereco) {this.endereco = endereco;}
	public void setTelefone(String telefone) {this.telefone= telefone;}
	public void setSenha(String senha) {this.senha = senha;}
	public String toString() {
		return "Titular: " + nome + "CPF: "+CPF + " Senha: " + this.senha;
		
	}
}
