// Java code to find number of unique paths
// in a Matrix
class Main
{
  static int uniquePathsWithObstacles(int[][] A)
  {
 
    int r = 3, c = 3;
 
    
    int[][] paths = new int[r][c];
    for(int i = 0; i < r; i++)
    {
      for(int j = 0; j < c; j++)
      {
        paths[i][j] = 0;
      }
    }
 
    
    if (A[0][0] == 0)
      paths[0][0] = 1;
 
    
    for(int i = 1; i < r; i++)
    {
      
      if (A[i][0] == 0)
        paths[i][0] = paths[i - 1][0];
    }
 
    
    for(int j = 1; j < c; j++)
    {
 
      
      if (A[0][j] == 0)
        paths[0][j] = paths[0][j - 1];
    }  
 
    for(int i = 1; i < r; i++)
    {
      for(int j = 1; j < c; j++)
      {
        if (A[i][j] == 0)
          paths[i][j] = paths[i - 1][j] +
          paths[i][j - 1];
      } 
    }
 	
    return paths[r - 1][c-1];
  }
 
  
  public static void main(String[] args) {
    int[][] A = { { 0, 0, 0 },
                 { 0, 1, 0 },
                 { 0, 0, 0} };
				
 
    System.out.print(uniquePathsWithObstacles(A));
  }
}
 
