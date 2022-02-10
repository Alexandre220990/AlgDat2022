public class AlgDatTest {
    public static void main(String[] args) {
        encription enc = new encription();

        System.out.println(enc.encryptRowColumn("this is a secret message",10));
        System.out.println(enc.encryptCaesarCipher("this is a secret message",3));


        /*

        char ch = 'D';
        ch++;
        System.out.println("Expected: E, Actual: " + ch);
        ch += 2; System.out.println("Expected: G, Actual: " + ch);
        ch -= 3; System.out.println("Expected: D, Actual: " + ch);

         */
    }
}
