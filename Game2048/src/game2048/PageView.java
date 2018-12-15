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
		
		//���α׷� ���� �� ù ȭ���� mainPage�� �ǵ���
		//(���� ��) gamePage, howToPage�� setVisible�� false�� ����
		
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
	
	//PageController���� listener�� ���޹޾� �� page�� add
	public void addControllerListener(ActionListener listener) {
		mainPage.addPageChangeListener(listener);
		gamePage.addPageChangeListener(listener);
		howToPage.addPageChangeListener(listener);
	} //addControllerListener()
	
	//SkillController���� listener�� ���޹޾� gamePage�� add
	public void addSkillListener(ActionListener listener) {
		gamePage.addSkillControllListener(listener);
	} //addCursorListener()
	
	//ȭ�� ��ȯ
	//setVisible �޼ҵ带 �̿��Ͽ� ȭ�鿡 ��Ÿ���� �������� ����
	public void change(String page) {
		
		//���ڿ� ��
		//str.equals("���ڿ�");
		
		if (page.equals("main")) {
			mainPage.setVisible(true);
			gamePage.setVisible(false);
			howToPage.setVisible(false);
			
			setFocusable(false); //KeyEvent�� ���� �� ������
		}
		else if (page.equals("game")) {
			mainPage.setVisible(false);
			gamePage.setVisible(true);
			howToPage.setVisible(false);
			
			gamePage.setButtonFocusable();
			setFocusable(true);	//KeyEvent�� ���� �� �ֵ���
			requestFocus();		//��Ŀ���� ���� ����
		}
		else if (page.equals("howto")) {
			mainPage.setVisible(false);
			gamePage.setVisible(false);
			howToPage.setVisible(true);
			
			setFocusable(false);
		} //if..else if
		
	} //change()
	
} //PageView class