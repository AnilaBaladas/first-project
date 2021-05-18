public class foreachloop {
    public static void main(String[] args) {
        String[] data={"ani","vinu"};
        for(String i:data)//foreach loop is only applicable for array or collection
        {
            System.out.println(i);
        }

        int[] data2={1,2,3,4,5,6};
        for(int i:data2)
        {
            System.out.println(i);
        }
    }
}
