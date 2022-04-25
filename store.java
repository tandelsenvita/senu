
// Java implementation of the above approach
class GFG{
 
// Function to find arrangements
public static int Arrangements(int N)
{
    int result = 1;
     
    for(int i = 1; i <= N; i++)
    {
 
        // Here, i for factorial and
        // (2*i-1) for series
       result = result * i * (2 * i - 1);
    }
    return result;
}
 
// Driver code   
public static void main(String[] args)
{
    int N = 4;
     
    System.out.print(Arrangements(N));
    System.out.println();
    System.out.println("valid");
}
}