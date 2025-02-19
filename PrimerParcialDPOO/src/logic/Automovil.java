package logic;

public class Automovil extends Vehiculo {

	public Automovil(int cilindraje, int peso, float tamanioTanque) {
		super(cilindraje, peso, tamanioTanque);
	}

	@Override
	public int calcularAutonomia() {
		// Ecuacion: 15*10⁴ / (cilindraje + peso) * tamaño del taque
		return (int) ((15 * Math.pow(10, 4)) / (super.getCilindraje() + super.getPeso()) * super.getTamanioTanque());
	}
}