package com.kh.chap01_container.view;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

// JFrame 생성하기1
// javax.swing.JFrame 클래스를 상속 받아 생성자에서 프레임에 대해 설정
public class JFrameView1 extends JFrame{
	
	// 기본 생성자 안에 프레임 기본 세팅 설정하기
	public JFrameView1() {
		// 프레임 위치 설정 (x, y)
		this.setLocation(300, 200);
		// 프레임 크기 설정(width, height)
		this.setSize(800, 500);
		// 프레임 위치와 크기 한번에 설정 (x, y, width, height)
		this.setBounds(300, 200 , 800, 500);
		
		// 프레임 상단에 이름 설정
		this.setTitle("MyFrame");
		
		// 프레임 상단에 로고 이미지 변경
		try {
			this.setIconImage(ImageIO.read(new File("image/icon.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 기본 값으로 프레임 사이즈 조정이 활성화 되어 있으므로 사이즈 조정 불가능하게 설정
		this.setResizable(false);

		
		
		
		
		// 창에서 X 버튼을 눌러서 종료를 해도 프로세스는 계속 실행 중
		// 닫기 버튼을 눌렀을 때 프로세스 정상 종료를 위한 구문 추가
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 화면이 보여지게 만들기 위해서는 반드시 setVisible(true) 호출 필요
		// 프레임 위에 올라간 컴포넌트들이 잘 보이려면 마지막에 호출
		this.setVisible(true);
	}

}
