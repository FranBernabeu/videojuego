package net.instituto.desa;

public class Game {
	private static final String ABAJO = "Abajo";
	private static final String ARRIBA = "Arriba";
	private static final String DERECHA = "Derecha";
	private static final String IZQUIERDA = "Izquierda";
	Jugador j=new Jugador();

	public void movimiento(String m) {
		if (m.equalsIgnoreCase(DERECHA)) {
			j.DERECHA();
		}
		if (m.equalsIgnoreCase(IZQUIERDA)) {
			j.IZQUIERDA();
		}
		if (m.equalsIgnoreCase(ARRIBA)) {
			j.ARRIBA();
		}
		if (m.equalsIgnoreCase(ABAJO)) {
			j.ABAJO();
		}
	}

}
