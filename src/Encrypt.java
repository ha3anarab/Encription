
public class Encrypt {
    public static void main(String[] args) {
        // We want to encrypt this sentence "This is secret code"
        String text = "This is secret code";
        System.out.println(text);

        // in all encryption algorithm, we need a KEY.
        int key = 10;

        //we use a simple algorithm, just add number to each character
        //all character is ASCII char then we can add integer to a char for transform it to another char
        char[] charArray = text.toCharArray();
        StringBuilder encryptedText = new StringBuilder();
        for (char c : charArray) {
            c += key;
            encryptedText.append(c);
        }

        // this is a encryptedText we search for
        System.out.println(encryptedText);
    }
}