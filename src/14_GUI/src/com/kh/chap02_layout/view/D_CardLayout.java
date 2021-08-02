package com.kh.chap02_layout.view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class D_CardLayout extends JFrame{
	
	public D_CardLayout() {
		super("CardLayout");
		this.setBounds(300, 200, 800, 500);
		
		// CardLayout
		// Panel�� �̿��ؼ� ī������ ����� ���� ����
		// �̺�Ʈ�� �̿��ؼ� �ٸ� ���� ���̰� �����ؾ� ��
		CardLayout card = new CardLayout();
		this.setLayout(card);
		
		// �г� ����
		// �г��� �������������� �ٸ� ������Ʈ�� ������ �� �ִ� �����̳��� ������ ����
		JPanel card1 = new JPanel();
		JPanel card2 = new JPanel();
		JPanel card3 = new JPanel();
		
		// �гθ��� ���� ����
		card1.setBackground(Color.GRAY);
		card2.setBackground(Color.yellow);
		card3.setBackground(new Color(50, 100, 100));
		
		// �гο� �� �߰�
		card1.add(new JLabel("Card1"));
		card2.add(new JLabel("Card2"));
		card3.add(new JLabel("Card3"));
		
		// ���� �����ӿ� �г� �߰�
		this.add(card1);
		this.add(card2);
		this.add(card3);
		
		// �гο� �̺�Ʈ �߰�
		card1.addMouseListener(new MouseAdapter( ) {
			// card1 �гο� ���콺 Ŭ�� �̺�Ʈ�� �Ͼ �� ������ �ڵ� �ۼ�
			@Override
			public void mouseClicked(MouseEvent e) {
				// ���� ��ư1, ��2, ������ ��ư3
				System.out.println(e.getButton());
				// ���� ��ư�� Ŭ�� �Ǿ��� �� ī�� ���̾ƿ��� ���� ī��� ����
				if(e.getButton() == MouseEvent.BUTTON1) {
					card.next(card1.getParent());
					// ������ ��ư�� Ŭ�� �Ǿ����� ī�� ���̾ƿ��� ���� ī��� ����
				} else if(e.getButton() == MouseEvent.BUTTON3) {
					card.previous(card1.getParent());
				}
			}
		});
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}

}
