import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GamePanel {
		public static void GamePanel(int chessArray) {
			return;
		}
		public static void setBackGround(Color color) {
			return;
		}
		public static void showUI() {
			// �������,JFrameĬ���Ǳ߿򲼾�
			JFrame jf = new JFrame();
			jf.setTitle("������1.0");
			jf.setSize(800, 700);
			// �����˳����̵ķ���
			jf.setDefaultCloseOperation(3);
			// ���þ�����ʾ
			jf.setLocationRelativeTo(null);
			GamePanel gp = new GamePanel(chessArray);
			//�������̱���ɫ
			gp.setBackground(new Color(139,139,122));
			jf.add(gp,BorderLayout.CENTER);
			//���ö��ߵ�����
			JPanel jp=new JPanel();
			jp.setBackground(new Color(245,245,245));
			jf.add(jp,BorderLayout.EAST);
			//���ö�����ʽ���ֵ�����
			java.awt.FlowLayout fl=new java.awt.FlowLayout(5,5,60);
			jp.setLayout(fl);
			Dimension di=new Dimension(120,0);
			jp.setPreferredSize(di);
			//���ö��ߵİ�ť����ť������
			javax.swing.JButton jbu1=new javax.swing.JButton("��ʼ��Ϸ");
			Dimension di1=new Dimension(100,60);
			jbu1.setPreferredSize(di1);
			jp.add(jbu1);
			javax.swing.JButton jbu2=new javax.swing.JButton("���˶�ս");
			Dimension di2=new Dimension(100,60);
			jbu2.setPreferredSize(di2);
			jp.add(jbu2);
			javax.swing.JButton jbu3=new javax.swing.JButton("�˻���ս");
			Dimension di3=new Dimension(100,60);
			jbu3.setPreferredSize(di3);
			jp.add(jbu3);
			javax.swing.JButton jbu4=new javax.swing.JButton("����");
			Dimension di4=new Dimension(100,60);
			jbu4.setPreferredSize(di4);
			jp.add(jbu4);
			javax.swing.JButton jbu5=new javax.swing.JButton("���¿�ʼ");
			Dimension di5=new Dimension(100,60);
			jbu5.setPreferredSize(di5);
			jp.add(jbu5);
			jf.setVisible(true);
			
			//���ð�ť�Ķ���������
			jbu1.addActionListener(mouse);
			jbu2.addActionListener(mouse);
			jbu3.addActionListener(mouse);
			jbu4.addActionListener(mouse);
	}
}
