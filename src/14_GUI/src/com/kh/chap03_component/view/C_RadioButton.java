package com.kh.chap03_component.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class C_RadioButton {

	public void radioButtonTest() {
		JFrame frame = new JFrame("RadioButtonTest");
		frame.setSize(300, 150);
		
		// 상단 생성
		JPanel topPanel = new JPanel();
		JLabel label = new JLabel("어떤 크기의 커피를 주문하시겠습니까?");
		topPanel.add(label);
		frame.add(topPanel, "North");		
		
		// 중간 패널
		JPanel sizePanel = new JPanel();
		
		JRadioButton small = new JRadioButton("Small Size");
		JRadioButton medium = new JRadioButton("Medium Size");
		JRadioButton large = new JRadioButton("Large Size");
		
		// 버튼 그룹을 지정해주지 않으면 각자 선택하게 동작
		// 라디오 버튼은 복수 선택이 불가능한 선택을 받기 위한 컴포넌트이므로
		// 필수로 그룹으로 묶어줘야함
		ButtonGroup sizeGroup = new ButtonGroup();
		sizeGroup.add(small);
		sizeGroup.add(medium);
		sizeGroup.add(large);
		
		sizePanel.add(small);
		sizePanel.add(medium);
		sizePanel.add(large);
		
		frame.add(sizePanel, "Center");
		
		// 하단 패널
		JPanel resultPanel = new JPanel();
		JLabel text = new JLabel("크기가 선택되지 않았습니다.");
		resultPanel.add(text);
		frame.add(resultPanel, "South");
		
		// medium size 버튼이 클릭 되었을 때
		medium.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("Medium Size가 선택되었습니다.");
			}});
		
		// small size 버튼이 클릭 되었을 때
		small.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("Small Size가 선택되었습니다.");
			}});
		
		// Large size 버튼이 클릭 되었을 때
		large.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("Large Size가 선택되었습니다.");
			}});
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
