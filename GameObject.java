public class GameObject {
    public final int ID;
    public final boolean MOVABLE;

    public GameObject(int id) {
        this(id, false);
    }

    protected GameObject(int id, boolean canMove) {
        ID = id;
        MOVABLE = canMove;
    }
}

class MobileObject extends GameObject {
    private int movement = 10;

    public MobileObject(int id) {
        super(id, true);
    }

    public int getMovement() {
        return movement;
    }

    public void setMovement(int movement) {
        this.movement = movement;
    }
}

class NamedObject extends MobileObject {
    public final String name;
    private int level = 1;

    public NamedObject(int ID, String name) {
        super(ID);
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public int getMovement() {
        return super.getMovement() * getLevel();
    }

    public static void main(String[] args) {
        GameObject go = new GameObject(10);
        MobileObject mo = new MobileObject(11);
        NamedObject no = new NamedObject(12, "Ganon");
        mo.setMovement(5);
        no.setLevel(2);
        System.out.println("go.MOVABLE: " + go.MOVABLE);
        System.out.println("no.MOVABLE: " + no.MOVABLE);
        System.out.println("no.getMovement(): " +no.getMovement());
        System.out.println("mo.ID:" + mo.ID);
    }
}
