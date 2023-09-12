import java.util.Scanner;

public class CircumferenceCircle {
    static void circum(float f){
        double ans=2*3.14*f;
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float f=sc.nextFloat();
        circum(f);
        sc.close();
        
    }
}
