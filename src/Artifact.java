public class Artifact {
    String name;
    int age;
    int year;
    // Артифакт о котором извесно лиш его номер.
    public Artifact (int age){
    this.age = age;
}
// Артифакт о котором извесно его культура и его номер.
    public Artifact (String name, int age){
    this.name = name;
    this.age = age;
}
    // Артифакт о котором извесно его культура, его номер, и его век.
    public Artifact (String name, int age, int year) {
        this.name = name;
        this.age = age;
        this.year = year;
    }

        public static void main (String[] args) {
            Artifact zara = new Artifact(1010);
            Artifact kosmos = new Artifact("Ацтеки", 2010);
            Artifact luna = new Artifact("Ацтеки", 3010, 12);
            System.out.print("В музее хранятся 3 Артифакта древности.");
            System.out.print("О первом Артифакте нам извесно. Номер Артифакта - " + zara.age + ".");
            System.out.print("О втором Артифакте нам извесно. Культура где был создан этот Артифакт - " + kosmos.name + ". Номер Артифакта - " + kosmos.age + ".");
            System.out.print("О третьем Артифакте нам извесно. Культура где был создан этот артифакт - " + luna.name + ". Номер Артифакта - " + luna.age + ". Век Артифакта - " + luna.year + ".");
        }
        }

