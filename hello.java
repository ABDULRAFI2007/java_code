import java.util.Scanner;
public class hello {
    Scanner scan = new Scanner(System.in);
    String getname() {
        String name=scan.nextLine();
        return name;     // example return value
    }
    int getphone(){
        int phone_number=scan.nextInt();
        return phone_number;
    }

    public static void main(String[] args) {

        hello obj1 = new hello();
        String obj=obj1.getname();
        int remainder = obj1.getphone();  // correct way to pass argument

        System.out.println(remainder);
        System.out.println(obj);
    }
}