
public class Decrypt {
    public static void main(String[] args) {
        //we want to decrypt this code : "^rs}*s}*}om|o~*myno"
        String encryptedText = "^rs}*s}*}om|o~*myno";
        System.out.println(encryptedText);

        //and someHow we know the KEY
        int key = 10;

        //for decrypt, we must reverse the algorithm of encryption
        //we know the algorithm of encryption, so we must decrease  number of ASCII for every char
        char[] charArray = encryptedText.toCharArray();
        StringBuilder theCodeText = new StringBuilder();
        for (char c : charArray) {
            c -= key;
            theCodeText.append(c);
        }

        //here is the Code Text
        System.out.println(theCodeText);
    }
}
