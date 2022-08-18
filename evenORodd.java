import java.util.*;
class evenORodd{
    public static void main(String args []){
        int a;
        Scanner S1 = new Scanner(System.in);
        System.out.println("number you want to  check");
        a = S1.nextInt();
        if(a%2 ==0){
            System.out.println("ITS EVEN NUMBER");
        }
        else
        {
            System.out.println("Its a odd number");
        }
    }
}