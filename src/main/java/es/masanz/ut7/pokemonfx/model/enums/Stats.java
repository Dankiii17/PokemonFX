package es.masanz.ut7.pokemonfx.model.enums;

public enum Stats {

    // TODO 08: Incluir nuevos pokemon. Cuidado, el nombre correcto es muy IMPORTANTE
    BULBASAUR("001", 45, 49, 49, 45, 65, 65, 64),
    CHARMANDER("004", 39, 52, 43, 65, 60, 50, 65),
    SQUIRTLE("007", 44, 48, 65, 43, 50, 64, 66),
    GROWLITHE("058", 55, 70, 45, 60, 70, 50, 65),
    VOLTORB("100", 40, 30, 35, 90, 55, 35, 60),
    CUBONE("104", 50, 50, 95, 35, 60, 30, 50),
    EEVEE("133", 55, 55, 50, 55, 45, 50, 65),
    VAPOREON("134", 130, 65, 60, 65, 110, 95, 235),
    BELLSPROUT("069", 50, 75, 35, 40, 70, 35, 64),
    ELECTRODE("101", 60, 50, 70, 150, 85, 80, 140),
    ARCANINE("059", 90, 110, 80, 95, 100, 80, 200);



    public final String numPokedex;
    public final int hp, ataque, defensa, velocidad, ataqueEspecial, defensaEspecial, expBase;

    Stats(String numPokedex, int hp, int ataque, int defensa, int velocidad, int ataqueEspecial, int defensaEspecial, int expBase) {
        this.numPokedex = numPokedex;
        this.hp = hp;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
        this.ataqueEspecial = ataqueEspecial;
        this.defensaEspecial = defensaEspecial;
        this.expBase = expBase;
    }
}
