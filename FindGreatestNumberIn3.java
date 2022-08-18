class FindGreatestNumberIn3{
    public static void main(String[]args){
        int a , b, c;
        a = 3; b=6; c=9;
        if(a>b){
            if(a>c){
                System.out.println("A IS THE GREATEST");
            }
            else
            {
System.out.println("C is GREATEST");
            }
        }
        else if (b>c){
            System.out.println("B is the greatest");
        }
        else{
            System.out.println("C is the greatest");
        }
    }
}