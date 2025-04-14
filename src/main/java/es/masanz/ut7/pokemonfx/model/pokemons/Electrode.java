package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Electrico;

public class Electrode extends Pokemon implements Electrico {

    public Electrode(int nivel){
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
        // Nivel 1: Impactrueno
        Ataque impactrueno = new Ataque("impactrueno", 40, 100, Tipo.ELECTRICO, false, 30);
        asignarAtaque(impactrueno.getNombre(), impactrueno);

        // Nivel 10: Puño trueno
        Ataque punotruno = new Ataque("puño trueno", 75, 100, Tipo.ELECTRICO, false, 10);
        asignarAtaque(punotruno.getNombre(), punotruno);

        // Nivel 20: Puño eléctrico (físico)
        Ataque punoelectrico = new Ataque("puño electrico", 80, 100, Tipo.ELECTRICO, false, 20);
        asignarAtaque(punoelectrico.getNombre(), punoelectrico);

        // Nivel 30: Rayo (especial)
        Ataque rayo = new Ataque("rayo", 90, 100, Tipo.ELECTRICO, false, 15);
        asignarAtaque(rayo.getNombre(), rayo);

        // Nivel 40: Bomba voltio (especial)
        Ataque bombavoltio = new Ataque("bomba voltio", 110, 80, Tipo.ELECTRICO, true, 5);
        asignarAtaque(bombavoltio.getNombre(), bombavoltio);
    }
}
