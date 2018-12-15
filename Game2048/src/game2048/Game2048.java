package game2048;

import javax.swing.JFrame;

public class Game2048 {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("용사 in 2048");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(TileValue.WIDTH, TileValue.HEIGHT);
		frame.setResizable(false);			// 프레임 크기 변경 x
		frame.setLocationRelativeTo(null);	// 프레임을 화면 중앙으로
											// 화면 사이즈를 지정해야 중앙에 나타남
		
		PageView view = new PageView();
		PageController controller = new PageController(view);
		SkillController skillController = new SkillController(view);
		frame.getContentPane().add(view);
		
		frame.pack();
		frame.setVisible(true);
	}
}
