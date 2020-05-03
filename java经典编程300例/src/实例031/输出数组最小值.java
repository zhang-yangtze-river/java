package 实例031;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 输出数组最小值 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					输出数组最小值 window = new 输出数组最小值();
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
	public 输出数组最小值() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u83B7\u53D6\u4E00\u7EF4\u6570\u7EC4\u6700\u5C0F\u503C");
		frame.setBounds(100, 100, 609, 248);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 47, 575, 52);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u8BF7\u5728\u6587\u672C\u6846\u4E2D\u8F93\u5165\u591A\u4E2A\u6574\u6570\uFF0C\u4EE5\u7A7A\u683C\u5206\u9694\u3002\u4F8B\u5982\uFF1A12  23        45  2");
		lblNewLabel.setFont(new Font("宋体", Font.BOLD, 17));
		lblNewLabel.setBounds(10, 10, 575, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("宋体", Font.BOLD, 17));
		lblNewLabel_1.setBounds(179, 128, 303, 52);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("\u8BA1\u7B97");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String arrayStr=textField.getText().trim();
				if(arrayStr.equals("")) {
					JOptionPane.showMessageDialog(null,"请输入数字内容");
					return;
				}
				for(int i=0;i<arrayStr.length();i++) {
					char charAt=arrayStr.charAt(i);
					if(!Character.isDigit(charAt)&&charAt!=' ') {
						JOptionPane.showMessageDialog(null,"输入内容包含非数字");
						textField.setText("");
						return;
					}
				}
				String[] numberStrs=arrayStr.split(" {1,}");
				int[] numArray=new int[numberStrs.length];
				for(int i=0;i<numberStrs.length;i++) {
					numArray[i]=Integer.valueOf(numberStrs[i]);
				}
				int min=numArray[0];
				for(int j=0;j<numberStrs.length;j++) {
					if(min>numArray[j]) {
						min=numArray[j];
					}
				}
				lblNewLabel_1.setText("最小值为："+min);
			}
		});
		btnNewButton.setFont(new Font("宋体", Font.BOLD, 20));
		btnNewButton.setBounds(25, 128, 124, 57);
		frame.getContentPane().add(btnNewButton);
		
		
	}
}
