package logic;

public class Motocicleta extends Vehiculo {

	public Motocicleta(int cilindraje, int peso, float tamanioTanque) {
		super(cilindraje, peso, tamanioTanque);
	}

	@Override
	public int calcularAutonomia() {
		// Ecuacion: 8*10⁴ / (cilindraje + 2*peso) * tamaño del taque
		return (int) ((8 * Math.pow(10, 4)) / (super.getCilindraje() + 2 * super.getPeso()) * super.getTamanioTanque());
	}
}