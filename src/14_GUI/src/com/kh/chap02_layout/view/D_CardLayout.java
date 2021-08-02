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
		// Panel을 이용해서 카드판을 만들어 겹쳐 놓음
		// 이벤트를 이용해서 다른 판이 보이게 설정해야 함
		CardLayout card = new CardLayout();
		this.setLayout(card);
		
		// 패널 생성
		// 패널은 컴포넌츠이지만 다른 컴포넌트를 포함할 수 있는 컨데이너의 성격을 지님
		JPanel card1 = new JPanel();
		JPanel card2 = new JPanel();
		JPanel card3 = new JPanel();
		
		// 패널마다 배경색 지정
		card1.setBackground(Color.GRAY);
		card2.setBackground(Color.yellow);
		card3.setBackground(new Color(50, 100, 100));
		
		// 패널에 라벨 추가
		card1.add(new JLabel("Card1"));
		card2.add(new JLabel("Card2"));
		card3.add(new JLabel("Card3"));
		
		// 메인 프레임에 패널 추가
		this.add(card1);
		this.add(card2);
		this.add(card3);
		
		// 패널에 이벤트 추가
		card1.addMouseListener(new MouseAdapter( ) {
			// card1 패널에 마우스 클릭 이벤트가 일어날 때 수행할 코드 작성
			@Override
			public void mouseClicked(MouseEvent e) {
				// 왼쪽 버튼1, 휠2, 오른쪽 버튼3
				System.out.println(e.getButton());
				// 왼쪽 버튼이 클릭 되었을 때 카드 레이아웃의 다음 카드로 변경
				if(e.getButton() == MouseEvent.BUTTON1) {
					card.next(card1.getParent());
					// 오른쪽 버튼이 클릭 되었을때 카드 레이아웃의 이전 카드로 변경
				} else if(e.getButton() == MouseEvent.BUTTON3) {
					card.previous(card1.getParent());
				}
			}
		});
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}

}
