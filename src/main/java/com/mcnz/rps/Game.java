package com.mcnz.rps;

import javax.swing.JOptionPane;
import javax.swing.*;

public class Game {
	
	public static void main(String[] args) {
		String prompt = "Will it be rock, paper or scissors edited edited?";
		String input = JOptionPane.showInputDialog(prompt);
		System.out.println("You selected edited edited: " + input);
	}

}
