import java.awt.Rectangle;
public class AddTester {
    public static void main(String[] args) {

        Rectangle box = new Rectangle(5, 10, 20, 30);
        System.out.println(box);
        //output: java.awt.Rectangle[x=5,y=10,width=20,height=30]

        box.add(0, 0);
        System.out.println(box);
        //output: java.awt.Rectangle[x=0,y=0,width=25,height=40]
    }
}
