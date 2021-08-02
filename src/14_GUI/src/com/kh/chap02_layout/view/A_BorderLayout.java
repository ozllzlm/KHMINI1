package com.kh.chap02_layout.view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class A_BorderLayout extends JFrame{
	
	public A_BorderLayout() {
		// 부모 생성자로 jframe title 전달
		super("BorderLayout");
		
		// 프레임 위치 및 크기 설정
		this.setBounds(300, 200, 800, 500);
		
		// 레이아웃 설정하기
		// LayoutManager 인터페이스의 후손 클래스로 다양한 레이아웃이 제공됨
		this.setLayout(new BorderLayout(10, 10));
		// 현재 적용 된 레이아웃 알아보기 
		// => 미설정 시JFrame의 기본 레이아웃도 BorderLayout임
		System.out.println(this.getLayout());
		
		// JButton 객체 생성
		JButton north = new JButton("북");
		JButton south = new JButton("남");
		JButton east = new JButton("동");
		JButton west = new JButton("서");
		JButton center = new JButton("가운데");
		
		// 화면에 추가하기 위해서 add 메소드로 jframe위에 jbutteon 추가
		// 위치 지정 문자열 틀렸을 경우 오류 발생 유의
		this.add(north, "North");
		this.add(south, "South");
		this.add(east, "East");
		this.add(west, "West");
		this.add(center, "Center");
		
		
		// 반드시 필요한 코드
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
