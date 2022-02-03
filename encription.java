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
        return sb.toString().toUpperCase();
    }
}
