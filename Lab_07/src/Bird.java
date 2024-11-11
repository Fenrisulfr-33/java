public class Bird extends Pets {
    public Bird(String name, String breed) {
        super(name, breed);
    }

    @Override
    public String makeNoise() {
        return "chirp";
    }

    public String makeNoise(int num) {
        if ((num % 4) == 0) {
            return "squawk";
        }
        if ((num % 3) == 0) {
            return "tweet";
        }
        if ((num % 2) == 0) {
            return "chirp";
        }
        return "caw caw";
    }

    // this method returns "[name] ate some seeds", where [name] is the Class
    // variable name
    public String eatSeeds() {
        return getName() + "ate some seeds";
    }

    // TODO put your overloads for eatSeeds() here
    // 1. eatSeeds(boolean) will take in a boolean value. If the boolean is true,
    // return "[name] ate some seeds". If the boolean is false, return "[name] did
    // not eat any seeds".
    // 2. eatSeeds(int num) will take in an int value. It will return "[name] ate
    // [num] seeds".
    public String eatSeeds(boolean value) {
        if (value) {
            return getName() + " ate some seeds";
        }
        return getName() + " did not eat any seeds";
    }

    public String eatSeeds(int num) {
        return getName() + " ate " + num + " seeds";
    }

    public static void main(String[] args) {
        // Bird Feathers = new Bird("Feathers", "parrot");
        // System.out.println(Feathers.makeNoise()); // this should return "chirp"
        // System.out.println(Feathers.makeNoise(16)); // this should return "squawk"
        // System.out.println(Feathers.eatSeeds(false)); // this should return "Feathers did not eat any seeds"
        // System.out.println(Feathers.eatSeeds(17)); // this should return "Feathers ate 17 seeds"
    }
}
