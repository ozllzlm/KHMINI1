package com.kh.chap01_container.view;

import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

// JFrame �����ϱ�2
// javax.swing.JFrame Ŭ������ ��ü�� ���� ��
// �ش� ������ ��ü�� ���� ���� �����ϴ� ���
public class JTrameView2 {

	public void showJFrame() {
		// JFrame mainFrame = new JFrame();
		// mainFrame.setTitle("MyFrame");
		
		// �Ű����� �����ڷ� title �����ϸ鼭 JFrame ��ü ����
		JFrame mainFrame = new JFrame("MyFrame");
		
		// ��ġ�� ������ ����
		// Rectangle ��ü�� Ȱ�� (x, y, width, height)
		Rectangle r = new Rectangle(300, 200, 800, 500);
		mainFrame.setBounds(r);
		
		// ������ ���� �Ұ�
		mainFrame.setResizable(false);
		
		// ������ �̹��� ����
		try {
			mainFrame.setIconImage(ImageIO.read(new File("image/icon.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);
	}

}
