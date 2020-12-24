package com.test;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.*;

public class Savoir extends Frame {

	JFrame frame;
	JLabel l1,l2;
	
	ArrayList<String> listeCitation = new ArrayList<String>();

	Savoir() {
		
		// creation label
		l1 = new JLabel("Le Saviez-vous ?");
		l1.setBounds(20, 60, 200, 30);
		l1.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
		l1.setForeground(Color.white);

		listeCitation.add("La Bière ne fait pas prendre du ventre.");
		listeCitation.add("Etre ameureux vous rend fainéant.");

		l2 = new JLabel();
		l2.setText(listeCitation.get(1));
		l2.setBounds(25, 150, 250, 50);
		l2.setFont(new Font("Comic Sans MS", Font.ITALIC, 14));
		l2.setForeground(Color.white);

		// creation button
		JButton btn = new JButton("MONTRER  UN AUTRE FAIT");// creating instance of JButton
		btn.setBounds(20, 340, 340, 30);// x , y , width, height
		btn.setForeground(new Color(249, 132, 91));
		btn.setBackground(new Color(238, 243, 248));
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					l2.setText(listeCitation.get(0));
					setBackground(new Color(125, 102, 158));
				} catch (Exception ex) {
					System.out.println(ex);
				}
			}

		});
		
		this.add(btn);
		this.add(l1);
		this.add(l2);
		this.setBackground(new Color(255, 132, 91));
		this.setTitle("Le Saviez-vous ?");
		this.setSize(400,400);    
		this.setVisible(true);
		this.setLayout(null);
		//this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	

}
