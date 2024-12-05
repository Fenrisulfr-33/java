// package PracticalProject01.src;
public class Fortune implements Attributes {
    private int armor;
    private DiceType dType;
    private int hitModifier;
    private int hpBonus;
    private String name;

    public Fortune(String name, int hpBonus, int armor, int hitModifier) {
        this(name, hpBonus, armor, hitModifier, null);
    }

    public Fortune(String name, int hpBonus, int armor, int hitModifier, DiceType type) {
        this.armor = armor;
        this.hitModifier = hitModifier;
        this.hpBonus = hpBonus;
        this.name = name;
        dType = type;
    }

    @Override
    public int getArmor() {
        return armor;
    }

    @Override
    public int getMaxHP() {
        return hpBonus;
    }

    @Override
    public DiceType getDamageDie() {
        return dType;
    }

    @Override
    public int getHitModifier() {
        return hitModifier;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "+======================+\n" +
                String.format("|%-22s|%n", getName()) +
                String.format("|HP Bonus: %12s|%n", "+" + getMaxHP()) +
                String.format("|AC Bonus: %12s|%n", "+" + getArmor()) +
                String.format("|Hit Bonus: %11s|%n", "+" + getHitModifier()) +
                String.format("|Damage Adj: %10s|%n", getDamageDie() != null ? getDamageDie() : "-") +
                "+======================+";
    }

    public static void main(String[] args) {
        // Fortune ftn = new Fortune("Merlin Luck", 10, 5, 2, DiceType.D12);
        // System.out.println("TESTING Armor in fortune " + ftn.getArmor()); //
        // System.out.println("TESTING MaxHP in fortune " + ftn.getMaxHP()); //
        // System.out.println("TESTING DamageDie in fortune " + ftn.getDamageDie()); //
        // System.out.println("TESTING HitModifier in fortune " + ftn.getHitModifier());
        // //
        // System.out.println("TESTING Name in fortune " + ftn.getName()); //
        // System.out.println("TESTING toString in fortune \n" + ftn); //
    }

}
