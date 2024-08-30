
import java.util.Scanner;

public class Array_Operations {

    public static float[] importData(float[] arrays) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrays.length; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arrays[i] = scanner.nextFloat();
        }
        return arrays;
    }

    public static void printData(float[] arrays) {
        System.out.print("Mang hien tai: ");
        for (float value : arrays) {
            System.out.print(value + ", ");
        }
        System.out.println();
    }

    public static float findMax2(float[] arrays) {
        float max1 = Float.MIN_VALUE;
        float max2 = Float.MIN_VALUE;

        for (float value : arrays) {
            if (value > max1) {
                max2 = max1;
                max1 = value;
            } else if (value > max2 && value != max1) {
                max2 = value;
            }
        }

        return max2;
    }

    public static float[] deleteOddNumber(float[] arrays) {
        int count = 0;
        for (float value : arrays) {
            if (value % 2 == 0) {
                count++;
            }
        }

        float[] newArray = new float[count];
        int index = 0;
        for (float value : arrays) {
            if (value % 2 == 0) {
                newArray[index++] = value;
            }
        }

        return newArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = scanner.nextInt();
        float[] arrays = new float[n];

        importData(arrays);

        printData(arrays);

        float max2 = findMax2(arrays);
        System.out.println("Gia tri lon thu 2 trong mang la: " + max2);

        float[] newArray = deleteOddNumber(arrays);
        System.out.println("Mang sau khi xoa cac phan tu le:");
        printData(newArray);
    }
}
