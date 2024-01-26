package com.awt;

import java.awt.Button;
import java.awt.Frame;

public class AwtTutorial extends Frame {

	public AwtTutorial() {
		Button b = new Button("Click here");
		b.setBounds(30,100,80,30);
		b.setSize(getPreferredSize());
}
	
}

class Run{
	public static void main(String[] args) {
		AwtTutorial a = new AwtTutorial();
	}
}
