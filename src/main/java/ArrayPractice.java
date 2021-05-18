import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
//        int[] nums = new int[10];
//
//        for (int i = 0; i < nums.length; i++) {//here length is a property unlike str.length() where length() is a method
//            nums[i] = 1012;
//
//        }
//        System.out.println(nums[3]);
//        int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        System.out.println(nums1.length);
//        System.out.println(nums1[3]);
//        System.out.println("First element" + nums1[0]);
//        System.out.println("last element" + nums1[nums1.length - 1]);
//
//        double[] val = {10.0, 20.0, 30.0, 40.0};
//
//        String[] val1 = {"Ania", "vinu", "sreya"};
//        val1[1] = "java";//can modify the values but cannot change the size of the array
//        for (int i = 0; i < val1.length; i++) {
//            System.out.println(val1[i]);
//        }
////        int[] data = new int[]{1, 2, 3, 4, 5, 6, 7};//More efficient way of creating the array
////        printArray(data);
//        printArray({1, 2, 3, 4, 5, 6, 7});//dont want to create local variable data and pass the array as {1, 2, 3, 4, 5, 6, 7}
//        // java consider this as block of statements
//
////        printArray(new int[]{1, 2, 3, 4, 5, 6, 7});//put new int[] to tell this is an array

        String guest="   Anila,vigu,rose,ravi";//CSV
        String[] names = guest.split(",");

        Scanner scan=new Scanner(System.in);
        System.out.println("enter names separated by #");
        String input=scan.nextLine();
        names=input.split("#");


        //printArray(names);
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i].trim());
//            System.out.println(names[i].strip());//strips same like trim()
//            System.out.println(names[i].stripLeading());//it removes only leading spaces but trailing space is there
//            System.out.println(names[i].stripTrailing());//it removes only Trailing spaces but leading space is there
        }

    }
//        public static void printArray(Object[] arr)
//        {
//            for (int j = 0; j < arr.length; j++) {
//
//
//                System.out.println(arr[j]);
//            }
//
//
//
//        }
    }



