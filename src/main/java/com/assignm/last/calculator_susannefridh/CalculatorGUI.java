package com.assignm.last.calculator_susannefridh;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CalculatorGUI {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI window = new CalculatorGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculatorGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(12, 12, 229, 39);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnPlus = new JButton("plus");
		btnPlus.setBounds(9, 63, 90, 58);
		frame.getContentPane().add(btnPlus);
		
		JButton btnMinus = new JButton("minus");
		btnMinus.setBounds(151, 63, 84, 53);
		frame.getContentPane().add(btnMinus);
		
		JButton btnGnger = new JButton("gånger");
		btnGnger.setBounds(9, 172, 90, 58);
		frame.getContentPane().add(btnGnger);
		
		JButton btnDivision = new JButton("division");
		btnDivision.setBounds(151, 172, 90, 58);
		frame.getContentPane().add(btnDivision);
		
		JButton btnLikaMed = new JButton("lika med");
		btnLikaMed.setBounds(296, 63, 117, 25);
		frame.getContentPane().add(btnLikaMed);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(308, 158, 117, 25);
		frame.getContentPane().add(btnClear);
		
		JButton btnExit = new JButton("exit");
		btnExit.setBounds(308, 244, 117, 25);
		frame.getContentPane().add(btnExit);
	}
}
