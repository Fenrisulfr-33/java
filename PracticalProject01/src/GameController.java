package PracticalProject01.src;

public class GameController {
    private final GameData data;
    private final CombatEngine engine;
    private final GameView view;

    public GameController(GameData data, GameView view, CombatEngine engine){
        this.data = data;
        this.engine = engine;
        this.view = view;
    }

    public void start(){
        // Starts the game, causing it to run until a client exits. Starts with splashScreen,
        // loops as long as processCommand returns true, prints endgame when loop is done.
        view.splashScreen();
        while (processCommand(view.displayMainMenu())){
            processCommand(view.displayMainMenu());
        }
        view.endGame();
    }

    protected boolean processCommand(String command){
        if (command == "bye" || command == "bye"){
            return false;
        } else if (command.contains("ls") || command.contains("list all")){
            view.listKnights(data.getKnights());
        } else if (command == "list active"){
            data.getActiveKnights();
        } else if (command == "show"){
            // take the remainder and show the knight
            if ( command.startsWith("show")){
                processShowKnight(command.substring(command.indexOf("show") + 4).trim());
            }
        } else if (command.startsWith("set active")){
            // if command starts with set active, grabs the remainder of the line, 
            // and try to add the knight to the active knight list.
            processSetActive(command.substring(command.indexOf("set active") + 10).trim());
        } else if (command.startsWith("remove")){
            // remove (name or id) - if command starts with remove, 
            // grabs the remainder of the line, 
            // attempts to remove the knight from active status.
            processRemoveActive(command.substring(command.indexOf("remove") + 6).trim());
        } else if (command.startsWith("save")){
            // save (filename - optional) - saves the game. 
            // If a file name is provided saves the knights to the file. 
            // If a file name is left off, saves out to saveData.csv
            if (command.trim() == "save"){
                data.save("saveData.csv");
            } else {
                data.save(command.substring(command.indexOf("save") + 4).trim());
            }
        } else if (command.contains("explore") || command.contains("adventure") || command.contains("quest")){
            // explore, adventure or quest - if any three of these words are used, it starts a combat sequence.
            engine.initialize();
            engine.runCombat();
            engine.clear();
        }
        return true;
    }

    private void processRemoveActive(String remove){
        // Optional helper method that helped keep processCommand(String) cleaner. 
        // removes the night by calling .getActive(), and then removeActive() if the knight exists
        // Prints knightNotFound() if an invalid knight is given.
        Knight knight = data.getActive(remove);
        if (knight != null){
            data.removeActive(knight);
        } else {
            view.knightNotFound();
        }
    }

    private void processSetActive(String active){
        // Optional helper method that helped keep processCommand(String) cleaner. 
        // sets a knight to 'active' by calling .getKnight(String), 
        // and then setActive(Knight) if the knight exists Prints knightNotFound() 
        // if an invalid knight is given, and setActiveFailed() if it can't add the knight.
        Knight knight = data.getKnight(active);
        if (knight != null){
            data.setActive(knight);
        } else {
            view.knightNotFound();
        }
    }

    private void processShowKnight(String nameOrId){
        // Optional helper method that helped keep processCommand(String) cleaner. 
        // Uses data.getKnight(nameOrId) to ge ta knight, 
        // and then call the showKnight(knight) method in GameView.
        // If the knight wasn't found, print knightNotFound()
        Knight knight = data.getKnight(nameOrId);
        if (knight != null){
            view.showKnight(knight);
        } else {
            view.knightNotFound();
        }
        
    }
}
