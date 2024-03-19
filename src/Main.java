import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] weight = {1, 2, 3};
        for (int i = 0; i < weight.length; i++) {
            if (i == weight.length - 1) {
                System.out.println(weight[i]);
                break;
            }
            System.out.print(weight[i] + ", ");
        }


        double[] weight2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < weight2.length; i++) {
            if (i == weight2.length - 1) {
                System.out.println(weight2[i]);
                break;
            }
            System.out.print(weight2[i] + ", ");
        }

        double[] weight3 = {2.22, 3.33, 4.44};
        for (int i = 0; i < weight3.length; i++) {
            if (i == weight3.length - 1) {
                System.out.println(weight3[i]);
                break;
            }
            System.out.print(weight3[i] + ", ");
        }

        for (int i = weight.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(weight[i]);
                break;
            }
            System.out.print(weight[i] + ", ");
        }

        for (int i = weight2.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(weight2[i]);
                break;
            }
            System.out.print(weight2[i] + ", ");
        }

        for (int i = weight3.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(weight3[i]);
                break;
            }
            System.out.print(weight3[i] + ", ");
        }


        for (int i = 0; i < weight.length; i++) {
            if (weight[i] % 2 != 0) {
                weight[i]++;
            }
            System.out.print(weight[i] + ", ");
        }
        System.out.println();

        int[] salary = {30000, 25000, 100000, 60000, 50000};
        int sum = 0;
        for (int i = 0; i < salary.length; i++) {
            sum += salary[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        int[] expenses = {120000, 20000, 30000, 40000, 50000};
        int maxExpenses = 0;
        for (final int current : expenses) {
            if (current > maxExpenses) {
                maxExpenses = current;
            }
        }
        System.out.println(maxExpenses);
        int minExpenses = maxExpenses;
        for (final int current : expenses) {
            if (current < minExpenses) {
                minExpenses = current;
            }
        }
        System.out.println(minExpenses);

        double[] equal = {135000, 20000, 500000, 40000, 30000};
        double average = 0;
        for (double element : equal) {
            average += element;
        }
        average = average / (equal.length);
        System.out.println(average);

    char[] reverseFullName =  {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--)

    {
        System.out.print(reverseFullName[i]);
    }}



}

