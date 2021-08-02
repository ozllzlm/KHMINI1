package com.kh.chap02_layout.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class F_PanelLayout extends JFrame{
	public F_PanelLayout() {
		super("PanelLayout");
		this.setBounds(200, 200, 500, 500);
		
		// ������Ʈ ����
		JLabel lb = new JLabel("�� �� : ");
		lb.setLocation(50, 100);
		lb.setSize(150, 50);
		
		JTextField tf = new JTextField(20);
		tf.setLocation(110, 100);
		tf.setSize(200, 50);
		
		JButton btn = new JButton("�� ��");
		btn.setLocation(350, 100);
		btn.setSize(100, 50);
		
		// JPanel  ����
		JPanel panel = new JPanel();
		
		// Panel�� ���̾ƿ� �⺻ ���� FlowLayout (������ Center)
		// �гο� ��ġ�� ���ؼ� ������Ʈ�� �ø��� �ʹٸ� �г��� ���̾ƿ��� null�� ����
		panel.setLayout(null);
		
		// �гο� ������Ʈ �߰�
		panel.add(lb);
		panel.add(tf);
		panel.add(btn);
		
		// �г��� �����ӿ� �߰�
		this.add(panel);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
