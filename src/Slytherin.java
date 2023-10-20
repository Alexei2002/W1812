public class Slytherin extends Hogwarts {
    int ambition;
    int cunning;

    public Slytherin(int ambition, int cunning) {
        super("Слизерин");
        this.ambition = ambition;
        this.cunning = cunning;
    }

    public void compareStudents(Slytherin student1, Slytherin student2) {
        int totalScore1 = student1.ambition + student1.cunning;
        int totalScore2 = student2.ambition + student2.cunning;

        if (totalScore1 > totalScore2) {
            System.out.println("Первый ученик Слизерина лучше второго ученика по свойствам");
        } else if (totalScore1 < totalScore2) {
            System.out.println("Второй ученик Слизерина лучше первого ученика по свойствам");
        } else {
            System.out.println("Ученики Слизерина равны по свойствам");
        }
    }

    public String getDescription() {
        return super.getDescription() + "\n" +
                "Амбиция: " + ambition + "\n" +
                "Хитрость: " + cunning;
    }
}