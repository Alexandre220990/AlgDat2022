import java.util.Locale;

public class encription {

    public static String encryptRowColumn(String plaintext, int numColumns){

        //plaintext.trim();

        StringBuilder sb = new StringBuilder();

        String ciphertext = "";

        //For col = 0 To numColumns - 1
        for(int col = 0; col < plaintext.length(); col++){
            if(plaintext.charAt(col) != ' '){
                sb.append(plaintext.charAt(col));
            }
        }
        int numRows = sb.length()/numColumns;
        if(sb.length()%numColumns==0){
            numRows++;

            //pad with numRows * numColumns - sb.length() of Xs
            StringBuilder textWithXs = new StringBuilder(sb);
            int numXs = numRows * numColumns - sb.length();
            for(int i =1;i < numXs;i++){
                textWithXs.append('X');
            }
        }
        return "";
    }

    public static String encryptCaesarCipher(String plaintext, int offset){

        StringBuilder sb = new StringBuilder();

        final int MAX_OFFSET=25;
        int originalAlphabetPosition = 0;

        if(offset > MAX_OFFSET)
            offset %= (MAX_OFFSET + 1);
         //note >= (if equals 26 what happens?)

        String ciphertext = "";

        for (int i=0; i < plaintext.length()-1;i++)

        if(plaintext.charAt(i) != ' '){
            originalAlphabetPosition = plaintext.charAt(i) - 'a';
        int newAlphabetPosition = (originalAlphabetPosition + offset) % 26;
        char ch = (char) ('a' + newAlphabetPosition);
            sb.append(ch);
        }

        return sb.toString();
    }
}
