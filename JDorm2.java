import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JDorm2 extends JFrame implements ItemListener {
	FlowLayout flow = new FlowLayout();
	JLabel label = new JLabel("What features would you like in your dormitory room?");
	JCheckBox privateRoom = new JCheckBox("Private Room", false);
	JCheckBox internet = new JCheckBox("Internet", false);
	JCheckBox cableTV = new JCheckBox("Cable TV", false);
	JCheckBox microwave = new JCheckBox("Microwave", false);
	JCheckBox miniFridge = new JCheckBox("MiniFridge", false);
	JCheckBox hardwood = new JCheckBox("Hardwood Floors", false);
	JLabel selections = new JLabel();
	
	
	public JDorm2() {
				super("JDorm");
				setSize(400, 400);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setLayout(flow);
				privateRoom.addItemListener(this);
				internet.addItemListener(this);
				cableTV.addItemListener(this);
				microwave.addItemListener(this);
				miniFridge.addItemListener(this);
				hardwood.addItemListener(this);
				add(label);
				add(privateRoom);
				add(internet);
				add(cableTV);
				add(microwave);
				add(miniFridge);
				add(hardwood);
				
				add(selections);
					
	}
	public void itemStateChanged(ItemEvent e)
	{
		Object source = e.getItem();
		int select = e.getStateChange();
		if(select==ItemEvent.SELECTED)
		{
			JCheckBox box = (JCheckBox) source;
			box.getText().toString()
		}
		else{
			JCheckBox box = (JCheckBox) source;
			selections.append("Exclude ");
			selections.append(box.getText().toString()+ "\n");
		}
	}
}