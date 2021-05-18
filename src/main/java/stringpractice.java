public class stringpractice {
    public static void main(String[] args) {
        String s="#i am Lear#ning java#";
        String s2="i am Learning java.";
//        System.out.println(s.toLowerCase());
//        System.out.println(s.toUpperCase());
//        System.out.println(s.trim());
//
//        String str2=s+ "!";
//        System.out.println(str2);//concatenation
//
//        if(s.toLowerCase().contains("java"))
//        {
//            System.out.println("string java exists");
//        }
//        else
//            System.out.println("string java does not exists");
//
//        System.out.println(s.endsWith("!"));
//        System.out.println(s.startsWith("I"));
//
//        System.out.println(s.contentEquals(s2));
//
//        System.out.println(s.indexOf("l"));  //Result as -1  because l is not present in the string

//        System.out.println(s.indexOf("am"));
//        System.out.println(s.indexOf("#",1));
//        System.out.println(s.indexOf("am",1));
//        System.out.println(s.length());
//        System.out.println(s.lastIndexOf("#"));// the character index which is close to the end of the string
//        System.out.println(s.lastIndexOf("am",10));// from 10th location check backwards

//        System.out.println(s.substring(10));
//        System.out.println(s.substring(1,10));//very imp 1 being startindex is inclusive ,10 being lastindex is excludeded
  //     System.out.printf("%d",10);//no. of formatters you give so many no of inputs with ,
    //    System.out.printf("%10d",10);// provide padding with 10 spaces
//        System.out.printf("%010d",10);
 //       System.out.printf("%-10d",10); //padding towards the right
//        System.out.printf("%d:%s",10,"anila");
//        System.out.printf("%d  %10s",10,"anila");
//        System.out.printf("%d  %-10s",10,"anila");
  //     System.out.printf("%d  %-10s  %10s %f",10,"anila",s,10.678898);
  //      System.out.printf("%d  %-10s  %10s %.2f",10,"anila",s,10.678898);
    //    System.out.printf("%d  %-10s  %10s %.2f  %b",10,"anila",s,10.678898,null);
//        System.out.printf("%d  %-10s  %10s %.2f  %b",10,"anila",s,10.678898,s);

        String formatvalue=String.format("Hello %s , your account %010d is due for $ %.2f,kindly make payment",s,12343,202.987);
        System.out.println(formatvalue);


    }
}
