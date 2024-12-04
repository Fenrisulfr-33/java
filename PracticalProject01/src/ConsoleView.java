package PracticalProject01.src;

import java.util.List;
import java.util.Scanner;

public class ConsoleView implements GameView {
    private final Scanner in;

    public ConsoleView() {
        in = new Scanner(System.in);
    }

    public void splashScreen() {
        // TODO: figure out what a splash screen is
        System.out.print("Splash Screen here....");
    }

    public void endGame() {
        System.out.println("Goodbye");
    }

    public String displayMainMenu() {
        System.out.println("What would you like to do?");
        String response = in.nextLine();
        return response;
    }

    public void printHelp() {
        System.out.print("Unsure what to do, here are some options:\r\n" +
                "            ls or list all  - listing the knights\r\n" +
                "            list active  - list the active knights knights only\r\n" +
                "            show name or id - show the knight details card\r\n" +
                "            set active name or id - set knight as active (note: only 4 knights can be active) \r\n" +
                "            remove active name or id - remove a knight from active status (heals knight)\r\n" +
                "            explore or adventure or quest - find random monsters to fight\r\n" +
                "            save filename - save the game to the file name (default: saveData.csv)\r\n" +
                "            exit or goodbye - to leave the game\r\n" +
                "\r\n" +
                " Game rules: You can have four active knights. As long as they are active, they won't heal, \r\n" +
                " but they can gain XP by going on adventures.\r\n" +
                " When you make a knight inactive, they will heal. How many monsters can you defeat \r\n" +
                " before, you have to heal?  ");
    }

    public void listKnights(List<Knight> knights){
        if (knights.size() == 0){
            System.out.println("No knights to list");
        } else {
            for (Knight knight : knights){
                System.out.println(knight.getId() + ": " + knight.getName())
            }
        }
    }

    public void knightNotFound(){
        System.out.println("Knight not found!");
    }

    public void showKnight(Knight knight){
        System.out.println(knight.toString() + "\n");
    }

    public void setActiveFailed(){
        System.out.println("Unable to set active knight. Only four can be active at a time.\n")
    }

    public void printBattleText(List<MOB> monsters, List<Knight> activeKnights){
        // Our heroes come across the following monsters. Prepare for battle!
        // Knights                     Foes
        // Guinevere                   Umber Hulk
        // Danu of Ireland
        // Arthur
        // %-27s %n
        System.out.println("Our heroes come across the following monsters. Prepare for battle!");
        System.out.printf("Knights %-27s  Foes %n");
        if (activeKnights.size() == monsters.size()){
            for (int i = 0; i < activeKnights.size(); i++){
                String knight = activeKnights.get(i).getName();
                String monster = monsters.get(i).getName();
                System.out.println(knight + " " + monster);
            }
        }
        // TODO if the lenghts are not the same, make one for loop

    }

    public void printBattleText(MOB dead){
        System.out.println(dead.getName() + " was defeated!");
    }

    public void printFortunes(List<Knight> activeKnights){
        System.out.println("For this quest, our knights drew the following fortunes!");
        for (Knight knight : activeKnights){
            System.out.println(knight.getName() + " drew");
            Fortune fortune = knight.getActiveFortune();
            System.out.println(fortune.toString());
        }
    }

    public boolean checkContinue(){
        System.out.println("Would you like to continue on your quest (y/n)? ");
        String response = in.nextLine();
        if (response == "y" || response == "yes"){
            return true;
        }
        return false;
    }

    public void printDefeated(){
        System.out.println("All active knights have been defeated!");
    }
}
