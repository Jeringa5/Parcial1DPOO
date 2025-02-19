package pruebas;

import logic.Automovil;
import logic.Motocicleta;

public class Main {
	private Automovil automovil;
	private Motocicleta motocicleta;

	public Main() {
		automovil = new Automovil(1450, 1000, 18); // cilindraje, peso, tamanioTanque
		System.out.println("La autonomía del automóvil dado es de: " + automovil.calcularAutonomia() + " km");

		motocicleta = new Motocicleta(230, 120, 5);
		System.out.println("La autonomía de la motocicleta dada es de: " + motocicleta.calcularAutonomia() + " km");
		
		automovil = new Automovil(1670, 1200, 15);
		System.out.println("La autonomía del automóvil dado es de: " + automovil.calcularAutonomia() + " km");

		motocicleta = new Motocicleta(450, 100, 8);
		System.out.println("La autonomía de la motocicleta dada es de: " + motocicleta.calcularAutonomia() + " km");
	}

	public static void main(String[] args) {
		new Main();
	}
}