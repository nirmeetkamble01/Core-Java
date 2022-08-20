import java.util.*;;
class multiarrya 
 {
   public static void main(String args[])
{
    int i ,j ;
    int [][] matrix = new int[3][3];
    Scanner S1 = new Scanner(System.in);
    System.out.println("enter matrix");
    for(i=0;i<3;i++)
    {
for(j=0;j<3;j++)
{
matrix[i][j] = S1.nextInt();
}
    }
    System.out.println("Print matrix");
    for(i=0;i<3;i++)
    {
for(j=0;j<3;j++){
    System.out.println(matrix[i][j]);
}
System.out.println("x");
    }

}
    
 }
