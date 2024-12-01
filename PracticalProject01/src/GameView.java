package PracticalProject01.src;

public interface GameView {
    boolean checkContinue();
    String displayMainMenu();
    void endGame();
    void knightNotFound();
    void listKnights(List);
    void printBattleText(List, List);
    void printBattleText(MOB);
    void printDefeated();
    void printFortunes(List);
    void printHelp();
    void setActiveFailed();
    void showKnight(Knight);
    void splashScreen();

}
