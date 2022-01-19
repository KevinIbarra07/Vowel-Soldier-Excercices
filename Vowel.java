import java.util.*;
public class Vowel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1. find out every 3rd vowel character in a string "happy new year 2022"
        
        System.out.println("Please, write th string");
        String str = sc.nextLine();
        StringOperation(str);
        
    }

    private static void StringOperation(String str) {
        
        char[] vowel = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'};

        char[] ch = str.toCharArray();
        int count =1;
        //for (int x = 0; x <= str.length()-1; x++) {
          for (char charc:ch) {
            if (count % 3 == 0) {
                for (int y = 0; y <= vowel.length-1; y++) {
                    if (charc == vowel[y]) {
                        System.out.println("\nVowel \"" + charc + "\" on position:" + count);
                    }
                }
            }
            count++;
        }
        System.out.println("");
    }

    private static void Soldiers() {        
        int numSoldiers = 10;

        for (int x = 1; x <= numSoldiers; x++) {
            
        }

    }

}

