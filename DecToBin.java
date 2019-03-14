import java.util.*;
public class DecToBin {
     public static void main(String []args){
        Scanner ask = new Scanner(System.in);
        //Asks user for input
        System.out.print("What integer do you want to convert? ");
        String decinum = ask.nextLine();
        //Converts String input into an integer for conversion
        int deci = Integer.parseInt(decinum);
        bin(deci);
    }
    public static void bin(int n){
        ArrayList<Integer> nums = new ArrayList<Integer>();
        //Conversion Logic
        while(n>0) {
            int z = n%2;
            nums.add(z);
            n = n/2;
        }
        //Have to reverse arraylist as digits inputted backwards
        Collections.reverse(nums);
        //Prints arraylist in normal format
        for (Integer num : nums) {
         System.out.print(num);
        }
    }
}

