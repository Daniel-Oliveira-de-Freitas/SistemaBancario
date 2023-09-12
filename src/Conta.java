
public class Conta {
    private static int totalDeContas = 0;
    
    private final int numero;
    private Cliente titular;
    private double saldo;
    private double limite;
    
    public Conta( Cliente titular){
    	this.numero = 1001 + totalDeContas;
    	this.titular = titular;
       	this.saldo  = 0;
       	Conta.totalDeContas++;
    	
        
    }
    public Cliente getTitular(){
        return titular;
    }
   
    public int getNumero(){
        return numero;
    }
    
    
    public double getSaldo(){
        return saldo;
    }
    
   
    public double getLimite(){
        return limite;
    }
    
    
     public static int getTotalDeContas() {
    	 return totalDeContas;
     }
    
  
    
    
    
   
    public void setTitular(Cliente t){
        titular = t;
    }
    
    
    
    public void setLimite(double l){
        limite = l;
    }
	
    
    public void deposita(double valor){
          saldo = saldo + valor;
	}
    
    
    public void saca(double valor){
     if(valor <= (saldo + limite)) {
    	 saldo = saldo - valor;
    	 System.out.println("Saque realizado com sucesso");
     }else {
    	 System.out.println("Saldo insuficiente");
     }
    
	}
    
    public void transfere(Conta destino, double valor) {
    	if(valor <= (saldo + limite)) {
       	 saldo = saldo - valor;
       	 System.out.println("Saque realizado com sucesso");
        }else {
       	 System.out.println("Saldo insuficiente");
        }
    }
    
    
    public String toString(){
    	return "Numero: " + numero + " " + titular.toString() + "Saldo: " +saldo + "Limite: "+ limite + totalDeContas;
    
	}
}
