import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String srcFilePath = "/home/swapnil/c/new/xyz/bitcode.txt";
        String destinationFilePath = "/home/swapnil/c/new/xyz/core java question";

        System.out.println("Enter the word to be replaced ");
        String wordToReplace = sc.nextLine();

        System.out.println("Enter the replacement word");
        String replacementWord = sc.nextLine();

        Util.ReplacementWithFileCopy(srcFilePath,destinationFilePath,wordToReplace,replacementWord);
    }
}