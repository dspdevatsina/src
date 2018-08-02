import java.awt.*;
import javax.swing.*;

public class Helloworld{
	public enum Month{January  , Feb, May};
	public static void run() {
		JFrame frame = new JFrame("hello , yangxiao!");
		frame.add(new BlueRC(),0);
		String str = "Hello world";
		//setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		JLabel lb1 = new JLabel(str);
		frame.add(lb1,1);
		frame.add(new JLabel("next"),2);
		frame.setSize(400,400);
		frame.setBackground(Color.WHITE);
		frame.setVisible(true);
		

	}

	private static class BlueRC extends JComponent{
		@Override
		public void paintComponent(Graphics g) {
			g.setColor(Color.RED);
			g.fillRect(100, 50 , 200 , 100);
		}
	}
//	public static void main(String[] args){
	    public static void main(String[] args){  
	    	//Helloworld h = 
	    	new Helloworld().run();
	    	//h.run();
	    	//new Hellowrold().run();
	    }  
	
	
}