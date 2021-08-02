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
		
		// JPanel ����
		JPanel checkPanel = new JPanel();
		JPanel resultPanel = new JPanel();
		
		// checkbox ��ü�� ���� �� ����ϹǷ� �迭�� �����Ͽ� ����
		JCheckBox[] buttons = new JCheckBox[3];
		String[] fruits = {"apple", "banana", "orange"};
		
		// ���ڿ� �����ϸ鼭 checkbox ��ü ���� �� �ٷ� ���� ���� �ø�
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JCheckBox(fruits[i]);
			checkPanel.add(buttons[i]);
		}
		
		// ��� ���� JLabel �����ؼ� �гο� ����
		JLabel text = new JLabel("������ ������ �����ϴ�.");
		resultPanel.add(text);
		
		// ���� ���� üũ �ڽ��� ������� �̺�Ʈ�� �ۼ��ؾ� �ϹǷ� �ݺ��� ���
		for(int i = 0 ; i < buttons.length; i++) {
			// �׸��� ���� �Ǵ� ���� �Ǿ����� ��Ÿ���� ItemEvent�� ������
			buttons[i].addItemListener(new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent e) {
					// üũ�� �Ǿ� �ִ� üũ �ڽ��� ��� Ȯ���Ͽ�
					// ���ڿ��� ���� �����ϰ� �󺧿� �� ����� �����Ѵ�
					String result = "";
					for(int i = 0; i < buttons.length; i++) {
						// üũ�ڽ��� ���� �Ǿ����� Ȯ��
						if(buttons[i].isSelected()) {
							// üũ�ڽ��� ���� �� ��� ���ڿ��� result�� ����
							result += buttons[i].getText() + " ";
						}
					}
					// resultPanel�� JLabel�� �� ����
					if(result.equals(""))
						text.setText("������ ������ �����ϴ�");
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
