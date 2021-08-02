package com.kh.chap02_layout.view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class A_BorderLayout extends JFrame{
	
	public A_BorderLayout() {
		// �θ� �����ڷ� jframe title ����
		super("BorderLayout");
		
		// ������ ��ġ �� ũ�� ����
		this.setBounds(300, 200, 800, 500);
		
		// ���̾ƿ� �����ϱ�
		// LayoutManager �������̽��� �ļ� Ŭ������ �پ��� ���̾ƿ��� ������
		this.setLayout(new BorderLayout(10, 10));
		// ���� ���� �� ���̾ƿ� �˾ƺ��� 
		// => �̼��� ��JFrame�� �⺻ ���̾ƿ��� BorderLayout��
		System.out.println(this.getLayout());
		
		// JButton ��ü ����
		JButton north = new JButton("��");
		JButton south = new JButton("��");
		JButton east = new JButton("��");
		JButton west = new JButton("��");
		JButton center = new JButton("���");
		
		// ȭ�鿡 �߰��ϱ� ���ؼ� add �޼ҵ�� jframe���� jbutteon �߰�
		// ��ġ ���� ���ڿ� Ʋ���� ��� ���� �߻� ����
		this.add(north, "North");
		this.add(south, "South");
		this.add(east, "East");
		this.add(west, "West");
		this.add(center, "Center");
		
		
		// �ݵ�� �ʿ��� �ڵ�
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
