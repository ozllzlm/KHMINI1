package com.kh.chap03_component.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class B_TextArea {

	public void textAreaTest() {
		JFrame frame = new JFrame("textare 테스트");
		
		// 입력용 텍스트 필드
		JTextField tf = new JTextField(30);
		// 출력용 텍스트 영역
		JTextArea  ta = new JTextArea(10, 30);	
		
		// 텍스트 필드에서 엔터키를 눌렀을 때 이벤트
		tf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 텍스트 필드에 입력 된 값 알아오기
				String text = tf.getText();
				// 텍스트 영역에 setText가 아닌 append로 해당 값 추가하기
				ta.append(text + "\n");
				// 텍스트 필드에 입력 된 값 지우기
				tf.setText("");
				
			}});
		
		frame.add(tf, "North");
		frame.add(ta, "Center");
		
		// 프레임 크기를 지정하지 않으면 작게 나옴
		// 프레임의 크기를 컴포넌트 배치에 맞추어서 자동 설정하고 싶을 때
		frame.pack();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
