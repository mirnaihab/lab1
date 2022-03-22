import java.util.Scanner;
public class Main
{
    public static void main (String[] args)
    {
        int n;
        int [][] points  = new int[1000][3];
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                points[i][j] = in.nextInt();
            }
        }
        Main z = new Main();
        boolean mirna= z.vasya(n, points);
        if(mirna)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
    public boolean vasya(int n, int [][]points)
    {
        if(n < 1 || n > 100)
        {
            return false;
        }
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                if(points[i][j] < -100 || points[i][j] > 100)
                {
                    return false;
                }
            }
        }
        int x = 0, y = 0, z =0;
        for(int i = 0; i < n; i++)
        {
            x = x + points[i][0];
            y = y + points[i][1];
            z = z + points[i][2];
        }
        if( x == 0 && y == 0 && z == 0)
        {
            return true;
        }
        return false;
    }
}
