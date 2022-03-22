import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MainTest{
    @Test
    public void testVasya()
    {
        int nNum[] = {-1, 0, 1, 2, 3};
        int[][] ind = {{1,2,3}, {-1,-2,-3}, {0,0,0},{-300, 400, 0}};
        boolean test = true;
        for(int i = 0; i < nNum.length; i++)
        {
            Main m = new Main();

            if(m.vasya(nNum[i],ind) == true && (nNum[i] < 1 || nNum[i] > 100))
            {
                if(ind[i][0] > -100 || ind[i][0] > 100 || ind[i][1] > -100 || ind[i][1] > 100 || ind[i][2] > -100 || ind[i][2] > 100 )
                   test = false;
            }
        }
        assertTrue(test);
    }




}