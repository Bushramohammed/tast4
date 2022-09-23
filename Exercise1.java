
import java .awt.*;
public class Exercise1 {
    public static void main(String[] args) {
        int width =5;
        int height =8;
        Rectangle x =new Rectangle(0,0,5,8);
        double area = x.getWidth()*x.getHeight();
        System.out.println("area = "+area);

        double perimeter = 2*(x.getHeight())+2*(x.getWidth());
        System.out.println("get the perimeter = "+ perimeter);



    }

}