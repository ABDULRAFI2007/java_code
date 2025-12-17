public class enhancedforloop{
    public static void main(String[] args) {

        int num[] = {12, 45, 67, 89};

        // Normal for loop
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

        System.out.println("-----");
        String[] dum = {"one", "two"};

        for (String ars:dum) {
            System.out.println(ars);
        }
        // Enhanced for-each loop
        for (int var:num) {
            System.out.println(var);
            System.out.println();
        
    }
}
}
