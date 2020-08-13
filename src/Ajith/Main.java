package Ajith;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	JFrame obj = new JFrame();
	GamePlay gamePlay = new GamePlay();
	obj.setBounds(10,10,700,800);	
	obj.setTitle("Brick Breaker Game---Ajith---");
	obj.setResizable(false);
	obj.setVisible(true);
	obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	obj.add(gamePlay);	
	}

}
