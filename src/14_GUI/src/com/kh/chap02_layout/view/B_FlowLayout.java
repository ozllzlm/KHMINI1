package com.kh.chap02_layout.view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class B_FlowLayout extends JFrame{

	public B_FlowLayout() {
		super("FolwLayout");
		this.setBounds(300, 200, 800, 500);
		
		// FlowLayout 설정
		// 컴포넌트들을 가로나 세로 방향의 줄 단위로 배치하는 레이아웃
		// 만약 컨테이너보다 배치할 구성 요소가 더 많거나 크게 되면 자동으로 다음 줄로 넘기며 배치
		this.setLayout(new FlowLayout());	  // 기본 정렬 설정은 Center
		
		// 정렬 기분 전달
		this.setLayout(new FlowLayout(FlowLayout.CENTER));	
		this.setLayout(new FlowLayout(FlowLayout.LEFT));	
		this.setLayout(new FlowLayout(FlowLayout.RIGHT));	
		
		for(int i = 0; i < 15; i++)
	      this.add(new JButton(i + 1 +"번"));

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}
}
