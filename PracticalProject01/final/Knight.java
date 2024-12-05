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
    }

}
