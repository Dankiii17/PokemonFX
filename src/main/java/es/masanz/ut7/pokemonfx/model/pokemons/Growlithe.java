package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Fuego;

public class Growlithe extends Pokemon implements Fuego {

    public Growlithe(int nivel){
        super(nivel);
    }

    @Override
    public int nivelEvolucion() {
        return 16;  // Evoluciona a Arcanine en el nivel 16
    }

    @Override
    public Pokemon pokemonAEvolucionar() {
        Growlithe original = (Growlithe) this.clone();
        Arcanine arcanine = new Arcanine(original.nivel);

        arcanine.setApodo(original.getApodo());
        arcanine.setPuntosExp(original.getPuntosExp());
        arcanine.setHpIV(original.getHpIV());
        arcanine.setAtaqueIV(original.getAtaqueIV());
        arcanine.setDefensaIV(original.getDefensaIV());
        arcanine.setVelocidadIV(original.getVelocidadIV());
        arcanine.setAtaqueEspecialIV(original.getAtaqueEspecialIV());
        arcanine.setDefensaEspecialIV(original.getDefensaEspecialIV());
        arcanine.setHpActual(original.getHpActual());

        return arcanine;
    }

    @Override
    protected void asignarAtaques() {
        // Nivel 1: Gruñido
        Ataque gruñido = new Ataque("gruñido", 0, 100, Tipo.NORMAL, false, 40);
        asignarAtaque(gruñido.getNombre(), gruñido);

        // Nivel 5: Placaje
        Ataque placaje = new Ataque("placaje", 35, 95, Tipo.NORMAL, false, 35);

        // Nivel 10: Lanzallamas (Ataque especial Fuego)
        Ataque lanzallamas = new Ataque("lanzallamas", 90, 100, Tipo.FUEGO, false, 5);
        asignarAtaque(lanzallamas.getNombre(), lanzallamas);

        // Nivel 15: Puño fuego
        Ataque punofuego = new Ataque("puño fuego", 75, 100, Tipo.FUEGO, false, 15);
        asignarAtaque(punofuego.getNombre(), punofuego);

        // Nivel 20: Fuego Sagrado (Ataque especial Fuego)
        Ataque fuegosagrado = new Ataque("fuego sagrado", 100, 90, Tipo.FUEGO, true, 5);
        asignarAtaque(fuegosagrado.getNombre(), fuegosagrado);
    }
}
