package java8;

import javax.swing.JButton;

public class ActionListener {
	
	public static void main(String[] args) {
		// Java 8֮ǰ��
		JButton show =  new JButton("Show");
		show.addActionListener((e) -> System.out.println("hello world" + e));
	}

}
