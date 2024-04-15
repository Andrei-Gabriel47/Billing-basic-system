import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class Point_of_Sale {

	private JFrame frmBdPoint;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JCheckBox box2;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	double p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16,p17,p18,p19,p20,p21,p22,p23,p24,p25,p26,p27,p28;
	double st,tva,t;
	String x1,x2,x3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Point_of_Sale window = new Point_of_Sale();
					window.frmBdPoint.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Point_of_Sale() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBdPoint = new JFrame();
		frmBdPoint.setTitle("B&D - Point of Sale");
		frmBdPoint.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Andre\\Desktop\\B&D.png"));
		frmBdPoint.setBounds(100, 100, 1400, 720);
		frmBdPoint.setResizable(false);
		frmBdPoint.setLocationRelativeTo(null);
		frmBdPoint.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBdPoint.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.BLACK));
		panel.setBounds(10, 10, 314, 50);
		frmBdPoint.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Categories");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 294, 30);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.BLACK));
		panel_1.setBounds(875, 10, 501, 50);
		frmBdPoint.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Total & Bill");
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 10, 481, 30);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.BLACK));
		panel_1_1.setBounds(334, 10, 531, 50);
		frmBdPoint.getContentPane().add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Poin of Sale");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_1.setBounds(10, 10, 511, 30);
		panel_1_1.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(2, 1, 2, 1, (Color) Color.DARK_GRAY));
		panel_2.setBounds(10, 70, 314, 574);
		frmBdPoint.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(2, 1, 2, 1, (Color) Color.DARK_GRAY));
		panel_3.setBounds(334, 70, 531, 574);
		frmBdPoint.getContentPane().add(panel_3);
		
		JCheckBox box1 = new JCheckBox("Tomato");
		box1.setBounds(1, 13, 105, 40);
		box1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		box1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setEnabled(true);
			}
		});
		panel_3.setLayout(null);
		box1.setEnabled(false);
		panel_3.add(box1);
		
		textField = new JTextField();
		textField.setBounds(133, 7, 132, 40);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("0");
		textField.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		textField.setEnabled(false);
		panel_3.add(textField);
		textField.setColumns(10);
		
		box2 = new JCheckBox("Chips");
		box2.setBounds(265, 7, 132, 40);
		box2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setEnabled(true);
			}
		});
		box2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		box2.setEnabled(false);
		panel_3.add(box2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(397, 7, 132, 40);
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setText("0");
		textField_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		textField_1.setEnabled(false);
		textField_1.setColumns(10);
		panel_3.add(textField_1);
		
		JCheckBox box3 = new JCheckBox("Cucumber");
		box3.setBounds(1, 49, 122, 40);
		box3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_2.setEnabled(true);
			}
		});
		box3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		box3.setEnabled(false);
		panel_3.add(box3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(133, 47, 132, 40);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setText("0");
		textField_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		textField_2.setEnabled(false);
		textField_2.setColumns(10);
		panel_3.add(textField_2);
		
		JCheckBox box4 = new JCheckBox("Biscuit");
		box4.setBounds(265, 47, 132, 40);
		box4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_3.setEnabled(true);
			}
		});
		box4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		box4.setEnabled(false);
		panel_3.add(box4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(397, 47, 132, 40);
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setText("0");
		textField_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		textField_3.setEnabled(false);
		textField_3.setColumns(10);
		panel_3.add(textField_3);
		
		JCheckBox box5 = new JCheckBox("Carrot");
		box5.setBounds(1, 87, 132, 40);
		box5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_4.setEnabled(true);
			}
		});
		box5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		box5.setEnabled(false);
		panel_3.add(box5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(133, 87, 132, 40);
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setText("0");
		textField_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		textField_4.setEnabled(false);
		textField_4.setColumns(10);
		panel_3.add(textField_4);
		
		JCheckBox box6 = new JCheckBox("Pretzel");
		box6.setBounds(265, 87, 132, 40);
		box6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_5.setEnabled(true);
			}
		});
		box6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		box6.setEnabled(false);
		panel_3.add(box6);
		
		textField_5 = new JTextField();
		textField_5.setBounds(397, 87, 132, 40);
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setText("0");
		textField_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		textField_5.setEnabled(false);
		textField_5.setColumns(10);
		panel_3.add(textField_5);
		
		JCheckBox box7 = new JCheckBox("Potato");
		box7.setBounds(1, 127, 132, 40);
		box7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_6.setEnabled(true);
			}
		});
		box7.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		box7.setEnabled(false);
		panel_3.add(box7);
		
		textField_6 = new JTextField();
		textField_6.setBounds(133, 127, 132, 40);
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setText("0");
		textField_6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		textField_6.setEnabled(false);
		textField_6.setColumns(10);
		panel_3.add(textField_6);
		
		JCheckBox box8 = new JCheckBox("Gum");
		box8.setBounds(265, 127, 132, 40);
		box8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_7.setEnabled(true);
			}
		});
		box8.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		box8.setEnabled(false);
		panel_3.add(box8);
		
		textField_7 = new JTextField();
		textField_7.setBounds(397, 127, 132, 40);
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setText("0");
		textField_7.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		textField_7.setEnabled(false);
		textField_7.setColumns(10);
		panel_3.add(textField_7);
		
		JCheckBox box9 = new JCheckBox("Pepper");
		box9.setBounds(1, 167, 132, 40);
		box9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_8.setEnabled(true);
			}
		});
		box9.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		box9.setEnabled(false);
		panel_3.add(box9);
		
		textField_8 = new JTextField();
		textField_8.setBounds(133, 167, 132, 40);
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setText("0");
		textField_8.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		textField_8.setEnabled(false);
		textField_8.setColumns(10);
		panel_3.add(textField_8);
		
		JCheckBox box10 = new JCheckBox("Ham");
		box10.setBounds(265, 167, 132, 40);
		box10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_9.setEnabled(true);
			}
		});
		box10.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		box10.setEnabled(false);
		panel_3.add(box10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(397, 167, 132, 40);
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setText("0");
		textField_9.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		textField_9.setEnabled(false);
		textField_9.setColumns(10);
		panel_3.add(textField_9);
		
		JCheckBox box11 = new JCheckBox("Onion");
		box11.setBounds(1, 207, 132, 40);
		box11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_10.setEnabled(true);
			}
		});
		box11.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		box11.setEnabled(false);
		panel_3.add(box11);
		
		textField_10 = new JTextField();
		textField_10.setBounds(133, 207, 132, 40);
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setText("0");
		textField_10.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		textField_10.setEnabled(false);
		textField_10.setColumns(10);
		panel_3.add(textField_10);
		
		JCheckBox box12 = new JCheckBox("Chicken");
		box12.setBounds(265, 207, 132, 40);
		box12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_11.setEnabled(true);
			}
		});
		box12.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		box12.setEnabled(false);
		panel_3.add(box12);
		
		textField_11 = new JTextField();
		textField_11.setBounds(397, 207, 132, 40);
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setText("0");
		textField_11.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		textField_11.setEnabled(false);
		textField_11.setColumns(10);
		panel_3.add(textField_11);
		
		JCheckBox box13 = new JCheckBox("Garlic");
		box13.setBounds(1, 247, 132, 40);
		box13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_12.setEnabled(true);
			}
		});
		box13.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		box13.setEnabled(false);
		panel_3.add(box13);
		
		textField_12 = new JTextField();
		textField_12.setBounds(133, 247, 132, 40);
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setText("0");
		textField_12.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		textField_12.setEnabled(false);
		textField_12.setColumns(10);
		panel_3.add(textField_12);
		
		JCheckBox box14 = new JCheckBox("Pig");
		box14.setBounds(265, 247, 132, 40);
		box14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_13.setEnabled(true);
			}
		});
		box14.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		box14.setEnabled(false);
		panel_3.add(box14);
		
		textField_13 = new JTextField();
		textField_13.setBounds(397, 247, 132, 40);
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setText("0");
		textField_13.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		textField_13.setEnabled(false);
		textField_13.setColumns(10);
		panel_3.add(textField_13);
		
		JCheckBox box15 = new JCheckBox("Salad");
		box15.setBounds(1, 287, 132, 40);
		box15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_14.setEnabled(true);
			}
		});
		box15.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		box15.setEnabled(false);
		panel_3.add(box15);
		
		textField_14 = new JTextField();
		textField_14.setBounds(133, 287, 132, 40);
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setText("0");
		textField_14.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		textField_14.setEnabled(false);
		textField_14.setColumns(10);
		panel_3.add(textField_14);
		
		JCheckBox box16 = new JCheckBox("Beef");
		box16.setBounds(265, 287, 132, 40);
		box16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_15.setEnabled(true);
			}
		});
		box16.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		box16.setEnabled(false);
		panel_3.add(box16);
		
		textField_15 = new JTextField();
		textField_15.setBounds(397, 287, 132, 40);
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setText("0");
		textField_15.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		textField_15.setEnabled(false);
		textField_15.setColumns(10);
		panel_3.add(textField_15);
		
		JCheckBox box17 = new JCheckBox("Sweet Potato");
		box17.setBounds(1, 327, 132, 40);
		box17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_16.setEnabled(true);
			}
		});
		box17.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		box17.setEnabled(false);
		panel_3.add(box17);
		
		textField_16 = new JTextField();
		textField_16.setBounds(133, 327, 132, 40);
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setText("0");
		textField_16.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		textField_16.setEnabled(false);
		textField_16.setColumns(10);
		panel_3.add(textField_16);
		
		JCheckBox box18 = new JCheckBox("Salmon");
		box18.setBounds(265, 327, 132, 40);
		box18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_17.setEnabled(true);
			}
		});
		box18.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		box18.setEnabled(false);
		panel_3.add(box18);
		
		textField_17 = new JTextField();
		textField_17.setBounds(397, 327, 132, 40);
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setText("0");
		textField_17.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		textField_17.setEnabled(false);
		textField_17.setColumns(10);
		panel_3.add(textField_17);
		
		JCheckBox box19 = new JCheckBox("Apple");
		box19.setBounds(1, 367, 132, 40);
		box19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_18.setEnabled(true);
			}
		});
		box19.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		box19.setEnabled(false);
		panel_3.add(box19);
		
		textField_18 = new JTextField();
		textField_18.setBounds(133, 367, 132, 40);
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18.setText("0");
		textField_18.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		textField_18.setEnabled(false);
		textField_18.setColumns(10);
		panel_3.add(textField_18);
		
		JCheckBox box20 = new JCheckBox("Vine");
		box20.setBounds(265, 367, 132, 40);
		box20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_19.setEnabled(true);
			}
		});
		box20.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		box20.setEnabled(false);
		panel_3.add(box20);
		
		textField_19 = new JTextField();
		textField_19.setBounds(397, 367, 132, 40);
		textField_19.setHorizontalAlignment(SwingConstants.CENTER);
		textField_19.setText("0");
		textField_19.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		textField_19.setEnabled(false);
		textField_19.setColumns(10);
		panel_3.add(textField_19);
		
		JCheckBox box21 = new JCheckBox("Strawberry");
		box21.setBounds(1, 407, 132, 40);
		box21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_20.setEnabled(true);
			}
		});
		box21.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		box21.setEnabled(false);
		panel_3.add(box21);
		
		textField_20 = new JTextField();
		textField_20.setBounds(133, 407, 132, 40);
		textField_20.setHorizontalAlignment(SwingConstants.CENTER);
		textField_20.setText("0");
		textField_20.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		textField_20.setEnabled(false);
		textField_20.setColumns(10);
		panel_3.add(textField_20);
		
		JCheckBox box22 = new JCheckBox("Cola");
		box22.setBounds(265, 407, 132, 40);
		box22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_21.setEnabled(true);
			}
		});
		box22.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		box22.setEnabled(false);
		panel_3.add(box22);
		
		textField_21 = new JTextField();
		textField_21.setBounds(397, 407, 132, 40);
		textField_21.setHorizontalAlignment(SwingConstants.CENTER);
		textField_21.setText("0");
		textField_21.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		textField_21.setEnabled(false);
		textField_21.setColumns(10);
		panel_3.add(textField_21);
		
		JCheckBox box23 = new JCheckBox("Cherry");
		box23.setBounds(1, 447, 132, 40);
		box23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_22.setEnabled(true);
			}
		});
		box23.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		box23.setEnabled(false);
		panel_3.add(box23);
		
		textField_22 = new JTextField();
		textField_22.setBounds(133, 447, 132, 40);
		textField_22.setHorizontalAlignment(SwingConstants.CENTER);
		textField_22.setText("0");
		textField_22.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		textField_22.setEnabled(false);
		textField_22.setColumns(10);
		panel_3.add(textField_22);
		
		JCheckBox box24 = new JCheckBox("Lemon");
		box24.setBounds(265, 447, 132, 40);
		box24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_23.setEnabled(true);
			}
		});
		box24.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		box24.setEnabled(false);
		panel_3.add(box24);
		
		textField_23 = new JTextField();
		textField_23.setBounds(397, 447, 132, 40);
		textField_23.setHorizontalAlignment(SwingConstants.CENTER);
		textField_23.setText("0");
		textField_23.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		textField_23.setEnabled(false);
		textField_23.setColumns(10);
		panel_3.add(textField_23);
		
		JCheckBox box25 = new JCheckBox("Grapes");
		box25.setBounds(1, 487, 132, 40);
		box25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_24.setEnabled(true);
			}
		});
		box25.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		box25.setEnabled(false);
		panel_3.add(box25);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		
		textField_24 = new JTextField();
		textField_24.setBounds(133, 487, 132, 40);
		textField_24.setHorizontalAlignment(SwingConstants.CENTER);
		textField_24.setText("0");
		textField_24.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		textField_24.setEnabled(false);
		textField_24.setColumns(10);
		panel_3.add(textField_24);
		
		JCheckBox box26 = new JCheckBox("Beer");
		box26.setBounds(265, 487, 132, 40);
		box26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_25.setEnabled(true);
			}
		});
		box26.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		box26.setEnabled(false);
		panel_3.add(box26);
		
		textField_25 = new JTextField();
		textField_25.setBounds(397, 487, 132, 40);
		textField_25.setHorizontalAlignment(SwingConstants.CENTER);
		textField_25.setText("0");
		textField_25.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		textField_25.setEnabled(false);
		textField_25.setColumns(10);
		panel_3.add(textField_25);
		
		JCheckBox box27 = new JCheckBox("Watermelon");
		box27.setBounds(1, 527, 132, 40);
		box27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_26.setEnabled(true);
			}
		});
		box27.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		box27.setEnabled(false);
		panel_3.add(box27);
		
		textField_26 = new JTextField();
		textField_26.setBounds(133, 527, 132, 40);
		textField_26.setHorizontalAlignment(SwingConstants.CENTER);
		textField_26.setText("0");
		textField_26.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		textField_26.setEnabled(false);
		textField_26.setColumns(10);
		panel_3.add(textField_26);
		
		JCheckBox box28 = new JCheckBox("Water");
		box28.setBounds(265, 527, 132, 40);
		box28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_27.setEnabled(true);
			}
		});
		box28.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		box28.setEnabled(false);
		panel_3.add(box28);
		
		textField_27 = new JTextField();
		textField_27.setBounds(397, 527, 132, 40);
		textField_27.setHorizontalAlignment(SwingConstants.CENTER);
		textField_27.setText("0");
		textField_27.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		textField_27.setEnabled(false);
		textField_27.setColumns(10);
		panel_3.add(textField_27);
		
		JButton btnNewButton = new JButton("Tomato");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				box1.setEnabled(true);
				
			}
		});
		btnNewButton.setBounds(10, 10, 140, 30);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Chips");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				box2.setEnabled(true);
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1.setBounds(160, 10, 140, 30);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Cucumber");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				box3.setEnabled(true);
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_2.setBounds(10, 50, 140, 30);
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("Biscuit");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				box4.setEnabled(true);
			}
		});
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1_1.setBounds(160, 50, 140, 30);
		panel_2.add(btnNewButton_1_1);
		
		JButton btnNewButton_3 = new JButton("Carrot");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				box5.setEnabled(true);
			}
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_3.setBounds(10, 90, 140, 30);
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_1_2 = new JButton("Pretzel");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				box6.setEnabled(true);
			}
		});
		btnNewButton_1_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1_2.setBounds(160, 90, 140, 30);
		panel_2.add(btnNewButton_1_2);
		
		JButton btnNewButton_2_1 = new JButton("Potato");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				box7.setEnabled(true);
			}
		});
		btnNewButton_2_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_2_1.setBounds(10, 130, 140, 30);
		panel_2.add(btnNewButton_2_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Gum");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				box8.setEnabled(true);
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1_1_1.setBounds(160, 130, 140, 30);
		panel_2.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_4 = new JButton("Pepper");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				box9.setEnabled(true);
			}
		});
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_4.setBounds(10, 170, 140, 30);
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_1_3 = new JButton("Ham");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				box10.setEnabled(true);
			}
		});
		btnNewButton_1_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1_3.setBounds(160, 170, 140, 30);
		panel_2.add(btnNewButton_1_3);
		
		JButton btnNewButton_2_2 = new JButton("Onion");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				box11.setEnabled(true);
			}
		});
		btnNewButton_2_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_2_2.setBounds(10, 210, 140, 30);
		panel_2.add(btnNewButton_2_2);
		
		JButton btnNewButton_1_1_2 = new JButton("Chicken");
		btnNewButton_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				box12.setEnabled(true);
			}
		});
		btnNewButton_1_1_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1_1_2.setBounds(160, 210, 140, 30);
		panel_2.add(btnNewButton_1_1_2);
		
		JButton btnNewButton_5 = new JButton("Garlic");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				box13.setEnabled(true);
			}
		});
		btnNewButton_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_5.setBounds(10, 250, 140, 30);
		panel_2.add(btnNewButton_5);
		
		JButton btnNewButton_1_4 = new JButton("Pig");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				box14.setEnabled(true);
			}
		});
		btnNewButton_1_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1_4.setBounds(160, 250, 140, 30);
		panel_2.add(btnNewButton_1_4);
		
		JButton btnNewButton_2_3 = new JButton("Salad");
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				box15.setEnabled(true);
			}
		});
		btnNewButton_2_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_2_3.setBounds(10, 290, 140, 30);
		panel_2.add(btnNewButton_2_3);
		
		JButton btnNewButton_1_1_3 = new JButton("Beef");
		btnNewButton_1_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				box16.setEnabled(true);
			}
		});
		btnNewButton_1_1_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1_1_3.setBounds(160, 290, 140, 30);
		panel_2.add(btnNewButton_1_1_3);
		
		JButton btnNewButton_6 = new JButton("Sweet Potato");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				box17.setEnabled(true);
			}
		});
		btnNewButton_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_6.setBounds(10, 330, 140, 30);
		panel_2.add(btnNewButton_6);
		
		JButton btnNewButton_1_5 = new JButton("Salmon");
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				box18.setEnabled(true);
			}
		});
		btnNewButton_1_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1_5.setBounds(160, 330, 140, 30);
		panel_2.add(btnNewButton_1_5);
		
		JButton btnNewButton_2_4 = new JButton("Apple");
		btnNewButton_2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				box19.setEnabled(true);
			}
		});
		btnNewButton_2_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_2_4.setBounds(10, 370, 140, 30);
		panel_2.add(btnNewButton_2_4);
		
		JButton btnNewButton_1_1_4 = new JButton("Vine");
		btnNewButton_1_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				box20.setEnabled(true);
			}
		});
		btnNewButton_1_1_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1_1_4.setBounds(160, 370, 140, 30);
		panel_2.add(btnNewButton_1_1_4);
		
		JButton btnNewButton_7 = new JButton("Strawberry");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				box21.setEnabled(true);
			}
		});
		btnNewButton_7.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_7.setBounds(10, 410, 140, 30);
		panel_2.add(btnNewButton_7);
		
		JButton btnNewButton_1_6 = new JButton("Cola");
		btnNewButton_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				box22.setEnabled(true);
			}
		});
		btnNewButton_1_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1_6.setBounds(160, 410, 140, 30);
		panel_2.add(btnNewButton_1_6);
		
		JButton btnNewButton_2_5 = new JButton("Cherry");
		btnNewButton_2_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				box23.setEnabled(true);
			}
		});
		btnNewButton_2_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_2_5.setBounds(10, 450, 140, 30);
		panel_2.add(btnNewButton_2_5);
		
		JButton btnNewButton_1_1_5 = new JButton("Lemon");
		btnNewButton_1_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				box24.setEnabled(true);
			}
		});
		btnNewButton_1_1_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1_1_5.setBounds(160, 450, 140, 30);
		panel_2.add(btnNewButton_1_1_5);
		
		JButton btnNewButton_8 = new JButton("Grapes");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				box25.setEnabled(true);
			}
		});
		btnNewButton_8.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_8.setBounds(10, 490, 140, 30);
		panel_2.add(btnNewButton_8);
		
		JButton btnNewButton_1_7 = new JButton("Beer");
		btnNewButton_1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				box26.setEnabled(true);
			}
		});
		btnNewButton_1_7.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1_7.setBounds(160, 490, 140, 30);
		panel_2.add(btnNewButton_1_7);
		
		JButton btnNewButton_2_6 = new JButton("Watermelon");
		btnNewButton_2_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				box27.setEnabled(true);
			}
		});
		btnNewButton_2_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_2_6.setBounds(10, 530, 140, 30);
		panel_2.add(btnNewButton_2_6);
		
		JButton btnNewButton_1_1_6 = new JButton("Water");
		btnNewButton_1_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				box28.setEnabled(true);
			}
		});
		btnNewButton_1_1_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1_1_6.setBounds(160, 530, 140, 30);
		panel_2.add(btnNewButton_1_1_6);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new MatteBorder(2, 1, 2, 1, (Color) Color.BLACK));
		panel_4.setBounds(875, 70, 501, 574);
		frmBdPoint.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnNewButton_9 = new JButton("Total");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				p1= Double.parseDouble(textField.getText()) * 6;
				p2= Double.parseDouble(textField_1.getText()) * 4.5;
				p3= Double.parseDouble(textField_2.getText()) * 5.5;
				p4= Double.parseDouble(textField_3.getText()) * 2.5;
				p5= Double.parseDouble(textField_4.getText()) * 6.5;
				p6= Double.parseDouble(textField_5.getText()) * 3.5;
				p7= Double.parseDouble(textField_6.getText()) * 2.5;
				p8= Double.parseDouble(textField_7.getText()) * 2;
				p9= Double.parseDouble(textField_8.getText()) * 3.5;
				p10= Double.parseDouble(textField_9.getText()) * 4.5;
				p11= Double.parseDouble(textField_10.getText()) * 10;
				p12= Double.parseDouble(textField_11.getText()) * 12.5;
				p13= Double.parseDouble(textField_12.getText()) * 13.5;
				p14= Double.parseDouble(textField_13.getText()) * 2.5;
				p15= Double.parseDouble(textField_14.getText()) * 5.5;
				p16= Double.parseDouble(textField_15.getText()) * 3.5;
				p17= Double.parseDouble(textField_16.getText()) * 3;
				p18= Double.parseDouble(textField_17.getText()) * 4;
				p19= Double.parseDouble(textField_18.getText()) * 6.5;
				p20= Double.parseDouble(textField_19.getText()) * 20;
				p21= Double.parseDouble(textField_20.getText()) * 24;
				p22= Double.parseDouble(textField_21.getText()) * 23.5;
				p23= Double.parseDouble(textField_22.getText()) * 27.5;
				p24= Double.parseDouble(textField_23.getText()) * 14.5;
				p25= Double.parseDouble(textField_24.getText()) * 5;
				p26= Double.parseDouble(textField_25.getText()) * 2.5;
				p27= Double.parseDouble(textField_26.getText()) * 6;
				p28= Double.parseDouble(textField_27.getText()) * 1.5;
				
				st=p1+p2+p3+p4+p5+p6+p7+p8+p9+p10+p11+p12+p13+p14+p15+p16+p17+p18+p19+p20+p21+p22+p23+p24+p25+p26+p27+p28;
				tva = st*5/100;
				t= st+tva;
				
				x1 =String.format(" %.2f",st);
				textField_28.setText(x1 + " RON");
				
				x2 =String.format(" %.2f",tva);
				textField_29.setText(x2 + " RON");
				
				x3 =String.format(" %.2f",t);
				textField_30.setText(x3 + " RON");
				
			}
		});
		btnNewButton_9.setBounds(10, 524, 150, 40);
		btnNewButton_9.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		panel_4.add(btnNewButton_9);
		
		Random random = new Random();
		
		JButton btnNewButton_9_1 = new JButton("Bill");
		btnNewButton_9_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(
				"Reference number :      " +  	random.nextInt(4000000) +"\n"
				+"========================================"+"\n"
				+box1.getText()+"  :   "+ textField.getText()+ "\n" 
				+box2.getText()+"  :   "+ textField_1.getText()+ "\n" 
				+box3.getText()+"  :   "+ textField_2.getText()+"\n" 
				+box4.getText()+"  :   "+ textField_3.getText()+ "\n" 
				+box5.getText()+"  :   "+ textField_4.getText()+"\n" 
				+box6.getText()+"  :   "+ textField_5.getText()+ "\n" 
				+box7.getText()+"  :   "+ textField_6.getText()+"\n" 
				+box8.getText()+"  :   "+ textField_7.getText()+ "\n" 
				+box9.getText()+"  :   "+ textField_8.getText()+"\n" 
				+box10.getText()+"  :   "+ textField_9.getText()+ "\n" 
				+box11.getText()+"  :   "+ textField_10.getText()+"\n" 
				+box12.getText()+"  :   "+ textField_11.getText()+ "\n" 
				+box13.getText()+"  :   "+ textField_12.getText()+"\n" 
				+box14.getText()+"  :   "+ textField_13.getText()+ "\n" 
				+box15.getText()+"  :   "+ textField_14.getText()+"\n" 
				+box16.getText()+"  :   "+ textField_15.getText()+ "\n" 
				+box17.getText()+"  :   "+ textField_16.getText()+"\n" 
				+box18.getText()+"  :   "+ textField_17.getText()+ "\n" 
				+box19.getText()+"  :   "+ textField_18.getText()+"\n" 
				+box20.getText()+"  :   "+ textField_19.getText()+ "\n" 
				+box21.getText()+"  :   "+ textField_20.getText()+"\n" 
				+box22.getText()+"  :   "+ textField_21.getText()+ "\n" 
				+box23.getText()+"  :   "+ textField_22.getText()+"\n" 
				+box24.getText()+"  :   "+ textField_23.getText()+ "\n" 
				+box25.getText()+"  :   "+ textField_24.getText()+"\n" 
				+box26.getText()+"  :   "+ textField_25.getText()+ "\n" 
				+box27.getText()+"  :   "+ textField_26.getText()+"\n" 
				+box28.getText()+"  :   "+ textField_27.getText()+"\n" 
				+"========================================"+"\n"
				+"Subtotal :      " + textField_28.getText()+"\n"
				+"TVA              :" + textField_29.getText()+"\n"
				+"Total          :" + textField_30.getText()+"\n"
				+"======================================="+"\n"
				+"Thank you!"
			
			
			);
				
				
			}
		});
		btnNewButton_9_1.setBounds(175, 524, 150, 40);
		btnNewButton_9_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		panel_4.add(btnNewButton_9_1);
		
		JButton btnNewButton_9_2 = new JButton("Reset");
		btnNewButton_9_2.setBounds(341, 524, 150, 40);
		btnNewButton_9_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				box1.setEnabled(false);
				box2.setEnabled(false);
				box3.setEnabled(false);
				box4.setEnabled(false);
				box5.setEnabled(false);
				box6.setEnabled(false);
				box7.setEnabled(false);
				box8.setEnabled(false);
				box9.setEnabled(false);
				box10.setEnabled(false);
				box11.setEnabled(false);
				box12.setEnabled(false);
				box13.setEnabled(false);
				box14.setEnabled(false);
				box15.setEnabled(false);
				box16.setEnabled(false);
				box17.setEnabled(false);
				box18.setEnabled(false);
				box19.setEnabled(false);
				box20.setEnabled(false);
				box21.setEnabled(false);
				box22.setEnabled(false);
				box23.setEnabled(false);
				box24.setEnabled(false);
				box25.setEnabled(false);
				box26.setEnabled(false);
				box27.setEnabled(false);
				box28.setEnabled(false);
				box1.setSelected(false);
				box2.setSelected(false);
				box3.setSelected(false);
				box4.setSelected(false);
				box5.setSelected(false);
				box6.setSelected(false);
				box7.setSelected(false);
				box8.setSelected(false);
				box9.setSelected(false);
				box10.setSelected(false);
				box11.setSelected(false);
				box12.setSelected(false);
				box13.setSelected(false);
				box14.setSelected(false);
				box15.setSelected(false);
				box16.setSelected(false);
				box17.setSelected(false);
				box18.setSelected(false);
				box19.setSelected(false);
				box20.setSelected(false);
				box21.setSelected(false);
				box22.setSelected(false);
				box23.setSelected(false);
				box24.setSelected(false);
				box25.setSelected(false);
				box26.setSelected(false);
				box27.setSelected(false);
				box28.setSelected(false);
				
				textField.setEnabled(false);
				textField.setText("0");
				textField_1.setEnabled(false);
				textField_1.setText("0");
				textField_2.setEnabled(false);
				textField_2.setText("0");
				textField_3.setEnabled(false);
				textField_3.setText("0");
				textField_4.setEnabled(false);
				textField_4.setText("0");
				textField_5.setEnabled(false);
				textField_5.setText("0");
				textField_6.setEnabled(false);
				textField_6.setText("0");
				textField_7.setEnabled(false);
				textField_7.setText("0");
				textField_8.setEnabled(false);
				textField_8.setText("0");
				textField_9.setEnabled(false);
				textField_9.setText("0");
				textField_10.setEnabled(false);
				textField_10.setText("0");
				textField_11.setEnabled(false);
				textField_11.setText("0");
				textField_12.setEnabled(false);
				textField_12.setText("0");
				textField_13.setEnabled(false);
				textField_13.setText("0");
				textField_14.setEnabled(false);
				textField_14.setText("0");
				textField_15.setEnabled(false);
				textField_15.setText("0");
				textField_16.setEnabled(false);
				textField_16.setText("0");
				textField_17.setEnabled(false);
				textField_17.setText("0");
				textField_18.setEnabled(false);
				textField_18.setText("0");
				textField_19.setEnabled(false);
				textField_19.setText("0");
				textField_20.setEnabled(false);
				textField_20.setText("0");
				textField_21.setEnabled(false);
				textField_21.setText("0");
				textField_22.setEnabled(false);
				textField_22.setText("0");
				textField_23.setEnabled(false);
				textField_23.setText("0");
				textField_24.setEnabled(false);
				textField_24.setText("0");
				textField_25.setEnabled(false);
				textField_25.setText("0");
				textField_26.setEnabled(false);
				textField_26.setText("0");
				textField_27.setEnabled(false);
				textField_27.setText("0");
				textField_28.setText(null);
				textField_29.setText(null);
				textField_30.setText(null);
				textArea.setText(null);
				
			}
		});
		btnNewButton_9_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		panel_4.add(btnNewButton_9_2);
		
		JLabel lblNewLabel_3 = new JLabel("Subtotal");
		lblNewLabel_3.setBounds(10, 10, 225, 25);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		panel_4.add(lblNewLabel_3);
		
		textField_28 = new JTextField();
		textField_28.setBounds(255, 13, 225, 25);
		textField_28.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		panel_4.add(textField_28);
		textField_28.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("TVA");
		lblNewLabel_3_1.setBounds(10, 45, 225, 25);
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		panel_4.add(lblNewLabel_3_1);
		
		textField_29 = new JTextField();
		textField_29.setBounds(255, 48, 225, 25);
		textField_29.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_29.setColumns(10);
		panel_4.add(textField_29);
		
		JLabel lblNewLabel_3_2 = new JLabel("Total");
		lblNewLabel_3_2.setBounds(10, 80, 225, 25);
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		panel_4.add(lblNewLabel_3_2);
		
		textField_30 = new JTextField();
		textField_30.setBounds(255, 83, 225, 25);
		textField_30.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_30.setColumns(10);
		panel_4.add(textField_30);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 115, 481, 394);
		panel_4.add(scrollPane);
		
		scrollPane.setViewportView(textArea);
		frmBdPoint.setVisible(true);
	}
}
