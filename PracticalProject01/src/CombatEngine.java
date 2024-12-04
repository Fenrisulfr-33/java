package PracticalProject01.src;

import java.util.List;
import java.util.Random;

public class CombatEngine {
    private final GameData data;
    private final DiceSet dice;
    private final Random rnd;
    private final GameView view;

    public CombatEngine(GameData data, GameView view){
        this.data = data;
        this.view = view;
    }

    public void initialize(){
        List<Knight> activeKnights = data.getActiveKnights();
        for (Knight activeKnight : activeKnights){
            activeKnight.setActiveFortune(data.getRandomFortune());
        }
        view.printFortunes(data.getActiveKnights());
    }

    public void runCombat(){

    }

    private int doBattle(List<MOB> attackers, List<MOB> defenders){

    }

    public void clear(){
        // Sets all fortunes to *null* across all knights. 
        // It is easier to just loop through all Knights setting the fortune to null, 
        // simply because activeKnights can be harder to track after combat is done.
        List<Knight> knights = data.getKnights();
        for (Knight knight : knights){
            knight.setActiveFortune(null);
        }
    }
}
