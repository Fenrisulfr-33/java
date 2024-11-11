package Pokemon.src;

public class Pokemon {
    String name;
    String ability;
    String nature;
    String type1;
    String type2;
    int hp;
    int atk;
    int spAtk;
    int def;
    int spDef;
    int spd;

    public Pokemon(String name, String ability, String nature, String type1, String type2, int hp, int atk, int spAtk,
            int def, int spDef, int spd) {
        this.name = name;
        this.ability = ability;
        this.nature = nature;
        this.type1 = type1;
        this.type2 = type2;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.spDef = spDef;
        this.spd = spd;
    }

    public String getName(){
        return name;
    }
    public String getAbility(){
        return ability;
    }

    public static void main(String[] args) {
        
    }
}
