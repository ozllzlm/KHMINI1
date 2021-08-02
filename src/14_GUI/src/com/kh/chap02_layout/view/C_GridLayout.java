package com.kh.chap02_layout.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class C_GridLayout extends JFrame{
	public C_GridLayout() {
		super("GridLayout");
		this.setBounds(300, 200, 800, 500);
		
		// GridLayout
		// 컴포넌트들을 가로, 세로의 일정 수만큼 배치하고자 할 때 사용
		// 윗 줄부터 시작해서 왼쪽에서 오른쪽으로 움직이며 각 줄을 이동하며 컴포넌츠 배치
		// 생성자(가로칸, 세로칸, 가로갭, 세로갭)
		this.setLayout(new GridLayout(5, 5, 10, 20));
		// => 컴포넌트 개수가 맞지 않으면 rows에 설정 된 값이 우선 된다
		// => 만약 cols를 우선시 하고 싶은 경우 row는 0으로 둔다
		
		for(int i = 1; i <= 25; i++)
			this.add(new JButton(i + "번"));
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

}
