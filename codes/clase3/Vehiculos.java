
abstract class Vehiculo {

	int numeroDeLlantas;
	abstract void mover(int x, int y);
}

interface Volador {

	void volar(int distancia);
}

class VehiculoMotorizado extends Vehiculo {

	public int numeroDeLlantas;
	public int numeroDePuertos;
	public int velocidadMaxima;
	public int capacidadMaxima;
	public int posicionX;
	public int posicionY;
	public String Marca;
	public String Modelo;
	public boolean encendido;

	public void encender() {
		this.encendido = true;
	}

	public void apagar() {
		this.encendido = false;
	}

	public void mover(int x, int y) {

		numeroDeLlantas = 3;
		posicionX += x;
		posicionY += y;
	}
}

class Automovil extends VehiculoMotorizado {

}

class Motocicleta extends VehiculoMotorizado {

}

class Bicicleta extends Vehiculo{

public void mover(int x, int y) {

	}
}

class Avion extends VehiculoMotorizado implements Volador {

	public void volar(int distancia) {

	}

	public void mover(int x, int y) {

	}

	public void mover(double x, double y) {

	}
	public void mover() {
		
	}
	public void mover(int x, int y, int z) {
		
	}
}

class Ave implements Volador {

	public void volar(int distancia) {
		
	}
}

class Superman implements Volador {

	public void volar(int distancia) {
		
	}
}

class Aguila extends Ave {

	
}

class Colibri extends Ave {

	public void volar(int distancia) {
		
	}
}

