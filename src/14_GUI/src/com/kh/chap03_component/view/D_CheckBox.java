package com.kh.chap03_component.view;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class D_CheckBox {
	
	public void checkBoxTest() {
		JFrame frame = new JFrame("Checkbox Test");
		
		// JPanel 생성
		JPanel checkPanel = new JPanel();
		JPanel resultPanel = new JPanel();
		
		// checkbox 객체를 여러 개 사용하므로 배열로 선언하여 생성
		JCheckBox[] buttons = new JCheckBox[3];
		String[] fruits = {"apple", "banana", "orange"};
		
		// 문자열 전달하면서 checkbox 객체 생성 수 바로 패털 위에 올림
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JCheckBox(fruits[i]);
			checkPanel.add(buttons[i]);
		}
		
		// 결과 문자 JLabel 생성해서 패널에 부착
		JLabel text = new JLabel("선택한 과일이 없습니다.");
		resultPanel.add(text);
		
		// 여러 개의 체크 박스를 대상으로 이벤트를 작성해야 하므로 반복문 사용
		for(int i = 0 ; i < buttons.length; i++) {
			// 항목이 선택 또는 해제 되었음을 나타내는 ItemEvent의 감지기
			buttons[i].addItemListener(new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent e) {
					// 체크가 되어 있는 체크 박스를 모두 확인하여
					// 문자열을 새로 생성하고 라벨에 그 결과를 설정한다
					String result = "";
					for(int i = 0; i < buttons.length; i++) {
						// 체크박스가 선택 되었는지 확인
						if(buttons[i].isSelected()) {
							// 체크박스가 선택 된 경우 문자열을 result에 저장
							result += buttons[i].getText() + " ";
						}
					}
					// resultPanel의 JLabel의 값 변경
					if(result.equals(""))
						text.setText("선택한 과일이 없습니다");
					else
					     text.setText(result);
				}});
		}
		frame.add(checkPanel, "North");
		frame.add(resultPanel, "Center");
		frame.pack();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
