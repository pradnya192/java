import java.util.Scanner;

class Simply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.next();
        System.out.println("Entered string: " + s);
        System.out.println("Characters in the string:");
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
              if(Character.isUpperCase(c))
            System.out.println(c);
        }
    }
}
