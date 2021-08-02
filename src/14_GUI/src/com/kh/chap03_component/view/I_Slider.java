package com.kh.chap03_component.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class I_Slider {

	public void sliderTest() {
		JFrame frame = new JFrame("Slider Test");
		frame.setSize(300, 300);
		
		// 패널 생성 후 라벨 올림
		JPanel panel1 = new JPanel();
		JLabel label = new JLabel("슬라이더를 움직여보세요");
		panel1.add(label);
		
		// 패널 생성 후 슬라이더와 버튼 올림
		JPanel panel2 = new JPanel();
		JSlider slider = new JSlider(0, 30, 15);		// min, max, value
		slider.setMajorTickSpacing(10);  		// 큰 눈금 간격
		slider.setMinorTickSpacing(1);			// 작은 눈금 간격
		slider.setPaintTicks(true); 				// 눈금 표시 기본 값 false
		slider.setPaintLabels(true); 				// 값을 라벨로 표시 기본 값 false
		
		panel2.add(slider);
		JButton button = new JButton("전송");
		panel2.add(button);
		
		// 패널 생성 후 결과 라벨 올림
		JPanel panel3 = new JPanel();
		JLabel text = new JLabel("결과 값 : ");
		JLabel result = new JLabel();
		panel3.add(text);
		panel3.add(result);
		
		// 전송 버튼 이벤트
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText(String.valueOf(slider.getValue()));
			}});
		
		// 프레임에 패널 올림
		frame.add(panel1, "North");
		frame.add(panel2, "Center");
		frame.add(panel3, "South");
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
