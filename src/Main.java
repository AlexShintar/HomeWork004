public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int age = 17;
        System.out.print("Если возраст человека равен " + age + ", то он ");
        if (age >= 18) {
            System.out.println("совершеннолетний.");
        } else {
            System.out.println("не достиг совершеннолетия, нужно немного подождать.");
        }
    }

    public static void task2 () {
        System.out.println("\nЗадача 2");
        int temperature = 7;
        System.out.print("На улице " + temperature + " градусов, ");
        if (temperature < 5) {
            System.out.println("нужно надеть шапку.");
        } else {
            System.out.println("можно идти без шапки.");
        }
    }
    public static void task3 () {
        System.out.println("\nЗадача 3");
        int speed = 99;
        System.out.print("Если скорость " + speed + ", то ");
        if (speed > 60) {
            System.out.println("придется заплатить штраф.");
        } else {
            System.out.println("можно ездить спокойно.");
        }
    }
    public static void task4 () {
        System.out.println("\nЗадача 4");
        int age = 55; // в условии задачи подразумевается возраст в диапазоне 2-65, иначе нужны ещё проверки
        System.out.print("Если возраст человека равен " + age + ", то ");
        if (age >= 2 && age <= 6 ) {
            System.out.println("ему нужно ходить в детский сад.");}
        else if (age <= 18 ) { // вторая проверка не нужна
            System.out.println("ему нужно ходить в школу.");}
        else if (age <= 24 ) {
            System.out.println("его место в университете.");}
        else {
            System.out.println("ему пора ходить на работу.");}
        }
    public static void task5 () {
        System.out.println("\nЗадача 5");
        int childAge = 14;
        System.out.print("Если возраст ребенка равен " + childAge + ", то ему ");
        if (childAge < 5) {
            System.out.println("нельзя кататься на аттракционе.");}
        else if (childAge < 14) { // в условии задачи неточность, упущен возраст ровно 14, включаю его в третий диапазон
            System.out.println("можно кататься на аттракционе в сопровождении взрослого.");}
        else {
            System.out.println("можно кататься на аттракционе без сопровождения взрослого.");}
    }
    public static void task6 () {
        System.out.println("\nЗадача 6");
        int peopleIn = 41;
        if (peopleIn < 60) {
            System.out.println("Места в вагоне есть, " + (60 - peopleIn) + " сидячих и 42 стоячих.");}
        else if (peopleIn < 102) {
            System.out.println("Места в вагоне есть, " + (102 - peopleIn) + " стоячих.");}
        else {
            System.out.println("Вагон уже полностью забит.");}
    }
    public static void task7 () {
        System.out.println("\nЗадача 7");
        int one = 1;
        int two = 5;
        int three = 5;
        if (one >= two && one >= three) {
            System.out.println("Большее число " + one);}
        else if (two >= one && two >= three) {
            System.out.println("Большее число " + two);}
        else {
            System.out.println("Большее число " + three);}
    }
}


