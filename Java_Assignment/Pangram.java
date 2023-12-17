import java.util.Scanner;
class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        // String s = "The quick brown fox jumps over lazy dog";
        s = s.toLowerCase();
        boolean letterPrsnt = true;
        for(char ch ='a';ch<='z';ch++){
            if(!s.contains(String.valueOf(ch))){
                letterPrsnt = false;
                break;
            }
        }
        if(letterPrsnt){
            System.out.println("Pangram");
        }
        else{
            System.out.println("Not Pangram");
        }
    }
}