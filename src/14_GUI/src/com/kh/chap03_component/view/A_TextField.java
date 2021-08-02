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
		JFrame frame = new JFrame("���� ����ϱ�");
		frame.setSize(300, 130);
		
		// �г� ����
		JPanel panel = new JPanel();
		// �� �гο� ����
		panel.add(new JLabel("���� �Է� : "));
		// �ؽ�Ʈ �ʵ� ����
		JTextField text = new JTextField(15);
		panel.add(text);
		// �� �гο� ����
		panel.add(new JLabel("������ �� : "));
		// ��� �ؽ�Ʈ �ʵ� ����
		JTextField result = new JTextField(15);
		result.setEditable(false);
		panel.add(result);
		//��ư ���� �� �гο� ����
		JButton btn = new JButton("OK");
		panel.add(btn);
		
		// ��ư Ŭ�� �� �߻��ϴ� �̺�Ʈ ����
		/* ActionEvent : ����ڰ� � ������ �� �� �߻��ϸ� ��� ������Ʈ���� �߻������� ����
		 * 1. ��ư�� �������� ��
		 * 2. �޴��� Ŭ������ ��
		 * 3. �ؽ�Ʈ �ʵ忡�� ����Ű�� ������ ��
		 */
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// Ŭ�� �� text�� ��� �� �� �������� (���ڿ� �Ľ� ó��)
				int value = Integer.parseInt(text.getText());
				// result�� ���� �� �Է��ϱ�
				result.setText(value * value + "");
				// �ؽ�Ʈ ���ڷ� �ٽ� ��Ŀ�� ��������
				text.requestFocus();
			}});
		
		frame.add(panel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	

}
