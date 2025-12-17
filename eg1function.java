public class eg1function {
    int a=10;
    int b=20;
    int sum(){
        int add=a+b;
        return add;
       
    }
    public static void main(String[] args){
        eg1function obj1=new eg1function();
        
        System.out.println(obj1.sum());
    }
    
}
