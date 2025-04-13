package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Planta;
import es.masanz.ut7.pokemonfx.model.type.Veneno;

public class Bellsprout extends Pokemon implements Planta, Veneno {

    public Bellsprout(int nivel){
        super(nivel);
    }

    @Override
    public int nivelEvolucion() {
        return -1;  // Evoluciona a Weepinbell en el nivel 21
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

        // Nivel 6: Látigo Cepa
        Ataque latigoCepa = new Ataque("látigo cepa", 35, 95, Tipo.PLANTA, false, 15);
        asignarAtaque(latigoCepa.getNombre(), latigoCepa);

        // Nivel 12: Bomba Lodo (especial)
        Ataque bombalodo = new Ataque("bomba lodo", 50, 90, Tipo.VENENO, true, 10);
        asignarAtaque(bombalodo.getNombre(), bombalodo);

        // Nivel 16: Hoja afilada
        Ataque hojaAfilada = new Ataque("hoja afilada", 55, 95, Tipo.PLANTA, false, 20);
        asignarAtaque(hojaAfilada.getNombre(), hojaAfilada);

        // Nivel 21: Giga Drenado (especial)
        Ataque gigadrenado = new Ataque("giga drenado", 75, 100, Tipo.PLANTA, true, 5);
        asignarAtaque(gigadrenado.getNombre(), gigadrenado);
    }
}
