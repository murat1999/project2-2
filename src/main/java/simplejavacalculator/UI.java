/*
 * @name        Simple Java Calculator
 * @file        UI.java
 * @author      Soria Pierre-Henry
 * @copyright   Copyright Pierre-Henry Soria, All Rights Reserved.
 * @license     Apache (http://www.apache.org/licenses/LICENSE-2.0).
 */

package simplejavacalculator;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.Box;
import javax.swing.BoxLayout;



public final class UI implements ActionListener {
   /** frame.*/
   private final JFrame frame;
   /** panel.*/
   private final JPanel panel;
   /** panelSub1.*/
   private final JPanel panelSub1;
   /** panelSub2.*/
   private final JPanel panelSub2;
   /** panelSub3.*/
   private final JPanel panelSub3;
   /** panelSub4.*/
   private final JPanel panelSub4;
   /** panelSub5.*/
   private final JPanel panelSub5;
   /** panelSub6.*/
   private final JPanel panelSub6;
   /** panelSub7.*/
   private final JPanel panelSub7;
   /** panelSub8.*/
   private final JPanel panelSub8;
   /** text.*/
   private final JTextArea text;
   /** button.*/
   private final JButton[] but;
   /** butAdd.*/
   private final JButton butAdd;
   /** butMinus.*/
   private final JButton butMinus;
   /** Multiply.*/
   private final JButton butMultiply;
   /** divide.*/
   private final JButton butDivide;
   /** equal.*/
   private final JButton butEqual;
   /** cancel.*/
   private final JButton butCancel;
   /** square root.*/
   private final JButton butSquareRoot;
   /** square.*/
   private final JButton butSquare;
   /** one divided by.*/
   private final JButton butOneDividedBy;
   /** cos.*/
   private final JButton butCos;
   /** sin.*/
   private final JButton butSin;
   /** tan.*/
   private final JButton butTan;
   /** x power of y.*/
   private final JButton butxpowerofy;
   /** log.*/
   private final JButton butlog;
   /** rate.*/
   private final JButton butrate;
   /** abs.*/
   private final JButton butabs;
   /** binary.*/
   private final JButton butBinary;
   /** calc.*/
   private final Calculator calc;
   /** button value.*/
   private final String[] buttonValue = {"0", "1", "2", "3", "4", "5", "6",
      "7", "8", "9"};
   /** font.*/
   private final Font font;
   /** text font.*/
   private final Font textFont;

   /** UI.*/
   public UI() {
      frame = new JFrame("Calculator PH");

      panel = new JPanel();
      panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
      panelSub1 = new JPanel(new FlowLayout());
      panelSub2 = new JPanel(new FlowLayout());
      panelSub3 = new JPanel(new FlowLayout());
      panelSub4 = new JPanel(new FlowLayout());
      panelSub5 = new JPanel(new FlowLayout());
      panelSub6 = new JPanel(new FlowLayout());
      panelSub7 = new JPanel(new FlowLayout());
      panelSub8 = new JPanel(new FlowLayout());
      final int fontSize = 18;
      final int textSize = 30;
      final int textFontSize = 24;
      font = new Font("Consolas", Font.PLAIN, fontSize);
      text = new JTextArea(1, textSize);
      textFont = new Font("Consolas", Font.BOLD, textFontSize);
      final int sizeButton = 10;
      but = new JButton[sizeButton];
      for (int i = 0; i < sizeButton; i++) {
         but[i] = new JButton(String.valueOf(i));
      }
      butAdd = new JButton("+");
      butMinus = new JButton("-");
      butMultiply = new JButton("*");
      butDivide = new JButton("/");
      butEqual = new JButton("=");
      butSquareRoot = new JButton("sqrt");
      butSquare = new JButton("x*x");
      butOneDividedBy = new JButton("1/x");
      butCos = new JButton("Cos");
      butSin = new JButton("Sin");
      butTan = new JButton("Tan");
      butxpowerofy = new JButton("x^y");
      butlog = new JButton("log10(x)");
      butrate = new JButton("x%");
      butabs = new JButton("abs(x)");
      butCancel = new JButton("C");
      butBinary = new JButton("Bin");
      calc = new Calculator();
   }
   /** comment.*/
   public void init() {
      final int width = 450;
      final int height = 450;
      frame.setSize(width, height);
      frame.setVisible(true);
      frame.setLocationRelativeTo(null);
      frame.setResizable(false);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      text.setFont(textFont);
      text.setEditable(false);
      final int iter = 10;
      for (int i = 0; i < iter; i++) {
         but[i].setFont(font);
      }
      butAdd.setFont(font);
      butMinus.setFont(font);
      butMultiply.setFont(font);
      butDivide.setFont(font);
      butEqual.setFont(font);
      butSquareRoot.setFont(font);
      butSquare.setFont(font);
      butOneDividedBy.setFont(font);
      butCos.setFont(font);
      butSin.setFont(font);
      butTan.setFont(font);
      butxpowerofy.setFont(font);
      butlog.setFont(font);
      butrate.setFont(font);
      butabs.setFont(font);
      butCancel.setFont(font);
      butBinary.setFont(font);
      final int panelWidth = 100;
      panel.add(Box.createHorizontalStrut(panelWidth));
      panelSub1.add(text);
      panel.add(panelSub1);
      panelSub2.add(but[1]);
      panelSub2.add(but[2]);
      final int third = 3;
      panelSub2.add(but[third]);
      final int strut = 15;
      final int forth = 4;
      final int fifth = 5;
      final int sixth = 6;
      final int seventh = 7;
      final int eighth = 8;
      final int ninth = 9;
      panelSub2.add(Box.createHorizontalStrut(strut));
      panelSub2.add(butAdd);
      panelSub2.add(butMinus);
      panel.add(panelSub2);
      panelSub3.add(but[forth]);
      panelSub3.add(but[fifth]);
      panelSub3.add(but[sixth]);
      panelSub3.add(Box.createHorizontalStrut(strut));
      panelSub3.add(butMultiply);
      panelSub3.add(butDivide);
      panel.add(panelSub3);
      panelSub4.add(but[seventh]);
      panelSub4.add(but[eighth]);
      panelSub4.add(but[ninth]);
      panelSub4.add(Box.createHorizontalStrut(strut));
      panelSub4.add(butEqual);
      panelSub4.add(butCancel);
      panel.add(panelSub4);
      panelSub5.add(but[0]);
      final int panelFive = 210;
      panelSub5.add(Box.createHorizontalStrut(panelFive));
      panel.add(panelSub5);
      panelSub6.add(butSquare);
      panelSub6.add(butSquareRoot);
      panelSub6.add(butOneDividedBy);
      panelSub6.add(butxpowerofy);
      panel.add(panelSub6);
      panelSub7.add(butCos);
      panelSub7.add(butSin);
      panelSub7.add(butTan);
      panel.add(panelSub7);
      panelSub8.add(butlog);
      panelSub8.add(butrate);
      panelSub8.add(butabs);
      panelSub8.add(butBinary);
      panel.add(panelSub8);
      for (int i = 0; i < iter; i++) {
         but[i].addActionListener(this);
      }
      butAdd.addActionListener(this);
      butMinus.addActionListener(this);
      butMultiply.addActionListener(this);
      butDivide.addActionListener(this);
      butSquare.addActionListener(this);
      butSquareRoot.addActionListener(this);
      butOneDividedBy.addActionListener(this);
      butCos.addActionListener(this);
      butSin.addActionListener(this);
      butTan.addActionListener(this);
      butxpowerofy.addActionListener(this);
      butlog.addActionListener(this);
      butrate.addActionListener(this);
      butabs.addActionListener(this);
      butBinary.addActionListener(this);
      butEqual.addActionListener(this);
      butCancel.addActionListener(this);
      frame.add(panel);
   }
   @Override
   public void actionPerformed(final ActionEvent e) {
      final Object source = e.getSource();
      final int iteration = 10;
      for (int i = 0; i < iteration; i++) {
         if (source == but[i]) {
            text.replaceSelection(buttonValue[i]);
            return;
         }
      }
      if (source == butAdd) {
         writer(calc.calculateBi(Calculator.BiOperatorModes.add, reader()));
      }
      if (source == butMinus) {
         writer(calc.calculateBi(Calculator.BiOperatorModes.minus, reader()));
      }
      if (source == butMultiply) {
         writer(calc.calculateBi(Calculator.BiOperatorModes.multiply,
                                 reader()));
      }
      if (source == butDivide) {
         writer(calc
                   .calculateBi(Calculator.BiOperatorModes.divide, reader()));
      }
      if (source == butxpowerofy) {
         writer(calc
                   .calculateBi(Calculator.BiOperatorModes.xPowerOfY,
                           reader()));
      }
      if (source == butSquare) {
         writer(calc.calculateMono(Calculator.MonoOperatorModes.square,
                                   reader()));
      }
      if (source == butSquareRoot) {
         writer(calc.calculateMono(Calculator.MonoOperatorModes.squareRoot,
                                   reader()));
      }
      if (source == butOneDividedBy) {
         writer(calc.calculateMono(
                                   Calculator.MonoOperatorModes.oneDividedBy,
                 reader()));
      }
      if (source == butCos) {
         writer(calc.calculateMono(Calculator.MonoOperatorModes.cos,
                                   reader()));
      }
      if (source == butSin) {
         writer(calc.calculateMono(Calculator.MonoOperatorModes.sin,
                                   reader()));
      }
      if (source == butTan) {
         writer(calc.calculateMono(Calculator.MonoOperatorModes.tan,
                                   reader()));
      }
      if (source == butlog) {
         writer(calc.calculateMono(Calculator.MonoOperatorModes.log,
                                   reader()));
      }
      if (source == butrate) {
         writer(calc.calculateMono(Calculator.MonoOperatorModes.rate,
                                   reader()));
      }
      if (source == butabs) {
         writer(calc.calculateMono(Calculator.MonoOperatorModes.abs, reader()));
      }
      if (source == butEqual) {
         writer(calc.calculateEqual(reader()));
      }
      if (source == butCancel) {
         writer(calc.reset());
      }
      if (source == butBinary) {
         parsetoBinary();
      }
      text.selectAll();
   }
   private void parsetoBinary() {
      try {
         text.setText("" + Long.toBinaryString(Long.parseLong(text.getText())));
      } catch (NumberFormatException ex) {
         System.err.println("Error while parse to binary." + ex.toString());
      }
   }
   /** reader.*/
   public Double reader() {
      double num;
      String str;
      str = text.getText();
      num = Double.parseDouble(str);
      return num;
   }
   /** @param num .*/
   public void writer(final Double num) {
      if (Double.isNaN(num)) {
         text.setText("");
      } else {
         text.setText(Double.toString(num));
      }
   }
}
