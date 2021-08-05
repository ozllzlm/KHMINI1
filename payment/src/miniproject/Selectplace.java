package miniproject;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Selectplace  {
	private BufferedImage img; 

	public Selectplace() {

		JFrame frame = new JFrame();
		frame.setSize(1280, 720);

		// �ڸ����� ��ư
		JButton seatbtn = new JButton("�ڸ�����");
		seatbtn.setFocusPainted(false);
		seatbtn.setPreferredSize(new Dimension(180, 50));
		seatbtn.setBackground(Color.pink);
		seatbtn.setFont(new Font("���", Font.BOLD, 30));

		// �� �ð� �� �ݾ� �� 
		JLabel lb = new JLabel("�� �ð� �� �ݾ�");
		lb.setHorizontalAlignment(JLabel.CENTER); //�� ���� ��� ����
		lb.setPreferredSize(new Dimension(180, 50));
		lb.setOpaque(true);
		lb.setBackground(Color.yellow);
		lb.setFont(new Font("���", Font.BOLD, 21));
		
		// �� �ð� �� �ݾ׶� �� �ؽ�Ʈ�ʵ�(?)
		JTextArea ta = new JTextArea(8,16); 
		ta.setPreferredSize(new Dimension(50,50));
		
		// �����ϱ� ��ư
		JButton paymentbtn = new JButton("�����ϱ�");
		paymentbtn.setFocusPainted(false);
		paymentbtn.setPreferredSize(new Dimension(180, 50));
		paymentbtn.setBackground(Color.red);
		paymentbtn.setFont(new Font("���", Font.BOLD, 30));
		
		// ���� �г� (�׸��巹�̾ƿ� �ø� �г�)
		JPanel leftPanel = new JPanel(new GridLayout(6, 5, 10, 20));
		leftPanel.setPreferredSize(new Dimension(800, 650));
		leftPanel.setBackground(new Color(0, 0, 0, 0));


		//������ �г�
		JPanel rightPanel = new JPanel();
		rightPanel.setPreferredSize(new Dimension(200, 320));
		rightPanel.setBackground(new Color(0, 0, 0, 0));
		
		// lol ��� �ø� �г�
		//JPanel backgroundPanel = new JPanel();
		//backgroundPanel.setPreferredSize(new Dimension(700,500)); 
		// �̹��� ũ�� �����Ͽ� �̹��� ��ü ����
		//Image icon = new ImageIcon("image./lol.jpg").getImage().getScaledInstance(150, 150, 0);  
		// JLabel �����Ͽ� Image ����
		//JLabel label = new JLabel(new ImageIcon(icon));
		//backgroundPanel.add(label);
		
		try {
			img =  ImageIO.read(new File("images/lol.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		rightPanel.add(seatbtn);  
		rightPanel.add(lb);   // �ݾ� ��
		rightPanel.add(ta);
		rightPanel.add(paymentbtn); 
		
		// ��ü �г�
		MyPanel page = new MyPanel();
		page.add(leftPanel); 
		page.add(rightPanel);  
 
		frame.add(page);  // ��ü �г� �����ӿ� �ø���
		//frame.add(backgroundPanel); // �� ��� �г� �����ӿ� �ø���
		
		// �Ʒ����� �׸��� ���̾ƿ� ���� ����
		JLabel lb1 = new JLabel("ȸ�����");
		lb1.setFont(lb1.getFont().deriveFont(25.0f));
		lb1.setHorizontalAlignment(JLabel.CENTER);
		lb1.setBackground(Color.blue);
		lb1.setOpaque(true);
		leftPanel.add(lb1);

		JLabel lb2 = new JLabel("�л����");
		lb2.setFont(lb2.getFont().deriveFont(25.0f));
		lb2.setHorizontalAlignment(JLabel.CENTER);
		lb2.setBackground(Color.blue);
		lb2.setOpaque(true);
		leftPanel.add(lb2);

		JLabel lb3 = new JLabel("��ȸ�����");
		lb3.setFont(lb3.getFont().deriveFont(25.0f));
		lb3.setHorizontalAlignment(JLabel.CENTER);
		lb3.setBackground(Color.blue);
		lb3.setOpaque(true);
		leftPanel.add(lb3);

		JLabel lb4 = new JLabel("��ǰ��");
		lb4.setFont(lb4.getFont().deriveFont(25.0f));
		lb4.setHorizontalAlignment(JLabel.CENTER);
		lb4.setBackground(Color.blue);
		lb4.setOpaque(true);
		leftPanel.add(lb4);

		JLabel lb5 = new JLabel("��������");
		lb5.setFont(lb5.getFont().deriveFont(25.0f));
		lb5.setHorizontalAlignment(JLabel.CENTER);
		lb5.setBackground(Color.blue);
		lb5.setOpaque(true);
		leftPanel.add(lb5);

		JButton b1 = new JButton("1�ð� / 1000��");
		b1.setFocusPainted(false);
		b1.setFont(b1.getFont().deriveFont(15.0f));
		leftPanel.add(b1);

		JButton b2 = new JButton("1�ð� / 900��");
		b2.setFocusPainted(false);
		b2.setFont(b2.getFont().deriveFont(15.0f));
		leftPanel.add(b2);

		JButton b3 = new JButton("1�ð� / 1200��");
		b3.setFocusPainted(false);
		b3.setFont(b3.getFont().deriveFont(15.0f));
		leftPanel.add(b3);

		JButton b4 = new JButton("��ȭ��ǰ��");
		b4.setFocusPainted(false);
		b4.setFont(b4.getFont().deriveFont(20.0f));
		leftPanel.add(b4);

		JButton b5 = new JButton("ī��");
		b5.setFocusPainted(false);
		b5.setFont(b5.getFont().deriveFont(20.0f));
		leftPanel.add(b5);

		JButton b6 = new JButton("3�ð� / 3000��");
		b6.setFocusPainted(false);
		b6.setFont(b6.getFont().deriveFont(15.0f));
		leftPanel.add(b6);

		JButton b7 = new JButton("3�ð� / 2400��");
		b7.setFocusPainted(false);
		b7.setFont(b7.getFont().deriveFont(15.0f));
		leftPanel.add(b7);

		JButton b8 = new JButton("3�ð� / 3300��");
		b8.setFocusPainted(false);
		b8.setFont(b8.getFont().deriveFont(15.0f));
		leftPanel.add(b8);

		JButton b9 = new JButton("�ؽ�ĳ��");
		b9.setFocusPainted(false);
		b9.setFont(b9.getFont().deriveFont(20.0f));
		leftPanel.add(b9);

		JButton b10 = new JButton("����");
		b10.setFocusPainted(false);
		b10.setFont(b10.getFont().deriveFont(20.0f));
		leftPanel.add(b10);

		JButton b11 = new JButton("5�ð� / 4000��");
		b11.setFocusPainted(false);
		b11.setFont(b11.getFont().deriveFont(15.0f));
		leftPanel.add(b11);

		JButton b12 = new JButton("5�ð� / 3500��");
		b12.setFocusPainted(false);
		b12.setFont(b12.getFont().deriveFont(15.0f));
		leftPanel.add(b12);

		JButton b13 = new JButton("5�ð� / 5000��");
		b13.setFocusPainted(false);
		b13.setFont(b13.getFont().deriveFont(15.0f));
		leftPanel.add(b13);

		JButton b14 = new JButton("��ĳ��");
		b14.setFocusPainted(false);
		b14.setFont(b14.getFont().deriveFont(20.0f));
		leftPanel.add(b14);

		JButton b15 = new JButton("īī������");
		b15.setFocusPainted(false);
		b15.setFont(b15.getFont().deriveFont(20.0f));
		leftPanel.add(b15);

		JButton b16 = new JButton("12�ð� / 10000��");
		b16.setFocusPainted(false);
		b16.setFont(b16.getFont().deriveFont(15.0f));
		leftPanel.add(b16);

		JButton b17 = new JButton("12�ð� / 8000��");
		b17.setFocusPainted(false);
		b17.setFont(b17.getFont().deriveFont(15.0f));
		leftPanel.add(b17);

		JButton b18 = new JButton("12�ð� / 12000��");
		b18.setFocusPainted(false);
		b18.setFont(b18.getFont().deriveFont(15.0f));
		leftPanel.add(b18);

		JButton b19 = new JButton("ƾĳ��");
		b19.setFocusPainted(false);
		b19.setFont(b19.getFont().deriveFont(20.0f));
		leftPanel.add(b19);

		JButton b20 = new JButton("�Ｚ����");
		b20.setFocusPainted(false);
		b20.setFont(b20.getFont().deriveFont(20.0f));
		leftPanel.add(b20);

		JButton b21 = new JButton("20�ð� / 15000��");
		b21.setFocusPainted(false);
		b21.setFont(b21.getFont().deriveFont(15.0f));
		leftPanel.add(b21);

		JButton b22 = new JButton("20�ð� / 12000��");
		b22.setFocusPainted(false);
		b22.setFont(b22.getFont().deriveFont(15.0f));
		leftPanel.add(b22);

		leftPanel.add(new JLabel(""));

		JButton b23 = new JButton("���۱���Ʈ");
		b23.setFocusPainted(false);
		b23.setFont(b23.getFont().deriveFont(20.0f));
		leftPanel.add(b23);

		JButton b24 = new JButton("�佺");
		b24.setFocusPainted(false);
		b24.setFont(b24.getFont().deriveFont(20.0f));
		leftPanel.add(b24);


		/*
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

					
			}
		});
		*/
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	 private class MyPanel extends JPanel{
		 
	        protected void paintComponent(Graphics g) {
	            super.paintComponent(g);
	            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
	        }
	    }

	public static void main(String[] args) {
		new Selectplace();
	}
}
