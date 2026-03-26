import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class 인터페이스_2 extends JFrame implements ActionListener{
	JButton north=new JButton("North");
	//JButton south=new JButton("South");
	JButton center=new JButton("Center");
	JButton east=new JButton("East");
	JButton west=new JButton("West");
	JTextField tf=new JTextField();
	public 인터페이스_2() {
		//화면 UI
		add("North",north); // window 추가
		//add("South",south);
		add("Center",center);
		add("East",east);
		add("West",west);
		add("South",tf);
		//윈도우 크기
		setSize(350, 400);
		setVisible(true);
		
		north.addActionListener(this);
		//south.addActionListener(this);
		center.addActionListener(this);
		east.addActionListener(this);
		west.addActionListener(this);
		tf.addActionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 인터페이스_2();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==north) {
			JOptionPane.showMessageDialog(this, "North Button Click");
		}
//		if(e.getSource()==south) {
//			JOptionPane.showMessageDialog(this, "South Button Click");
//		}
		if(e.getSource()==center) {
			JOptionPane.showMessageDialog(this, "Center Button Click");
		}
		if(e.getSource()==east) {
			JOptionPane.showMessageDialog(this, "East Button Click");
		}
		if(e.getSource()==west) {
			JOptionPane.showMessageDialog(this, "West Button Click");
		}
		else if (e.getSource()==tf) {
			String msg=tf.getText();
			if(msg.length()<1)
				return;
			JOptionPane.showMessageDialog(this, msg);
		}
	}

}
