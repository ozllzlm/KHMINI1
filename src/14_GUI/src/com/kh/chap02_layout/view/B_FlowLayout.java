package com.kh.chap02_layout.view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class B_FlowLayout extends JFrame{

	public B_FlowLayout() {
		super("FolwLayout");
		this.setBounds(300, 200, 800, 500);
		
		// FlowLayout ����
		// ������Ʈ���� ���γ� ���� ������ �� ������ ��ġ�ϴ� ���̾ƿ�
		// ���� �����̳ʺ��� ��ġ�� ���� ��Ұ� �� ���ų� ũ�� �Ǹ� �ڵ����� ���� �ٷ� �ѱ�� ��ġ
		this.setLayout(new FlowLayout());	  // �⺻ ���� ������ Center
		
		// ���� ��� ����
		this.setLayout(new FlowLayout(FlowLayout.CENTER));	
		this.setLayout(new FlowLayout(FlowLayout.LEFT));	
		this.setLayout(new FlowLayout(FlowLayout.RIGHT));	
		
		for(int i = 0; i < 15; i++)
	      this.add(new JButton(i + 1 +"��"));

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}
}
