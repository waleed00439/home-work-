public class homework {

    public static void main(String[] args) {
        primeNumber(5);

    }
    static void primeNumber (int nume) {
        String S;
        int l,f=0;
        l=nume/2;
        if (nume==0 || nume==1){
            System.out.println("Not prime number");
        }else {
            for (int i = 2; i < l; i++) {
                if (nume%i==0){
                    System.out.println(" Not prime number");
                    f=1;

                }

            }
            if (f==0) System.out.println("Prime number");
        }
    }
}

