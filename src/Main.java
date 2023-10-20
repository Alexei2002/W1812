public class Main {
    public static void main(String[] args) {
        Gryffindor gryffindor1 = new Gryffindor(80, 90);
        Gryffindor gryffindor2 = new Gryffindor(70, 95);
        Hufflepuff hufflepuff1 = new Hufflepuff(85, 75);
        Hufflepuff hufflepuff2 = new Hufflepuff(90, 80);
        Ravenclaw ravenclaw1 = new Ravenclaw(95, 85);
        Ravenclaw ravenclaw2 = new Ravenclaw(90, 90);
        Slytherin slytherin1 = new Slytherin(90, 85);
        Slytherin slytherin2 = new Slytherin(85, 90);

        Student hermione = new Student("Гермиона Грейнджер", 90, 10);
        Student ron = new Student("Рон Уизли", 80, 15);
        Student zacharias = new Student("Захария Смит", 85, 20);
        Student susan = new Student("Сьюзан Бонничер", 75, 18);
        Student luna = new Student("Луна Лавгуд", 95, 5);
        Student terry = new Student("Терри Буттс", 90, 8);
        Student draco = new Student("Драко Малфой", 110, 7);
        Student pansy = new Student("Пэнси Паркинсон", 98, 8);

        Hogwarts hogwarts = new Hogwarts("Хогвартс");

        System.out.println(hogwarts.getDescription());
        System.out.println();

        System.out.println("Факультет Гриффиндор");
        System.out.println(gryffindor1.getDescription());
        System.out.println(gryffindor2.getDescription());
        gryffindor1.compareStudents(gryffindor1, gryffindor2);
        System.out.println();

        System.out.println("Факультет Хаффлпафф");
        System.out.println(hufflepuff1.getDescription());
        System.out.println(hufflepuff2.getDescription());
        hufflepuff1.compareStudents(hufflepuff1, hufflepuff2);
        System.out.println();

        System.out.println("Факультет Равенкло");
        System.out.println(ravenclaw1.getDescription());
        System.out.println(ravenclaw2.getDescription());
        ravenclaw1.compareStudents(ravenclaw1, ravenclaw2);
        System.out.println();

        System.out.println("Факультет Слизерин");
        System.out.println(slytherin1.getDescription());
        System.out.println(slytherin2.getDescription());
        slytherin1.compareStudents(slytherin1, slytherin2);
        System.out.println();

        System.out.println("Сравнение двух учеников Хогвартса");
        System.out.println(hermione.getDescription());
        System.out.println(draco.getDescription());
        hermione.compareStudents(hermione, draco);
    }
}