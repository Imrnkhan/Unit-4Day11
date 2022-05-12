package Question1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Demo {
    
    public static void main(String[] args) {
         Set<Integer> set = new HashSet<>();
         Scanner sc =new Scanner(System.in);
         System.out.println("Enter how many element do you want");
         int size =sc.nextInt();

         for(int i =0;i<size;i++){

            System.out.println("Enter value formenber"+i+1);
            int value = sc.nextInt();
            set.add(value);
         }
         System.out.println(set);
    }
}
