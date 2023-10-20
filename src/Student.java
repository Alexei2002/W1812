public class Student extends Hogwarts {
    String name;
    int magicPower;
    int transgressionDistance;

    public Student(String name, int magicPower, int transgressionDistance) {
        super("Хогвартс");
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public void compareStudents(Student student1, Student student2) {
        int magicPowerComparison = Integer.compare(student1.magicPower, student2.magicPower);
        int transgressionDistanceComparison = Integer.compare(student1.transgressionDistance, student2.transgressionDistance);

        if (magicPowerComparison > 0) {
            System.out.println(student1.name + " обладает бОльшей мощностью магии, чем " + student2.name);
        } else if (magicPowerComparison < 0) {
            System.out.println(student2.name + " обладает бОльшей мощностью магии, чем " + student1.name);
        } else {
            System.out.println(student1.name + " и " + student2.name + " обладают одинаковой мощностью магии");
        }

        if (transgressionDistanceComparison > 0) {
            System.out.println(student1.name + " может пересечь большее расстояние во время трансгрессии, чем " + student2.name);
        } else if (transgressionDistanceComparison < 0) {
            System.out.println(student2.name + " может пересечь большее расстояние во время трансгрессии, чем " + student1.name);
        } else {
            System.out.println(student1.name + " и " + student2.name + " могут пересечь одинаковое расстояние во время трансгрессии");
        }
    }

    public String getDescription() {
        return super.getDescription() + "\n" +
                "Имя студента: " + name + "\n" +
                "Мощность магии: " + magicPower + "\n" +
                "Расстояние трансгрессии: " + transgressionDistance;
    }
}