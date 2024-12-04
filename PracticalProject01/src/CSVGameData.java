package PracticalProject01.src;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class CSVGameData extends GameData {
    public CSVGameData(String gameData, String saveData) {
        loadGameData(gameData);
        loadSaveData(saveData);
    }

    private Scanner readFile(String fileName) {
        try {
            return new Scanner(new FileInputStream(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void loadSaveData(String saveData) {
        int counter = 0;
        Scanner file = readFile(saveData);
        if (file == null) return;

        while (file.hasNextLine()) {
            Scanner line = new Scanner(file.nextLine());
            line.useDelimiter(",");

            Knight kt = new Knight(
                ++counter,
                line.next().trim(),
                line.nextInt(),
                line.nextInt(),
                line.nextInt(),
                DiceType.valueOf(line.next().trim()),
                line.nextInt()
            );
            knights.add(kt);
        }
    }

    public void loadGameData(String gameData) {
        Scanner file = readFile(gameData);
        if (file == null) return;

        while (file.hasNextLine()) {
            String line = file.nextLine();
            if (line.startsWith("MOB") || line.startsWith("FORTUNE")) {
                parseGameDataLine(new Scanner(line));
            }
        }
    }

    private void parseGameDataLine(Scanner line) {
        line.useDelimiter(",");
        String type = line.next().trim();
        if ("MOB".equalsIgnoreCase(type)) {
            monsters.add(new MOB(
                line.next().trim(),
                line.nextInt(),
                line.nextInt(),
                line.nextInt(),
                DiceType.valueOf(line.next().trim())
            ));
        } else if ("FORTUNE".equalsIgnoreCase(type)) {
            fortunes.add(new Fortune(
                line.next().trim(),
                line.nextInt(),
                line.nextInt(),
                line.nextInt(),
                line.hasNext() ? DiceType.valueOf(line.next().trim()) : null
            ));
        }
    }

    @Override
    public void save(String filename) {
        try (PrintWriter writer = new PrintWriter(new FileOutputStream(filename))) {
            for (Knight knight : knights) {
                writer.println(knight.toCSV());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
