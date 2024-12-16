public class Main {
    private static String gameData = "gamedata.csv";
    private static String saveData = "knights.csv";
    public static void main(String[] args) {
        processArgs(args); // method that parses the args, optional but cleaned up the code
        GameData data = new CSVGameData(gameData, saveData);
        GameView view = new ConsoleView();
        CombatEngine engine = new CombatEngine(data, view);
        GameController controller = new GameController(data, view, engine);
        controller.start();

        /*
         * ls
         * set active 1
         * list active
         * set active Anna
         * list active
         * set active 14
         * list active
         * set active 17
         * list active
         * remove gwain
         * list active
         * ?
         * show gwain
         * bye
         */
    }

    private static void processArgs(String[] args) {
        // loops through each each program argument (args).
        // checks to see if the argument starts with --data. If it starts with data,
        // takes the substring of the argument (after the = sign) to set the gamedata.
        // else,
        // any other argument sets the saveData value (even if it has been set)
        for (int i = 0; i < args.length; i++) {
            if (args[i].contains("data")) {
                gameData = args[i].substring(args[i].indexOf("=" + 1));
            } else {
                saveData = args[i];
            }
        }
    }
}
