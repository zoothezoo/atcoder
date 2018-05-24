import java.util.Scanner;

public class Synop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int ans;
        if(a < 100){
            ans = 0;
        }
        else if(a <= 5000){
            ans = a/100;
        }
        else if(a >= 6000 && a <= 30000){
            ans = a/1000 + 50;
        }
        else if(a >= 35000 && a <= 70000){
            ans = (a - 30000) / 5000 + 80;
        }
        else{
            ans = 89;
        }
        System.out.printf("%02d%n",ans);
    }
}
