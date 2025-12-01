<<<<<<< HEAD
import java.util.Scanner;

public class SmallestLetter {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
          char[] ch = new char[n];
        System.out.println("Enter the charcters in that array");
        for (int i = 0; i < ch.length; i++) {
            ch[i] = sc.next().charAt(0);
        }
        System.out.println("Enter the target charter that can be searched");
        char target = sc.next().charAt(0);

        char result  = nextGreatestLetter(ch,target);
        System.out.println("Smallest letter greater than target is: "+result);

    }
    static char nextGreatestLetter(char[] letters, char target){

        int start = 0;
        int end = letters.length-1;

        while (start<=end){

            int mid = (start+end)/2;

            if (letters[mid]>target){
                 end = mid-1;
            }else {
                start= mid+1;
            }

        }

        return letters[start%letters.length];
    }

}
=======
import java.util.Scanner;

public class SmallestLetter {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
          char[] ch = new char[n];
        System.out.println("Enter the charcters in that array");
        for (int i = 0; i < ch.length; i++) {
            ch[i] = sc.next().charAt(0);
        }
        System.out.println("Enter the target charter that can be searched");
        char target = sc.next().charAt(0);

        char result  = nextGreatestLetter(ch,target);
        System.out.println("Smallest letter greater than target is: "+result);

    }
    static char nextGreatestLetter(char[] letters, char target){

        int start = 0;
        int end = letters.length-1;

        while (start<=end){

            int mid = (start+end)/2;

            if (letters[mid]>target){
                 end = mid-1;
            }else {
                start= mid+1;
            }

        }

        return letters[start%letters.length];
    }

}
>>>>>>> d24490359211438a3663ed80fd4f6f36b14ac32b
