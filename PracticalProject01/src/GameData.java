package PracticalProject01.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class GameData {
    protected final List<Knight> activeKnights;
    protected final List<Fortune> fortunes;
    protected final List<Knight> knights;
    private static final int MAX_ACTIVE = 4;
    protected final List<MOB> monsters;
    private static final Random random;

    // No constructor

    public List<Knight> getKnights(){
        return knights;
    }
    public List<Knight> getActiveKnights(){
        return activeKnights;
    }
    public Knight getActive(String nameOrId){
        // use findKnight
        return findKnight(nameOrId, activeKnights);
    }
    public Knight getKnight(String nameOrId){
        return findKnight(nameOrId, knights);
    }
    protected Knight findKnight(String nameOrId, List<Knight> list){
        for (Knight knight : list){
            if (knight.getName().equals(nameOrId) || knight.getId() == Integer.parseInt(nameOrId)){
                return knight;
            }
        }
        return null;
    }
    public boolean setActive(Knight kt){
        if (activeKnights.size() < 4){
            activeKnights.add(kt);
            return true;
        }
        return false;
    }
    public void removeActive(Knight kt){
        int knightIndex = activeKnights.indexOf(kt);
        kt.resetDamage();
        activeKnights.remove(knightIndex);
    }
    public Fortune getRandomFortune(){
        return fortunes.get(random.nextInt(fortunes.size() - 1));
    }
    public List<MOB> getRandomMonsters(){
        List<MOB> returnMonsters = new ArrayList<MOB>();
        for (int i = 0; i < activeKnights.size(); i++){
            returnMonsters.add(monsters.get(random.nextInt(monsters.size() - 1)));
        }
        return returnMonsters;
    }
    public List<MOB> getRandomMonsters(int number){
        List<MOB> returnMonsters = new ArrayList<MOB>();
        // Builds a list of random monsters of size number. 
        // Note, that monsters should be copied into the return List, so they can be modified individually.
        for (int i = 0; i < number; i++){
            returnMonsters.add(monsters.get(random.nextInt(monsters.size() - 1)));
        }
        return returnMonsters;
    }
    public abstract void save(String filename);

    public static void main(String[] args) {
        // Test cases
        // Import the list and test
        String file = "PracticalProject01\\gamedata.csv";

    }
}
