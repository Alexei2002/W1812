public class Ravenclaw extends Hogwarts {
    int intelligence;
    int creativity;

    public Ravenclaw(int intelligence, int creativity) {
        super("Равенкло");
        this.intelligence = intelligence;
        this.creativity = creativity;
    }

    public void compareStudents(Ravenclaw student1, Ravenclaw student2) {
        int totalScore1 = student1.intelligence + student1.creativity;
        int totalScore2 = student2.intelligence + student2.creativity;

        if (totalScore1 > totalScore2) {
            System.out.println("Первый ученик Равенкло лучше второго ученика по свойствам");
        } else if (totalScore1 < totalScore2) {
            System.out.println("Второй ученик Равенкло лучше первого ученика по свойствам");
        } else {
            System.out.println("Ученики Равенкло равны по свойствам");
        }
    }

    public String getDescription() {
        return super.getDescription() + "\n" +
                "Интеллект: " + intelligence + "\n" +
                "Творчество: " + creativity;
    }
}