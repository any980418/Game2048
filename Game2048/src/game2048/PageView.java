package game2048;

import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class PageView extends JPanel {

	protected MainPage mainPage;
	protected GamePage gamePage;
	protected HowToPage howToPage;
	
	public PageView() {
		setPreferredSize(new Dimension(TileValue.WIDTH, TileValue.HEIGHT));
		setLayout(null);
		
		//프로그램 실행 시 첫 화면은 mainPage가 되도록
		//(생성 시) gamePage, howToPage의 setVisible을 false로 설정
		
		mainPage = new MainPage();
		mainPage.setBounds(0,0,TileValue.WIDTH,TileValue.HEIGHT);
		add(mainPage);
		
		gamePage = new GamePage();
		gamePage.setBounds(0,0,TileValue.WIDTH,TileValue.HEIGHT);
		gamePage.setVisible(false);
		add(gamePage);
		
		howToPage = new HowToPage();
		howToPage.setBounds(0,0,TileValue.WIDTH,TileValue.HEIGHT);
		howToPage.setVisible(false);
		add(howToPage);
		
	} //PageView()
	
	//PageController에서 listener를 전달받아 각 page에 add
	public void addControllerListener(ActionListener listener) {
		mainPage.addPageChangeListener(listener);
		gamePage.addPageChangeListener(listener);
		howToPage.addPageChangeListener(listener);
	} //addControllerListener()
	
	//SkillController에서 listener를 전달받아 gamePage에 add
	public void addSkillListener(ActionListener listener) {
		gamePage.addSkillControllListener(listener);
	} //addCursorListener()
	
	//화면 전환
	//setVisible 메소드를 이용하여 화면에 나타나는 페이지를 변경
	public void change(String page) {
		
		//문자열 비교
		//str.equals("문자열");
		
		if (page.equals("main")) {
			mainPage.setVisible(true);
			gamePage.setVisible(false);
			howToPage.setVisible(false);
			
			setFocusable(false); //KeyEvent를 받을 수 없도록
		}
		else if (page.equals("game")) {
			mainPage.setVisible(false);
			gamePage.setVisible(true);
			howToPage.setVisible(false);
			
			gamePage.setButtonFocusable();
			setFocusable(true);	//KeyEvent를 받을 수 있도록
			requestFocus();		//포커스를 강제 지정
		}
		else if (page.equals("howto")) {
			mainPage.setVisible(false);
			gamePage.setVisible(false);
			howToPage.setVisible(true);
			
			setFocusable(false);
		} //if..else if
		
	} //change()
	
} //PageView class