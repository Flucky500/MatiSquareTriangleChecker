import java.sql.SQLOutput;

public class SquareTriangleChecker {

    public static boolean squareTriangleChecker(int a, int b, int c){
        if(a + b < c || a + c < b || b + c < a){
            System.out.println("This is not a triangle");
            return false;
        }else if ((a*a + b*b == c*c) || (a*a + c*c == b*b) || (b*b + c*c == a*a)){
            System.out.println("This is a square triangle");
            return true;
        } System.out.println("This triangle is not square");
            return false;

        }
    }

