package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Tierra;

public class Cubone extends Pokemon implements Tierra {

    public Cubone(int nivel){
        super(nivel);
    }

    @Override
    public int nivelEvolucion() {
        return -1;
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

        // Nivel 10: Gruñido
        Ataque grunido = new Ataque("gruñido", 0, 100, Tipo.NORMAL, false, 40);
        asignarAtaque(grunido.getNombre(), grunido);

        // Nivel 15: Hueso palo (físico)
        Ataque huesopalo = new Ataque("hueso palo", 50, 85, Tipo.TIERRA, false, 10);
        asignarAtaque(huesopalo.getNombre(), huesopalo);

        // Nivel 25: Terremoto (especial)
        Ataque terremoto = new Ataque("terremoto", 100, 100, Tipo.TIERRA, false, 5);
        asignarAtaque(terremoto.getNombre(), terremoto);

        // Nivel 40: Hueso pesado (físico)
        Ataque huesopesado = new Ataque("hueso pesado", 75, 95, Tipo.TIERRA, false, 15);
        asignarAtaque(huesopesado.getNombre(), huesopesado);
    }
}
