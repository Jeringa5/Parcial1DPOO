package logic;

public abstract class Vehiculo {
	private int peso;
	private int cilindraje;
	private float tamanioTanque;

	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getCilindraje() {
		return cilindraje;
	}
	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}

	public float getTamanioTanque() {
		return tamanioTanque;
	}
	public void setTamanioTanque(float tamanioTanque) {
		this.tamanioTanque = tamanioTanque;
	}

	public Vehiculo(int cilindraje, int peso, float tamanioTanque) {
		this.cilindraje = cilindraje;
		this.peso = peso;
		this.tamanioTanque = tamanioTanque;
	}

	public abstract int calcularAutonomia();
}
	
