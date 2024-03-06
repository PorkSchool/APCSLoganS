
public class CaserTester {

    public int shift;

    public static void main(String[] args) {
        Encryption enc = new Encryption("I like food");
        System.out.println(enc.ALPHABET);
        enc.EncryptAlphabet(3);
    }
}
