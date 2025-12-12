import java.util.*;
public class School {
    String passorfail(int totalmarks){
        if(totalmarks>=40){
            return "pass";
        } else {
            return "fail";
        }

    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        School obj=new School();
        int totalmarks=scan.nextInt();
        System.out.println(obj.passorfail(totalmarks));

    }
    
}
