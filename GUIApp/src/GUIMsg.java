import javax.swing.*;

public class GUIMsg {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Kobo Kanaeru");
    JButton button = new JButton("Hello");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 300);
    button.setSize(100,100);
    frame.getContentPane().add(button);
    frame.setVisible(true);
  }
}
