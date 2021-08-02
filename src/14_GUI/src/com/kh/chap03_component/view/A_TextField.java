package com.kh.chap03_component.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class A_TextField {

	public void textFieldTest() {
		JFrame frame = new JFrame("제곱 계산하기");
		frame.setSize(300, 130);
		
		// 패널 생성
		JPanel panel = new JPanel();
		// 라벨 패널에 부착
		panel.add(new JLabel("숫자 입력 : "));
		// 텍스트 필드 생성
		JTextField text = new JTextField(15);
		panel.add(text);
		// 라벨 패널에 부착
		panel.add(new JLabel("제곱한 값 : "));
		// 결과 텍스트 필드 생성
		JTextField result = new JTextField(15);
		result.setEditable(false);
		panel.add(result);
		//버튼 생성 후 패널에 부착
		JButton btn = new JButton("OK");
		panel.add(btn);
		
		// 버튼 클릭 시 발생하는 이벤트 감지
		/* ActionEvent : 사용자가 어떤 동작을 할 때 발생하며 모든 컴포넌트에서 발생하지는 않음
		 * 1. 버튼이 눌러졌을 때
		 * 2. 메뉴를 클릭했을 때
		 * 3. 텍스트 필드에서 엔터키를 눌렀을 때
		 */
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭 시 text에 기록 된 값 가져오기 (문자열 파싱 처리)
				int value = Integer.parseInt(text.getText());
				// result에 제곱 값 입력하기
				result.setText(value * value + "");
				// 텍스트 상자로 다시 포커스 가져가기
				text.requestFocus();
			}});
		
		frame.add(panel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	

}
