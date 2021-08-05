package com.kh.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SignUp2 extends JFrame{
	
	public SignUp2() {
		super("PC�� ���α׷�");
		this.setSize(1280, 720);
		this.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(246, 246, 246));
		
		// Ÿ��Ʋ
		JLabel title = new JLabel("ȸ�� ����");
		title.setFont(new Font("���� ���", Font.BOLD, 30));
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setOpaque(true);
		title.setForeground(Color.white);
		title.setBackground(new Color(153, 184, 215));
		title.setLocation(0, 0);
		title.setSize(1280, 80);
		panel.add(title);
		
		// ���̵� �Է�
		JLabel id = new JLabel("- ���̵�");
		id.setFont(new Font("���� ���", Font.PLAIN, 15));
		id.setLocation(440, 100);
		id.setSize(500, 50);
		panel.add(id);
		
		JTextField inputId = new JTextField();
		inputId.setLocation(570, 115);
		inputId.setSize(140, 25);
		panel.add(inputId);
		
		// ** ���̵� �ߺ� Ȯ��
		JButton checkId = new JButton("�ߺ� Ȯ��");
		checkId.setFont(new Font("���� ���", Font.BOLD, 15));
		checkId.setForeground(Color.white);
		checkId.setBackground(Color.gray);
		checkId.setBorderPainted(false);
		checkId.setFocusPainted(false);
		checkId.setLocation(720, 115);
		checkId.setSize(100, 24);
		panel.add(checkId);
		
		JLabel duplId = new JLabel("");
		duplId.setFont(new Font("���� ���", Font.BOLD, 15));
		duplId.setLocation(570, 125);
		duplId.setSize(500, 50);
		panel.add(duplId);
		
		// �ߺ� Ȯ�� ��ư Ŭ���̺�Ʈ -> ����� �����Ͷ� �� �� ��ġ ���� �� ���
		checkId.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*if(ArrayList.searchId(inputId.getText) > 0) { // ȸ������ �÷��� controller ���̵� �˻� ��� ���� -> �Ű������� ���ڿ� �Է°� ���� -> ��ġ�ϴ� �� ������ result 1 ����
					duplId.setText("�̹� ��ϵ� ���̵��Դϴ�.");
					duplId.setForeground(Color.red);
				} else*/ if(inputId.getText().equals("")) {
					duplId.setText("���̵� �Է����ּ���.");
					duplId.setForeground(Color.red);
				} else {
					duplId.setText("��� ������ ���̵��Դϴ�.");
					duplId.setForeground(Color.blue);
				}
			}
		});
		
		// �̸� �Է�
		JLabel name = new JLabel("- �̸�");
		name.setFont(new Font("���� ���", Font.PLAIN, 15));
		name.setLocation(440, 160);
		name.setSize(500, 50);
		panel.add(name);
		
		JTextField inputName = new JTextField();
		inputName.setLocation(570, 175);
		inputName.setSize(252, 25);
		panel.add(inputName);
		
		// ��й�ȣ �Է�
		JLabel pw = new JLabel("- ��й�ȣ");
		pw.setFont(new Font("���� ���", Font.PLAIN, 15));
		pw.setLocation(440, 200);
		pw.setSize(500, 50);
		panel.add(pw);
		
		JTextField inputPw = new JTextField();
		inputPw.setLocation(570, 215);
		inputPw.setSize(252, 25);
		panel.add(inputPw);
		
		// ��й�ȣ Ȯ��
		JLabel compare = new JLabel("- ��й�ȣ Ȯ��");
		compare.setFont(new Font("���� ���", Font.PLAIN, 15));
		compare.setLocation(440, 240);
		compare.setSize(500, 50);
		panel.add(compare);
		
		JTextField inputPw2 = new JTextField();
		inputPw2.setLocation(570, 255);
		inputPw2.setSize(140, 25);
		panel.add(inputPw2);
		
		// ** ��й�ȣ ��ġ Ȯ��
		JButton checkPw = new JButton("Ȯ��");
		checkPw.setFont(new Font("���� ���", Font.BOLD, 15));
		checkPw.setForeground(Color.white);
		checkPw.setBackground(Color.gray);
		checkPw.setBorderPainted(false);
		checkPw.setFocusPainted(false);
		checkPw.setLocation(720, 255);
		checkPw.setSize(100, 24);
		panel.add(checkPw);
		
		JLabel samePw = new JLabel("");
		samePw.setFont(new Font("���� ���", Font.BOLD, 15));
		samePw.setLocation(570, 265);
		samePw.setSize(500, 50);
		panel.add(samePw);
		
		// Ȯ�� ��ư Ŭ���̺�Ʈ -> inputPw�� inputPw2 ���ؼ� ��ġ ���� Ȯ��
		checkPw.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(inputPw.getText().equals(inputPw2.getText())) {
					samePw.setText("��й�ȣ�� ��ġ�մϴ�.");
					samePw.setForeground(Color.blue);
				} else if(inputPw2.getText().equals("")) {
					samePw.setText("��й�ȣ�� �Է����ּ���.");
					samePw.setForeground(Color.red);
				} else {
					samePw.setText("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
					samePw.setForeground(Color.red);
				}
			}
		});
		
		// ������� �Է�
		JLabel birth = new JLabel("- �������");
		birth.setFont(new Font("���� ���", Font.PLAIN, 15));
		birth.setLocation(440, 300);
		birth.setSize(500, 50);
		panel.add(birth);
		
		JTextField inputBirth = new JTextField();
		inputBirth.setLocation(570, 315);
		inputBirth.setSize(252, 25);
		panel.add(inputBirth);
		
		JLabel form = new JLabel("ex. 19990101");
		form.setFont(new Font("���� ���", Font.PLAIN, 15));
		form.setForeground(Color.gray);
		form.setLocation(570, 325);
		form.setSize(500, 50);
		panel.add(form);
		
		// ���� ����
		JLabel gender = new JLabel("- ����");
		gender.setFont(new Font("���� ���", Font.PLAIN, 15));
		gender.setLocation(440, 360);
		gender.setSize(500, 50);
		panel.add(gender);
		
		JRadioButton male = new JRadioButton("����");
		male.setFont(new Font("���� ���", Font.PLAIN, 15));
		male.setContentAreaFilled(false);
		male.setFocusPainted(false);
		male.setLocation(570, 373);
		male.setSize(65, 25);
		JRadioButton female = new JRadioButton("����");
		female.setFont(new Font("���� ���", Font.PLAIN, 15));
		female.setContentAreaFilled(false);
		female.setFocusPainted(false);
		female.setLocation(640, 373);
		female.setSize(65, 25);
		ButtonGroup mf = new ButtonGroup();
		mf.add(male);
		mf.add(female);
		panel.add(male);
		panel.add(female);
		
		// �ڵ��� ��ȣ �Է�
		JLabel phone = new JLabel("- �ڵ��� ��ȣ");
		phone.setFont(new Font("���� ���", Font.PLAIN, 15));
		phone.setLocation(440, 400);
		phone.setSize(500, 50);
		panel.add(phone);
		
		JTextField inputNum = new JTextField();
		inputNum.setLocation(570, 415);
		inputNum.setSize(140, 25);
		panel.add(inputNum);
		
		// ** �ڵ��� ��ȣ �ߺ� Ȯ��
		JButton checkNum = new JButton("Ȯ��");
		checkNum.setFont(new Font("���� ���", Font.BOLD, 15));
		checkNum.setForeground(Color.white);
		checkNum.setBackground(Color.gray);
		checkNum.setBorderPainted(false);
		checkNum.setFocusPainted(false);
		checkNum.setLocation(720, 415);
		checkNum.setSize(100, 24);
		panel.add(checkNum);
		
		JLabel duplNum = new JLabel("");
		duplNum.setFont(new Font("���� ���", Font.BOLD, 15));
		duplNum.setLocation(570, 425);
		duplNum.setSize(500, 50);
		panel.add(duplNum);
		
		// Ȯ�� ��ư Ŭ���̺�Ʈ -> ����� �����Ͷ� �� �� ��ġ ���� �� ���
		checkNum.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*if(ArrayList.searchNum(inputNum.getText) > 0) { // controller ��ȣ �˻� ��� ���� -> �Ű������� ���ڿ� �Է°� ���� -> ��ġ�ϴ� �� ������ result 1 ����
					duplNum.setText("�̹� ��ϵ� ��ȣ�Դϴ�.");
					duplNum.setForeground(Color.red);
				} else*/ if(inputNum.getText().equals("")) {
					duplNum.setText("��ȣ�� �Է����ּ���.");
					duplNum.setForeground(Color.red);
				} else {
					duplNum.setText("��� ������ ��ȣ�Դϴ�.");
					duplNum.setForeground(Color.blue);
				}
			}
		});
		
		// �̸��� �Է�
		JLabel email = new JLabel("- �̸���");
		email.setFont(new Font("���� ���", Font.PLAIN, 15));
		email.setLocation(440, 460);
		email.setSize(500, 50);
		panel.add(email);
		
		JTextField inputEmail = new JTextField();
		inputEmail.setLocation(570, 475);
		inputEmail.setSize(252, 25);
		panel.add(inputEmail);
		
		// �Ϸ� ��ư
		JButton finish = new JButton("ȸ������ �Ϸ�");
		finish.setFont(new Font("���� ���", Font.BOLD, 18));
		finish.setForeground(Color.white);
		finish.setBackground(new Color(153, 184, 215));
		finish.setBorderPainted(false);
		finish.setFocusPainted(false);
		finish.setLocation(440, 540);
		finish.setSize(380, 50);
		panel.add(finish);
		
		// �Ϸ� ��ư Ŭ���̺�Ʈ
		// 1. �Է� â�� ��� �Է� + ���̵�, ��й�ȣ, ����ȣ ���� ��ġ�ϸ� ������ �Է� �� �α��� ȭ������ ���ư�
		// 2. ���̵�, ����ȣ �ߺ��̰ų� ��й�ȣ ����ġ�ϸ� �� Ȯ�� �˾�
		// 3. ���̵�, ��й�ȣ, ����ȣ �� �� �ϳ��� Ȯ�ι�ư ������ �ʾ��� ��� �� Ȯ�� �˾�
		// 4. �Է� â�� ��� �Էµ��� �ʾ��� ��� �� Ȯ�� �˾�
		finish.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!inputId.getText().equals("") && !inputName.getText().equals("") && !inputPw.getText().equals("") && !inputPw2.getText().equals("")
						&& !inputBirth.getText().equals("") && (male.isSelected() || female.isSelected()) && !inputNum.getText().equals("") && !inputEmail.getText().equals("")
						&& duplId.getText().equals("��� ������ ���̵��Դϴ�.") && samePw.getText().equals("��й�ȣ�� ��ġ�մϴ�.") && duplNum.getText().equals("��� ������ ��ȣ�Դϴ�.")) {
					JOptionPane.showMessageDialog(null, "ȸ�������� �Ϸ�Ǿ����ϴ�.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
//					ChangePanel.changePanel(mfr, signUp2, new LoginPage());
				} else if(duplId.getText().equals("�̹� ��ϵ� ���̵��Դϴ�.")) {
					JOptionPane.showMessageDialog(null, "�ٸ� ���̵� �Է��� �ּ���.", "MINI1 PC", JOptionPane.WARNING_MESSAGE);
				} else if(samePw.getText().equals("��й�ȣ�� ��ġ���� �ʽ��ϴ�.")) {
					JOptionPane.showMessageDialog(null, "��й�ȣ�� Ȯ���� �ּ���.", "MINI1 PC", JOptionPane.WARNING_MESSAGE);
				} else if(duplNum.getText().equals("�̹� ��ϵ� ��ȣ�Դϴ�.")) {
					JOptionPane.showMessageDialog(null, "�ڵ��� ��ȣ�� Ȯ���� �ּ���.", "MINI1 PC", JOptionPane.WARNING_MESSAGE);
				} else if(duplId.getText().equals("") || samePw.getText().equals("") || duplNum.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "���̵�, ��й�ȣ, �ڵ��� ��ȣ�� Ȯ���� �ּ���.", "MINI1 PC", JOptionPane.WARNING_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "��� �ԷµǾ����� Ȯ���� �ּ���.", "MINI1 PC", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		
		// ��� ��ư
		JButton back = new JButton("���");
		back.setFont(new Font("���� ���", Font.BOLD, 17));
		back.setBackground(new Color(221, 221, 221));
		back.setBorderPainted(false);
		back.setFocusPainted(false);
		back.setLocation(440, 600);
		back.setSize(380, 50);
		panel.add(back);
		
		// ��� ��ư Ŭ���̺�Ʈ -> ȸ������ ���� ȭ������ ���ư�
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "���� ȭ������ ���ư��ϴ�.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
//				ChangePanel.changePanel(mfr, signUp2, new SignUp());
			}
		});
		
		this.add(panel);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
}
