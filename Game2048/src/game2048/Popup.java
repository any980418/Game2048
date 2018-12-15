package game2048;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Popup extends JPanel {

	public static JPanel resetpopup, mainpopup, gameover;
	public static JLabel mainlbl, resetlbl, finalscore, overlbl, retry;
	public static ImageIcon	imgYes1, imgYes2, imgNo1, imgNo2;
	
	protected JButton btnYes, btnNo;
	
	public Popup() {
		setBackground(Color.white);
		setLayout(null);
	}

	public Popup(String str) {
		
		setBackground(Color.white);
		setLayout(null);
		
		imgYes1 = new ImageIcon("Image/yesButton.png");
		imgYes2 = new ImageIcon("Image/clickedYes.png");
		
		imgNo1 = new ImageIcon("Image/noButton.png");
		imgNo2 = new ImageIcon("Image/clickedNo.png");
		
		/*
		 * ��ư ���� �޼ҵ�
		 setPressedIcon(new ImageIcon("���� ���")); //��ư�� ���� ������ �� ��µǴ� �̹��� ����
		 setContentAreaFilled(false);	//ä��� ����
		 setBorderPainted(false);		//�ܰ��� ���ֱ�
		 setFocusPainted(false);		//���õ� �� �۾� �׵θ� ����
		*/
		
		btnYes = new JButton(imgYes1);
		btnYes.setPressedIcon(imgYes2);
		btnYes.setBounds(50,80,75,35);
		btnYes.setContentAreaFilled(false);
		btnYes.setBorderPainted(false);
		btnYes.setFocusPainted(false);
		add(btnYes);
		
		btnNo = new JButton(imgNo1);
		btnNo.setPressedIcon(imgNo2);
		btnNo.setBounds(175,80,75,35);
		btnNo.setContentAreaFilled(false);
		btnNo.setBorderPainted(false);
		btnNo.setFocusPainted(false);
		add(btnNo);
		
		//���ڿ� ��
		//str.equals("���ڿ�");
		
		if (str.equals("reset")) {
			
			resetlbl = new JLabel("�����Ͻðڽ��ϱ�?");
			resetlbl.setBounds(50,35,200,35);
			resetlbl.setFont(new Font("����",Font.BOLD,15));
			resetlbl.setHorizontalAlignment(SwingConstants.CENTER);
			add(resetlbl);
		}
		
		else if (str.equals("main")) {
			
			mainlbl = new JLabel("�������� ���ư��ðڽ��ϱ�?");
			mainlbl.setBounds(50,35,200,35);
			mainlbl.setFont(new Font("����",Font.BOLD,15));
			mainlbl.setHorizontalAlignment(SwingConstants.CENTER);
			add(mainlbl);
		}
		
		else if (str.equals("gameover")) {
			
			overlbl = new JLabel("���� ����!");
			overlbl.setBounds(50,7,200,30);
			overlbl.setForeground(Color.red);
			overlbl.setFont(new Font("�ü�",Font.BOLD,20));
			overlbl.setHorizontalAlignment(SwingConstants.CENTER);
			add(overlbl);
			
			finalscore = new JLabel("���� ���ھ�: ");
			finalscore.setBounds(50,40,200,20);
			finalscore.setFont(new Font("����",Font.BOLD,15));
			finalscore.setHorizontalAlignment(SwingConstants.CENTER);
			add(finalscore);
			
			retry = new JLabel("�ٽ� �Ͻðڽ��ϱ�?");
			retry.setBounds(50,55,200,20);
			retry.setFont(new Font("����",Font.BOLD,15));
			retry.setHorizontalAlignment(SwingConstants.CENTER);
			add(retry);
		}
	}
	
	//PageController���� listener�� ���޹޾� ��ư�� add
	public void addButtonListener(ActionListener listener) {
		btnYes.addActionListener(listener);
		btnNo.addActionListener(listener);
	} //addPageChangeListener()
}
