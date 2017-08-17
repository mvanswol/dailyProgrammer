import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QuickTaskOrganizerUI extends JFrame {
	
	private JLabel lbl;
	
	public QuickTaskOrganizerUI() {
		initUI();
	}
	
	private void initUI() {
		
		setLayout(null);
		
		// Text Field
		JTextField field = new JTextField(15);
		lbl = new JLabel();
		
		field.getDocument().addDocumentListener(new MyDocumentListener());
		createLayout(field,lbl);
		
		// Quit Button
		JButton quitButton = new JButton("QUIT");
		quitButton.setBounds(250, 400, 80,40);
		add(quitButton);
		quitButton.addActionListener((ActionEvent event) -> { System.exit(0);});
		
		//createLayout(quitButton);
		
		setTitle("QuickTaskOrganizer");
		setSize(600,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void createLayout(JComponent... arg)
	{
		Container pane = getContentPane();
		GroupLayout gl = new GroupLayout(pane);
		pane.setLayout(gl);
		
		gl.setAutoCreateContainerGaps(true);
		gl.setAutoCreateGaps(true);
		gl.setHorizontalGroup(gl.createParallelGroup()
	                .addComponent(arg[0])
	                .addComponent(arg[1])
	                .addGap(250)
	        );

	    gl.setVerticalGroup(gl.createSequentialGroup()
	                .addComponent(arg[0], GroupLayout.DEFAULT_SIZE, 
	                        GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	                .addComponent(arg[1])
	                .addGap(150)
	        );

	    pack();
	}
	
	private class MyDocumentListener implements DocumentListener {
		private String text;
		
		@Override
		public void insertUpdate(DocumentEvent e) {
			updateLabel(e);
		}
		
		@Override
		public void removeUpdate(DocumentEvent e) {
			updateLabel(e);
		}
		
		@Override
		public void changedUpdate(DocumentEvent e) {
		}
		
		private void updateLabel(DocumentEvent e) {
			
			Document doc = e.getDocument();
			int len = doc.getLength();
			
			try {
				text = doc.getText(0, len);
			} catch (BadLocationException ex) {
				Logger.getLogger(JTextField.class.getName()).log(Level.SEVERE, null, ex);
			}
			
			lbl.setText(text);
		}
	}
	
	

}
