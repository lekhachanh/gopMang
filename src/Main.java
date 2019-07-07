import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size_1;
        int arr1[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of arr1: ");
        size_1 = sc.nextInt();
        arr1 = new int[size_1];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("nhap vao phan tu thu " + (i + 1) + " ");
            arr1[i] = sc.nextInt();
        }
        int size_2;
        int arr2[];
        System.out.println("Enter a size of arr2: ");
        size_2 = sc.nextInt();
        arr2 = new int[size_2];
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("nhap vao phan tu thu " + (i + 1) + " ");
            arr2[i] = sc.nextInt();
        }
        int arr3[];
        arr3 = new int[size_1 + size_2];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = size_1; i < size_1+size_2 ; i++) {
            arr3[i] = arr2[i-size_1];
        }
        System.out.println("mang thu 3 gop cua 2 mang la: ");
        for (int i=0; i<arr3.length; i++) {
            System.out.print(arr3[i]+" ");
        }
    }
}
