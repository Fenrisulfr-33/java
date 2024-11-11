public class Hamster extends Pets {
    public Hamster(String name, String breed) {
        super(name, breed);
    }

    @Override
    public String makeNoise() {
        return "squeak";
    }

    // This method should take in an array of strings. If any of the strings is
    // "tired", return false. Otherwise, return true.
    // 2. wheelRun() will take in an Array of Strings. If any of the strings is the
    // phrase "tired", return false. If "tired" never appears, return true.
    public boolean wheelRun(String[] run) {
        for (String word : run) {
            if (word.equals("tired")) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Hamster hamster1 = new Hamster("Henry", "Gerbel");
        // System.out.println("TESTING: " + hamster1.makeNoise());
        // String[] run = { "sad", "happy", "angry", "excited", "energized" };
        // Hamster Chewy = new Hamster("Chewy", "dwarf");
        // System.out.println("TESTING: " + Chewy.wheelRun(run)); // this should return
        // true
    }
}
