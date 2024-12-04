package PracticalProject01.src;

public class Main {
    private static String gameData;
    private static String saveData;

    public static void main(String[] args){
        processArgs(args); // method that parses the args, optional but cleaned up the code
        GameData data = new CSVGameData(gameData, saveData);
        GameView view  = new ConsoleView();
        CombatEngine engine = new CombatEngine(data, view);
        GameController controller = new GameController(data, view, engine);
        controller.start();
    }

    private static void processArgs(String[] args){
        // loops through each each program argument (args). 
        // checks to see if the argument starts with --data. If it starts with data, 
        // takes the substring of the argument (after the = sign) to set the gamedata. else,
        // any other argument sets the saveData value (even if it has been set)
        for (int i = 0; i < args.length; i++){
            if (args[i].substring(0, 6) == "--data"){
                gameData = args[i].substring(args[i].indexOf("=" + 1));
            } else {
                saveData = args[i];
            }
        }
    }
}
