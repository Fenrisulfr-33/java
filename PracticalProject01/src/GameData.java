package PracticalProject01.src;

import java.util.List;
import java.util.Random;

public abstract class GameData {
    protected final List<Knight> activeKnights;
    protected final List<Fortune> fortunes;
    protected final List<Knight> knights;
    private static final int MAX_ACTIVE;
    protected final List<MOB> monsters;
    private static final Random random;

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
        if (activeKnights.size() != 4){
            activeKnights.add(kt);
            return true;
        }
        return false;
    }
    public void removeActive(Knight kt){
        int knightIndex = activeKnights.indexOf(kt);
        // reset damage
        activeKnights.remove(knightIndex);
    }
    public Fortune getRandomFortune(){
        return fortunes.get(random.nextInt(fortunes.size() - 1));
    }
    public List<MOB> getRandomMonsters(){
        // Gets a random monster from monsters assuming the max number of 
        // monsters is less than or equal to activeKnights.size(). Careful about an OB1 error here!
    }
    public List<MOB> getRandomMonsters(int number){

    }
    public abstract void save(String filename){
        
    }
}
