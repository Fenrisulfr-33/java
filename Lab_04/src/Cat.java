public class Cat extends Pets {
  String badName;

  public Cat(String name, String breed, String badName) {
    super(name, breed);
    this.badName = badName;
  }

  @Override
  public String getName() {
    return name + " aka " + badName;
  }

  @Override
  public String makeNoise() {
    return "meow";
  }

  public static void main(String[] args) {
    // Cat Gyorik = new Cat("Gyorik", "russian blue", "Wretched Man");
    // System.out.println("TESTING: " + Gyorik.getName()); // this should now return "Gyorik aka Wretched Man"
  }
}
