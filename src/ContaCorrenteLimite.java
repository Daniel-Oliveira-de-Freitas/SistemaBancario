
public class ContaCorrenteLimite extends Conta {
	private double limite;
	public ContaCorrenteLimite(Cliente titular) {
		super (titular);
		this.limite = 200;
	}
	public double getLimite() {
		return limite;
	}
	

}
