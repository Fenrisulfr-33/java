package PracticalProject01.src;

public class Knight extends MOB {
    private Fortune activeFortune;
    protected final int id;
    protected int xp;

    public Knight(int id, String name, int hp, int armor, int hitmodifier, DiceType damageDie, int xp) {
        super(name, hp, armor, hitmodifier, damageDie);
        this.xp = xp;
    }

    public int addXP(int xp){
        this.xp += xp;
    }

    public Fortune getActiveFortune() {
        return activeFortune;
    }

    public int getArmor() {
        return armor;
    }

    public DiceType getDamageDie() {
        return damageDie;
    }

    public int getId() {
        return id;
    }

    public int getMaxHP() {
        return maxHp;
    }

    public int getXP() {
        return xp;
    }

    public Fortune setActiveFortune(Fortune fortune){
        this.activeFortune = fortune;
    }

    public String toCSV() {
        return getName() + "," + getMaxHP() + "," + armor + "," + getHitModifier() + "," + damageDie + "," + xp;
    }

    public String toString() {
        return "+============================+\n" +
                String.format("| %-27s|%n", getName()) +
                String.format("| id: %-23d|%n", getId()) +
                "|                            |\n" +
                String.format("| Health: %-6d  XP: %-7d|%n", getHP(), getXP()) +
                String.format("|  Power: %-6s  Armor: %-4d|%n", getDamageDie().toString(), getArmor()) +
                "|                            |\n" +
                "+============================+";
    }

    public static void main(String[] args) {

    }

}
