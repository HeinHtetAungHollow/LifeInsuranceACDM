package forms;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;

public class RegisterationForm {

	private JFrame frame;
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private JTextField txtFieldStartDatehome;
	private JTextField txtFieldEndDatehome;
	private JTextField txtFieldSearchhome;
	private JTextField txtFieldCusName;
	private JTextField txtFieldCusNrc;
	private JTextField txtFieldCusPhone;
	private JTextField txtFieldEmail;
	private JTextField txtFieldCusOccupation;
	private JTextField txtFieldIncome;
	private JTextField txtFieldBenName;
	private JTextField txtFieldBenNrc;
	private JTextField txtFieldBenPhone;
	private JTextField txtFieldBenEmail;
	private JTextField txtFieldBenOccupation;
	private JTextField txtFieldPaymentTermRegis;
	private JTextField txtFieldStartDateRegis;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterationForm window = new RegisterationForm();
					window.frame.setVisible(true);
					window.frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RegisterationForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(150, 10, 1080, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1064, 59);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblLogo = new JLabel("");		
		Image image=new ImageIcon(this.getClass().getResource("/Love-cloud-icon.png")).getImage();
		lblLogo.setIcon(new ImageIcon(image));
		lblLogo.setBounds(201, 5, 50, 50);
		
		panel.add(lblLogo);
		
		JLabel lblCompanyName = new JLabel("ACDM Life Insurance");
		lblCompanyName.setForeground(new Color(34, 139, 34));
		lblCompanyName.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 23));
		lblCompanyName.setBounds(267, 5, 312, 51);
		panel.add(lblCompanyName);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setForeground(new Color(34, 139, 34));
		btnLogout.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		btnLogout.setBounds(913, 14, 101, 32);
		panel.add(btnLogout);
		
		tabbedPane.setBounds(40, 68, 989, 603);
		frame.getContentPane().add(tabbedPane);
		
		JPanel Home = new JPanel();
		tabbedPane.addTab("Home", null, Home, null);
		tabbedPane.setForegroundAt(0, new Color(34, 139, 34));
		Home.setLayout(null);
		
		JComboBox cboInsurancehome = new JComboBox();
		cboInsurancehome.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 12));
		cboInsurancehome.setModel(new DefaultComboBoxModel(new String[] {"Insurance"}));
		cboInsurancehome.setBounds(12, 10, 184, 30);
		Home.add(cboInsurancehome);
		
		JComboBox cboPlanhome = new JComboBox();
		cboPlanhome.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 12));
		cboPlanhome.setModel(new DefaultComboBoxModel(new String[] {"Plan"}));
		cboPlanhome.setBounds(12, 50, 184, 30);
		Home.add(cboPlanhome);
		
		JLabel lblStartDate = new JLabel("Start Date");
		lblStartDate.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 13));
		lblStartDate.setBounds(251, 10, 81, 30);
		Home.add(lblStartDate);
		
		JLabel lblEndDate = new JLabel("End Date");
		lblEndDate.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 13));
		lblEndDate.setBounds(251, 50, 81, 30);
		Home.add(lblEndDate);
		
		txtFieldStartDatehome = new JTextField();
		txtFieldStartDatehome.setBounds(361, 15, 146, 25);
		Home.add(txtFieldStartDatehome);
		txtFieldStartDatehome.setColumns(10);
		
		txtFieldEndDatehome = new JTextField();
		txtFieldEndDatehome.setColumns(10);
		txtFieldEndDatehome.setBounds(361, 55, 146, 25);
		Home.add(txtFieldEndDatehome);
		
		txtFieldSearchhome = new JTextField();
		txtFieldSearchhome.setColumns(10);
		txtFieldSearchhome.setBounds(614, 16, 146, 25);
		Home.add(txtFieldSearchhome);
		
		JButton btnSearchhome = new JButton("Search");
		btnSearchhome.setBounds(870, 15, 102, 21);
		Home.add(btnSearchhome);
		
		JButton btnUpdatehome = new JButton("Update");
		btnUpdatehome.setBounds(43, 517, 129, 21);
		Home.add(btnUpdatehome);
		
		JButton btnDeletehome = new JButton("Delete");
		btnDeletehome.setBounds(205, 517, 129, 21);
		Home.add(btnDeletehome);
		
		JPanel Register = new JPanel();
		tabbedPane.addTab("Register", null, Register, null);
		tabbedPane.setForegroundAt(1, new Color(34, 139, 34));
		Register.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration Form");
		lblNewLabel.setForeground(new Color(34, 139, 34));
		lblNewLabel.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 19));
		lblNewLabel.setBounds(417, 10, 186, 37);
		Register.add(lblNewLabel);
		
		JLabel lblCusInfo = new JLabel("Customer Information");
		lblCusInfo.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 12));
		lblCusInfo.setBounds(109, 60, 144, 20);
		Register.add(lblCusInfo);
		
		JLabel lblBenInfo = new JLabel("Benefitiary Information");
		lblBenInfo.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 12));
		lblBenInfo.setBounds(446, 57, 144, 20);
		Register.add(lblBenInfo);
		
		JLabel lblInsuranceInfo = new JLabel("Insurance Information");
		lblInsuranceInfo.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 12));
		lblInsuranceInfo.setBounds(761, 57, 144, 20);
		Register.add(lblInsuranceInfo);
		
		JLabel lblName = new JLabel("Name");
		lblName.setHorizontalAlignment(SwingConstants.LEFT);
		lblName.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 12));
		lblName.setBounds(26, 107, 78, 20);
		Register.add(lblName);
		
		JLabel lblNrc = new JLabel("NRC");
		lblNrc.setHorizontalAlignment(SwingConstants.LEFT);
		lblNrc.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 12));
		lblNrc.setBounds(26, 147, 78, 20);
		Register.add(lblNrc);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhone.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 12));
		lblPhone.setBounds(26, 190, 78, 20);
		Register.add(lblPhone);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setHorizontalAlignment(SwingConstants.LEFT);
		lblAddress.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 12));
		lblAddress.setBounds(26, 234, 78, 20);
		Register.add(lblAddress);
		
		JLabel lblEmail = new JLabel("EMail");
		lblEmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmail.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 12));
		lblEmail.setBounds(26, 336, 78, 20);
		Register.add(lblEmail);
		
		JLabel lblOccupation = new JLabel("Occupation");
		lblOccupation.setHorizontalAlignment(SwingConstants.LEFT);
		lblOccupation.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 12));
		lblOccupation.setBounds(26, 389, 78, 20);
		Register.add(lblOccupation);
		
		JLabel lblIncome = new JLabel("Income");
		lblIncome.setHorizontalAlignment(SwingConstants.LEFT);
		lblIncome.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 12));
		lblIncome.setBounds(26, 441, 78, 20);
		Register.add(lblIncome);
		
		txtFieldCusName = new JTextField();
		txtFieldCusName.setBounds(130, 108, 144, 19);
		Register.add(txtFieldCusName);
		txtFieldCusName.setColumns(10);
		
		txtFieldCusNrc = new JTextField();
		txtFieldCusNrc.setColumns(10);
		txtFieldCusNrc.setBounds(130, 148, 144, 19);
		Register.add(txtFieldCusNrc);
		
		txtFieldCusPhone = new JTextField();
		txtFieldCusPhone.setColumns(10);
		txtFieldCusPhone.setBounds(130, 191, 144, 19);
		Register.add(txtFieldCusPhone);
		
		txtFieldEmail = new JTextField();
		txtFieldEmail.setColumns(10);
		txtFieldEmail.setBounds(130, 337, 144, 19);
		Register.add(txtFieldEmail);
		
		txtFieldCusOccupation = new JTextField();
		txtFieldCusOccupation.setColumns(10);
		txtFieldCusOccupation.setBounds(130, 390, 144, 19);
		Register.add(txtFieldCusOccupation);
		
		txtFieldIncome = new JTextField();
		txtFieldIncome.setColumns(10);
		txtFieldIncome.setBounds(130, 442, 144, 19);
		Register.add(txtFieldIncome);
		
		JTextPane txtPaneCusAddress = new JTextPane();
		txtPaneCusAddress.setBounds(130, 234, 144, 82);
		Register.add(txtPaneCusAddress);
		
		JLabel lblBenName = new JLabel("Name");
		lblBenName.setHorizontalAlignment(SwingConstants.LEFT);
		lblBenName.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 12));
		lblBenName.setBounds(374, 107, 78, 20);
		Register.add(lblBenName);
		
		txtFieldBenName = new JTextField();
		txtFieldBenName.setColumns(10);
		txtFieldBenName.setBounds(478, 108, 144, 19);
		Register.add(txtFieldBenName);
		
		JLabel lblBenNrc = new JLabel("NRC");
		lblBenNrc.setHorizontalAlignment(SwingConstants.LEFT);
		lblBenNrc.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 12));
		lblBenNrc.setBounds(374, 147, 78, 20);
		Register.add(lblBenNrc);
		
		txtFieldBenNrc = new JTextField();
		txtFieldBenNrc.setColumns(10);
		txtFieldBenNrc.setBounds(478, 148, 144, 19);
		Register.add(txtFieldBenNrc);
		
		JLabel lblBenPhone = new JLabel("Phone");
		lblBenPhone.setHorizontalAlignment(SwingConstants.LEFT);
		lblBenPhone.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 12));
		lblBenPhone.setBounds(374, 190, 78, 20);
		Register.add(lblBenPhone);
		
		txtFieldBenPhone = new JTextField();
		txtFieldBenPhone.setColumns(10);
		txtFieldBenPhone.setBounds(478, 191, 144, 19);
		Register.add(txtFieldBenPhone);
		
		JLabel lblBenAddress = new JLabel("Address");
		lblBenAddress.setHorizontalAlignment(SwingConstants.LEFT);
		lblBenAddress.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 12));
		lblBenAddress.setBounds(374, 234, 78, 20);
		Register.add(lblBenAddress);
		
		JTextPane txtPaneBenAddress = new JTextPane();
		txtPaneBenAddress.setBounds(478, 234, 144, 82);
		Register.add(txtPaneBenAddress);
		
		JLabel lblBenEmail = new JLabel("EMail");
		lblBenEmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblBenEmail.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 12));
		lblBenEmail.setBounds(374, 336, 78, 20);
		Register.add(lblBenEmail);
		
		txtFieldBenEmail = new JTextField();
		txtFieldBenEmail.setColumns(10);
		txtFieldBenEmail.setBounds(478, 337, 144, 19);
		Register.add(txtFieldBenEmail);
		
		JLabel lblBenOccupation = new JLabel("Occupation");
		lblBenOccupation.setHorizontalAlignment(SwingConstants.LEFT);
		lblBenOccupation.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 12));
		lblBenOccupation.setBounds(374, 389, 78, 20);
		Register.add(lblBenOccupation);
		
		txtFieldBenOccupation = new JTextField();
		txtFieldBenOccupation.setColumns(10);
		txtFieldBenOccupation.setBounds(478, 390, 144, 19);
		Register.add(txtFieldBenOccupation);
		
		JLabel lblCategory = new JLabel("Category");
		lblCategory.setHorizontalAlignment(SwingConstants.LEFT);
		lblCategory.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 12));
		lblCategory.setBounds(683, 107, 78, 20);
		Register.add(lblCategory);
		
		JLabel lblPlan = new JLabel("Plan");
		lblPlan.setHorizontalAlignment(SwingConstants.LEFT);
		lblPlan.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 12));
		lblPlan.setBounds(683, 147, 78, 20);
		Register.add(lblPlan);
		
		JLabel lblPaymentTerms = new JLabel("Payment terms");
		lblPaymentTerms.setHorizontalAlignment(SwingConstants.LEFT);
		lblPaymentTerms.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 12));
		lblPaymentTerms.setBounds(683, 190, 98, 20);
		Register.add(lblPaymentTerms);
		
		JLabel lblPaymentPlan = new JLabel("Payment Plan");
		lblPaymentPlan.setHorizontalAlignment(SwingConstants.LEFT);
		lblPaymentPlan.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 12));
		lblPaymentPlan.setBounds(683, 234, 98, 20);
		Register.add(lblPaymentPlan);
		
		JComboBox cboInsuCategoryRegis = new JComboBox();
		cboInsuCategoryRegis.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 12));
		cboInsuCategoryRegis.setModel(new DefaultComboBoxModel(new String[] {"Category"}));
		cboInsuCategoryRegis.setBounds(799, 107, 152, 20);
		Register.add(cboInsuCategoryRegis);
		
		JComboBox cboPlanRegis = new JComboBox();
		cboPlanRegis.setModel(new DefaultComboBoxModel(new String[] {"Plan"}));
		cboPlanRegis.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 12));
		cboPlanRegis.setBounds(799, 147, 152, 20);
		Register.add(cboPlanRegis);
		
		txtFieldPaymentTermRegis = new JTextField();
		txtFieldPaymentTermRegis.setColumns(10);
		txtFieldPaymentTermRegis.setBounds(800, 191, 65, 19);
		Register.add(txtFieldPaymentTermRegis);
		
		JComboBox cboPaymentPlanRegis = new JComboBox();
		cboPaymentPlanRegis.setModel(new DefaultComboBoxModel(new String[] {"Payment Plan"}));
		cboPaymentPlanRegis.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 12));
		cboPaymentPlanRegis.setBounds(799, 234, 152, 20);
		Register.add(cboPaymentPlanRegis);
		
		JLabel lblPremiumAmount = new JLabel("Premium Amount");
		lblPremiumAmount.setHorizontalAlignment(SwingConstants.LEFT);
		lblPremiumAmount.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 12));
		lblPremiumAmount.setBounds(683, 289, 112, 20);
		Register.add(lblPremiumAmount);
		
		JLabel lblStartDate_1 = new JLabel("Start Date");
		lblStartDate_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblStartDate_1.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 12));
		lblStartDate_1.setBounds(683, 336, 78, 20);
		Register.add(lblStartDate_1);
		
		JComboBox cboPremiumRegis = new JComboBox();
		cboPremiumRegis.setModel(new DefaultComboBoxModel(new String[] {"PremiumAmount"}));
		cboPremiumRegis.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 12));
		cboPremiumRegis.setBounds(799, 289, 152, 20);
		Register.add(cboPremiumRegis);
		
		txtFieldStartDateRegis = new JTextField();
		txtFieldStartDateRegis.setColumns(10);
		txtFieldStartDateRegis.setBounds(799, 337, 144, 19);
		Register.add(txtFieldStartDateRegis);
		
		JButton btnUpdateRegis = new JButton("Update");
		btnUpdateRegis.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 12));
		btnUpdateRegis.setBounds(26, 506, 131, 31);
		Register.add(btnUpdateRegis);
		
		JButton btnCancelRegis = new JButton("Cancel");
		btnCancelRegis.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 12));
		btnCancelRegis.setBounds(820, 511, 131, 31);
		Register.add(btnCancelRegis);
		
		JButton btnRegisterRegis = new JButton("Register");
		btnRegisterRegis.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 12));
		btnRegisterRegis.setBounds(677, 511, 131, 31);
		Register.add(btnRegisterRegis);
		
		JPanel Claim = new JPanel();
		tabbedPane.addTab("Claim", null, Claim, null);
		tabbedPane.setForegroundAt(2, new Color(34, 139, 34));

	
	
	
	
	
	
	
	}
}
