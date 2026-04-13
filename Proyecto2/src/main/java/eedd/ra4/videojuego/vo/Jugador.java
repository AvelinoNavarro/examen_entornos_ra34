package eedd.ra4.videojuego.vo;

/**
 *
 * Jugador: Clase de persistencia que representa un Jugador.
 * 
 * @author Isidoro Nevares Martín - IES Virgen de la Paloma
 * @date 03 marzo 2026
 * 
 * 
 */
public class Jugador extends Personaje {
    private static final int VEINTE = 20;
	private static final int CIEN = 100;
	public int getExperiencia;

    public void ganarExperiencia(int puntos) {
        getExperiencia += puntos;
        if (getExperiencia > CIEN) {
            getNivel++;
            getExperiencia = 0;
        }
    }
    
    public void ataqueEspecial(Enemigo enemigo) {
        int danio = getNivel * VEINTE;
        enemigo.getVida -= danio;
    }
}
