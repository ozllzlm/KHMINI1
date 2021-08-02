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
		
		// 콤보 박스 메뉴 목록을 문자열 배열로 만들고 생성자에 매개변수로 전달
		String[] animals = {"dog", "cat", "tiger"};
		JComboBox animalList = new JComboBox(animals);	
		
		// 처음 선택 되어 있을 값을 지정
		animalList.setSelectedIndex(2);
		
		// 이미지가 올라갈 JLabel 생성
		JLabel label = new JLabel();
		
		// 라벨 가운데 기준으로 수평 정렬
		label.setHorizontalAlignment(JLabel.CENTER);
		
		// 콤보 박스 선택이 일어날 때
		animalList.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// System.out.println(e.getSource());
				// 이벤트 발생지
				JComboBox cb = (JComboBox) e.getSource();
				// 선택 된 아이템이 무엇인지 알아옴
				String name = (String)cb.getSelectedItem();
				// 선택 된 아이템에 해당하는 사진을 사이즈 조정하여 label에 설정
				Image img = 
				new ImageIcon("image/" + name + ".PNG").getImage().getScaledInstance(150, 150, 0);
				label.setIcon(new ImageIcon(img));
			}});
		
		
		// 프레임에 컴포넌트 직접 부착
		frame.add(animalList, "North");
		frame.add(label, "South");
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
