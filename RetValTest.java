class SentenceEmptyException extends Exception {
    public SentenceEmptyException(String message, Throwable error){
        super(message, error);
        System.out.println("Supplied string empty");
    }
}

class NotValidAddress extends Exception {
    public NotValidAddress(){
        System.out.println("No valid @cam.ac.uk address supplied");
    }
}

public class RetValTest {
    public static String sEmail = "";

    public static void extractCamEmail(String sentence) throws SentenceEmptyException {
        try{
            if (sentence==null || sentence.length()==0)
               throw new NullPointerException(); // Error - sentence empty

        String tokens[] = sentence.split(" "); // split into tokens
        for (int i=0; i< tokens.length; i++) {
            if (tokens[i].endsWith("@cam.ac.uk")) {
                sEmail=tokens[i];

            }
        }
        throw new NotValidAddress(); // Error - no cam email found
    }
        catch (NullPointerException e) {
            throw new SentenceEmptyException(e.getMessage(), e);
        }

        catch (NotValidAddress e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws SentenceEmptyException {
        RetValTest.extractCamEmail("tam71@cam.ac.uj");

    }
}