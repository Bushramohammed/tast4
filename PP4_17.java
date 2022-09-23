import javax.swing.JFrame;

public class PP4_17 {
    //Ctrates the main frame of the program.
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Traffic light");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Trafficlight panel = new Trafficlight();

        frame.getContentPane().add(panel);

        frame.pack();
        frame.setVisible(true);
    }//end main
}
