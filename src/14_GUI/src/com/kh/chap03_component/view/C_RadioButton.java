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
		
		// ��� ����
		JPanel topPanel = new JPanel();
		JLabel label = new JLabel("� ũ���� Ŀ�Ǹ� �ֹ��Ͻðڽ��ϱ�?");
		topPanel.add(label);
		frame.add(topPanel, "North");		
		
		// �߰� �г�
		JPanel sizePanel = new JPanel();
		
		JRadioButton small = new JRadioButton("Small Size");
		JRadioButton medium = new JRadioButton("Medium Size");
		JRadioButton large = new JRadioButton("Large Size");
		
		// ��ư �׷��� ���������� ������ ���� �����ϰ� ����
		// ���� ��ư�� ���� ������ �Ұ����� ������ �ޱ� ���� ������Ʈ�̹Ƿ�
		// �ʼ��� �׷����� ���������
		ButtonGroup sizeGroup = new ButtonGroup();
		sizeGroup.add(small);
		sizeGroup.add(medium);
		sizeGroup.add(large);
		
		sizePanel.add(small);
		sizePanel.add(medium);
		sizePanel.add(large);
		
		frame.add(sizePanel, "Center");
		
		// �ϴ� �г�
		JPanel resultPanel = new JPanel();
		JLabel text = new JLabel("ũ�Ⱑ ���õ��� �ʾҽ��ϴ�.");
		resultPanel.add(text);
		frame.add(resultPanel, "South");
		
		// medium size ��ư�� Ŭ�� �Ǿ��� ��
		medium.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("Medium Size�� ���õǾ����ϴ�.");
			}});
		
		// small size ��ư�� Ŭ�� �Ǿ��� ��
		small.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("Small Size�� ���õǾ����ϴ�.");
			}});
		
		// Large size ��ư�� Ŭ�� �Ǿ��� ��
		large.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("Large Size�� ���õǾ����ϴ�.");
			}});
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
