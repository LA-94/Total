public class Artifact {
    String name;
    String secondFullName;
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
    public Artifact (String name, int age, int year ) {
        this.name = name;
        this.age = age;
        this.year = year;
    }
    public Artifact (String name, String secondName, int age, int year ) {
        this.name = name;
        this.age = age;
        this.year = year;
        this.secondName = secondName;
    }
        public static void main (String[] args) {
            Artifact zara = new Artifact(1010);
            Artifact kosmos = new Artifact("Ацтеки", 2010);
            Artifact luna = new Artifact("Ацтеки", 3010, 12);
            Artifact zara1 = new Artifact("Aztek","Total",34,1000);
            System.out.print("В музее хранятся 3 Артифакта древности.");
            System.out.print("В музее хранятся 3 Артифакта древности.");
            System.out.print("О первом Артифакте нам извесно. Номер Артифакта - " + zara.age + ".");
            

        }
        }

