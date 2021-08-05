package com.kh.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.kh.common.ChangePanel;

public class SignUp extends JFrame{
	
	public SignUp() {
		super("PC�� ���α׷�");
		this.setSize(1280, 720);
		this.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(246, 246, 246));
		
		// Ÿ��Ʋ
		JLabel title = new JLabel("ȸ�� ���� ����");
		title.setFont(new Font("���� ���", Font.BOLD, 30));
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setOpaque(true);
		title.setForeground(Color.white);
		title.setBackground(new Color(153, 184, 215));
		title.setLocation(0, 0);
		title.setSize(1280, 80);
		panel.add(title);
		
		// �̿��� ���� üũ, ����
		JCheckBox agree1 = new JCheckBox(" �̿��� ����");
		agree1.setFont(new Font("���� ���", Font.BOLD, 15));
		agree1.setBackground(new Color(246, 246, 246));
		agree1.setFocusPainted(false);
		agree1.setLocation(165, 90);
		agree1.setSize(500, 50);
		panel.add(agree1);
		
		JTextArea clause1 = new JTextArea("������ �ɰ��翡 ���� ������ ������ ���� �� ������ �� ���� ���� ��н��� ������ �־�ΰ� ������ �ǰ��� �����̴ϱ� �츮 ���� ������ �������� �� ��Ź�� ��� �ۺ��� �̺��� �Ϻ��ұ� Love me only till this spring �� ���϶� ���� ���� �� good bye �̷� �ḻ�� ���� �ȳ� ���� ���� �ȳ� ���̾� �츮 ������ climax �� �󸶳� ��� ���̾� Ooh ooh Love me only till this spring ���ٶ�ó�� Ooh ooh Love me only till this spring ���ٶ�ó�� ����� �޾� ��뷡 �θ��� (����) �Բ����� ��¦ �ø� ä ���� �̷��� �ϴ��� �� �ٶ��� �� �Ϻ��� ���� ���õ��� �� ��� ���� ��� ó�� ���� �׳�ó�� ���ڴٰ� �����ٷ� ��� �̺��� ����� �����ұ� Love resembles misty dream �� ���϶� ���� ���� �� good bye �̷� �ḻ�� ���� �ȳ� ���� ���� �ȳ� ���̾� �츮 ������ climax �� �󸶳� ��� ���̾� Ooh ooh Love resembles misty dream �ᱸ��ó�� Ooh ooh Love resembles misty dream �ᱸ��ó�� �ʵ� ������ �� �ذ� �ɱ� ���� ǥ���� ������ ��⵵ ���� ���̿� ���İ� ������ ��ó�� �� ���϶� ���� ���� �� good bye ���� ����� �� ��� �ȳ� ��� ���� �ȳ� ���̾� �츮 ������ climax �� �󸶳� ��� ���̾� Ooh ooh Love me only untill this spring ���ٶ�ó�� Ooh ooh Love me only untill this spring ���ٶ�ó�� Ooh ooh Love resembles misty dream �ᱸ��ó�� Ooh ooh Love resembles misty dream �ᱸ��ó��");
		clause1.setLineWrap(true);
		clause1.setFont(new Font("���� ���", Font.PLAIN, 15));
		JScrollPane sp1 = new JScrollPane(clause1);
		sp1.setLocation(165, 150);
		sp1.setSize(900, 120);
		panel.add(sp1);
		
		// �������� ���� üũ, ����
		JCheckBox agree2 = new JCheckBox(" �������� ���� �� �̿� ����");
		agree2.setFont(new Font("���� ���", Font.BOLD, 15));
		agree2.setBackground(new Color(246, 246, 246));
		agree2.setFocusPainted(false);
		agree2.setLocation(165, 280);
		agree2.setSize(500, 50);
		panel.add(agree2);
		
		JTextArea clause2 = new JTextArea("����?��� �� ���ڿ� �װ� ���� �;� ���� �Ӹ����� ��� �̸�Ƽ�� �ϳ��ϳ� �ӿ� �޶����� �� �̹��� �ɸ��� �˱� �ƴ� �ٻ��� �ʾ� nothing no no ���� ���� �ʾ� insomnia nia nia ���� �ٸ� ����� �Բ����� �ʾ� ��, ���� �ʸ� ���� �� �츮�� �׸� ĭ�� bloom �����հ������� ��̲��� �ǿ� ��⿡ ���� �� ���� ���� �Ѹ��� ����� ���� I feel bloom I feel bloom I feel bloom �ʿ��� �� ���̸� �� ���� ��� �۾����� ������Ʈ ��̷ο� �� ��ǰ�� ������ that's me ���� �� ������ Ŭ���̸ƽ� 2������ �Ѿ�⿣ ������ good timing ���� ���� �� �˾� realize la lize ���� ���� ���� just reply la la ly ���� �峭������ ���� ������ �� �ؼ��� �ñ��� �츮�� ���� gray and blue �����հ������� ��ǳ���� ��� �ݼ� ���� �� ���� �� ȣ���� ������ �������� I feel blue. I feel blue. I feel blue. �ʿ��� ������ ä�� ������̺����Ի���ΰͰ��� �鸸������̲���, �����ǿ�����? ������ ���� �츮 ���� ���� ��� ĥ�� �õ� ���� ���ڰ� �츮�� �׸� ĭ�� bloom �����հ������� ��̲��� �ǿ� ��⿡ ���� �� ���� ���� �Ѹ��� ����� ���� I feel bloom I feel bloom I feel bloom �ʿ��� �� ���̸� �� ����");
		clause2.setLineWrap(true);
		clause2.setFont(new Font("���� ���", Font.PLAIN, 15));
		JScrollPane sp2 = new JScrollPane(clause2);
		sp2.setLocation(165, 340);
		sp2.setSize(900, 120);
		panel.add(sp2);
		
		// ��� ���� üũ
		JCheckBox allAgree = new JCheckBox(" PC�� �̿���, �������� ���� �� �̿뿡 ���� ��� �����մϴ� (���� �������� ���� �� �̿� ���� ����)");
		allAgree.setFont(new Font("���� ���", Font.BOLD, 15));
		allAgree.setBackground(new Color(246, 246, 246));
		allAgree.setFocusPainted(false);
		allAgree.setLocation(165, 470);
		allAgree.setSize(1000, 50);
		panel.add(allAgree);
		
		// ���� �ܰ� ��ư
		JButton next = new JButton("���� �ܰ�");
		next.setFont(new Font("���� ���", Font.BOLD, 18));
		next.setForeground(Color.white);
		next.setBackground(new Color(153, 184, 215));
		next.setBorderPainted(false);
		next.setFocusPainted(false);
		next.setLocation(440, 540);
		next.setSize(380, 50);
		panel.add(next);
		
		// ���� �ܰ� ��ư �̺�Ʈ -> üũ�ڽ� ��� üũ�ϸ� ȸ������ â����
		next.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if((agree1.isSelected() && agree2.isSelected()) && allAgree.isSelected()) {
					JOptionPane.showMessageDialog(null, "ȸ������ ȭ������ �Ѿ�ϴ�.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
//					ChangePanel.changePanel(mfr, signUp, new SignUp2());
				} else {
					JOptionPane.showMessageDialog(null, "PC�� �̿���, �������� ���� �� �̿뿡 ���� ��� �����ϼž� ȸ������ �����մϴ�.", "MINI1 PC", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		
		// ���� ȭ�� ��ư
		JButton prev = new JButton("���� ȭ������");
		prev.setFont(new Font("���� ���", Font.BOLD, 17));
		prev.setBackground(new Color(221, 221, 221));
		prev.setBorderPainted(false);
		prev.setFocusPainted(false);
		prev.setLocation(440, 600);
		prev.setSize(380, 50);
		panel.add(prev);
		
		// ���� ȭ�� ��ư �̺�Ʈ -> �α��� ȭ������
		prev.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "�α��� ȭ������ ���ư��ϴ�.", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
//				ChangePanel.changePanel(mfr, signUp, new LoginPage());
			}
		});
		
		this.add(panel);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
}
