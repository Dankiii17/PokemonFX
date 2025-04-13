package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;

public class Arcanine extends Pokemon {
    public Arcanine(int nivel) {
        super(nivel);
    }

    @Override
    protected void asignarAtaques() {
        Ataque alarido = new Ataque("alarido",55,95, Tipo.SINIESTRO,false,15);
        asignarAtaque(alarido.getNombre(),alarido);

        Ataque colmilloIgneo = new Ataque("colmillo igneo",65,95,Tipo.FUEGO,false,15);
        asignarAtaque(colmilloIgneo.getNombre(),colmilloIgneo);

        Ataque llamarada = new Ataque("llamarada",110,85,Tipo.FUEGO,true,5);
        asignarAtaque(llamarada.getNombre(),llamarada);

        Ataque voltioCruel = new Ataque("voltio cruel",90,100,Tipo.ELECTRICO,true,15);

    }

    @Override
    public int nivelEvolucion() {
        return 0;
    }

    @Override
    public Pokemon pokemonAEvolucionar() {
        return null;
    }
}
