public class omework2 {

    public static void main(String[] args) {
        System.out.println(calculateTax(90));
    }
    static int calculateTax (int nume){
        int sum=0;
        if (nume < 100 || nume  > 500){
            System.out.println("Price is wrong");
        } else {
            sum =nume + nume *15/100;
        }
        return sum;
    }

}
