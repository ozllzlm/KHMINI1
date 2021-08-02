package com.kh.chap01_container.view;

import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

// JFrame 생성하기2
// javax.swing.JFrame 클래스를 객체로 생성 후
// 해당 프레임 객체의 설정 값을 변경하는 방법
public class JTrameView2 {

	public void showJFrame() {
		// JFrame mainFrame = new JFrame();
		// mainFrame.setTitle("MyFrame");
		
		// 매개변수 생성자로 title 전달하면서 JFrame 객체 생성
		JFrame mainFrame = new JFrame("MyFrame");
		
		// 위치와 사이즈 설정
		// Rectangle 객체를 활용 (x, y, width, height)
		Rectangle r = new Rectangle(300, 200, 800, 500);
		mainFrame.setBounds(r);
		
		// 사이즈 변경 불가
		mainFrame.setResizable(false);
		
		// 아이콘 이미지 변경
		try {
			mainFrame.setIconImage(ImageIO.read(new File("image/icon.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);
	}

}
