
public class ContaPoupanca extends Conta {
	
	private static final String Data = null;
	private String dataAniv;
	private double juros = 2.9;
	
	public ContaPoupanca(Cliente titular) {
		super(titular);
	
	}
	
	
	
	public String getDataAniv() {
		return dataAniv;
	}
	public void setDataAniv(String dataAniv) {
		this.dataAniv = dataAniv;
	}
	public double getJuros() {
		return juros;
	}
	public void setJuros(double juros) {
		this.juros = juros;
	}
	
	public void atualiza (double juros) {
		if ( Data == dataAniv) {
		super.deposita(juros); 
	}
	}
	}


