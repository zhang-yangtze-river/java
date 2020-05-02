package calculator计算器;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class 计算器 {

	private JFrame frame;
	private JTextField textField;

	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;
	int flag = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					计算器 window = new 计算器();
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
	public 计算器() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 282, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setFont(new Font("宋体", Font.BOLD, 20));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 10, 256, 100);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (flag == 1) {
					textField.setText("");
					flag = 0;
				}
				String EntrNumber = textField.getText() + btn7.getText();
				textField.setText(EntrNumber);
			}
		});
		btn7.setFont(new Font("宋体", Font.BOLD, 18));
		btn7.setBounds(10, 177, 55, 55);
		frame.getContentPane().add(btn7);

		JButton btn7_1 = new JButton("8");
		btn7_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (flag == 1) {
					textField.setText("");
					flag = 0;
				}
				String EntrNumber = textField.getText() + btn7_1.getText();
				textField.setText(EntrNumber);
			}
		});
		btn7_1.setFont(new Font("宋体", Font.BOLD, 18));
		btn7_1.setBounds(75, 177, 55, 55);
		frame.getContentPane().add(btn7_1);

		JButton btn7_2 = new JButton("9");
		btn7_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (flag == 1) {
					textField.setText("");
					flag = 0;
				}
				String EntrNumber = textField.getText() + btn7_2.getText();
				textField.setText(EntrNumber);
			}
		});
		btn7_2.setFont(new Font("宋体", Font.BOLD, 18));
		btn7_2.setBounds(140, 177, 55, 55);
		frame.getContentPane().add(btn7_2);

		JButton btn7_3 = new JButton("+");
		btn7_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
			}
		});
		btn7_3.setFont(new Font("宋体", Font.BOLD, 18));
		btn7_3.setBounds(211, 113, 55, 55);
		frame.getContentPane().add(btn7_3);

		JButton btn7_4 = new JButton("4");
		btn7_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (flag == 1) {
					textField.setText("");
					flag = 0;
				}
				String EntrNumber = textField.getText() + btn7_4.getText();
				textField.setText(EntrNumber);
			}
		});
		btn7_4.setFont(new Font("宋体", Font.BOLD, 18));
		btn7_4.setBounds(10, 242, 55, 55);
		frame.getContentPane().add(btn7_4);

		JButton btn7_5 = new JButton("5");
		btn7_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (flag == 1) {
					textField.setText("");
					flag = 0;
				}
				String EntrNumber = textField.getText() + btn7_5.getText();
				textField.setText(EntrNumber);
			}
		});
		btn7_5.setFont(new Font("宋体", Font.BOLD, 18));
		btn7_5.setBounds(75, 242, 55, 55);
		frame.getContentPane().add(btn7_5);

		JButton btn7_6 = new JButton("6");
		btn7_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (flag == 1) {
					textField.setText("");
					flag = 0;
				}
				String EntrNumber = textField.getText() + btn7_6.getText();
				textField.setText(EntrNumber);
			}
		});
		btn7_6.setFont(new Font("宋体", Font.BOLD, 18));
		btn7_6.setBounds(140, 242, 55, 55);
		frame.getContentPane().add(btn7_6);

		JButton btn7_7 = new JButton("-");
		btn7_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		btn7_7.setFont(new Font("宋体", Font.BOLD, 18));
		btn7_7.setBounds(211, 177, 55, 55);
		frame.getContentPane().add(btn7_7);

		JButton btn7_8 = new JButton("1");
		btn7_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (flag == 1) {
					textField.setText("");
					flag = 0;
				}
				String EntrNumber = textField.getText() + btn7_8.getText();
				textField.setText(EntrNumber);
			}
		});
		btn7_8.setFont(new Font("宋体", Font.BOLD, 18));
		btn7_8.setBounds(10, 307, 55, 55);
		frame.getContentPane().add(btn7_8);

		JButton btn7_9 = new JButton("2");
		btn7_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (flag == 1) {
					textField.setText("");
					flag = 0;
				}
				String EntrNumber = textField.getText() + btn7_9.getText();
				textField.setText(EntrNumber);
			}
		});
		btn7_9.setFont(new Font("宋体", Font.BOLD, 18));
		btn7_9.setBounds(75, 307, 55, 55);
		frame.getContentPane().add(btn7_9);

		JButton btn7_10 = new JButton("3");
		btn7_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (flag == 1) {
					textField.setText("");
					flag = 0;
				}
				String EntrNumber = textField.getText() + btn7_10.getText();
				textField.setText(EntrNumber);
			}
		});
		btn7_10.setFont(new Font("宋体", Font.BOLD, 18));
		btn7_10.setBounds(140, 307, 55, 55);
		frame.getContentPane().add(btn7_10);

		JButton btn7_11 = new JButton("*");
		btn7_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
			}
		});
		btn7_11.setFont(new Font("宋体", Font.BOLD, 18));
		btn7_11.setBounds(211, 242, 55, 55);
		frame.getContentPane().add(btn7_11);

		JButton btn7_12 = new JButton("<-");
		btn7_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				if (textField.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() - 1);
					backspace = strB.toString();
					textField.setText(backspace);
				}
			}
		});
		btn7_12.setFont(new Font("宋体", Font.BOLD, 18));
		btn7_12.setBounds(10, 113, 55, 55);
		frame.getContentPane().add(btn7_12);

		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setFont(new Font("宋体", Font.BOLD, 18));
		btnC.setBounds(75, 113, 55, 55);
		frame.getContentPane().add(btnC);

		JButton btn7_14 = new JButton("%");
		btn7_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "%";
			}
		});
		btn7_14.setFont(new Font("宋体", Font.BOLD, 18));
		btn7_14.setBounds(140, 113, 55, 55);
		frame.getContentPane().add(btn7_14);

		JButton btn7_15 = new JButton("/");
		btn7_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
			}
		});
		btn7_15.setFont(new Font("宋体", Font.BOLD, 18));
		btn7_15.setBounds(211, 307, 55, 55);
		frame.getContentPane().add(btn7_15);

		JButton btn7_8_1 = new JButton("0");
		btn7_8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (flag == 1) {
					textField.setText("");
					flag = 0;
				}
				String EntrNumber = textField.getText() + btn7_8_1.getText();
				textField.setText(EntrNumber);
			}
		});
		btn7_8_1.setFont(new Font("宋体", Font.BOLD, 18));
		btn7_8_1.setBounds(10, 372, 55, 55);
		frame.getContentPane().add(btn7_8_1);

		JButton btn7_8_2 = new JButton(".");
		btn7_8_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (flag == 1) {
					textField.setText("");
					flag = 0;
				}
				String EntrNumber = textField.getText() + btn7_8_2.getText();
				textField.setText(EntrNumber);
			}
		});
		btn7_8_2.setFont(new Font("宋体", Font.BOLD, 18));
		btn7_8_2.setBounds(75, 372, 55, 55);
		frame.getContentPane().add(btn7_8_2);

		JButton btn7_8_3 = new JButton("\u00B1");
		btn7_8_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = ops * (-1);
				textField.setText(String.valueOf(ops));

			}
		});
		btn7_8_3.setFont(new Font("宋体", Font.BOLD, 18));
		btn7_8_3.setBounds(140, 372, 55, 55);
		frame.getContentPane().add(btn7_8_3);

		JButton btn7_8_4 = new JButton("=");
		btn7_8_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondnum = Double.parseDouble(textField.getText());
				if (operations == "+") {
					result = firstnum + secondnum;
					answer = String.format("%.10f", result);
					textField.setText(answer);
				} else if (operations == "-") {
					result = firstnum - secondnum;
					answer = String.format("%.10f", result);
					textField.setText(answer);
				} else if (operations == "*") {
					result = firstnum * secondnum;
					answer = String.format("%.10f", result);
					textField.setText(answer);
				} else if (operations == "/") {
					result = firstnum / secondnum;
					answer = String.format("%.10f", result);
					textField.setText(answer);
				} else if (operations == "%") {
					result = firstnum % secondnum;
					answer = String.format("%.10f", result);
					textField.setText(answer);
				}
				flag = 1;
			}
		});
		btn7_8_4.setFont(new Font("宋体", Font.BOLD, 18));
		btn7_8_4.setBounds(211, 372, 55, 55);
		frame.getContentPane().add(btn7_8_4);
	}
}
