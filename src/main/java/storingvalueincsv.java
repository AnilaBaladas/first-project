import java.util.Scanner;

public class storingvalueincsv {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the values");
        String res = scan.nextLine();
        String[] spilts = res.split(",");


        int[] intStoreNum = new int[spilts.length];
        for (int i = 0; i < spilts.length; i++) {

            intStoreNum[i] = Integer.parseInt(spilts[i]);
            //System.out.println(spilts[i]);
        }
        int sum = 0;
        for (int i = 0; i < intStoreNum.length; i++) {
            sum = sum + intStoreNum[i];

        }
        System.out.println(sum);
    }
}
