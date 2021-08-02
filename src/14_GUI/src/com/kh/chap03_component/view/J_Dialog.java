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
		
		// ���̾�α� ���� �� �־ ����
		JDialog dialog = new JDialog(frame, "���ο� â �̸�");
		dialog.setBounds(150, 250, 200, 200);
		
		// button1 Ŭ�� �� dialog ���̰� ó��
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
			}
			
		});
		
		// dialog�� �ݱ� ��ư �����Ͽ� �ø�
		JButton button2 = new JButton("close");
		dialog.add(button2);
		
		// button2Ŭ�� �� dialog ����
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.dispose();
			}});
		
		// �гο� ��ư �ϳ� �� �ø�
		JButton button3 = new JButton("Input Dialog");
		panel.add(button3);
		
		button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 1. �Է� ���̾�α�
				// String result = JOptionPane.showInputDialog("������ �Է��ϼ���");
				// System.out.println(result);
				// ��� ��ư�̳� �Է� ���� ������ null ����, Ȯ�� ������ �Է� �� ����

				// 2. Ȯ�� ���̾�α�
				// int result =
				//      JOptionPane.showConfirmDialog(null, "Ȯ���Ͻðڽ��ϱ�?", "Ȯ�� â",
				// JOptionPane.YES_NO_OPTION);
				// int result =
				//      JOptionPane.showConfirmDialog(null, "Ȯ���Ͻðڽ��ϱ�?", "Ȯ�� â",
				// JOptionPane.YES_NO_CANCEL_OPTION);
				// System.out.println(result);
				
				// 3. �޼��� ���̾�α�
				JOptionPane.showMessageDialog(null, "�����մϴ�", "danger", JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "�����մϴ�", "danger", JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null, "�����մϴ�", "danger", JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showMessageDialog(null, "�����մϴ�", "danger", JOptionPane.QUESTION_MESSAGE);
				JOptionPane.showMessageDialog(null, "�����մϴ�", "danger", JOptionPane.WARNING_MESSAGE);
			}
		});
		
		frame.add(panel);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
