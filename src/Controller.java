import java.util.Scanner;
public class Controller {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inform First number: ");
        int first = scan.nextInt();
        System.out.println("Inform Second number: ");
        int second = scan.nextInt();
        try {
            counter(first, second);
        }catch(InvalidParamsException e){
            System.out.println("Error: "+e.getMessage());
        }
        scan.close();
    }
    static void counter(int first, int second) throws InvalidParamsException{
        if(second > first) throw new InvalidParamsException("The value of the second argument must be less than.");
        int difference = first - second;
        for(int i = 1; i < difference; i++){
            System.out.println(i);
        }
    }


}
