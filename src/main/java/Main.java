import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int w;
        w = in.nextInt();
        Main m = new Main();
        boolean x = m.waterMelon(w);
        if(x)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
    public boolean waterMelon(int w)
    {
        if(w < 1 || w > 100)
        {
            return false;
        }
        if(w % 2 == 0 && w != 2)
        {

            return true;
        }
        return false;
    }
}
