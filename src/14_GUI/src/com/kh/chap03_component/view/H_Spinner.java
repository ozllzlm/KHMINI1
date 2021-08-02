package com.kh.chap03_component.view;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;

public class H_Spinner {

	public void spinnerTest() {
		JFrame frame = new JFrame ("Spinner Test");
		frame.setSize(500, 100);
		
		// 스피너 올릴 패널 생성/ 결과 출력 패널 생성
		JPanel panel = new JPanel();
		JPanel resultPanel = new JPanel();
		
		// 1. ListModel : 구성 아이템을 문자열 배열로
		String[] items = {"소설", "잡지", "전공서적", "취미"};
		SpinnerListModel listModel = new SpinnerListModel(items);
		JSpinner spinner1 = new JSpinner(listModel);
		panel.add(spinner1);
		
		// 2. NumberModel : 숫자
		// 생성자에 (시작값, 최소값, 최대값, 증가값) 전달
		SpinnerNumberModel numberModel = new SpinnerNumberModel(1, 0, 9, 1);	
		JSpinner spinner2 = new JSpinner(numberModel);
		panel.add(spinner2);
		
		// 3. DateModel : 날짜
	   Calendar calendar = Calendar.getInstance();
	   Date today = calendar.getTime();		// 현재날짜
	   
	   calendar.add(Calendar.YEAR, -50);
	   Date start = calendar.getTime();		// 현재 날짜보다 50년 감소한 날짜
	   
	   calendar.add(Calendar.YEAR, 100);	// 현재 날짜보다 50년 증가한 날짜
	   Date end = calendar.getTime();			// 해당 객체 설정 값이 -50 이여서 +100 처리
	   
	   SpinnerDateModel dateModel = new SpinnerDateModel(today, start, end, Calendar.YEAR);
	   JSpinner spinner3 = new JSpinner(dateModel);
	   spinner3.setEditor(new JSpinner.DateEditor(spinner3, "yyyy/MM/dd"));
	   panel.add(spinner3);
	   
	   // 버튼 생성
	   JButton button = new JButton("전송");
	  panel.add(button);
	  
	  // resultPanel에 넣을 JLabel 객체 생성
	  JLabel text= new JLabel();
	  resultPanel.add(text);
	  
	  // 버튼 클릭시 동작하는 이벤트
	  button.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// 각 스피너의 현재 값을 가져와서 라벨의 setText
			text.setText(spinner1.getValue()+ ", " + spinner2.getValue() + ", "
					+ spinner3.getValue());
		}});
	   
		// 프레임에 패널 올리기
		frame.add(panel, "North");
		frame.add(resultPanel, "Center");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
