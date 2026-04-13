package eedd.ra4.videojuego;

import eedd.ra4.videojuego.vo.Enemigo;
import eedd.ra4.videojuego.vo.Jugador;

/**
 *
 * AppVideojuego: Clase que realiza el tratamiento de un videojuego.
 * 
 * @author Isidoro Nevares Martín - IES Virgen de la Paloma
 * @date 4 dic 2025
 * 
 * 
 */

public class AppVideojuego {
    public static void main(String[] args) {
        Jugador jugador = new Jugador();
        jugador.nombre = "Héroe";
        jugador.getVida = 100;
        jugador.getNivel = 5;
        jugador.getExperiencia = 50;

        Enemigo enemigo = new Enemigo();
        enemigo.nombre = "Orco";
        enemigo.getVida = 80;
        enemigo.getNivel = 3;
        enemigo.getTipo = "Guerrero";
        
        jugador.atacar(enemigo);

        System.out.println("Vida del enemigo: " + enemigo.getVida);
    }
}
