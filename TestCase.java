import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TestCase{
  @Test
  public void TestCase1(){
    var input  = new int[]{1, 2, 3, 4, 3, 2, 1};
    var expected = 7;
    var actual  = LongestPeak.longestPeak(input);
    assertTrue(expected == actual);
  }
  @Test
  public void TestCase2(){
    var input  = new int[]{1, 2, 3, 0, 3, 2, 1};
    var expected = 4;
    var actual  = LongestPeak.longestPeak(input);
    assertTrue(expected == actual);
  }
  @Test
  public void TestCase3(){
    var input  = new int[]{1, 0, 3, 4, 3, 0, 1};
    var expected = 5;
    var actual  = LongestPeak.longestPeak(input);
    assertTrue(expected == actual);
  }

}
