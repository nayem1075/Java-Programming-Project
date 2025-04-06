package StringComparison;

public class EqualsMethod {

    public static void main(String[] args) {

        String password1 = "Nayem622";
        String password2 = "Nayem622";
        String password3 = new String("Nayem622");
        String password4 = new String("Nayem622");
        String password5 = new String("nayem622");

        //Compares the original of the String.
        System.out.println(password1.equals(password2));//True
        System.out.println(password1.equals(password3));//True
        System.out.println(password1.equals(password4));//True
        System.out.println(password1.equalsIgnoreCase(password5));//Ignore Case, So true.

    }
}
