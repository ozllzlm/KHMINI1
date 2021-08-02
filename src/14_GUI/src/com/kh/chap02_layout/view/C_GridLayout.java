package com.kh.chap02_layout.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class C_GridLayout extends JFrame{
	public C_GridLayout() {
		super("GridLayout");
		this.setBounds(300, 200, 800, 500);
		
		// GridLayout
		// ������Ʈ���� ����, ������ ���� ����ŭ ��ġ�ϰ��� �� �� ���
		// �� �ٺ��� �����ؼ� ���ʿ��� ���������� �����̸� �� ���� �̵��ϸ� �������� ��ġ
		// ������(����ĭ, ����ĭ, ���ΰ�, ���ΰ�)
		this.setLayout(new GridLayout(5, 5, 10, 20));
		// => ������Ʈ ������ ���� ������ rows�� ���� �� ���� �켱 �ȴ�
		// => ���� cols�� �켱�� �ϰ� ���� ��� row�� 0���� �д�
		
		for(int i = 1; i <= 25; i++)
			this.add(new JButton(i + "��"));
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

}
