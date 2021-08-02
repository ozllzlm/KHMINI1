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
		
		// ���ǳ� �ø� �г� ����/ ��� ��� �г� ����
		JPanel panel = new JPanel();
		JPanel resultPanel = new JPanel();
		
		// 1. ListModel : ���� �������� ���ڿ� �迭��
		String[] items = {"�Ҽ�", "����", "��������", "���"};
		SpinnerListModel listModel = new SpinnerListModel(items);
		JSpinner spinner1 = new JSpinner(listModel);
		panel.add(spinner1);
		
		// 2. NumberModel : ����
		// �����ڿ� (���۰�, �ּҰ�, �ִ밪, ������) ����
		SpinnerNumberModel numberModel = new SpinnerNumberModel(1, 0, 9, 1);	
		JSpinner spinner2 = new JSpinner(numberModel);
		panel.add(spinner2);
		
		// 3. DateModel : ��¥
	   Calendar calendar = Calendar.getInstance();
	   Date today = calendar.getTime();		// ���糯¥
	   
	   calendar.add(Calendar.YEAR, -50);
	   Date start = calendar.getTime();		// ���� ��¥���� 50�� ������ ��¥
	   
	   calendar.add(Calendar.YEAR, 100);	// ���� ��¥���� 50�� ������ ��¥
	   Date end = calendar.getTime();			// �ش� ��ü ���� ���� -50 �̿��� +100 ó��
	   
	   SpinnerDateModel dateModel = new SpinnerDateModel(today, start, end, Calendar.YEAR);
	   JSpinner spinner3 = new JSpinner(dateModel);
	   spinner3.setEditor(new JSpinner.DateEditor(spinner3, "yyyy/MM/dd"));
	   panel.add(spinner3);
	   
	   // ��ư ����
	   JButton button = new JButton("����");
	  panel.add(button);
	  
	  // resultPanel�� ���� JLabel ��ü ����
	  JLabel text= new JLabel();
	  resultPanel.add(text);
	  
	  // ��ư Ŭ���� �����ϴ� �̺�Ʈ
	  button.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// �� ���ǳ��� ���� ���� �����ͼ� ���� setText
			text.setText(spinner1.getValue()+ ", " + spinner2.getValue() + ", "
					+ spinner3.getValue());
		}});
	   
		// �����ӿ� �г� �ø���
		frame.add(panel, "North");
		frame.add(resultPanel, "Center");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
