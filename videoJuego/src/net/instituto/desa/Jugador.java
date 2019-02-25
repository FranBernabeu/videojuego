package net.instituto.desa;

public class Jugador {
	int y, x;
	Jugador j;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void ABAJO() {
		j.setY(j.getY() + 1);
	}

	public void ARRIBA() {
		j.setY(j.getY() - 1);
	}

	public void IZQUIERDA() {
		j.setX(j.getX() - 1);
	}

	public void DERECHA() {
		j.setX(j.getX() + 1);
	}

}
