package com.kh.member;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {
	private Image bg = new ImageIcon
            (Login.class.getResource("icon/bg.jpg")).getImage();
	public Login() {
		JFrame frame = new JFrame("�α��� ȭ��");
		frame.setSize(1280,720);
		
		JPanel panel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(bg, 0, 0, 1280, 720, null);
			}
		};		
		panel.setLayout(null);
		
		
		String text = "<html><p style=\"color:white;font-size:40px;border-bottom:5px solid white;\">"+ "01" +"</p></html>";
		JLabel label = new JLabel(text);
		//label.setFont(new Font("",Font.BOLD,40));
		//label.setForeground(Color.white);

		String PName = "<html><p style=\"color:#E5C9F1;font-size:40px;\">"+ "MINI1 PC" +"</p></html>";
		JLabel label2 = new JLabel(PName);
		//label2.setFont(new Font("",Font.BOLD,40));
		//label2.setForeground(Color.getHSBColor(282, (float)16.6, (float)94.5));

		String PMenu = "<html><p style=\"color:#BEBEBE;font-size:15px;\">"
					   + "COFFEE<br>" + "DRINK<br>" + "RICE<br>" + "NOODLE<br>" + "CHICKEN<br>" + "SNACK<br>"
					   +"</p></html>";
		String PMenuDetail = "<html><p style=\"color:#FFFFFF;font-size:15px;\">"
				   + "�Ƹ޸�ī�� / ī��� / ī��Ḷ���ƶ�<br>"
				   + "ź������(�ݶ�, ���̴�, ��ġ��) / ���̽�Ƽ / ���̵�<br>"
				   + "��ġ������ / ���������� / ���캺����<br>"
				   + "��� / ¥�İ�Ƽ / ���� / �쵿<br>"
				   + "����ġŲ / ���ȷ��� / ���ȷκ� / ������<br>"
				   + "�ֵ��� / ġ�ƽ / �Ҷ��Ҷ� / �򷯽�<br>"
				   +"</p></html>";
		JLabel label3 = new JLabel(PMenu);
		JLabel label4 = new JLabel(PMenuDetail);

		label.setSize(400, 80);
		label.setLocation(20, 20);
		label2.setSize(230, 60);
		label2.setLocation(525, 80);
		label3.setSize(100, 180);
		label3.setLocation(350, 200);
		label4.setSize(500, 180);
		label4.setLocation(500, 200);
		
		panel.add(label);
		panel.add(label2);
		panel.add(label3);
		panel.add(label4);

		JPanel panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBackground(Color.DARK_GRAY);
		panel2.setSize(1280, 150);
		panel2.setLocation(0, 550);

		JLabel logo = new JLabel("KH����������");
		logo.setFont(new Font("",Font.BOLD,25));
		logo.setForeground(Color.LIGHT_GRAY);
		logo.setSize(300, 150);
		logo.setLocation(10, 0);
		panel2.add(logo);		

		JPanel panel3 = new JPanel();	
		panel3.setBackground(Color.DARK_GRAY);
		panel3.setBounds(680, 550, 600, 150);
		panel3.setLayout(null);
		JLabel IdLabel = new JLabel("���̵� ");
		JLabel PwLabel = new JLabel("��й�ȣ ");
		JLabel NumLabel = new JLabel("��ȸ�� ");
		IdLabel.setForeground(Color.WHITE);
		PwLabel.setForeground(Color.WHITE);
		NumLabel.setForeground(Color.WHITE);
		JTextField IdArea = new JTextField(15);
		JPasswordField PwArea = new JPasswordField(15);
		JTextField NumArea = new JTextField(15);
		JButton LoginBtn = new JButton("�α���");
		JButton JoinBtn = new JButton("ȸ������");
		JButton SearchBtn = new JButton("���̵�/��й�ȣ ã��");
		LoginBtn.setBackground(new Color(52, 152, 219));	//RGB
		JoinBtn.setBackground(new Color(224, 224, 224));
		SearchBtn.setBackground(new Color(224, 224, 224));

		IdLabel.setSize(100, 30);
		IdLabel.setLocation(0, 10);
		PwLabel.setSize(100, 30);
		PwLabel.setLocation(0, 50);
		NumLabel.setSize(100, 30);
		NumLabel.setLocation(0, 90);

		IdArea.setSize(150, 30);
		IdArea.setLocation(100, 10);
		PwArea.setSize(150, 30);
		PwArea.setLocation(100, 50);
		NumArea.setSize(150, 30);
		NumArea.setLocation(100, 90);
		
		LoginBtn.setSize(100, 110);
		LoginBtn.setLocation(260, 10);
		JoinBtn.setSize(180, 50);
		JoinBtn.setLocation(370, 10);
		SearchBtn.setSize(180, 50);
		SearchBtn.setLocation(370, 70);
		
		panel3.add(IdLabel);
		panel3.add(IdArea);		
		panel3.add(PwLabel);
		panel3.add(PwArea);		
		panel3.add(NumLabel);
		panel3.add(NumArea);
		panel3.add(LoginBtn);
		panel3.add(JoinBtn);
		panel3.add(SearchBtn);
		
		panel2.add(panel3);
		frame.add(panel3);
		frame.add(panel2);
		frame.add(panel);		
				
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		

		JDialog dialog = new JDialog(frame, "���̵�/��й�ȣ ã��");
		dialog.setBounds(440, 110, 400, 500);
		JPanel findID = new JPanel();
		JLabel findTit = new JLabel("���̵� / ��й�ȣ ã��");
		findTit.setFont(new Font("",Font.BOLD,30));
		String textIdOn = "<html><p style=\"width:120px;border-bottom:5px solid black;text-align:center;font-size:15px;\">"+ "���̵� ã��" +"</p></html>";
		String textIdOff = "<html><p style=\"width:120px;border-bottom:5px solid gray;text-align:center;font-size:15px;color:gray;\">"+ "���̵� ã��" +"</p></html>";
		String textPwOn = "<html><p style=\"width:120px;border-bottom:5px solid black;text-align:center;font-size:15px;\">"+ "��й�ȣ ã��" +"</p></html>";
		String textPwOff = "<html><p style=\"width:120px;border-bottom:5px solid gray;text-align:center;font-size:15px;color:gray;\">"+ "��й�ȣ ã��" +"</p></html>";
		JButton findIdtxt = new JButton(textIdOn);
		JButton findPwtxt = new JButton(textPwOff);
		findIdtxt.setBorder(null);
		findPwtxt.setBorder(null);

		JTextField InputName = new JTextField("�̸� �Է�");
		JTextField InputID = new JTextField("���̵� �Է�");
		JTextField InputEmail = new JTextField("�̸����ּ� �Է�");
		JTextField InputPhone = new JTextField("�޴�����ȣ �Է� (-����)");
		JButton SearchId_btn = new JButton("���̵� ã��");
		JButton SearchPw_btn = new JButton("��й�ȣ ã��");

		InputName.setSize(300, 50);
		InputName.setLocation(260, 10);
		InputID.setSize(300, 50);
		InputID.setLocation(260, 10);
		InputEmail.setSize(300, 50);
		InputEmail.setLocation(260, 10);
		InputPhone.setSize(300, 50);
		InputPhone.setLocation(260, 10);
		SearchId_btn.setSize(300, 50);
		SearchId_btn.setLocation(260, 10);
		SearchPw_btn.setSize(300, 50);
		SearchPw_btn.setLocation(260, 10);
		
		
		findID.add(findTit);
		findID.add(findIdtxt);
		findID.add(findPwtxt);
		findID.add(InputName);
		findID.add(InputEmail);
		findID.add(SearchId_btn);
		//dialog.add(contents);
		dialog.add(findID);
		
		JPanel findPW = new JPanel();
		

		SearchBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
			}			
		});
		findIdtxt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				findIdtxt.setText(textIdOn);
				findPwtxt.setText(textPwOff);
			}			
		});
		findPwtxt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				findIdtxt.setText(textIdOff);
				findPwtxt.setText(textPwOn);
			}			
		});
	}
	public static void main(String[] args) {
		new Login();
	}
}
