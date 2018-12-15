package game2048;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MainPage extends JPanel {
	
	private ImageIcon titleImage;
	private JLabel lblProgrammedBy;
	
	protected JButton btnStart, btnExit, btnHowtoPlay;
	
	public MainPage() {
		setLayout(null);
		
		/*
		 * 버튼 관련 메소드
		 setPressedIcon(new ImageIcon("파일 경로")); //버튼을 누른 상태일 때 출력되는 이미지 설정
		 setContentAreaFilled(false);	//채우기 없음
		 setBorderPainted(false);		//외곽선 없애기
		 setFocusPainted(false);		//선택될 때 글씨 테두리 없앰
		*/
		
		btnStart = new JButton (new ImageIcon("Image/startButton.png"));
		btnStart.setPressedIcon(new ImageIcon("Image/clickedStart.png"));
		btnStart.setBounds(135, 380, 280, 80);
		btnStart.setContentAreaFilled(false);
		btnStart.setBorderPainted(false);
		btnStart.setFocusPainted(false);
		add(btnStart);
		
		btnHowtoPlay = new JButton (new ImageIcon("Image/HowtoPlayButton.png"));
		btnHowtoPlay.setPressedIcon(new ImageIcon("Image/clickedHowtoPlay.png"));
		btnHowtoPlay.setBounds(135, 480, 280, 80);
		btnHowtoPlay.setContentAreaFilled(false);
		btnHowtoPlay.setBorderPainted(false);
		btnHowtoPlay.setFocusPainted(false);
		add(btnHowtoPlay);
		
		btnExit = new JButton (new ImageIcon("Image/exitButton.png"));
		btnExit.setPressedIcon(new ImageIcon("Image/clickedExit.png"));
		btnExit.setBounds(135, 580, 280, 80);
		btnExit.setContentAreaFilled(false);
		btnExit.setBorderPainted(false);
		btnExit.setFocusPainted(false);
		add(btnExit);
		
		titleImage = new ImageIcon("Image/title.png"); //배경 이미지
		
		lblProgrammedBy = new JLabel("Programmed by Group 1");
		lblProgrammedBy.setBounds(175, 725, 200, 15);
		lblProgrammedBy.setForeground(Color.white);
		lblProgrammedBy.setFont(new Font("고딕", Font.PLAIN, 15));
		lblProgrammedBy.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblProgrammedBy);
		
	} //MainPage()
	
	public void paintComponent(Graphics page) {
		super.paintComponent(page);
		
		page.drawImage(titleImage.getImage(), 0, 0, null);
		setOpaque(false); //배경이 보이도록 하기 위해
						  //투명도 지정
		
	} //paintComponent()
	
	//PageController에서 listener를 전달받아 버튼에 add
	public void addPageChangeListener(ActionListener listener) {
		btnStart.addActionListener(listener);
		btnExit.addActionListener(listener);
		btnHowtoPlay.addActionListener(listener);
	} //addPageChangeListener()
	
} //MainPage class
