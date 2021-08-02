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
		
		// JPanel 생성
		JPanel listPanel = new JPanel();
		
		// 리스크를 구성할 바열 생성
		String[] cities = {"서울", "대전", "대구", "부산", "경기", "인천", "강원", "제주"};
		// JList 생성(생성자로 String 배열 전달)
		JList<String> list = new JList<>(cities);
		
		// 리스트 선택 모드를 아무것도 설정하지 않으면 복수선택
		// 선택 모드 1. 단일 선택 모드
		// list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		// 선택 모드 2. 복수 선택 모드(1)
		//                    단, 인접한 리스트만 선택 가능
		// list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		
		// 선택 모드 3. 복수 선택 모드(2)
		//                    인점 하지 않은 리스트도 선택 가능
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		// 리스트에 스크롤바 추가
		JScrollPane scroller = new JScrollPane(list);
		// Dimension : 크기를 지정하지 위한 클래스
		// 스크롤 패널의 사이즈를 위해 Dimenson 타입의 객체를 인자로 넣어줘야 함
		scroller.setPreferredSize(new Dimension(200,100));
		
		// listPanel에 scroller 추가
		listPanel.add(scroller);
		
		// 결과 나타낸 resultPanel 생성
		JPanel resultPanel = new JPanel();
		JLabel label = new JLabel("선택 된 항목 : ");
		JTextField selected = new JTextField(10);
		selected.setEditable(false);
		resultPanel.add(label);
		resultPanel.add(selected);
		
		// 리스트 선택 시 발생하는 이벤트
		list.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				// 1. 단일 선택 모드일 경우
				// elected.setText(list.getSelectedValue());
				// 2. 복수 선택 모드 일 경우
				List<String> li = list.getSelectedValuesList();
				String result = "";
				for(int i = 0; i < li.size(); i++) {
					result += li.get(i) + " ";
				}
				selected.setText(result);
			}});
		
		
		// 프레임에 패널 부착
		frame.add(listPanel, "North");
		frame.add(resultPanel, "Center");
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
