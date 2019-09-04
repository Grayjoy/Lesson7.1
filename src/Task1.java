import java.util.Random;

public class Task1 {
    // Найти вероятность выпадения:
    // на 2 кубиках чтобы выпало число 6


    private static final int TOTAL_COUNT = 10000;

    private static Random random = new Random();

    public void randomCub() {
        int count = 0;
        int temp;
        int remp; // вводим переменную для второго кубика
        for (int i = 0; i < TOTAL_COUNT; i++) {
            temp = rollDice();
            remp = rollDice();
            if (temp == 6 && remp == 6) //добавляем второй кубик
            {
                count++;
            }

        }
        System.out.println("на 2 кубиках чтобы выпало число 6");
        System.out.println("Count:" + count);
        double probability = (double) count / TOTAL_COUNT * 100;
        System.out.println("Probability: " + round(probability));
    }

    private static int rollDice() {
        return random.nextInt(6) + 1;
    }

    private static double round(double value) {
        return Math.round(value * 100) / 100.0;
    }


    //Найти вероятность выпадения:
    //на 2 кубиках выпало одинаковое число

    public void randomCub1() {
        int count = 0;
        int temp;
        int remp;
        for (int i = 0; i < TOTAL_COUNT; i++) {
            temp = rollDice();
            remp = rollDice();
            if (temp == remp) {
                count++;
            }

        }
        System.out.println("\nна 2 кубиках выпало одинаковое число");
        System.out.println("Count:" + count);
        double probability = (double) count / TOTAL_COUNT * 100;
        System.out.println("Probability: " + round(probability));
    }

//    Найти вероятность выпадения:
//    на 3 кубиках выпало разные числе

    public void randomCub3() {
        int count = 0;
        int temp;
        int remp;
        int kemp; // вводим переменную для третьего кубика
        for (int i = 0; i < TOTAL_COUNT; i++) {
            temp = rollDice();
            remp = rollDice();
            kemp = rollDice();
            if (temp != remp && remp != kemp && temp != kemp) {
                count++;
            }

        }
        System.out.println("\nна 3 кубиках выпало разные числе");
        System.out.println("Count:" + count);
        double probability = (double) count / TOTAL_COUNT * 100;
        System.out.println("Probability: " + round(probability));
    }

    //Найти вероятность выпадения:
    //на 3 монетках выпало одна сторона

    public void randomCub4() {
        int count = 0;
        int temp;
        int remp;
        int kemp; // вводим переменную для третьего кубика
        for (int i = 0; i < TOTAL_COUNT; i++) {
            temp = rollDice1();
            remp = rollDice1();
            kemp = rollDice1();
            if (temp == remp && temp == kemp) {
                count++;
            }

        }
        System.out.println("\nна 3 монетках выпало одна сторона");
        System.out.println("Count:" + count);
        double probability = (double) count / TOTAL_COUNT * 100;
        System.out.println("Probability: " + round(probability));
    }

    private static int rollDice1() {
        return random.nextInt(2) + 1;
    }
}



