package com.kh.chap02_layout.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class E_NullLayout extends JFrame{
	public E_NullLayout() {
		super("NullLayout");
		this.setBounds(200, 200, 500, 500);
		
		// Layout ���� ���� ��ġ �����ϸ鼭 ��ġ�ϴ� ���
		this.setLayout(null);
		
		JLabel lb = new JLabel("�� �� : ");
		lb.setLocation(50, 100);
		lb.setSize(150, 50);
		
		JTextField tf = new JTextField(20);
		tf.setLocation(110, 100);
		tf.setSize(200, 50);
		
		JButton btn = new JButton("�� ��");
		btn.setLocation(350, 100);
		btn.setSize(100, 50);
		
		// �����ӿ� ���� �� ������Ʈ �߰�
		// Layout�� null�� ���¿��� ������Ʈ�� ��ġ ������ ������
		// �����ӿ� �ö� �� ����
		this.add(lb);
		this.add(tf);
		this.add(btn);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
