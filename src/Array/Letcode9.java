package Array;

public class Letcode9 {

    /*A pangram is a sentence where every letter of the English alphabet appears at least once.
    Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
     question 1832 */

    public static void main(String[] args) {
        String s = "thequickbrownfoxjumpsoverthelazydog";
        int j = 0;
        String p ="";
        s = s.toLowerCase();
        boolean all = true;
        for (char ch = 'a'; ch<='z'; ch++){
            if (!s.contains(String.valueOf(ch))){
                all = false;
                break;
            }

        }
        System.out.println(all);
    }
}
