import static org.junit.Assert.*;
import org.junit.Test;
public class MainTest{
    @Test
    public void test()
    {
        boolean check = true;
       int[] testcases = {-100, 2, 30, 45, 102, 204,1};
       for(int i = 0; i < testcases.length; i++)
       {
           Main  c = new Main();
           if((c.waterMelon(testcases[i]) == true)) //&& (testcases[i]  < 1 || testcases[i] > 100) );
           {
               if(testcases[i]  < 1 || testcases[i] > 100)//&& (testcases[i]  < 1 || testcases[i] > 100) );
               {
                   check = false;
                   break;
               }
           }


       }
        assertTrue(check);
    }
}