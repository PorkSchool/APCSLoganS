/*
 * Logan Santamarina
 * 3/7/24
 * The class that is used to encrypt values
 */
public class Encryption {
    public static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static String cipher;

    public Encryption() {
    }

    public static void EncryptAlphabet(int shift) {
        StringBuilder cipherBet = new StringBuilder();
        for (int i = 0; i < ALPHABET.length(); i++) {
            int shiftIndex = (i + shift) % ALPHABET.length();
            char shiftedChar = ALPHABET.charAt(shiftIndex);
            cipherBet.append(shiftedChar);
        }
        cipher = cipherBet.toString();
        System.out.println("\nEncryption Cipher: " + cipherBet);
    }

    public static String EncryptMessage(String message) {

        System.out.println("\nOriginal Message: " + message.toLowerCase());

        char[] cMes = message.toUpperCase().toCharArray();
        StringBuilder ciphered = new StringBuilder();
        for (char c : cMes) {
            int index = ALPHABET.indexOf(c);
            if (index == -1) {
                ciphered.append(" ");
                continue;
            }

            char cipherEquivalent = cipher.charAt(index);
            ciphered.append(cipherEquivalent);
        }
        System.out.println("Encrypted Message: " + ciphered.toString().toLowerCase());
        return ciphered.toString();
    }
}
