package dominio;

public class Conversao {
	private static final String prefixoDolar = "USD";
	private double valorReal;
	private double cotacaoDolar;
	
	
	public void imprimir() {
		System.out.printf("%s %.2f",Conversao.prefixoDolar,conversaoDolar());
	}
	
	public final double conversaoDolar() {
		return this.valorReal / this.cotacaoDolar;
	}

	public double getValorReal() {
		return valorReal;
	}

	public void setValorReal(double valorReal) {
		this.valorReal = valorReal;
	}

	public double getCotacaoDolar() {
		return cotacaoDolar;
	}

	public void setCotacaoDolar(double cotacaoDolar) {
		this.cotacaoDolar = cotacaoDolar;
	}

	public static String getPrefixodolar() {
		return prefixoDolar;
	}
	
}
