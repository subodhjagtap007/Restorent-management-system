	import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;

public class Resto {

	private JFrame frame;
	private JTextField txtQty;
	private JTextField textField_2;
	double firstname;
	double secondnum;
	double result;
	String operation;
	
	double []i=new double[5];
	double usa=1.2;
	double India=1;

	double nigeria=2.3;
	double pakistan=3;
	double australia=4;

	double dubai=4.5;
	protected JLabel label_11;
	private JTextField textPane_3;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Resto window = new Resto();
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
	public Resto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1300, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 88, 593, 241);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 7));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Chicken sandwich");
		lblNewLabel_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setBounds(24, 27, 164, 20);
		panel.add(lblNewLabel_1);
		
		JLabel lblChickenBurger = new JLabel("Chicken burger");
		lblChickenBurger.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblChickenBurger.setBounds(24, 80, 164, 20);
		panel.add(lblChickenBurger);
		
		JLabel lblChicken = new JLabel("Chicken meal");
		lblChicken.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblChicken.setBounds(24, 121, 164, 20);
		panel.add(lblChicken);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(203, 27, 242, 27);
		panel.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(203, 80, 242, 27);
		panel.add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(198, 125, 242, 27);
		panel.add(textPane_2);
		
		JLabel lblDrink = new JLabel("Drink");
		lblDrink.setFont(new Font("Bookman Old Style", Font.PLAIN, 18));
		lblDrink.setBounds(24, 152, 164, 20);
		panel.add(lblDrink);
		
		JLabel lblQty = new JLabel("Qty");
		lblQty.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblQty.setBounds(187, 156, 164, 20);
		panel.add(lblQty);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select a Drink", "Coffe", "maza", "kukka", "tea", "icetea", "rassa"}));
		comboBox.setBounds(23, 180, 131, 27);
		panel.add(comboBox);
		
		txtQty = new JTextField();
		txtQty.setBounds(187, 187, 86, 20);
		panel.add(txtQty);
		txtQty.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Home delivery");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxNewCheckBox.setBounds(24, 207, 130, 27);
		panel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Tax");
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxNewCheckBox_1.setBounds(205, 211, 97, 23);
		panel.add(chckbxNewCheckBox_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 336, 593, 137);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 7));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label = new JLabel("Cost of Drinks");
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setBounds(21, 22, 164, 20);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("Cost of meal");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_1.setBounds(21, 54, 164, 20);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("Cost of delivery");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_2.setBounds(21, 86, 164, 20);
		panel_1.add(label_2);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(221, 22, 194, 19);
		lblNewLabel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.add(lblNewLabel_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_3.setBounds(221, 59, 194, 19);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_4.setBounds(221, 91, 194, 19);
		panel_1.add(label_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(633, 88, 342, 241);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 7));
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Choose currency");
		lblNewLabel_3.setFont(new Font("Gungsuh", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_3.setBounds(60, 11, 210, 27);
		panel_2.add(lblNewLabel_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"select country", "usa", "india", "nigeria", "pakistan", "australia", "dubai"}));
		comboBox_1.setBounds(58, 59, 167, 43);
		panel_2.add(comboBox_1);
		
		JLabel label_11 = new JLabel("");
		label_11.setHorizontalAlignment(SwingConstants.RIGHT);
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_11.setBounds(60, 158, 165, 27);
		panel_2.add(label_11);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setBounds(58, 118, 167, 20);
		panel_2.add(textPane_3);
		
		JButton btnNewButton = new JButton("Convert");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double British_pounds=Double.parseDouble(textPane_3.getText());
				if(comboBox_1.getSelectedItem().equals("india"))
				{
					String cConvert1=String.format("Rs%.2f", British_pounds*India);
					label_11.setText(cConvert1);
				}
				
				double British_poundss=Double.parseDouble(textPane_3.getText());
				if(comboBox_1.getSelectedItem().equals("usa"))
				{
					String cConvert2=String.format("$%.2f", British_poundss*usa);
					label_11.setText(cConvert2);
				}
				double British_poundsss=Double.parseDouble(textPane_3.getText());
				if(comboBox_1.getSelectedItem().equals("nigeria"))
				{
					String cConvert3=String.format("$%.2f", British_poundsss*nigeria);
					label_11.setText(cConvert3);
				}
				
				double British_poundssss=Double.parseDouble(textPane_3.getText());
				if(comboBox_1.getSelectedItem().equals("pakistan"))
				{
					String cConvert4=String.format("Rs%.2f", British_poundssss*pakistan);
					label_11.setText(cConvert4);
				}
				double British_poundsssss=Double.parseDouble(textPane_3.getText());
				if(comboBox_1.getSelectedItem().equals("australia"))
				{
					String cConvert5=String.format("$%.2f", British_poundsssss*australia);
					label_11.setText(cConvert5);
				}
				double British_poundssssss=Double.parseDouble(textPane_3.getText());
				if(comboBox_1.getSelectedItem().equals("dubai"))
				{
					String cConvert6=String.format("dirham%.2f", British_poundssssss*dubai);
					label_11.setText(cConvert6);
				}
				
				
				
			}
		});
		btnNewButton.setBounds(35, 196, 89, 34);
		panel_2.add(btnNewButton);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane_3.setText(null);
				label_11.setText(null);
			}
		});
		btnClose.setBounds(165, 196, 89, 34);
		panel_2.add(btnClose);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(631, 336, 344, 137);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 7));
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel label_5 = new JLabel("Tax");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_5.setBounds(10, 22, 118, 20);
		panel_3.add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_6.setBounds(149, 22, 105, 19);
		panel_3.add(label_6);
		
		JLabel label_7 = new JLabel("Subtotal");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_7.setBounds(10, 55, 118, 20);
		panel_3.add(label_7);
		
		JLabel label_8 = new JLabel("");
		label_8.setHorizontalAlignment(SwingConstants.RIGHT);
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_8.setBounds(149, 56, 105, 19);
		panel_3.add(label_8);
		
		JLabel label_9 = new JLabel("Total");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_9.setBounds(10, 87, 118, 20);
		panel_3.add(label_9);
		
		JLabel label_10 = new JLabel("");
		label_10.setHorizontalAlignment(SwingConstants.RIGHT);
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_10.setBounds(149, 92, 105, 19);
		panel_3.add(label_10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(983, 86, 291, 387);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 7));
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 26, 271, 350);
		panel_4.add(tabbedPane);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_6, null);
		panel_6.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 246, 300);
		panel_6.add(textArea);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_7, null);
		panel_7.setLayout(null);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_2.setColumns(10);
		textField_2.setBounds(10, 28, 250, 41);
		panel_7.add(textField_2);
		
		JButton button_18 = new JButton("1");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber=textField_2.getText()+button_18.getText();
				textField_2.setText(Enternumber);
			
					
			}
		});
		button_18.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_18.setBounds(10, 80, 55, 33);
		panel_7.add(button_18);
		
		JButton button_19 = new JButton("2");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber=textField_2.getText()+button_19.getText();
				textField_2.setText(Enternumber);
			
			}
		});
		button_19.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_19.setBounds(75, 81, 55, 32);
		panel_7.add(button_19);
		
		JButton button_20 = new JButton("3");
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber=textField_2.getText()+button_20.getText();
				textField_2.setText(Enternumber);
			}
		});
		button_20.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_20.setBounds(140, 81, 55, 32);
		panel_7.add(button_20);
		
		JButton button_21 = new JButton("4");
		button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber=textField_2.getText()+button_21.getText();
				textField_2.setText(Enternumber);
			}
		});
		button_21.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_21.setBounds(205, 80, 55, 33);
		panel_7.add(button_21);
		
		JButton button_22 = new JButton("5");
		button_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber=textField_2.getText()+button_22.getText();
				textField_2.setText(Enternumber);
			}
		});
		button_22.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_22.setBounds(10, 124, 55, 32);
		panel_7.add(button_22);
		
		JButton button_23 = new JButton("6");
		button_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber=textField_2.getText()+button_23.getText();
				textField_2.setText(Enternumber);
			}
		});
		button_23.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_23.setBounds(75, 124, 55, 33);
		panel_7.add(button_23);
		
		JButton button_24 = new JButton("7");
		button_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber=textField_2.getText()+button_24.getText();
				textField_2.setText(Enternumber);
			}
		});
		button_24.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_24.setBounds(140, 124, 55, 34);
		panel_7.add(button_24);
		
		JButton button_25 = new JButton("8");
		button_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber=textField_2.getText()+button_25.getText();
				textField_2.setText(Enternumber);
			}
		});
		button_25.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_25.setBounds(205, 124, 55, 32);
		panel_7.add(button_25);
		
		JButton button_26 = new JButton("9");
		button_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber=textField_2.getText()+button_26.getText();
				textField_2.setText(Enternumber);
			}
		});
		button_26.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_26.setBounds(10, 171, 55, 33);
		panel_7.add(button_26);
		
		JButton button_27 = new JButton("0");
		button_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber=textField_2.getText()+button_27.getText();
				textField_2.setText(Enternumber);
			}
		});
		button_27.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_27.setBounds(75, 171, 55, 33);
		panel_7.add(button_27);
		
		JButton button_28 = new JButton("+");
		button_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstname=Double.parseDouble(textField_2.getText());
				textField_2.setText("");
				operation="+";
			}
		});
		button_28.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_28.setBounds(140, 169, 55, 35);
		panel_7.add(button_28);
		
		JButton button_29 = new JButton("-");
		button_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstname=Double.parseDouble(textField_2.getText());
				textField_2.setText("");
				operation="-";
			}
		});
		button_29.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_29.setBounds(205, 171, 55, 33);
		panel_7.add(button_29);
		
		JButton button_30 = new JButton("/");
		button_30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstname=Double.parseDouble(textField_2.getText());
				textField_2.setText("");
				operation="/";
			}
		});
		button_30.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_30.setBounds(10, 215, 55, 34);
		panel_7.add(button_30);
		
		JButton button_31 = new JButton("*");
		button_31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstname=Double.parseDouble(textField_2.getText());
				textField_2.setText("");
				operation="*";
			}
		});
		button_31.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_31.setBounds(75, 215, 55, 34);
		panel_7.add(button_31);
		
		JButton button_32 = new JButton("+/-");
		button_32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(textField_2.getText()));
				ops=ops*(-1);
				textField_2.setText(String.valueOf(ops));
			}
		});
		button_32.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_32.setBounds(140, 216, 55, 33);
		panel_7.add(button_32);
		
		JButton button_33 = new JButton(".");
		button_33.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_33.setBounds(205, 216, 55, 33);
		panel_7.add(button_33);
		
		JButton button_34 = new JButton("c");
		button_34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_2.setText(null);
			}
		});
		button_34.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_34.setBounds(10, 270, 120, 41);
		panel_7.add(button_34);
		
		JButton button_35 = new JButton("=");
		button_35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondnum=Double.parseDouble(textField_2.getText());
				if(operation=="+")
				{
					result=firstname+secondnum;
					answer=String.format("%.2f", result);
					textField_2.setText(answer);
				}
				else if(operation =="-") {
					result=firstname-secondnum;
					answer=String.format("%.2f", result);
					textField_2.setText(answer);
				}
				else if(operation =="*") {
					result=firstname*secondnum;
					answer=String.format("%.2f", result);
					textField_2.setText(answer);
				}
				else if(operation =="/") {
					result=firstname/secondnum;
					answer=String.format("%.2f", result);
					textField_2.setText(answer);
				}
			}
		});
		button_35.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_35.setBounds(140, 270, 120, 40);
		panel_7.add(button_35);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(10, 484, 1264, 127);
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 7));
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double chicsandwich=Double.parseDouble(textPane.getText());
				double ichicsandwich=4;
				double sandwich;
				sandwich=(chicsandwich*ichicsandwich);
				String pmeal=String.format("%.2f", sandwich);
				label_3.setText(pmeal);
				
				double chicburger=Double.parseDouble(textPane_1.getText());
				double iburger=2;
				double burger2 ;
				burger2=(chicburger*iburger);
				String smeal=String.format("%.2f", burger2+sandwich);
				//String smeal=String.format("%.2f", burger2);
				label_3.setText(smeal);
				

				double chicmeal=Double.parseDouble(textPane_2.getText());
				double cheakmeal=6.2;
				double chikmeal ;
				chikmeal=(cheakmeal*chicmeal);
				String dmeal=String.format("%.2f", chikmeal+sandwich+burger2);
				//String smeal=String.format("%.2f", burger2);
				label_3.setText(dmeal);
				 double idelivery=4;
				 if(chckbxNewCheckBox.isSelected())
				 {
					 String pdelivery=String.format("%.2f", idelivery);
					 label_4.setText(pdelivery);
					 
				 }
				 else{
				 
					 chckbxNewCheckBox.setText("0");}
				
				
			
			
			//double Drinks=Double.parseDouble(textField.getText());
			double Drinks=Double.parseDouble(txtQty.getText());
			double Coffee1=2*Drinks;
			double maza=3*Drinks;
			double kukka1=10*Drinks;
			double tea1=6*Drinks;
			double icetea1=12*Drinks;
			double rassa1=2.0*Drinks;
			if(comboBox.getSelectedItem().equals("Coffe"))
			{
				String cCoffe=String.format("%.2f",Coffee1);
				lblNewLabel_2.setText(cCoffe);
			}
			if(comboBox.getSelectedItem().equals("maza"))
			{
				String cmaza=String.format("%.2f",maza);
				lblNewLabel_2.setText(cmaza);
			}
			if(comboBox.getSelectedItem().equals("kukka"))
			{
				String ckukka=String.format("%.2f",kukka1);
				lblNewLabel_2.setText(ckukka);
			}
			if(comboBox.getSelectedItem().equals("tea"))
			{
				String ctea=String.format("%.2f",tea1);
				lblNewLabel_2.setText(ctea);
			}
			if(comboBox.getSelectedItem().equals("icetea"))
			{
				String cicetea=String.format("%.2f",icetea1);
				lblNewLabel_2.setText(cicetea);
			}
			if(comboBox.getSelectedItem().equals("rassa"))
			{
				String crassa=String.format("%.2f",rassa1);
				lblNewLabel_2.setText(crassa);
			}
			if(comboBox.getSelectedItem().equals("Select a Drink"))
			{
				//String cCoffe=String.format("%.2f",Coffee1);
				lblNewLabel_2.setText("0");
			}
			double ctotal1=Double.parseDouble(label_3.getText());
			double ctotal2=Double.parseDouble(label_4.getText());
			double ctotal3=Double.parseDouble(lblNewLabel_2.getText());
			double alltotal=(ctotal1+ctotal2+ctotal3)/100;
			if(chckbxNewCheckBox_1.isSelected()) {
				String itotal=String.format("%.2f",alltotal);
				label_6.setText(itotal);
				
			}
				
			double ctotal4=Double.parseDouble(label_6.getText());
			double subTotal=(ctotal1+ctotal2+ctotal3);
			String isubtotal=String.format("n%.2f", subTotal);
			label_8.setText(isubtotal);
			
			//double ctotal5=Double.parseDouble(label_6.getText());
			double allTotal=(ctotal1+ctotal2+ctotal3+ctotal4);
			String isubtotall=String.format("RS%.2f", allTotal);
			label_10.setText(isubtotall);
			
			String iTaxtotal=String.format("RS%.2f",allTotal);
			label_10.setText(iTaxtotal);
			
			
			}
			
		});
		btnTotal.setBounds(180, 30, 89, 34);
		panel_5.add(btnTotal);
		
		JButton btnReceipt = new JButton("Receipt");
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a1=Double.parseDouble(textPane.getText());
				double a2=Double.parseDouble(textPane_1.getText());
				double a3=Double.parseDouble(textPane_2.getText());
				textArea.append("\t\nRestaurent Management System:\n\n"+"chicken sandwich:\t\t"+a1+"\nchicken burger :\t\t"+a2+"\nchicken meal :\t\t"+a3+"\n\nThanks for using restorent");
				//double b1=Double.parseDouble(comboBox.getToolKit());
				//double b2=Double.parseDouble(textPane_1.getText());
				//double b3=Double.parseDouble(textPane_2.getText());
			//	textArea.append("\t\nRestaurent Management System:\n\n"+"chicken sandwich:\t\t"+a1+"\nchicken burger :\t\t"+a2+"\nchicken meal :\t\t"+a3+"\n\nThanks for using restorent");
			
			
			}
		});
		btnReceipt.setBounds(375, 30, 89, 34);
		panel_5.add(btnReceipt);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane.setText(null);
				textPane_1.setText(null);
				textPane_2.setText(null);
				txtQty.setText(null);
				lblNewLabel_2.setText(null);
				label_3.setText(null);
				label_4.setText(null);
				//btnTotal.setText(null);
			//	btnReceipt.setText(null);
				//btnExit.setText(null);
				//btnNewButton.setText(null);
				//btnClose.setText(null);
				label_6.setText(null);
				label_8.setText(null);
				label_10.setText(null);
				//btnTotal.setText(null);
				//btnReceipt.setText(null);
				comboBox.setSelectedItem("Select a Drink");
				comboBox_1.setSelectedItem("select country");
			//	panel.setText(null);
				label_11.setText(null);
				textPane_3.setText(null);
				
				
				
				
				
			}
		});
		btnReset.setBounds(544, 30, 89, 34);
		panel_5.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBounds(742, 30, 89, 34);
		panel_5.add(btnExit);
		
		
		JLabel lblNewLabel = new JLabel("Restorent Management System");
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setBounds(147, -4, 978, 81);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 70));
		frame.getContentPane().add(lblNewLabel);
	}
}
