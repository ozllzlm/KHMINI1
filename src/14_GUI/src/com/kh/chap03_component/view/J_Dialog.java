package com.kh.chap03_component.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class J_Dialog {

	public void dialogTest() {
		JFrame frame = new JFrame("Dialog test");
		
		JPanel panel = new JPanel();
		JButton button1 = new JButton("Simple Doalog");
		panel.add(button1);
		
		// 다이얼로그 설정 값 넣어서 생성
		JDialog dialog = new JDialog(frame, "새로운 창 이름");
		dialog.setBounds(150, 250, 200, 200);
		
		// button1 클릭 시 dialog 보이게 처리
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
			}
			
		});
		
		// dialog에 닫기 버튼 생성하여 올림
		JButton button2 = new JButton("close");
		dialog.add(button2);
		
		// button2클릭 시 dialog 닫힘
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.dispose();
			}});
		
		// 패널에 버튼 하나 더 올림
		JButton button3 = new JButton("Input Dialog");
		panel.add(button3);
		
		button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 1. 입력 다이어로그
				// String result = JOptionPane.showInputDialog("내용을 입력하세요");
				// System.out.println(result);
				// 취소 버튼이나 입력 없이 닫히면 null 리턴, 확인 누르면 입력 값 리턴

				// 2. 확인 다이어로그
				// int result =
				//      JOptionPane.showConfirmDialog(null, "확인하시겠습니까?", "확인 창",
				// JOptionPane.YES_NO_OPTION);
				// int result =
				//      JOptionPane.showConfirmDialog(null, "확인하시겠습니까?", "확인 창",
				// JOptionPane.YES_NO_CANCEL_OPTION);
				// System.out.println(result);
				
				// 3. 메세지 다이어로그
				JOptionPane.showMessageDialog(null, "위험합니다", "danger", JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "위험합니다", "danger", JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null, "위험합니다", "danger", JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showMessageDialog(null, "위험합니다", "danger", JOptionPane.QUESTION_MESSAGE);
				JOptionPane.showMessageDialog(null, "위험합니다", "danger", JOptionPane.WARNING_MESSAGE);
			}
		});
		
		frame.add(panel);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
