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
		
		// 컴포넌트 생성
		JLabel lb = new JLabel("이 름 : ");
		lb.setLocation(50, 100);
		lb.setSize(150, 50);
		
		JTextField tf = new JTextField(20);
		tf.setLocation(110, 100);
		tf.setSize(200, 50);
		
		JButton btn = new JButton("추 가");
		btn.setLocation(350, 100);
		btn.setSize(100, 50);
		
		// JPanel  생성
		JPanel panel = new JPanel();
		
		// Panel의 레이아웃 기본 값은 FlowLayout (정렬은 Center)
		// 패널에 위치를 정해서 컴포넌트를 올리고 싶다면 패널의 레이아웃을 null로 변경
		panel.setLayout(null);
		
		// 패널에 컴포넌트 추가
		panel.add(lb);
		panel.add(tf);
		panel.add(btn);
		
		// 패널을 프레임에 추가
		this.add(panel);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
