package com.kh.menu.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

public class MainPage{

	public void MainPage() {
		JFrame frame = new JFrame("�ֹ��ϱ�");

		frame.setBounds(200, 200, 1280, 720);

		// �г� ���� ����
		frame.setBackground(Color.LIGHT_GRAY);

		// null Layout ����
		frame.setLayout(null);

		// �ϴ� ���� �г�
		JPanel infor = new JPanel();
		JLabel text = new JLabel("���õ� ��ǰ�� �����ϴ�.");
		infor.setBackground(Color.white);
		infor.setLocation(30, 630);
		infor.setSize(1200, 30);
		infor.add(text);
		frame.add(infor);
		
		// �����޴�
		JPanel foodMenuT = new JPanel();
		foodMenuT.setLocation(30, 30);
		foodMenuT.setSize(600, 50);
		

		foodMenuT.setLayout(null);

		JButton btn1 = new JButton("���ڷ�");
		btn1.setLocation(107, 10);
		btn1.setSize(100, 40);
		JButton btn2 = new JButton("�Ļ��");
		btn2.setLocation(265, 10);
		btn2.setSize(100, 40);
		JButton btn3 = new JButton("�����");
		btn3.setLocation(422, 10);
		btn3.setSize(100, 40);

		foodMenuT.add(btn1);
		foodMenuT.add(btn2);
		foodMenuT.add(btn3);
		
		// ��ư Ŭ���� �����ϴ� �̺�Ʈ
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("���ڷ��� ���õǾ����ϴ�.");
			}
		});
		
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("�Ļ���� ���õǾ����ϴ�.");
			}
		});
		
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("������� ���õǾ����ϴ�.");
			}
		});

//		JTextField foodMenuM = new JTextField();
//		foodMenuM.setLocation(30, 100);
//		foodMenuM.setSize(815,520);

		// foodMenuM1 JPanel ����
		JPanel foodMenuM1 = new JPanel();
		foodMenuM1.setLocation(30, 100);
		foodMenuM1.setSize(160, 250);
		foodMenuM1.setBackground(Color.white);
		foodMenuM1.setLayout(null);
		// �̹��� ũ�� �����Ͽ� �̹��� ��ü ����
		Image icon1 = new ImageIcon("image/Swingchip.png").getImage().getScaledInstance(150, 150, 0);
		JLabel label1 = new JLabel(new ImageIcon(icon1));
		label1.setLocation(20, -10);
		label1.setSize(120, 200);
		foodMenuM1.add(label1);
		//�����̸�
		JTextField name1 = new JTextField("����Ĩ");
		name1.setLocation(30, 170);
		name1.setSize(50, 30);
		foodMenuM1.add(name1);
		// ����
		JTextField price1 = new JTextField("1500��");
		price1.setLocation(80, 170);
		price1.setSize(50, 30);
		foodMenuM1.add(price1);
		// JButton ����
		JButton button1 = new JButton("�ֹ��ϱ�");
		button1.setLocation(30, 200);
		button1.setSize(100, 30);
		foodMenuM1.add(button1);

		// foodMenuM2 JPanel ����
		JPanel foodMenuM2 = new JPanel();
		foodMenuM2.setLocation(194, 100);
		foodMenuM2.setSize(160, 250);
		foodMenuM2.setBackground(Color.white);
		foodMenuM2.setLayout(null);
		// �̹��� ũ�� �����Ͽ� �̹��� ��ü ����
		Image icon2 = new ImageIcon("image/������.png").getImage().getScaledInstance(150, 150, 0);
		JLabel label2 = new JLabel(new ImageIcon(icon2));
		label2.setLocation(20, -10);
		label2.setSize(120, 200);
		foodMenuM2.add(label2);
		// �����̸�
		JTextField name2 = new JTextField("������ ");
		name2.setLocation(30, 170);
		name2.setSize(50, 30);
		foodMenuM2.add(name2);
		// ����
		JTextField price2 = new JTextField("1500��");
		price2.setLocation(80, 170);
		price2.setSize(50, 30);
		foodMenuM2.add(price2);
		// JButton ����
		JButton button2 = new JButton("�ֹ��ϱ�");
		button2.setLocation(30, 200);
		button2.setSize(100, 30);
		foodMenuM2.add(button2);

		// foodMenuM3 JPanel ����
		JPanel foodMenuM3 = new JPanel();
		foodMenuM3.setLocation(358, 100);
		foodMenuM3.setSize(160, 250);
		foodMenuM3.setBackground(Color.white);
		foodMenuM3.setLayout(null);
		// �̹��� ũ�� �����Ͽ� �̹��� ��ü ����
		Image icon3 = new ImageIcon("image/���̸�.png").getImage().getScaledInstance(150, 150, 0);
		JLabel label3 = new JLabel(new ImageIcon(icon3));
		label3.setLocation(20, -10);
		label3.setSize(120, 200);
		foodMenuM3.add(label3);
		// �����̸�
		JTextField name3 = new JTextField("���̸�");
		name3.setLocation(30, 170);
		name3.setSize(50, 30);
		foodMenuM3.add(name3);
		// ����
		JTextField price3 = new JTextField("1500��");
		price3.setLocation(80, 170);
		price3.setSize(50, 30);
		foodMenuM3.add(price3);

		// JButton ����
		JButton button3 = new JButton("�ֹ��ϱ�");
		button3.setLocation(30, 200);
		button3.setSize(100, 30);
		foodMenuM3.add(button3);

		// foodMenuM4 JPanel ����
		JPanel foodMenuM4 = new JPanel();
		foodMenuM4.setLocation(522, 100);
		foodMenuM4.setSize(160, 250);
		foodMenuM4.setBackground(Color.white);
		foodMenuM4.setLayout(null);
		// �̹��� ũ�� �����Ͽ� �̹��� ��ü ����
		Image icon4 = new ImageIcon("image/�ܲʹ��.png").getImage().getScaledInstance(150, 150, 0);
		JLabel label4 = new JLabel(new ImageIcon(icon4));
		label4.setLocation(20, -10);
		label4.setSize(120, 200);
		foodMenuM4.add(label4);
		// �����̸�
		JTextField name4 = new JTextField("�ܲʹ��");
		name4.setLocation(30, 170);
		name4.setSize(50, 30);
		foodMenuM4.add(name4);
		// ����
		JTextField price4 = new JTextField("1500��");
		price4.setLocation(80, 170);
		price4.setSize(50, 30);
		foodMenuM4.add(price4);
		// JButton ����
		JButton button4 = new JButton("�ֹ��ϱ�");
		button4.setLocation(30, 200);
		button4.setSize(100, 30);
		foodMenuM4.add(button4);

		// foodMenuM5 JPanel ����
		JPanel foodMenuM5 = new JPanel();
		foodMenuM5.setLocation(685, 100);
		foodMenuM5.setSize(160, 250);
		foodMenuM5.setBackground(Color.white);
		foodMenuM5.setLayout(null);
		// �̹��� ũ�� �����Ͽ� �̹��� ��ü ����
		Image icon5 = new ImageIcon("image/���ٸ�.png").getImage().getScaledInstance(150, 150, 0);
		JLabel label5 = new JLabel(new ImageIcon(icon5));
		label5.setLocation(20, -10);
		label5.setSize(120, 200);
		foodMenuM5.add(label5);
		// �����̸�
		JTextField name5 = new JTextField("���ٸ�");
		name5.setLocation(30, 170);
		name5.setSize(50, 30);
		foodMenuM5.add(name5);
		// ����
		JTextField price5 = new JTextField("1500��");
		price5.setLocation(80, 170);
		price5.setSize(50, 30);
		foodMenuM5.add(price5);
		// JButton ����
		JButton button5 = new JButton("�ֹ��ϱ�");
		button5.setLocation(30, 200);
		button5.setSize(100, 30);
		foodMenuM5.add(button5);

		// foodMenuM6 JPanel ����
		JPanel foodMenuM6 = new JPanel();
		foodMenuM6.setLocation(30, 370);
		foodMenuM6.setSize(160, 250);
		foodMenuM6.setBackground(Color.white);
		foodMenuM6.setLayout(null);
		// �̹��� ũ�� �����Ͽ� �̹��� ��ü ����
		Image icon6 = new ImageIcon("image/��äŸ��.png").getImage().getScaledInstance(150, 150, 0);
		JLabel label6 = new JLabel(new ImageIcon(icon6));
		label6.setLocation(20, -10);
		label6.setSize(120, 200);
		foodMenuM6.add(label6);
		// �����̸�
		JTextField name6 = new JTextField("��äŸ��");
		name6.setLocation(30, 170);
		name6.setSize(50, 30);
		foodMenuM6.add(name6);
		// ����
		JTextField price6 = new JTextField("1500��");
		price6.setLocation(80, 170);
		price6.setSize(50, 30);
		foodMenuM6.add(price6);
		// JButton ����
		JButton button6 = new JButton("�ֹ��ϱ�");
		button6.setLocation(30, 200);
		button6.setSize(100, 30);
		foodMenuM6.add(button6);

		// foodMenuM7 JPanel ����
		JPanel foodMenuM7 = new JPanel();
		foodMenuM7.setLocation(194, 370);
		foodMenuM7.setSize(160, 250);
		foodMenuM7.setBackground(Color.white);
		foodMenuM7.setLayout(null);
		// �̹��� ũ�� �����Ͽ� �̹��� ��ü ����
		Image icon7 = new ImageIcon("image/�����ð�.png").getImage().getScaledInstance(150, 100, 0);
		JLabel label7 = new JLabel(new ImageIcon(icon7));
		label7.setLocation(20, 30);
		label7.setSize(120, 100);
		foodMenuM7.add(label7);
		// �����̸�
		JTextField name7 = new JTextField("�����ð�");
		name7.setLocation(30, 170);
		name7.setSize(50, 30);
		foodMenuM7.add(name7);
		// ����
		JTextField price7 = new JTextField("1500��");
		price7.setLocation(80, 170);
		price7.setSize(50, 30);
		foodMenuM7.add(price7);
		// JButton ����
		JButton button7 = new JButton("�ֹ��ϱ�");
		button7.setLocation(30, 200);
		button7.setSize(100, 30);
		foodMenuM7.add(button7);

		// foodMenuM8 JPanel ����
		JPanel foodMenuM8 = new JPanel();
		foodMenuM8.setLocation(358, 370);
		foodMenuM8.setSize(160, 250);
		foodMenuM8.setBackground(Color.white);
		foodMenuM8.setLayout(null);
		// �̹��� ũ�� �����Ͽ� �̹��� ��ü ����
		Image icon8 = new ImageIcon("image/���ڼ���.png").getImage().getScaledInstance(150, 150, 0);
		JLabel label8 = new JLabel(new ImageIcon(icon8));
		label8.setLocation(20, -10);
		label8.setSize(120, 200);
		foodMenuM8.add(label8);
		// �����̸�
		JTextField name8 = new JTextField("���ڼ���");
		name8.setLocation(30, 170);
		name8.setSize(50, 30);
		foodMenuM8.add(name8);
		// ����
		JTextField price8 = new JTextField("1500��");
		price8.setLocation(80, 170);
		price8.setSize(50, 30);
		foodMenuM8.add(price8);
		// JButton ����
		JButton button8 = new JButton("�ֹ��ϱ�");
		button8.setLocation(30, 200);
		button8.setSize(100, 30);
		foodMenuM8.add(button8);

		// foodMenuM9 JPanel ����
		JPanel foodMenuM9 = new JPanel();
		foodMenuM9.setLocation(522, 370);
		foodMenuM9.setSize(160, 250);
		foodMenuM9.setBackground(Color.white);
		foodMenuM9.setLayout(null);
		// �̹��� ũ�� �����Ͽ� �̹��� ��ü ����
		Image icon9 = new ImageIcon("image/ĭ��.png").getImage().getScaledInstance(150, 150, 0);
		JLabel label9 = new JLabel(new ImageIcon(icon9));
		label9.setLocation(20, -10);
		label9.setSize(120, 200);
		foodMenuM9.add(label9);
		// �����̸�
		JTextField name9 = new JTextField("ĭ��");
		name9.setLocation(30, 170);
		name9.setSize(50, 30);
		foodMenuM9.add(name9);
		// ����
		JTextField price9 = new JTextField("1500��");
		price9.setLocation(80, 170);
		price9.setSize(50, 30);
		foodMenuM9.add(price9);
		// JButton ����
		JButton button9 = new JButton("�ֹ��ϱ�");
		button9.setLocation(30, 200);
		button9.setSize(100, 30);
		foodMenuM9.add(button9);

		// foodMenuM10 JPanel ����
		JPanel foodMenuM10 = new JPanel();
		foodMenuM10.setLocation(685, 370);
		foodMenuM10.setSize(160, 250);
		foodMenuM10.setBackground(Color.white);
		foodMenuM10.setLayout(null);
		// �̹��� ũ�� �����Ͽ� �̹��� ��ü ����
		Image icon10 = new ImageIcon("image/Ȩ����.png").getImage().getScaledInstance(150, 150, 0);
		JLabel label10 = new JLabel(new ImageIcon(icon10));
		label10.setLocation(20, -10);
		label10.setSize(120, 200);
		foodMenuM10.add(label10);
		// �����̸�
		JTextField name10 = new JTextField("Ȩ����");
		name10.setLocation(30, 170);
		name10.setSize(50, 30);
		foodMenuM10.add(name10);
		// ����
		JTextField price10 = new JTextField("1500��");
		price10.setLocation(80, 170);
		price10.setSize(50, 30);
		foodMenuM10.add(price10);
		// JButton ����
		JButton button10 = new JButton("�ֹ��ϱ�");
		button10.setLocation(30, 200);
		button10.setSize(100, 30);
		foodMenuM10.add(button10);

		JTextField foodSearch = new JTextField();
		foodSearch.setLocation(645, 30);
		foodSearch.setSize(200, 50);

//		JTextField order = new JTextField();
//		order.setLocation(860, 30);
//		order.setSize(370,270);

		JButton orderT = new JButton("�ֹ�����");
		orderT.setLocation(860, 30);
		orderT.setSize(370, 50);

		JPanel orderM = new JPanel();
		orderM.setLocation(860, 85);
		orderM.setSize(370, 250);
		orderM.setBackground(Color.white);
		frame.add(orderM);

		button1.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				JLabel jls1 = new JLabel();
				JLabel jlp1 = new JLabel();
				SpinnerNumberModel numberModel1 = new SpinnerNumberModel(1, 0, 9, 1);	
				JSpinner spinner1 = new JSpinner(numberModel1);
				jls1.setText(name1.getText());
				jls1.setPreferredSize(new Dimension(100, 30));
				jlp1.setText(price1.getText());
				jlp1.setPreferredSize(new Dimension(100, 30));
				spinner1.setPreferredSize(new Dimension(80, 30));
				orderM.add(jls1);
				orderM.add(jlp1);
				orderM.add(spinner1);
				orderM.revalidate();
				orderM.repaint();
				button1.setEnabled(false);
			}		
		});
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JLabel jls2 = new JLabel();
				JLabel jlp2 = new JLabel();
				SpinnerNumberModel numberModel2 = new SpinnerNumberModel(1, 0, 9, 1);	
				JSpinner spinner2 = new JSpinner(numberModel2);
				jls2.setText(name2.getText());
				jls2.setPreferredSize(new Dimension(100, 30));
				jlp2.setText(price2.getText());
				jlp2.setPreferredSize(new Dimension(100, 30));
				spinner2.setPreferredSize(new Dimension(80, 30));
				orderM.add(jls2);
				orderM.add(jlp2);
				orderM.add(spinner2);
				orderM.revalidate();
				orderM.repaint();
				button2.setEnabled(false);
			}		
		});
		
		button3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JLabel jls3 = new JLabel();
				JLabel jlp3 = new JLabel();
				SpinnerNumberModel numberModel3 = new SpinnerNumberModel(1, 0, 9, 1);	
				JSpinner spinner3 = new JSpinner(numberModel3);
				jls3.setText(name3.getText());
				jls3.setPreferredSize(new Dimension(100, 30));
				jlp3.setText(price3.getText());
				jlp3.setPreferredSize(new Dimension(100, 30));
				spinner3.setPreferredSize(new Dimension(80, 30));
				orderM.add(jls3);
				orderM.add(jlp3);
				orderM.add(spinner3);
				orderM.revalidate();
				orderM.repaint();
				button3.setEnabled(false);
			}		
		});
		
	button4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JLabel jls4 = new JLabel();
				JLabel jlp4 = new JLabel();
				SpinnerNumberModel numberModel4 = new SpinnerNumberModel(1, 0, 9, 1);	
				JSpinner spinner4 = new JSpinner(numberModel4);
				jls4.setText(name4.getText());
				jls4.setPreferredSize(new Dimension(100, 30));
				jlp4.setText(price4.getText());
				jlp4.setPreferredSize(new Dimension(100, 30));
				spinner4.setPreferredSize(new Dimension(80, 30));
				orderM.add(jls4);
				orderM.add(jlp4);
				orderM.add(spinner4);
				orderM.revalidate();
				orderM.repaint();
				button4.setEnabled(false);
			}		
		});
	button5.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			JLabel jls5 = new JLabel();
			JLabel jlp5 = new JLabel();
			SpinnerNumberModel numberModel5 = new SpinnerNumberModel(1, 0, 9, 1);	
			JSpinner spinner5 = new JSpinner(numberModel5);
			jls5.setText(name5.getText());
			jls5.setPreferredSize(new Dimension(100, 30));
			jlp5.setText(price5.getText());
			jlp5.setPreferredSize(new Dimension(100, 30));
			spinner5.setPreferredSize(new Dimension(80, 30));
			orderM.add(jls5);
			orderM.add(jlp5);
			orderM.add(spinner5);
			orderM.revalidate();
			orderM.repaint();
			button5.setEnabled(false);
		}		
	});
	
		
		

		
		

		JTextField orderB1 = new JTextField("�� �ֹ��ݾ�");
		orderB1.setLocation(860, 340);
		orderB1.setSize(250, 50);

		JTextField orderB2 = new JTextField("~��");
		orderB2.setLocation(1115, 340);
		orderB2.setSize(115, 50);

//		JTextField bill = new JTextField();
//		bill.setLocation(860, 320);
//		bill.setSize(370,180);

		JButton billInfor = new JButton("��������");
		billInfor.setLocation(860, 400);
		billInfor.setSize(370, 50);

		JButton billCash = new JButton("����");
		billCash.setLocation(860, 455);
		billCash.setSize(110, 50);

		JButton billCard = new JButton("ī��");
		billCard.setLocation(990, 455);
		billCard.setSize(110, 50);

		JButton billKakao = new JButton("īī������");
		billKakao.setLocation(1120, 455);
		billKakao.setSize(110, 50);

		JTextField call = new JTextField("��û������ 50�� �̳��� �ۼ����ּ���");
		call.setLocation(860, 515);
		call.setSize(370, 30);

		JButton pay = new JButton("�ֹ��ϱ�");
		pay.setBackground(Color.yellow);
		pay.setLocation(860, 560);
		pay.setSize(370, 60);

		frame.add(foodMenuT);
		// mf.add(foodMenuM);
		frame.add(foodMenuM1);
		frame.add(foodMenuM2);
		frame.add(foodMenuM3);
		frame.add(foodMenuM4);
		frame.add(foodMenuM5);
		frame.add(foodMenuM6);
		frame.add(foodMenuM7);
		frame.add(foodMenuM8);
		frame.add(foodMenuM9);
		frame.add(foodMenuM10);
		frame.add(foodSearch);
		// mf.add(order);
		frame.add(orderT);
		
		frame.add(orderB1);
		frame.add(orderB2);
		// mf.add(bill);
		frame.add(billInfor);
		frame.add(billCash);
		frame.add(billCard);
		frame.add(billKakao);
		frame.add(call);
		frame.add(pay);
		
	
		
		// �ݵ�� �ʿ��� �ڵ�
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}



}


