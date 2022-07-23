public class Main {
    public static void main(String[] args) {

        //Задание 1 и 2
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.print(numbers[i]);
            } else {
                System.out.print(numbers[i] + ", ");
            }
        }
        System.out.println();

        double[] fractions = {1.57, 7.654, 9.986};
        for (int i = 0; i < fractions.length; i++) {
            if (i == fractions.length - 1) {
                System.out.print(fractions[i]);
            } else {
                System.out.print(fractions[i] + ", ");
            }
        }
            System.out.println();

            boolean[] answers = new boolean[2];
            answers[0] = true;
            answers[1] = false;
            for (int i = 0; i < answers.length; i++) {
                if (i == answers.length - 1) {
                    System.out.print(answers[i]);
                } else {
                    System.out.print(answers[i] + ", ");
                }
            }
        System.out.println();

            //Задание 3
        for (int i = numbers.length - 1; i >=0; i--) {
            if (i == 0) {
                System.out.print(numbers[i]);
            } else {
                System.out.print(numbers[i] + ", ");
            }
        }
        System.out.println();
        for (int i = fractions.length - 1; i >=0; i--) {
            if (i == 0) {
                System.out.print(fractions[i]);
            } else {
                System.out.print(fractions[i] + ", ");
            }
        }
        System.out.println();

        for (int i = answers.length - 1; i >=0; i--) {
            if (i == 0) {
                System.out.print(answers[i]);
            } else {
                System.out.print(answers[i] + ", ");
            }
        }
        System.out.println();

        //Задание 4
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] = numbers[i] + 1;
                System.out.print(numbers[i] + " ");
            } else {
                    System.out.print(numbers[i] + " ");
                }
            }
            System.out.println();
    }
}