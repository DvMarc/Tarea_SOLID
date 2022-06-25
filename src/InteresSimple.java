
public class InteresSimple implements Interes{
	private int nMeses;
	private int mesInicial;
	private int mesFinal;
	private double monto;
	private double tasa;
	private double interes; 
	
	public InteresSimple(int mesInicial, int mesFinal, double tasa) {
		this.nMeses = nMeses;
		this.mesFinal = mesFinal;
		this.mesInicial = mesInicial;
	}
	
	
	@Override
	public void calcularInteres() {
		if(mesInicial>=nMeses && nMeses<=mesFinal){
			interes = monto*tasa;
					System.out.println("El interes es de: "+interes);
		}
		
	}

}
