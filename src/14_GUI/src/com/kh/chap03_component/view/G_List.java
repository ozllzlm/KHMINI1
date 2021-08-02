package com.kh.chap03_component.view;

import java.awt.Dimension;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class G_List {

	public void listTest() {
		JFrame frame = new JFrame("List Test");
		frame.setSize(300, 200);
		
		// JPanel ����
		JPanel listPanel = new JPanel();
		
		// ����ũ�� ������ �ٿ� ����
		String[] cities = {"����", "����", "�뱸", "�λ�", "���", "��õ", "����", "����"};
		// JList ����(�����ڷ� String �迭 ����)
		JList<String> list = new JList<>(cities);
		
		// ����Ʈ ���� ��带 �ƹ��͵� �������� ������ ��������
		// ���� ��� 1. ���� ���� ���
		// list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		// ���� ��� 2. ���� ���� ���(1)
		//                    ��, ������ ����Ʈ�� ���� ����
		// list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		
		// ���� ��� 3. ���� ���� ���(2)
		//                    ���� ���� ���� ����Ʈ�� ���� ����
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		// ����Ʈ�� ��ũ�ѹ� �߰�
		JScrollPane scroller = new JScrollPane(list);
		// Dimension : ũ�⸦ �������� ���� Ŭ����
		// ��ũ�� �г��� ����� ���� Dimenson Ÿ���� ��ü�� ���ڷ� �־���� ��
		scroller.setPreferredSize(new Dimension(200,100));
		
		// listPanel�� scroller �߰�
		listPanel.add(scroller);
		
		// ��� ��Ÿ�� resultPanel ����
		JPanel resultPanel = new JPanel();
		JLabel label = new JLabel("���� �� �׸� : ");
		JTextField selected = new JTextField(10);
		selected.setEditable(false);
		resultPanel.add(label);
		resultPanel.add(selected);
		
		// ����Ʈ ���� �� �߻��ϴ� �̺�Ʈ
		list.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				// 1. ���� ���� ����� ���
				// elected.setText(list.getSelectedValue());
				// 2. ���� ���� ��� �� ���
				List<String> li = list.getSelectedValuesList();
				String result = "";
				for(int i = 0; i < li.size(); i++) {
					result += li.get(i) + " ";
				}
				selected.setText(result);
			}});
		
		
		// �����ӿ� �г� ����
		frame.add(listPanel, "North");
		frame.add(resultPanel, "Center");
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
