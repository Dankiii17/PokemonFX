package es.masanz.ut7.pokemonfx.model.map;

import es.masanz.ut7.pokemonfx.model.base.Evento;
import es.masanz.ut7.pokemonfx.model.base.Mapa;
import es.masanz.ut7.pokemonfx.model.base.Entrenador;
import es.masanz.ut7.pokemonfx.model.enums.CollisionType;
import es.masanz.ut7.pokemonfx.model.enums.TileType;
import es.masanz.ut7.pokemonfx.model.fx.NPC;
import es.masanz.ut7.pokemonfx.model.pokemons.*;

import java.util.ArrayList;

import static es.masanz.ut7.pokemonfx.util.Configuration.*;

public class Ruta3 extends Mapa {

    @Override
    protected void cargarPokemonSalvajes(){
        pokemonSalvajes = new ArrayList<>();
        pokemonSalvajes.add(new Voltorb(5));
        pokemonSalvajes.add(new Eevee(4));
        pokemonSalvajes.add(new Squirtle(6));
    }

    @Override
    protected void cargarMapa() {

        int[][] mapaRuta = {
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 2, 2, 2, 2, 3, 2, 2, 2, 3, 2, 2, 2, 3, 2, 2, 2, 2, 1},
                {1, 2, 3, 3, 2, 3, 2, 2, 2, 3, 2, 2, 2, 3, 2, 3, 3, 2, 1},
                {1, 2, 2, 2, 2, 3, 2, 2, 2, 3, 2, 2, 2, 3, 2, 2, 2, 2, 1},
                {1, 3, 3, 3, 2, 3, 2, 2, 2, 3, 2, 2, 2, 3, 2, 3, 3, 3, 1},
                {1, 2, 2, 2, 2, 3, 2, 11,7, 7, 7,12, 2, 3, 2, 2, 2, 2, 1},
                {1, 2, 3, 3, 2, 3, 2,  9, 6, 6, 6,10, 2, 3, 2, 3, 3, 2, 1},
                {1, 2, 2, 2, 2, 3, 2,  9, 6, 6, 6,10, 2, 3, 2, 2, 2, 2, 1},
                {1, 3, 3, 3, 2, 3, 2,  9, 6, 6, 6,10, 2, 3, 2, 3, 3, 3, 1},
                {1, 2, 2, 2, 2, 3, 2, 13, 8, 8, 8,14, 2, 3, 2, 2, 2, 2, 1},
                {1, 2, 3, 3, 2, 3, 2,  2, 2, 2, 2, 2, 2, 3, 2, 3, 3, 2, 1},
                {1, 2, 2, 2, 2, 2, 2,  2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1},
                {1, 1, 1, 1, 1, 1, 1,  1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
        };

        this.inicioX = 9;
        this.inicioY = 2;

        this.altura = mapaRuta.length;
        this.anchura = mapaRuta[0].length;
        this.nombre = "Ruta 3";

        this.mapData = new int[altura][anchura];
        this.collisionMap = new int[altura][anchura];
        this.teleportMap = new String[altura][anchura];
        this.eventsMap = new Evento[altura][anchura];
        this.npcs = new ArrayList<>();

        teleportMap[5][7] = "Ruta 2";



        Entrenador entrenador1 = new Entrenador();
        entrenador1.incluirPokemonParaCombatir(0, new Cubone(5));
        entrenador1.incluirPokemonParaCombatir(1, new Charmander(4));

        Entrenador entrenador2 = new Entrenador();
        entrenador2.incluirPokemonParaCombatir(0, new Growlithe(6));

        npcs.add(new NPC(2, 1, ABAJO, entrenador1));
        npcs.add(new NPC(2, 3, ARRIBA, 0, entrenador2));

        for (int y = 0; y < altura; y++) {
            for (int x = 0; x < anchura; x++) {
                switch (mapaRuta[y][x]) {
                    case 1:
                        mapData[y][x] = TileType.PARED_BLANCA.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 2:
                        mapData[y][x] = TileType.CESPED.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                    case 3:
                        mapData[y][x] = TileType.CESPED_HIERBA.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                    case 6:
                        mapData[y][x] = TileType.MONTE_CENTRO.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 7:
                        mapData[y][x] = TileType.MONTE_BORDE_SUPERIOR.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 8:
                        mapData[y][x] = TileType.MONTE_BORDE_INFERIOR.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 9:
                        mapData[y][x] = TileType.MONTE_BORDE_IZQUIERDA.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 10:
                        mapData[y][x] = TileType.MONTE_BORDE_DERECHA.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 11:
                        mapData[y][x] = TileType.MONTE_ESQUINA_SUPERIOR_IZQUIERDA.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 12:
                        mapData[y][x] = TileType.MONTE_ESQUINA_SUPERIOR_DERECHA.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 13:
                        mapData[y][x] = TileType.MONTE_ESQUINA_INFERIOR_IZQUIERDA.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 14:
                        mapData[y][x] = TileType.MONTE_ESQUINA_INFERIOR_DERECHA.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                }
            }
        }
    }
}
