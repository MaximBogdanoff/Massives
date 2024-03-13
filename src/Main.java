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
    }
}

