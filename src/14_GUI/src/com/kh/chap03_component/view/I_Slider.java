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
		
		// �г� ���� �� �� �ø�
		JPanel panel1 = new JPanel();
		JLabel label = new JLabel("�����̴��� ������������");
		panel1.add(label);
		
		// �г� ���� �� �����̴��� ��ư �ø�
		JPanel panel2 = new JPanel();
		JSlider slider = new JSlider(0, 30, 15);		// min, max, value
		slider.setMajorTickSpacing(10);  		// ū ���� ����
		slider.setMinorTickSpacing(1);			// ���� ���� ����
		slider.setPaintTicks(true); 				// ���� ǥ�� �⺻ �� false
		slider.setPaintLabels(true); 				// ���� �󺧷� ǥ�� �⺻ �� false
		
		panel2.add(slider);
		JButton button = new JButton("����");
		panel2.add(button);
		
		// �г� ���� �� ��� �� �ø�
		JPanel panel3 = new JPanel();
		JLabel text = new JLabel("��� �� : ");
		JLabel result = new JLabel();
		panel3.add(text);
		panel3.add(result);
		
		// ���� ��ư �̺�Ʈ
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText(String.valueOf(slider.getValue()));
			}});
		
		// �����ӿ� �г� �ø�
		frame.add(panel1, "North");
		frame.add(panel2, "Center");
		frame.add(panel3, "South");
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
