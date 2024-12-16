package PracticalProject01.src;

import java.util.List;
import java.util.Scanner;

public class ConsoleView implements GameView {
    private final Scanner in;

    public ConsoleView() {
        in = new Scanner(System.in);
    }
    @Override
    public void splashScreen() {
        System.out.println("Splash Screen here....");
    }
    @Override
    public void endGame() {
        System.out.println("Goodbye");
    }
    @Override
    public String displayMainMenu() {
        System.out.print("What would you like to do? ");
        String response = in.nextLine();
        return response;
    }
    @Override
    public void printHelp() {
        System.out.print("Unsure what to do, here are some options:\n" +
                "\tls or list all  - listing the knights\n" +
                "\tlist active  - list the active knights knights only\n" +
                "\tshow name or id - show the knight details card\n" +
                "\tset active name or id - set knight as active (note: only 4 knights can be active) \n" +
                "\tremove active name or id - remove a knight from active status (heals knight)\n" +
                "\texplore or adventure or quest - find random monsters to fight\n" +
                "\tsave filename - save the game to the file name (default: saveData.csv)\n" +
                "\texit or goodbye - to leave the game\n" +
                "\n" +
                "Game rules: You can have four active knights. As long as they are active, they won't heal,\n" +
                "but they can gain XP by going on adventures.\n" +
                "When you make a knight inactive, they will heal. How many monsters can you defeat\n" +
                "before, you have to heal?\n");
    }
    @Override
    public void listKnights(List<Knight> knights){
        if (knights.isEmpty()){
            System.out.println("No knights to list");
        } else {
            for (Knight knight : knights){
                System.out.println(knight.getId() + ": " + knight.getName());
            }
        }
    }
    @Override
    public void knightNotFound(){
        System.out.println("Knight not found!");
    }
    @Override
    public void showKnight(Knight knight){
        System.out.println(knight.toString() + "\n");
    }
    @Override
    public void setActiveFailed(){
        System.out.println("Unable to set active knight. Only four can be active at a time.\n");
    }

    @Override
    public void printBattleText(List<MOB> monsters, List<Knight> activeKnights) {
        System.out.println("Our heroes come across the following monsters. Prepare for battle!");
        String formattedString = String.format("%-27s %6s", "Knights", "Foes");
        System.out.println(formattedString);
        int i = 0;
        for (; i < monsters.size(); i++) {
            String formattedKnightsMOB = String.format("%-27s%6s", activeKnights.get(i), monsters.get(i));
            System.out.println(formattedKnightsMOB);
        }
        for (; i < activeKnights.size(); i++) {
            String formattedKnight = String.format("%-27s", activeKnights.get(i));
            System.out.println(formattedKnight);
        }
    }
    @Override
    public void printBattleText(MOB dead){
        System.out.println(dead.getName() + " was defeated!");
    }
    @Override
    public void printFortunes(List<Knight> activeKnights){
        System.out.println("For this quest, our knights drew the following fortunes!");
        for (Knight knight : activeKnights){
            System.out.println(knight.getName() + " drew");
            Fortune fortune = knight.getActiveFortune();
            System.out.println(fortune.toString());
        }
    }
    @Override
    public boolean checkContinue(){
        System.out.println("Would you like to continue on your quest (y/n)? ");
        String response = in.nextLine();
        if (response == "y" || response == "yes"){
            return true;
        }
        return false;
    }
    @Override
    public void printDefeated(){
        System.out.println("All active knights have been defeated!");
    }
}
