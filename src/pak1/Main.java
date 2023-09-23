package pak1;

public class Main {
    public static void main(String[] args) {
        Gryffindor harri = new Gryffindor("Гарри Потер", 76, 15, 15, 98, 99);
        Gryffindor germiona = new Gryffindor("Гермиона Грейнджер", 38, 90, 10, 81, 90);
        Gryffindor ron = new Gryffindor("Рон Уизли", 24, 10, 49, 75, 80);
        Slytherin draco = new Slytherin("Драко Малфой", 48, 72, 82, 48, 32, 57, 94);
        Slytherin grecham = new Slytherin("Грэхэм Монтегю", 12, 21, 34, 21, 5, 58, 2);
        Slytherin gregori = new Slytherin("Грегори Гойл", 17, 11, 23, 32, 52, 17, 10);
        Hufflepuff zahariy = new Hufflepuff("Захария Смит", 69, 90, 37, 48, 87);
        Hufflepuff sedrik = new Hufflepuff("Седрик Диггори", 43, 41, 31, 74, 37);
        Hufflepuff djastin = new Hufflepuff("Джастин Финч-Флетчли", 21, 19, 44, 58, 67);
        Ravenclaw chjoy = new Ravenclaw("Чжоу Чанг", 64, 42, 74, 91, 11, 45);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 24, 72, 54, 41, 31, 35);
        Ravenclaw markus = new Ravenclaw("Маркус Белби", 34, 82, 74, 61, 21, 65);
        System.out.println(harri);
        System.out.println(germiona);
        System.out.println(draco);
        System.out.println(zahariy);
        System.out.println(chjoy);
        System.out.println(ron.comparisonFeatures(germiona));
        System.out.println(germiona.comparisonPower(sedrik));
        System.out.println(germiona.comparisonFeatures(ron));
    }
}