package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;

public class Eevee extends Pokemon {

    public Eevee(int nivel){
        super(nivel);
    }

    @Override
    public int nivelEvolucion() {
        return 15;  // Evoluciona a Vaporeon, Jolteon, Flareon dependiendo del objeto usado
    }

    @Override
    public Pokemon pokemonAEvolucionar() {
        Eevee original = (Eevee) this.clone();

        Vaporeon vaporeon = new Vaporeon(original.getNivel());

        vaporeon.setApodo(original.getApodo());
        vaporeon.setPuntosExp(original.getPuntosExp());
        vaporeon.setHpIV(original.getHpIV());
        vaporeon.setAtaqueIV(original.getAtaqueIV());
        vaporeon.setDefensaIV(original.getDefensaIV());
        vaporeon.setVelocidadIV(original.getVelocidadIV());
        vaporeon.setAtaqueEspecialIV(original.getAtaqueEspecialIV());
        vaporeon.setDefensaEspecialIV(original.getDefensaEspecialIV());
        vaporeon.setHpActual(original.getHpActual());

        return vaporeon;
    }

    @Override
    protected void asignarAtaques() {
        // Nivel 1: Placaje
        Ataque placaje = new Ataque("placaje", 35, 95, Tipo.NORMAL, false, 35);
        asignarAtaque(placaje.getNombre(), placaje);

        // Nivel 9: Gruñido
        Ataque grunido = new Ataque("gruñido", 0, 100, Tipo.NORMAL, false, 40);
        asignarAtaque(grunido.getNombre(), grunido);

        // Nivel 15: Viento rápido (físico)
        Ataque vientosRapidos = new Ataque("viento rápido", 40, 100, Tipo.NORMAL, false, 30);
        asignarAtaque(vientosRapidos.getNombre(), vientosRapidos);

        // Nivel 25: Puño fuego (para cuando evoluciona a Flareon)
        Ataque punofuego = new Ataque("puño fuego", 75, 100, Tipo.FUEGO, false, 10);
        asignarAtaque(punofuego.getNombre(), punofuego);
    }
}
