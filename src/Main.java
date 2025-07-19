//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int age = 24;
        if (age >= 18) {
            System.out.println("Если возраст человека равен" + age + ",он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен" + age + ",он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println("Задача 2");
        int temperature = 3;
        if (temperature <= 5) {
            System.out.println("На улице" + temperature + ",градусов,нужно надеть шапку");
        } else {
            System.out.println("На улице" + temperature + ",градусов,можно идти без шапки");
        }
        System.out.println("Задача 3");
        int speed = 81;
        if (speed >= 60) {
            System.out.println("Если скорость" + speed + ",то придется заплатить штраф");
        } else {
            System.out.println("Если скорость" + speed + ",то можно ездить спокойно");
        }
        System.out.println("Задача 4");
        int yearstoMan = 16;
        if (yearstoMan >= 2 && yearstoMan <= 6) {
            System.out.println("Если возраст человека равен " + yearstoMan + ",то ему нужно ходить в детский сад");
        }
        if (yearstoMan >= 7 && yearstoMan <= 17) {
            System.out.println("Если возраст человека равен " + yearstoMan + ",то ему нужно ходить в школу");
        }
        else if (yearstoMan >= 18 && yearstoMan <= 24) {
            System.out.println("Если возраст человека равен " + yearstoMan + " то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + yearstoMan + " то ему пора ходить на работу");
        }
        System.out.println("Задача 5");
        age = 11;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен" + age + "то он не может кататься на аттракционе.");
        } else if (age > 5 && age < 14) {
            System.out.println("Если возраст ребенка равен" + age +"то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else {
            System.out.println("Если возраст ребенка равен" + age + "то он может кататься без сопровождения взрослого.");
        }
        System.out.println( "Задача 6");

    }
}