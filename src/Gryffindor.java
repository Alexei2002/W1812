public class Gryffindor extends Hogwarts {
    int bravery;
    int loyalty;

    public Gryffindor(int bravery, int loyalty) {
        super("Гриффиндор");
        this.bravery = bravery;
        this.loyalty = loyalty;
    }

    public void compareStudents(Gryffindor student1, Gryffindor student2) {
        int totalScore1 = student1.bravery + student1.loyalty;
        int totalScore2 = student2.bravery + student2.loyalty;

        if (totalScore1 > totalScore2) {
            System.out.println("Первый ученик Гриффиндора лучше второго ученика по свойствам");
        } else if (totalScore1 < totalScore2) {
            System.out.println("Второй ученик Гриффиндора лучше первого ученика по свойствам");
        } else {
            System.out.println("Ученики Гриффиндора равны по свойствам");
        }
    }

    public String getDescription() {
        return super.getDescription() + "\n" +
                "Мужество: " + bravery + "\n" +
                "Лояльность: " + loyalty;
    }
}