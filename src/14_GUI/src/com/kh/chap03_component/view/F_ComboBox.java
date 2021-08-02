package com.kh.chap03_component.view;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class F_ComboBox {
	
	public void comboBoxTest() {
		JFrame frame = new JFrame("comboBox Text");
		frame.setSize(300, 200);
		
		// �޺� �ڽ� �޴� ����� ���ڿ� �迭�� ����� �����ڿ� �Ű������� ����
		String[] animals = {"dog", "cat", "tiger"};
		JComboBox animalList = new JComboBox(animals);	
		
		// ó�� ���� �Ǿ� ���� ���� ����
		animalList.setSelectedIndex(2);
		
		// �̹����� �ö� JLabel ����
		JLabel label = new JLabel();
		
		// �� ��� �������� ���� ����
		label.setHorizontalAlignment(JLabel.CENTER);
		
		// �޺� �ڽ� ������ �Ͼ ��
		animalList.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// System.out.println(e.getSource());
				// �̺�Ʈ �߻���
				JComboBox cb = (JComboBox) e.getSource();
				// ���� �� �������� �������� �˾ƿ�
				String name = (String)cb.getSelectedItem();
				// ���� �� �����ۿ� �ش��ϴ� ������ ������ �����Ͽ� label�� ����
				Image img = 
				new ImageIcon("image/" + name + ".PNG").getImage().getScaledInstance(150, 150, 0);
				label.setIcon(new ImageIcon(img));
			}});
		
		
		// �����ӿ� ������Ʈ ���� ����
		frame.add(animalList, "North");
		frame.add(label, "South");
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
