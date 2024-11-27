package PracticalProject01.src;
public class Knight extends MOB {
    private Fortune activeFortune;
    protected final int id;
    protected int xp;

    public Knight(int id, String name, int hp, int armor, int hitModifier, DiceType damageDie, int xp) {
        super(name, hp, armor, hitModifier, damageDie);
        this.xp = xp;
        this.id = id;
    }

    @Override
    public int getArmor() {
        if (activeFortune != null) {
            return activeFortune.getArmor() + super.getArmor();
        }
        return super.getArmor();
    }

    @Override
    public int getMaxHP() {
        if (activeFortune != null) {
            return activeFortune.getMaxHP() + super.getMaxHP();
        }
        return super.getMaxHP();
    }

    @Override
    public DiceType getDamageDie() {
        if (activeFortune != null) {
            return activeFortune.getDamageDie();
        }
        return super.getDamageDie();
    }

    @Override
    public int getHitModifier() {
        if (activeFortune != null) {
            return activeFortune.getHitModifier() + super.getHitModifier();
        }
        return super.getHitModifier();
    }

    public Fortune getActiveFortune() {
        return activeFortune;
    }

    public void setActiveFortune(Fortune fortune) {
        this.activeFortune = fortune;
    }

    public int getXP() {
        return xp;
    }

    public void addXP(int xp) {
        this.xp += xp;
    }

    public int getId() {
        return id;
    }

    public String toCSV() {
        return getName() + "," + getMaxHP() + "," + armor + "," + getHitModifier() + "," + damageDie + "," + xp;
    }

    @Override
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
        // Knight knight = new Knight(1, "Black Knight", 400, 200, 1, DiceType.D12, 10);

        // System.out.println("TESTING Knight, Name: " + knight.getName()); // Should
        // return: Black Knight
        // System.out.println("TESTING Knight, MaxHP: " + knight.getMaxHP()); // Should
        // return: 400
        // System.out.println("TESTING Knight, Armor: " + knight.getArmor()); // Should
        // return: 200
        // System.out.println("TESTING Knight, XP: " + knight.getXP()); // Should
        // return: 10
        // System.out.println("TESTING Knight, DamageDie: " + knight.getDamageDie()); //
        // Should return: D12
        // System.out.println("TESTING Knight, HitModifier: " +
        // knight.getHitModifier()); // Should return: 1
        // System.out.println("TESTING Knight, Active fortune: " +
        // knight.getActiveFortune()); // Should return: null
        // Fortune knightsReckoning = new Fortune("Knight's Reckoning", 100, 50, 2);
        // knight.setActiveFortune(knightsReckoning);
        // System.out.println("TESTING Knight, Active fortune: \n" +
        // knight.getActiveFortune()); //
        // System.out.println("TESTING Knight, MaxHP after fortune: " +
        // knight.getMaxHP()); // Should return: 500
        // System.out.println("TESTING Knight, Armor after fortune: " +
        // knight.getArmor()); // Should return: 250
        // System.out.println("TESTING Knight, HitModifier after fortune: " +
        // knight.getHitModifier()); // Should return: 2
        // System.out.println("TESTING Knight, Monster killed +10 xp."); // Should
        // return: 200
        // knight.addXP(10);
        // System.out.println("TESTING Knight, getXP after kill: " + knight.getXP()); //
        // System.out.println("TESTING Knight, CSV: " + knight.toCSV()); //
        // System.out.println("TESTING Knight, toString \n" + knight); //
    }

}
