// String methods()
import java.util.Scanner;

public class Q33 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = scanner.nextLine();
    System.out.println("Length of the string: " + str.length());
    System.out.println("Trimmed string: " + str.trim());
    System.out.print("Enter an index: ");
    int index = scanner.nextInt();
    System.out.println(
      "Character at index " + index + ": " + str.charAt(index)
    );
    System.out.print("Enter a starting index: ");
    int startIndex = scanner.nextInt();
    System.out.print("Enter an ending index: ");
    int endIndex = scanner.nextInt();
    System.out.println(
      "Substring from " +
      startIndex +
      " to " +
      endIndex +
      ": " +
      str.substring(startIndex, endIndex)
    );
    System.out.print("Enter a substring to search for: ");
    String subStr = scanner.next();
    int firstIndex = str.indexOf(subStr);
    if (firstIndex == -1) {
      System.out.println("Substring not found");
    } else {
      System.out.println(
        "First occurrence of substring at index " + firstIndex
      );
      int lastIndex = str.lastIndexOf(subStr);
      System.out.println("Last occurrence of substring at index " + lastIndex);
    }
    System.out.print("Enter a character to replace: ");
    char oldChar = scanner.next().charAt(0);
    System.out.print("Enter a character to replace it with: ");
    char newChar = scanner.next().charAt(0);
    System.out.println(
      "String with replaced characters: " + str.replace(oldChar, newChar)
    );
    char[] charArray = new char[str.length()];
    str.getChars(0, str.length(), charArray, 0);
    System.out.println("Characters in the string:");
    for (char c : charArray) {
      System.out.print(c + " ");
    }
    System.out.println();
  }
}
