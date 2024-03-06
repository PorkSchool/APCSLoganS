public class Encryption {
    private String message;
    public final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public Encryption(String m) {
        message = m;
    }

    public void EncryptAlphabet(int shift){
        StringBuilder cipherBet = new StringBuilder();

        for(int i =0; i <ALPHABET.length();i++){
            char letter = ALPHABET.charAt(i);
            int shiftIndex = (i+shift) % ALPHABET.length();
            char shiftedChar = ALPHABET.charAt(shiftIndex);

            cipherBet.append(shiftedChar);
        }
        System.out.println(cipherBet);
    }
    public void EncryptMessage(int shift) {
        char[] cMes = message.toCharArray();
        System.out.println(message);
        for (char c : cMes) {
            
        }
        System.out.println(message);
    }
}
