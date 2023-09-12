import java.util.ArrayList;


public class Banco {
	
    private String nome;
	private ArrayList<Conta> contas;
	
    
    public Banco(String nome){
    	this.nome = nome;
    	contas = new ArrayList<Conta> ();

    }
    
    public String getNome() {
    	return nome;
    }
    
    public void setNome(String nome) {
      this.nome = nome;
    }
    
    
    public void abrirConta(Conta c){
    	contas.add(c);

    }
    
    
    public Conta getConta (int numero){
    	for(Conta c : contas) {
    		if(c.getNumero()== numero)
    			return c;
    	}
    	return null;
    }
    
    
    
   
    public void  saque(int numero, double valor ,String senha){
       Conta c = getConta(numero);
       if(c != null) {
    	   for(Conta clientes : contas) {
    		   if(clientes.getTitular().getSenha().equals(senha)) {
    			   c.saca(valor);
    		   }
    	   }
       }
       
    }

   
    public void deposita(int numero, double valor,String senha){
    	Conta c = getConta(numero);
    	if(c != null)
    		 for(Conta clientes : contas) {
    			 if(clientes.getTitular().getSenha().equals(senha)) {
    				 c.deposita(valor); 
    			 }
    		 }
      			   
      		   }
    public void transfere(int numero, double valor,String senha){
    	Conta c = getConta(numero);
    	if(c != null)
    		 for(Conta clientes : contas) {
    			 if(clientes.getTitular().getSenha().equals(senha)) {
    				 c.deposita(valor); 
    			 }
    		 }
      			   
      		   }
    		 
    

    public String toString() {
    	String tudo = "";
    	for(Conta c: contas) {
    		tudo = tudo + c.toString() + "\n";
    	}
    	return tudo;
    }
}