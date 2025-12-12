import java.util.Scanner;
public class find {
    void evenodd(int number){
        if(number % 2 == 0){
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        find obj =new find();
        int num =scan.nextInt();
        obj.evenodd(num);
        System.out.println("Program ended");
    }

    
}
