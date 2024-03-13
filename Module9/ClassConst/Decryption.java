/*
 * Logan Santamarina
 * 3/7/24
 * The class that is used to decrypt values
 */
public class Decryption {
    public static String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static String cipher;

    public Decryption() {
    }

    public static void DecryptAlphabet(int shift) {
        StringBuilder decipherKey = new StringBuilder();
        for (int i = 0; i < ALPHABET.length(); i++) {
            int shiftIndex = (i + shift) % ALPHABET.length();
            char shiftedChar = ALPHABET.charAt(shiftIndex);
            decipherKey.append(shiftedChar);
        }
        cipher = decipherKey.toString();
        System.out.println("\nDecryption Key: " + decipherKey);
    }

    public static String DecryptMessage(String encryptedMessage) {
        System.out.println("\nEncrypted Message: " + encryptedMessage.toLowerCase());

        char[] encryptedChars = encryptedMessage.toUpperCase().toCharArray();
        StringBuilder decryptedMessage = new StringBuilder();
        for (char c : encryptedChars) {
            int index = cipher.indexOf(c);
            if (index == -1) {
                decryptedMessage.append(" ");
                continue;
            }

            char originalChar = ALPHABET.charAt(index);
            decryptedMessage.append(originalChar);
        }
        System.out.println("Decrypted Message: " + decryptedMessage.toString().toLowerCase());
        return decryptedMessage.toString();
    }

    public static void main(String[] args) {
        DecryptAlphabet(3); // Change 3 to your decryption key
        String encryptedMessage = Encryption.EncryptMessage("HELLO"); // Change "HELLO" to your encrypted message
        DecryptMessage(encryptedMessage);
    }
}
