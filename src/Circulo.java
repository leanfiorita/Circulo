import static java.lang.Math.*;

public class Circulo {
	private double radio;
	private Punto centro;

	public Circulo(Punto centro, double radio) {
		this.radio = radio;
		this.centro = centro;
	}

	public boolean intersectaCon(Circulo otro) {
		double distancia = sqrt(
				pow((centro.getX() - otro.centro.getX()), 2) + pow(centro.getY() - otro.centro.getY(), 2));
		//Verifico si se intersectan
		if (distancia > radio + otro.radio)
			return false;
		//Verifico si alguno está incluido en el otro
		if (distancia < abs(radio - otro.radio))
			return false;
		//Verifico si son el mismo circulo
		if (distancia == 0 && radio == otro.radio)
			return false;		
		
		return true;
	}
}
