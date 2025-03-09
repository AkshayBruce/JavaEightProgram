package com.example.javaeightprograms.Miscmornings;

public class ToggleString {

    public static void main(String[] args) {

        //Scanner scan =  new Scanner(System.in);
        String word = "Hey Siri";

       // System.out.println("Enter the String to Toggle:"+  word);


       String toggledStringApi =toggleStringNoApi(word);

        System.out.println("Original: " + word);
        System.out.println("Toggle: " + toggledStringApi);

        String toggledStringNoApi = toggleStringWithApi(word);
        System.out.println("Using Api ToggleString: " + toggledStringNoApi);
    }

    public static String toggleStringNoApi(String word)
    {
        StringBuilder sb = new StringBuilder(word.length());

        for(char character : word.toCharArray())
        {
            if (character >= 'A' && character <= 'Z')
            {
                sb.append((char) (character + ('a' - 'A')));
            }else if (character >='a' && character <= 'z')
            {
                sb.append((char) (character - ('a' - 'A')));
            }else
            {
                sb.append(character);
            }
        }
        return sb.toString();
    }

    static String toggleStringWithApi(String word){
        StringBuilder sb = new StringBuilder(word.length());

        char[] character = word.toCharArray();

        for(char streamCharacters :  character)
        {
            if(Character.isUpperCase(streamCharacters))
            {
               sb.append(Character.toLowerCase(streamCharacters));
            } else if (Character.isLowerCase(streamCharacters)) {

               sb.append(Character.toUpperCase(streamCharacters)) ;
            }else
            {
                sb.append(streamCharacters);
            }
        }


        return sb.toString();
    }

}
