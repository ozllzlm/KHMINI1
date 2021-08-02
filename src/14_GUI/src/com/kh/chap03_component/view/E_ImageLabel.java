package com.kh.chap03_component.view;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class E_ImageLabel {

	public void imageLabelTest() {
		JFrame frame = new JFrame();
		frame.setSize(250, 300);
		
		// JPanel ����
		JPanel panel  = new JPanel();
		// �̹��� ũ�� �����Ͽ� �̹��� ��ü ����
		Image icon = new ImageIcon("image/user.PNG").getImage().getScaledInstance(150, 150, 0);
		// JLabel �����Ͽ� Image ����
		JLabel label = new JLabel(new ImageIcon(icon));
		panel.add(label);
		// JButton ����
		JButton button = new JButton("�̹��� ����");
		panel.add(button);
		
		// ��ư Ŭ�� �� �����ϴ� �̺�Ʈ
		button.addActionListener(new ActionListener() {
			int count = 0;

			@Override
			public void actionPerformed(ActionEvent e) {
				String filePath = "";
				if(count % 2 ==0) {
					filePath = "image/dog.PNG";
				} else {
					filePath = "image/user.PNG";
				}
				count++;
				
				Image icon = new ImageIcon(filePath).getImage().getScaledInstance(150, 150, 0);
				label.setIcon(new ImageIcon(icon));
			}
			
		});
	
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
