public class Hufflepuff extends Hogwarts {
    int dedication;
    int patience;

    public Hufflepuff(int dedication, int patience) {
        super("Хаффлпафф");
        this.dedication = dedication;
        this.patience = patience;
    }

    public void compareStudents(Hufflepuff student1, Hufflepuff student2) {
        int totalScore1 = student1.dedication + student1.patience;
        int totalScore2 = student2.dedication + student2.patience;

        if (totalScore1 > totalScore2) {
            System.out.println("Первый ученик Хаффлпафф лучше второго ученика по свойствам");
        } else if (totalScore1 < totalScore2) {
            System.out.println("Второй ученик Хаффлпафф лучше первого ученика по свойствам");
        } else {
            System.out.println("Ученики Хаффлпафф равны по свойствам");
        }
    }

    public String getDescription() {
        return super.getDescription() + "\n" +
                "Самоотдача: " + dedication + "\n" +
                "Терпение: " + patience;
    }
}