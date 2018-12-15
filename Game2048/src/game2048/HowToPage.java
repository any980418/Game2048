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

//������ ����� ���� �۵����� ���� ������ �������ִ� Ŭ����
public class HowToPage extends JPanel {
	private JPanel examPanel, explainPanel, pn1, pn2, pn3, pn4, pn5, pn6, e1, e2, e3, e4, e5, e6;
	//������ �����ϱ����� �ÿ�â �г�,���ӽÿ��� �ʿ��� ������ �ִ� �����г�,�׸��� �� ������ �гε�� �߰��Ǿ��� �гε� ���� 
	private ImageIcon background, image1, image2, image3, image4, image5, image6;
	//����̹����� ���� �̹���������,���� �ÿ�â�� �ʿ��� 6���� �̹��� ������ ����
	private ImageIcon nimage1, nimage2, nimage3, nimage4, nimage5, nimage6;
	//���� ������ �̹������� �г� ����� �°� �����ϱ� ���� �̹��������ܵ� ����
	private ImageIcon eImage1, eImage2, eImage3, eImage4, eImage5, eImage6;
	//���� ���� �гο� �� ������ ���� ���� �̹����� ����
	private JLabel lb1, lb2, lb3, lb4, lb5, lb6, elb1, elb2, elb3, elb4, elb5, elb6;
	//�̹����� ���� �󺧵� ����
	private JButton btnPrev, btnNext;
	//�����ΰ��� ��ư �ڷΰ��� ��ư ����
	
	private ButtonListener btnL;//��ư ������ ����
	
	protected JButton btnExit;//������ ��ư ����
	
	public HowToPage() {
		setLayout(null);//���̾ƿ� �η� ����
		
		btnL = new ButtonListener();//��ư������ ����
		
		/*
		 * �г� ���� �޼ҵ�
		 * 
		 setBounds(x��ǥ, y��ǥ, width, height);	//�г��� ��ġ�� ������ ����
		 setBackground(color);					//�г� ���� ����
		 add(component);						//container(panel)�� �߰�
		 */
		
		//���� ȭ���� ���� �����ִ� �г��� ����
		examPanel = new JPanel();
		examPanel.setBounds(45, 85, 460, 405);
		examPanel.setBackground(Color.white);
		add(examPanel);
		
		//������ ������ ���ִ� �г� ����
		explainPanel = new JPanel();
		explainPanel.setBounds(45, 500, 460, 225);
		explainPanel.setBackground(Color.white);
		add(explainPanel);
		
		/*
		 * ��ư ���� �޼ҵ�
		 setPressedIcon(new ImageIcon("���� ���")); //��ư�� ���� ������ �� ��µǴ� �̹��� ����
		 setContentAreaFilled(false);	//ä��� ����
		 setBorderPainted(false);		//�ܰ��� ���ֱ�
		 setFocusPainted(false);		//���õ� �� �۾� �׵θ� ����
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
		btnPrev.addActionListener(btnL);	//��ư�� �������� �̺�Ʈ ó���� ���� �����ʸ� �߰�
		btnPrev.setContentAreaFilled(false);
		btnPrev.setBorderPainted(false);
		btnPrev.setFocusPainted(false);
		btnPrev.setEnabled(false);			//ó�� 1������������ ��� ���ϰ��Ѵ�
		add(btnPrev);
		
		btnNext = new JButton(new ImageIcon("Image/arrowNext.png"));
		btnNext.setPressedIcon(new ImageIcon("Image/clickedNext.png"));
		btnNext.setBounds(452, 16, 53, 53);
		btnNext.addActionListener(btnL);
		btnNext.setContentAreaFilled(false);
		btnNext.setBorderPainted(false);
		btnNext.setFocusPainted(false);
		add(btnNext);
		
		background = new ImageIcon("Image/background70.png");//�г� ��� �̹���
		
		//���� ���/////////////////////////////////////////////////////////////
		
		/* �̹��� ����  */
		image1 = new ImageIcon("Image/page1.PNG");	//�гο� �־��� �̹��� ������ ����
		Image change1 = image1.getImage();			//�̹��� ����� ���߱� ���� �⺻ �̹����� ������ �޾ƿ�
		Image changed1 = change1.getScaledInstance(460, 400,java.awt.Image.SCALE_SMOOTH); //�г� ũ�⿡ �´� ������� ��ȯ ��Ų �̹��� �۾�
		nimage1= new ImageIcon(changed1);			//��ȯ�� �̹����� ���ο� �����ܿ� ����
		
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
		
		//������ ȭ�� ���� ����
		pn1 = new JPanel();
		lb1 = new JLabel(nimage1);	//����� ���� �� �̹��� �������� �󺧿� �߰�
		pn1.setVisible(true);		//ó�� ����̱� ������ ȭ�鿡 ����ش�.
		pn1.add(lb1);
		examPanel.add(pn1);
		
		//��ϳ��� ������ ������ ���� ��
		pn2 = new JPanel();
		lb2 = new JLabel(nimage2);
		pn2.setVisible(false);
		pn2.add(lb2);
		examPanel.add(pn2);
		
		//���͸� ����� ��ų����Ʈ�� �ø��� ��� �г�
		pn3 = new JPanel();
		lb3 = new JLabel(nimage3);
		pn3.setVisible(false);
		pn3.add(lb3);
		examPanel.add(pn3);
		
		//���ں���� ���Ϳ� ���� ������ ����г�
		pn4 = new JPanel();
		lb4 = new JLabel(nimage4);
		pn4.setVisible(false);
		pn4.add(lb4);
		examPanel.add(pn4);
		
		//��ų��� ��� �г�
		pn5 = new JPanel();
		lb5 = new JLabel(nimage5);
		pn5.setVisible(false);
		pn5.add(lb5);
		examPanel.add(pn5);
		
		//���ӿ��� ��� �г�
		pn6 = new JPanel();
		lb6 = new JLabel(nimage6);
		pn6.setVisible(false);
		pn6.add(lb6);
		examPanel.add(pn6);
		
		//���� ����//////////////////////////////////////////////////////////////////////
		
		/* ������ ���� �̹����� �޾� ���� */
		eImage1 = new ImageIcon("Image/explain1.png");
		eImage2 = new ImageIcon("Image/explain2.png");
		eImage3 = new ImageIcon("Image/explain3.png");
		eImage4 = new ImageIcon("Image/explain4.png");
		eImage5 = new ImageIcon("Image/explain5.png");
		eImage6 = new ImageIcon("Image/explain6.png");
		
		//ȭ�� ���� ����
		e1 = new JPanel();			//�г� ���� 
		elb1 = new JLabel(eImage1);	//�̹��� �������� �󺧿� �߰�
		e1.setVisible(true);		//ó������ ���̰� ����
		e1.add(elb1);				//�гο� ���� �̹����� �߰� 
		explainPanel.add(e1);
		
		//��� �̵��� ���� ���ڳ����� �浹 ȿ�� ����
		e2 = new JPanel();
		elb2 = new JLabel(eImage2);
		e2.setVisible(false);		//ó������ ������ �ʰ� ����
		e2.add(elb2);
		explainPanel.add(e2);
		
		//���Ϳ� ĳ������ �浹 ȿ�� ����
		e3 = new JPanel();
		elb3 = new JLabel(eImage3);
		e3.setVisible(false);
		e3.add(elb3);
		explainPanel.add(e3);
		
		//���Ϳ� ���ں���� �浹 ����
		e4 = new JPanel();
		elb4 = new JLabel(eImage4);
		e4.setVisible(false);
		e4.add(elb4);
		explainPanel.add(e4);
		
		//��ų��뼳��
		e5 = new JPanel();
		elb5 = new JLabel(eImage5);
		e5.setVisible(false);
		e5.add(elb5);
		explainPanel.add(e5);
		
		//���ӿ��� ����
		e6 = new JPanel();
		elb6 = new JLabel(eImage6);
		e6.setVisible(false);
		e6.add(elb6);
		explainPanel.add(e6);
		
	} //HowToPlayPanel()
	
	public void paintComponent(Graphics g) {//��� �̹����� �׷��ֱ� ���� ����Ʈ ������Ʈ���
		super.paintComponent(g);//��ӹ��� ����Ʈ ������Ʈ�� g�� ���
		
		//����Ʈ���۳�Ʈ�� ����� ���߾� ����̹����� �׷��ش�
		g.drawImage(background.getImage(), 0, 0, getWidth(), getHeight(), this);
		setOpaque(false);	//����� ���̵��� �ϱ� ����
		  					//���� ����
		
	} //paintComponent()
	
	//������ �ѱ��
	//��ư �̺�Ʈ�� �߻����� �� ó���� ���ִ� ������ Ŭ����
	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			Object obj = e.getSource();//������Ʈ�� �׼��� ����� ������
			
			if(obj == btnPrev) {//���� ��ư�� ��
				if(pn1.isVisible() == true) {//����1�϶� 
					pn6.setVisible(false);
					e6.setVisible(false);
				}
				else if(pn2.isVisible() == true) {//����2�϶�(������ư�� �����鼭 ����1�� ����ȭ)
					btnPrev.setEnabled(false);//ó�� ���� ���ư��� ���� ��ư�� �� �������� �ϱ� ���� �۾�
					pn1.setVisible(true);
					pn2.setVisible(false);
					pn6.setVisible(false);
					
					e1.setVisible(true);
					e2.setVisible(false);
					e6.setVisible(false);
				}
				else if(pn3.isVisible() == true) {//����3�϶�(������ư�� �����鼭 ����2�� ����ȭ)
					pn2.setVisible(true); 
					pn3.setVisible(false);
					pn6.setVisible(false);
					
					e2.setVisible(true);
					e3.setVisible(false);
					e6.setVisible(false);
				}
				else if(pn4.isVisible() == true) {//����4�϶�(������ư�� �����鼭 ����3�� ����ȭ)
					pn3.setVisible(true);
					pn4.setVisible(false);
					pn6.setVisible(false);
					
					e3.setVisible(true);
					e4.setVisible(false);
					e6.setVisible(false);
				}
				else if(pn5.isVisible() == true) {//���� 5�϶�(������ư�� �����鼭 ����4�� ����ȭ)
					pn4.setVisible(true);
					pn5.setVisible(false);
					pn6.setVisible(false);
						
					e4.setVisible(true);
					e5.setVisible(false);
					e6.setVisible(false);
				}
				else if(pn6.isVisible() == true) {//���� 6�϶�(������ư�� �����鼭 ����5�� ����ȭ)
					btnNext.setEnabled(true);
					pn5.setVisible(true);
					pn6.setVisible(false);
					
					e5.setVisible(true);
					e6.setVisible(false);
					
				} //if..else if	
			} //if (obj == btnPrev)
			
			else if(obj == btnNext) {//���� ��ư�� ȣ�� ����϶�
				if(pn1.isVisible() == true) {//���� 1�϶� ������ư�� �����鼭 ����2�� ����ȭ
					pn5.setVisible(false);
					pn1.setVisible(false);
					pn2.setVisible(true);
						
					e5.setVisible(false);
					e1.setVisible(false);
					e2.setVisible(true);
					btnPrev.setEnabled(true);
				}
				else if(pn2.isVisible() == true) {//���� 2�϶� ������ư�� �����鼭 ����3�� ����ȭ
					pn2.setVisible(false);
					pn3.setVisible(true);
				
					e2.setVisible(false);
					e3.setVisible(true);
				}
				else if(pn3.isVisible() == true) {//���� 3�϶� ������ư�� �����鼭 ����4�� ����ȭ
					pn3.setVisible(false);
					pn4.setVisible(true);
						
					e3.setVisible(false);
					e4.setVisible(true);
				}
				else if(pn4.isVisible() == true) {//���� 4�϶� ������ư�� �����鼭 ����5�� ����ȭ
					pn4.setVisible(false);
					pn5.setVisible(true);
					
					e4.setVisible(false);
					e5.setVisible(true);
				}
				else if(pn5.isVisible() == true) {//���� 5�϶� ������ư�� �����鼭 ����6�� ����ȭ �Ǹ� ���� 6���� ���� ��ư ��Ȱ��ȭ 
					pn5.setVisible(false);
					pn6.setVisible(true);
					
					e5.setVisible(false);
					e6.setVisible(true);
					btnNext.setEnabled(false);//���������� ���� ��ư�� �� ����ϰ��ϱ� ���� �۾�
				} //if..else if
			} //else if(obj == btnNext)
			
		} //actionPerformed()
		
	} //ButtonListener()
	
	//������ ��ư�� ������ ��  ȭ�� �̵��� ����
	//PageController���� listener�� ���޹޾� ��ư�� add
	public void addPageChangeListener(ActionListener listener) {
		btnExit.addActionListener(listener);
	} //addPageChangeListener()
	
} //HowToPage class
