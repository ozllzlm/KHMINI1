package com.kh.chap03_component.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class B_TextArea {

	public void textAreaTest() {
		JFrame frame = new JFrame("textare �׽�Ʈ");
		
		// �Է¿� �ؽ�Ʈ �ʵ�
		JTextField tf = new JTextField(30);
		// ��¿� �ؽ�Ʈ ����
		JTextArea  ta = new JTextArea(10, 30);	
		
		// �ؽ�Ʈ �ʵ忡�� ����Ű�� ������ �� �̺�Ʈ
		tf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// �ؽ�Ʈ �ʵ忡 �Է� �� �� �˾ƿ���
				String text = tf.getText();
				// �ؽ�Ʈ ������ setText�� �ƴ� append�� �ش� �� �߰��ϱ�
				ta.append(text + "\n");
				// �ؽ�Ʈ �ʵ忡 �Է� �� �� �����
				tf.setText("");
				
			}});
		
		frame.add(tf, "North");
		frame.add(ta, "Center");
		
		// ������ ũ�⸦ �������� ������ �۰� ����
		// �������� ũ�⸦ ������Ʈ ��ġ�� ���߾ �ڵ� �����ϰ� ���� ��
		frame.pack();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
