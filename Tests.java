import junit.framework.TestCase;
import org.junit.jupiter.api.BeforeEach;

public class Tests extends TestCase{
    Main m=new Main();

    public void testSingleNumber(){
        int [] nums= {1,1,2,2,3,3,4,4,5};
        assertEquals(m.singleNumber(nums),5);

    }
    public void testSingleNumber1(){
        int [] nums1 ={1, 2,3,1,3};
        assertEquals(m.singleNumber(nums1),2);

        int [] nums2={1,5,2,3,2,3,5};
        assertEquals(m.singleNumber(nums2),1);
    }

    public void testMinSplit(){
        assertEquals(m.minSplit(100),2);
        assertEquals(m.minSplit(0),0);
        assertEquals(m.minSplit(33),5);
        assertEquals(m.minSplit(1),1);
        assertEquals(m.minSplit(55),2);

    }
    public void testnotContains(){
        int [] nums1= {1,2,3,4,5,6,7};
        assertEquals(m.notContains(nums1), 8);

        int [] nums2= {1, 2,6, 100, 120, -2};
        assertEquals(m.notContains(nums2), 3);

        int [] nums3= {1,3,4,5,6,8};
        assertEquals(m.notContains(nums3), 2);

        int []nums={-100, 2, 500, 3, 7};
        assertEquals(m.notContains(nums), 1);
    }

    public void testAddBinary(){
        String a="1010";
        String b="1011";
        String res="10101";
        assertEquals(m.addBinary(a,b), res);



        String a1 ="1000";
        String b1="111";
        String res1="1111";
        assertEquals(m.addBinary(a1,b1), res1);

        String a2 ="1110";
        String b2="000";
        String res2="1110";
        assertEquals(m.addBinary(a2,b2), res2);


    }
    public void testCountVariants(){
        assertEquals(m.countVariants(0),0);
        assertEquals(m.countVariants(1),1);
        assertEquals(m.countVariants(2),2);
        assertEquals(m.countVariants(3),3);
        assertEquals(m.countVariants(4),5);
        assertEquals(m.countVariants(5),8);
    }

}
