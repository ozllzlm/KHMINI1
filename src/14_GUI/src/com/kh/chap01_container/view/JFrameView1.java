package com.kh.chap01_container.view;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

// JFrame �����ϱ�1
// javax.swing.JFrame Ŭ������ ��� �޾� �����ڿ��� �����ӿ� ���� ����
public class JFrameView1 extends JFrame{
	
	// �⺻ ������ �ȿ� ������ �⺻ ���� �����ϱ�
	public JFrameView1() {
		// ������ ��ġ ���� (x, y)
		this.setLocation(300, 200);
		// ������ ũ�� ����(width, height)
		this.setSize(800, 500);
		// ������ ��ġ�� ũ�� �ѹ��� ���� (x, y, width, height)
		this.setBounds(300, 200 , 800, 500);
		
		// ������ ��ܿ� �̸� ����
		this.setTitle("MyFrame");
		
		// ������ ��ܿ� �ΰ� �̹��� ����
		try {
			this.setIconImage(ImageIO.read(new File("image/icon.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// �⺻ ������ ������ ������ ������ Ȱ��ȭ �Ǿ� �����Ƿ� ������ ���� �Ұ����ϰ� ����
		this.setResizable(false);

		
		
		
		
		// â���� X ��ư�� ������ ���Ḧ �ص� ���μ����� ��� ���� ��
		// �ݱ� ��ư�� ������ �� ���μ��� ���� ���Ḧ ���� ���� �߰�
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ȭ���� �������� ����� ���ؼ��� �ݵ�� setVisible(true) ȣ�� �ʿ�
		// ������ ���� �ö� ������Ʈ���� �� ���̷��� �������� ȣ��
		this.setVisible(true);
	}

}
