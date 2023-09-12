import java.util.Scanner;

public class FindPersonCanVote {

    public static void canvote (int n) {
        if(n>18) {
            System.out.println("You can vote");
        } else {
            System.out.println("cannot vote");
        }
        return ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        canvote(age);
        sc.close();
    }
}
