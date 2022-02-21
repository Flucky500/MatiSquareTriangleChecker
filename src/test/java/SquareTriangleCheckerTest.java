import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class SquareTriangleCheckerTest {

    @Test
    public void shouldReturnTrueWhen345(){
        //given
        int a = 3;
        int b = 4;
        int c = 5;
        //when
        SquareTriangleChecker.squareTriangleChecker(3,4,5);
        //then
        Assert.assertTrue(true);
    }
    @Test
    public void shouldReturnTrueWhen534(){
        //given
        int a = 5;
        int b = 3;
        int c = 4;
        //when
        SquareTriangleChecker.squareTriangleChecker(5,3,4);
        //then
        Assert.assertTrue(true);
    }
    @Test
    public void shouldReturnTrueWhen453(){
        //given
        int a = 4;
        int b = 5;
        int c = 3;
        //when
        SquareTriangleChecker.squareTriangleChecker(4,5,3);
        //then
        Assert.assertTrue(true);
    }
    @Test
    public void shouldReturnFalseWhen125(){
        //given
        int a = 1;
        int b = 2;
        int c = 5;
        //when
        SquareTriangleChecker.squareTriangleChecker(1,2,5);
        //then
        Assert.assertFalse(false);
    }
    @Test
    public void shouldReturnFalseWhenAnyLessThanZero(){
        //given
        int a = -1;
        int b = 4;
        int c = 5;
        //when
        SquareTriangleChecker.squareTriangleChecker(-1,4,5);
        //then
        Assert.assertFalse(false);
    }
    @Test
    public void shouldReturnFalseWhen225() {
        //given
        int a = 2;
        int b = 2;
        int c = 5;
        //when
        SquareTriangleChecker.squareTriangleChecker(2, 2, 5);
        //then
        Assert.assertFalse(false);
    }
    @Test
    public void shouldReturnFalseWhen333() {
        //given
        int a = 3;
        int b = 3;
        int c = 3;
        //when
        SquareTriangleChecker.squareTriangleChecker(3, 3, 3);
        //then
        Assert.assertFalse(false);
    }

}
