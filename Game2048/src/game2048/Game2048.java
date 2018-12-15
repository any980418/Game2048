package game2048;

import javax.swing.JFrame;

public class Game2048 {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("��� in 2048");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(TileValue.WIDTH, TileValue.HEIGHT);
		frame.setResizable(false);			// ������ ũ�� ���� x
		frame.setLocationRelativeTo(null);	// �������� ȭ�� �߾�����
											// ȭ�� ����� �����ؾ� �߾ӿ� ��Ÿ��
		
		PageView view = new PageView();
		PageController controller = new PageController(view);
		SkillController skillController = new SkillController(view);
		frame.getContentPane().add(view);
		
		frame.pack();
		frame.setVisible(true);
	}
}
