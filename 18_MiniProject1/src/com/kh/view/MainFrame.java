package com.kh.view;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	
	public MainFrame() {
		super("PC�� ���α׷�");
		this.setSize(1280, 720);
		this.setLocationRelativeTo(null); // �������� �� ȭ�� ����� â �߰� �ϴ� �޼ҵ�
		
		new MainPage(this);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
