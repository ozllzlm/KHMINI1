package com.kh.common;

import javax.swing.JPanel;

import com.kh.view.MainFrame;

public class ChangePanel {
	
	public static void changePanel(MainFrame mf, JPanel op, JPanel np) {
		// �����̳�(������)�� ���� �г�(old panel), �� �г�(new panel)�� �ּ� �Ű������� ���� ����
		
		mf.remove(op);		// old panel �����
		mf.add(np);			// new panel �ø���
		mf.revalidate();	// ���̾ƿ� �����ڿ��� �� ������ҷ� �缳�� �ϵ��� ��û (���Ӱ� �ö� ������Ʈ�� ���̰� �ϱ� ����)
		mf.repaint();		// ������� �ٽ� �׸����� ��
	}

}
