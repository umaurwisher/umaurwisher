- 👋 Hi, I’m @umaurwisher
- 👀 I’m interested in ...
- 🌱 I’m currently learning ...
- 💞️ I’m looking to collaborate on ...
- 📫 How to reach me ...

<!---
umaurwisher/umaurwisher is a ✨ special ✨ repository because its `README.md` (this file) appears on your GitHub profile.
You can click the Preview link to take a look at your changes.
--->
import java.util.*;
public class Main
{
  public static void main(String[] args) {
      
      
    int i,j; 
    Scanner sc= new Scanner(System.in);
    System.out.println("enter row");
    int R=sc.nextInt();
    System.out.println("enter column");
    int C=sc.nextInt();
    int[] b=new int[R];
    int[][] a=new int[R][C];
    for(i=0;i<R;i++)
    {
        for(j=0;j<C;j++)
        {
            
            a[i][j]=sc.nextInt();   
        }
    }
    for(i=0;i<R;i++)
    {
        for(j=0;j<C;j++)
        {
            if(j==C-1)
            {
                
            
            b[i]=a[i][j]%10;
            }
        }
    }
    for(i=0;i<R;i++)
    {
        for(j=0;j<C;j++)
        {
            System.out.print(a[i][j]+b[i] + " ");
        }
        System.out.println("");
    }
  }
}
    
