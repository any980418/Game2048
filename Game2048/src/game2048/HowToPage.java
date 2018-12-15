package game2048;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

//게임을 실행시 게임 작동법에 대한 간단한 설명해주는 클래스
public class HowToPage extends JPanel {
	private JPanel examPanel, explainPanel, pn1, pn2, pn3, pn4, pn5, pn6, e1, e2, e3, e4, e5, e6;
	//게임을 설명하기위한 시연창 패널,게임시연에 필요한 설명이 있는 설명패널,그리고 그 각각의 패널들어 추가되어질 패널들 선언 
	private ImageIcon background, image1, image2, image3, image4, image5, image6;
	//배경이미지를 위한 이미지아이콘,게임 시연창에 필요한 6개의 이미지 아이콘 선언
	private ImageIcon nimage1, nimage2, nimage3, nimage4, nimage5, nimage6;
	//위의 각각의 이미지들을 패널 사이즈에 맞게 변경하기 위한 이미지아이콘들 선언
	private ImageIcon eImage1, eImage2, eImage3, eImage4, eImage5, eImage6;
	//게임 설명 패널에 들어갈 설명을 적어 놓은 이미지들 선언
	private JLabel lb1, lb2, lb3, lb4, lb5, lb6, elb1, elb2, elb3, elb4, elb5, elb6;
	//이미지를 담을 라벨들 선언
	private JButton btnPrev, btnNext;
	//앞으로가는 버튼 뒤로가는 버튼 선언
	
	private ButtonListener btnL;//버튼 리스너 선언
	
	protected JButton btnExit;//나가는 버튼 선언
	
	public HowToPage() {
		setLayout(null);//레이아웃 널로 설정
		
		btnL = new ButtonListener();//버튼리스너 생성
		
		/*
		 * 패널 관련 메소드
		 * 
		 setBounds(x좌표, y좌표, width, height);	//패널의 위치와 사이즈 지정
		 setBackground(color);					//패널 배경색 지정
		 add(component);						//container(panel)에 추가
		 */
		
		//게임 화면의 예를 보여주는 패널을 생성
		examPanel = new JPanel();
		examPanel.setBounds(45, 85, 460, 405);
		examPanel.setBackground(Color.white);
		add(examPanel);
		
		//게임의 설명을 해주는 패널 생성
		explainPanel = new JPanel();
		explainPanel.setBounds(45, 500, 460, 225);
		explainPanel.setBackground(Color.white);
		add(explainPanel);
		
		/*
		 * 버튼 관련 메소드
		 setPressedIcon(new ImageIcon("파일 경로")); //버튼을 누른 상태일 때 출력되는 이미지 설정
		 setContentAreaFilled(false);	//채우기 없음
		 setBorderPainted(false);		//외곽선 없애기
		 setFocusPainted(false);		//선택될 때 글씨 테두리 없앰
		*/
		
		btnExit = new JButton(new ImageIcon("Image/exitButton2.png"));
		btnExit.setPressedIcon(new ImageIcon("Image/clickedExit2.png"));
		btnExit.setBounds(205, 16, 140, 53);
		btnExit.setContentAreaFilled(false);
		btnExit.setBorderPainted(false);
		btnExit.setFocusPainted(false);
		add(btnExit);
		
		btnPrev = new JButton(new ImageIcon("Image/arrowPrev.png"));
		btnPrev.setPressedIcon(new ImageIcon("Image/clickedPrev.png"));
		btnPrev.setBounds(45, 16, 53, 53);
		btnPrev.addActionListener(btnL);	//버튼이 눌렸을때 이벤트 처리를 위한 리스너를 추가
		btnPrev.setContentAreaFilled(false);
		btnPrev.setBorderPainted(false);
		btnPrev.setFocusPainted(false);
		btnPrev.setEnabled(false);			//처음 1페이지에서는 사용 못하게한다
		add(btnPrev);
		
		btnNext = new JButton(new ImageIcon("Image/arrowNext.png"));
		btnNext.setPressedIcon(new ImageIcon("Image/clickedNext.png"));
		btnNext.setBounds(452, 16, 53, 53);
		btnNext.addActionListener(btnL);
		btnNext.setContentAreaFilled(false);
		btnNext.setBorderPainted(false);
		btnNext.setFocusPainted(false);
		add(btnNext);
		
		background = new ImageIcon("Image/background70.png");//패널 배경 이미지
		
		//게임 장면/////////////////////////////////////////////////////////////
		
		/* 이미지 생성  */
		image1 = new ImageIcon("Image/page1.PNG");	//패널에 넣어줄 이미지 아이콘 생성
		Image change1 = image1.getImage();			//이미지 사이즈를 맞추기 위해 기본 이미지를 선언후 받아옴
		Image changed1 = change1.getScaledInstance(460, 400,java.awt.Image.SCALE_SMOOTH); //패널 크기에 맞는 사이즈로 변환 시킨 이미지 작업
		nimage1= new ImageIcon(changed1);			//변환한 이미지를 새로운 아이콘에 생성
		
		image2 = new ImageIcon("Image/move1.PNG");
		Image change2 = image2.getImage();
		Image changed2 = change2.getScaledInstance(460, 400,java.awt.Image.SCALE_SMOOTH);
		nimage2= new ImageIcon(changed2);
		
		image3 = new ImageIcon("Image/move2.PNG");
		Image change3 = image3.getImage();
		Image changed3 = change3.getScaledInstance(460, 400,java.awt.Image.SCALE_SMOOTH);
		nimage3= new ImageIcon(changed3);
		
		image4 = new ImageIcon("Image/move3.PNG");
		Image change4 = image4.getImage();
		Image changed4 = change4.getScaledInstance(460, 400,java.awt.Image.SCALE_SMOOTH);
		nimage4 = new ImageIcon(changed4);
		
		image5 = new ImageIcon("Image/useSkill.PNG");
		Image change5 = image5.getImage();
		Image changed5 = change5.getScaledInstance(460, 400,java.awt.Image.SCALE_SMOOTH);
		nimage5 = new ImageIcon(changed5);
		
		image6 = new ImageIcon("Image/gameover.PNG");
		Image change6 = image6.getImage();
		Image changed6 = change6.getScaledInstance(460, 400,java.awt.Image.SCALE_SMOOTH);
		nimage6 = new ImageIcon(changed6);
		
		//게임의 화면 구성 설명
		pn1 = new JPanel();
		lb1 = new JLabel(nimage1);	//사이즈를 맞춰 준 이미지 아이콘을 라벨에 추가
		pn1.setVisible(true);		//처음 장면이기 때문에 화면에 띄워준다.
		pn1.add(lb1);
		examPanel.add(pn1);
		
		//블록끼리 합쳐져 점수를 얻을 때
		pn2 = new JPanel();
		lb2 = new JLabel(nimage2);
		pn2.setVisible(false);
		pn2.add(lb2);
		examPanel.add(pn2);
		
		//몬스터를 무찌르고 스킬포인트를 올리는 장면 패널
		pn3 = new JPanel();
		lb3 = new JLabel(nimage3);
		pn3.setVisible(false);
		pn3.add(lb3);
		examPanel.add(pn3);
		
		//숫자블록이 몬스터에 가로 막히는 장면패널
		pn4 = new JPanel();
		lb4 = new JLabel(nimage4);
		pn4.setVisible(false);
		pn4.add(lb4);
		examPanel.add(pn4);
		
		//스킬사용 장면 패널
		pn5 = new JPanel();
		lb5 = new JLabel(nimage5);
		pn5.setVisible(false);
		pn5.add(lb5);
		examPanel.add(pn5);
		
		//게임오버 장면 패널
		pn6 = new JPanel();
		lb6 = new JLabel(nimage6);
		pn6.setVisible(false);
		pn6.add(lb6);
		examPanel.add(pn6);
		
		//게임 설명//////////////////////////////////////////////////////////////////////
		
		/* 설명할 글을 이미지로 받아 생성 */
		eImage1 = new ImageIcon("Image/explain1.png");
		eImage2 = new ImageIcon("Image/explain2.png");
		eImage3 = new ImageIcon("Image/explain3.png");
		eImage4 = new ImageIcon("Image/explain4.png");
		eImage5 = new ImageIcon("Image/explain5.png");
		eImage6 = new ImageIcon("Image/explain6.png");
		
		//화면 구성 설명
		e1 = new JPanel();			//패널 생성 
		elb1 = new JLabel(eImage1);	//이미지 아이콘을 라벨에 추가
		e1.setVisible(true);		//처음에만 보이게 설정
		e1.add(elb1);				//패널에 설명 이미지를 추가 
		explainPanel.add(e1);
		
		//블록 이동시 같은 숫자끼리의 충돌 효과 설명
		e2 = new JPanel();
		elb2 = new JLabel(eImage2);
		e2.setVisible(false);		//처음에는 보이지 않게 설정
		e2.add(elb2);
		explainPanel.add(e2);
		
		//몬스터와 캐릭터의 충돌 효과 설명
		e3 = new JPanel();
		elb3 = new JLabel(eImage3);
		e3.setVisible(false);
		e3.add(elb3);
		explainPanel.add(e3);
		
		//몬스터와 숫자블록의 충돌 설명
		e4 = new JPanel();
		elb4 = new JLabel(eImage4);
		e4.setVisible(false);
		e4.add(elb4);
		explainPanel.add(e4);
		
		//스킬사용설명
		e5 = new JPanel();
		elb5 = new JLabel(eImage5);
		e5.setVisible(false);
		e5.add(elb5);
		explainPanel.add(e5);
		
		//게임오버 설명
		e6 = new JPanel();
		elb6 = new JLabel(eImage6);
		e6.setVisible(false);
		e6.add(elb6);
		explainPanel.add(e6);
		
	} //HowToPlayPanel()
	
	public void paintComponent(Graphics g) {//배경 이미지를 그려주기 위해 페인트 컴포넌트사용
		super.paintComponent(g);//상속받은 페인트 컴포넌트로 g를 사용
		
		//페인트컴퍼넌트로 사이즈에 맞추어 배경이미지를 그려준다
		g.drawImage(background.getImage(), 0, 0, getWidth(), getHeight(), this);
		setOpaque(false);	//배경이 보이도록 하기 위해
		  					//투명도 지정
		
	} //paintComponent()
	
	//페이지 넘기기
	//버튼 이벤트가 발생했을 때 처리를 해주는 리스너 클래스
	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			Object obj = e.getSource();//오브젝트로 액션의 대상을 가져옴
			
			if(obj == btnPrev) {//이전 버튼일 때
				if(pn1.isVisible() == true) {//설명1일때 
					pn6.setVisible(false);
					e6.setVisible(false);
				}
				else if(pn2.isVisible() == true) {//설명2일때(이전버튼이 눌리면서 설명1을 가시화)
					btnPrev.setEnabled(false);//처음 으로 돌아가도 이전 버튼이 안 눌러지게 하기 위한 작업
					pn1.setVisible(true);
					pn2.setVisible(false);
					pn6.setVisible(false);
					
					e1.setVisible(true);
					e2.setVisible(false);
					e6.setVisible(false);
				}
				else if(pn3.isVisible() == true) {//설명3일때(이전버튼이 눌리면서 설명2을 가시화)
					pn2.setVisible(true); 
					pn3.setVisible(false);
					pn6.setVisible(false);
					
					e2.setVisible(true);
					e3.setVisible(false);
					e6.setVisible(false);
				}
				else if(pn4.isVisible() == true) {//설명4일때(이전버튼이 눌리면서 설명3을 가시화)
					pn3.setVisible(true);
					pn4.setVisible(false);
					pn6.setVisible(false);
					
					e3.setVisible(true);
					e4.setVisible(false);
					e6.setVisible(false);
				}
				else if(pn5.isVisible() == true) {//설명 5일때(이전버튼이 눌리면서 설명4을 가시화)
					pn4.setVisible(true);
					pn5.setVisible(false);
					pn6.setVisible(false);
						
					e4.setVisible(true);
					e5.setVisible(false);
					e6.setVisible(false);
				}
				else if(pn6.isVisible() == true) {//설명 6일때(이전버튼이 눌리면서 설명5을 가시화)
					btnNext.setEnabled(true);
					pn5.setVisible(true);
					pn6.setVisible(false);
					
					e5.setVisible(true);
					e6.setVisible(false);
					
				} //if..else if	
			} //if (obj == btnPrev)
			
			else if(obj == btnNext) {//다음 버튼이 호출 대상일때
				if(pn1.isVisible() == true) {//설명 1일때 다음버튼이 눌리면서 설명2이 가시화
					pn5.setVisible(false);
					pn1.setVisible(false);
					pn2.setVisible(true);
						
					e5.setVisible(false);
					e1.setVisible(false);
					e2.setVisible(true);
					btnPrev.setEnabled(true);
				}
				else if(pn2.isVisible() == true) {//설명 2일때 다음버튼이 눌리면서 설명3이 가시화
					pn2.setVisible(false);
					pn3.setVisible(true);
				
					e2.setVisible(false);
					e3.setVisible(true);
				}
				else if(pn3.isVisible() == true) {//설명 3일때 다음버튼이 눌리면서 설명4이 가시화
					pn3.setVisible(false);
					pn4.setVisible(true);
						
					e3.setVisible(false);
					e4.setVisible(true);
				}
				else if(pn4.isVisible() == true) {//설명 4일때 다음버튼이 눌리면서 설명5이 가시화
					pn4.setVisible(false);
					pn5.setVisible(true);
					
					e4.setVisible(false);
					e5.setVisible(true);
				}
				else if(pn5.isVisible() == true) {//설명 5일때 다음버튼이 눌리면서 설명6이 가시화 되며 설명 6에서 다음 버튼 비활성화 
					pn5.setVisible(false);
					pn6.setVisible(true);
					
					e5.setVisible(false);
					e6.setVisible(true);
					btnNext.setEnabled(false);//마지막에서 다음 버튼을 못 사용하게하기 위한 작업
				} //if..else if
			} //else if(obj == btnNext)
			
		} //actionPerformed()
		
	} //ButtonListener()
	
	//나가기 버튼을 눌렀을 때  화면 이동을 위해
	//PageController에서 listener를 전달받아 버튼에 add
	public void addPageChangeListener(ActionListener listener) {
		btnExit.addActionListener(listener);
	} //addPageChangeListener()
	
} //HowToPage class
