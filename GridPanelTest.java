import javax.swing.*;
import java.awt.*;

public class GridPanelTest {

	public static void showUI()
	{
		System.out.println("GridPanelTest.class");
		JFrame jf = new JFrame("GridPanelTest.class");
		jf.setVisible(true);
		jf.setSize(600, 400);
		
		GridLayout layout = new GridLayout(2, 2);
		
		JPanel jptop = new JPanel();
		jf.add(jptop);
		
		jptop.setLayout(layout);
		JPanel jp = new JPanel(layout);
		jptop.add(jp);
		
		JPanel jp1 = new JPanel(layout);
		jptop.add(jp1);
		
		JButton jb00 = new JButton("testButton00");
		jp1.add(jb00);
		JButton jb01 = new JButton("testButton01");
		jp1.add(jb01);
		JTextArea jt=  new JTextArea();
		jp1.add(jt);
		
		JButton jb0 = new JButton("testButton02");
		jp.add(jb0);
		
		JButton jb1 = new JButton("testButton1");
		jp.add(jb1);
		
		JButton jb2 = new JButton("testButton2");
		jp.add(jb2);
		
		JButton jb3 = new JButton("testButton3");
		jp.add(jb3);
		
		JButton jb4 = new JButton("testButton4");
		jp.add(jb4);
		
		jf.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		showUI();
	}
}
