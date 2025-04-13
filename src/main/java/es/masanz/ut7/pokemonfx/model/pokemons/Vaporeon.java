package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Agua;

public class Vaporeon extends Pokemon implements Agua {

    public Vaporeon(int nivel){
        super(nivel);
    }

    @Override
    public int nivelEvolucion() {
        return 0;
    }

    @Override
    public Pokemon pokemonAEvolucionar() {
        return null;
    }

    @Override
    protected void asignarAtaques() {
        // Nivel 1: Placaje
        Ataque placaje = new Ataque("placaje", 35, 95, Tipo.NORMAL, false, 35);
        asignarAtaque(placaje.getNombre(), placaje);

        // Nivel 10: Pistola Agua (especial)
        Ataque pistolaAgua = new Ataque("pistola agua", 40, 100, Tipo.AGUA, false, 25);
        asignarAtaque(pistolaAgua.getNombre(), pistolaAgua);

        // Nivel 20: Hidrobomba (especial)
        Ataque hidrobomba = new Ataque("hidrobomba", 110, 85, Tipo.AGUA, false, 5);
        asignarAtaque(hidrobomba.getNombre(), hidrobomba);

        // Nivel 30: Puño Acuático (físico)
        Ataque puñoAcuatico = new Ataque("puño acuático", 75, 100, Tipo.AGUA, false, 15);
        asignarAtaque(puñoAcuatico.getNombre(), puñoAcuatico);
    }
}
