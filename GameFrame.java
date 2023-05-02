package snakeUtube;

import javax.swing.JFrame;
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.*;

public class GameFrame extends JFrame {
	
//	private JButton restartButton;
//	private GamePanel gamePanel;
		
	GameFrame(){
//		restartButton = new JButton("Chơi lại");
//	    restartButton.addActionListener(this);
		this.add(new GamePanel());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
//		this.add(restartButton, BorderLayout.NORTH);
//	    this.add(gamePanel, BorderLayout.CENTER);
	}
}

