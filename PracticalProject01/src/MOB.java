package PracticalProject01.src;
public class MOB implements Attributes {
    protected int armor;
    protected int damage;
    protected DiceType damageDie;
    protected int hitModifier;
    protected int maxHp;
    private String name;

    public MOB(String name, int hp, int armor, int hitModifier, DiceType damageDie){
        this.name = name;
        this.maxHp = hp;
        this.armor = armor;
        this.hitModifier = hitModifier;
        this.damageDie = damageDie;
        damage = 0;
    }

    @Override
    public int getArmor() {
        return armor;
    }

    @Override
    public int getMaxHP() {
        return maxHp;
    }

    @Override
    public DiceType getDamageDie() {
        return damageDie;
    }

    @Override
    public int getHitModifier() {
        return hitModifier;
    }

    public void addDamage(int damage){
        this.damage += damage;
    }

    public MOB copy(){
        return new MOB(name, maxHp, armor, hitModifier, damageDie);
    }

    public int getHP(){
        return maxHp - damage;
    }
    public String getName(){
        return name;
    }
    public void resetDamage(){
        this.damage = 0;
    }
    public String toString(){
        return "+============================+\n" +
        String.format("| %-27s|%n", getName()) +
        "|                            |\n" +
        String.format("|         Health: %-10d |%n", getHP())  +
        String.format("|  Power: %-6s  Armor: %-4d|%n", getDamageDie().toString(), getArmor()) +
        "|                            |\n" +
        "+============================+";
    }
    public static void main(String[] args) {
        
    }
}
