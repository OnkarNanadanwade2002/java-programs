import java.awt.*;
import java.awt.event.ActionEvent;
import java.lang.module.ModuleDescriptor.Builder;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;
import javax.swing.text.AttributeSet.ColorAttribute;
import java.awt.event.ActionListener;

import javax.lang.model.util.ElementScanner14;
import javax.swing.*;


public class calculater implements ActionListener
{
    //creating variables for our calculatere

    double number,answer;
    int calculation;

    JFrame frame;
    JLabel lable=new JLabel();
    JTextField textfield=new JTextField();
    JRadioButton onRadioButton=new JRadioButton();
    JRadioButton offRadioButton=new JRadioButton();
    JButton buttonzero=new JButton("0");
    JButton buttonone=new JButton("1");
    JButton buttontwo=new JButton("2");
    JButton buttonthree=new JButton("3");
    // JButton button=new JButton("4");
    JButton buttonfour=new JButton("4");
    JButton buttonfive=new JButton("5");
    JButton buttonsix=new JButton("6");
    JButton buttonsiven=new JButton("7");
    JButton buttoneight=new JButton("8");
    JButton buttonnine=new JButton("9");
    JButton buttonDot=new JButton(".");
    JButton buttondel=new JButton("<-");
    JButton buttonequal=new JButton("=");
    JButton buttonmul=new JButton("x");
    JButton buttondiv=new JButton("/");
    JButton buttonplus=new JButton("+");
    JButton buttonminus=new JButton("-");
    JButton buttonsquare=new JButton("x\u00B2");
    JButton buttonreciprocal=new JButton("1/x");
    JButton buttonsqrt=new JButton("\u221A");
    JButton buttonclr=new JButton("C");
    calculater()
    {
        prepareGUI();
        addcomponent();
        AddactionEvent();
    }

    public static void main(String args[])
    {
        new calculater();
    }
    // public void AddactionEvent()
    // {

    // }
    public void prepareGUI()
    {
        frame=new JFrame();
        frame.setTitle("CLACULATER");
        frame.setSize(300,490);
        frame.getContentPane().setBackground(Color.black);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addcomponent()
    {
        lable.setBounds(250,0,50,50);
        lable.setForeground(Color.white);
        frame.add(lable);
        textfield.setBounds(10,40,270,40);
        textfield.setFont(new Font("Arial",Font.BOLD,20));
        textfield.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textfield);
        onRadioButton.setBounds(10,95,60,40);
        onRadioButton.setSelected(true);
        onRadioButton.setBackground(Color.black);
        onRadioButton.setForeground(Color.white);
        frame.add(onRadioButton);


        offRadioButton.setBounds(10,120,60,40);
        offRadioButton.setBackground(Color.black);
        offRadioButton.setForeground(Color.white);
        frame.add(offRadioButton);


        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(offRadioButton);
        buttonGroup.add(onRadioButton);
        buttonsiven.setBounds(10, 230, 60, 40);
        buttonsiven.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonsiven);


        buttoneight.setBounds(80,230,60,40);
        buttoneight.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttoneight);

        buttonnine.setBounds(150,2630,60,40);
        buttonnine.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonnine);

        buttonfour.setBounds(10,290,60,40);
        buttonfour.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonfour);

        buttonfive.setBounds(80,290,60,40);
        buttonfive.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonfive);

        buttonsix.setBounds(150,290,60,40);
        buttonsix.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonsix);

        buttonone.setBounds(10,350,60,40);
        buttonone.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonone);

        buttontwo.setBounds(80,290,60,40);
        buttontwo.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttontwo);

        buttonthree.setBounds(150,290,60,40);
        buttonthree.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonthree);

        buttonDot.setBounds(150,290,60,40);
        buttonDot.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonDot);

        buttonzero.setBounds(10,410,60,40);
        buttonzero.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonzero);

        buttonequal.setBounds(220,350,60,100);
        buttonequal.setFont(new Font("Arial",Font.BOLD,20));
        buttonequal.setBackground(new Color(239,188,2));
        frame.add(buttonequal);

        buttondiv.setBounds(220,110,60,40);
        buttondiv.setFont(new Font("Arial",Font.BOLD,20));
        buttondiv.setBackground(new Color(239,188,2));
        frame.add(buttondiv);

        buttonsqrt.setBounds(10,170,60,40);
        buttonsqrt.setFont(new Font("Arial",Font.BOLD,20));
        buttonsqrt.setBackground(new Color(239,188,2));
        frame.add(buttonsqrt);

        buttonmul.setBounds(220,230,60,40);
        buttonmul.setFont(new Font("Arial",Font.BOLD,20));
        buttonmul.setBackground(new Color(239,188,2));
        frame.add(buttonmul);

        buttonminus.setBounds(220,170,60,40);
        buttonminus.setFont(new Font("Arial",Font.BOLD,20));
        buttonminus.setBackground(new Color(239,188,2));
        frame.add(buttonminus);

        buttonplus.setBounds(220,290,60,40);
        buttonplus.setFont(new Font("Arial",Font.BOLD,20));
        buttonplus.setBackground(new Color(239,188,2));
        frame.add(buttonplus);

        buttonsquare.setBounds(80,170,60,40);
        buttonsquare.setFont(new Font("Arial",Font.BOLD,20));
        // buttonsquare.setBackground(new Color(239,188,2));
        frame.add(buttonsquare);

        buttonreciprocal.setBounds(150,170,60,40);
        buttonreciprocal.setFont(new Font("Arial",Font.BOLD,20));
        // buttonplus.setBackground(new Color(239,188,2));
        frame.add(buttonreciprocal);

        buttondel.setBounds(150,110,60,40);
        buttondel.setFont(new Font("Arial",Font.BOLD,20));
        buttondel.setBackground(Color.red);
        buttondel.setForeground(Color.white);
        frame.add(buttondel);

        buttonclr.setBounds(80,110,60,40);
        buttonclr.setFont(new Font("Arial",Font.BOLD,20));
        buttonclr.setBackground(Color.red);
        buttonclr.setForeground(Color.white);
        frame.add(buttonclr);

    }

    public void AddactionEvent()
    {
        //registering action listner to button
        onRadioButton.addActionListener(this);
        offRadioButton.addActionListener(this);
        buttonclr.addActionListener(this);
        buttondel.addActionListener(this);
        buttondiv.addActionListener(this);
        buttonsqrt.addActionListener(this);
        buttonsquare.addActionListener(this);
        buttonreciprocal.addActionListener(this);
        buttonminus.addActionListener(this);
        buttonsiven.addActionListener(this);
        buttoneight.addActionListener(this);
        buttonnine.addActionListener(this);
        buttonmul.addActionListener(this);
        buttonfour.addActionListener(this);
        buttonfive.addActionListener(this);
        buttonsix.addActionListener(this);
        buttonplus.addActionListener(this);
        buttonone.addActionListener(this);
        buttontwo.addActionListener(this);
        buttonthree.addActionListener(this);
        buttonequal.addActionListener(this);
        buttonzero.addActionListener(this);
        buttonDot.addActionListener(this);
        // button.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object source=e.getSource();

        if(source==onRadioButton)
        {
            enable(); //calling enable method
        }
        else if(source==offRadioButton)
        {
            disable();
        }
        else if(source==buttonclr)
        {
            lable.setText("");
            textfield.setText("");
        }
        else if(source==buttondel)
        {
            int length=textfield.getText().length();
            int number=length-1;

            if(length>0)
            {
                StringBuilder back=new StringBuilder(textfield.getText());
                back.deleteCharAt(number);
                textfield.setText(back.toString());
            }

            if(textfield.getText().endsWith(""))
            {
                lable.setText("");
            }
        }
        else if(source==buttonzero)
        {
            if(textfield.getText().equals("0"))
            {
                return;

            }
            else{
                textfield.setText(textfield.getText()+"0");
            }
        }

        else if(source==buttonone)
        {
            textfield.setText(textfield.getText()+"1");
        }
        else if(source==buttontwo)
        {
            textfield.setText(textfield.getText()+"2");
        }
        else if(source==buttonthree)
        {
            textfield.setText(textfield.getText()+"3");
        }
        else if(source==buttonfour)
        {
            textfield.setText(textfield.getText()+"4");
        }
        else if(source==buttonfive)
        {
            textfield.setText(textfield.getText()+"5");
        }
        else if(source==buttonsix)
        {
            textfield.setText(textfield.getText()+"5");
        }
        else if(source==buttonsiven)
        {
            textfield.setText(textfield.getText()+"7");
        }    
        else if(source==buttoneight)
        {
            textfield.setText(textfield.getText()+"8");
        }
        else if(source==buttonnine)
        {
            textfield.setText(textfield.getText()+"9");
        }
        else if(source==buttonDot)
        {
            if(textfield.getText().contains("."))
            return;
            else
            textfield.setText(textfield.getText()+".");
        }
        else if(source==buttonplus)
        {
            String str=textfield.getText();
            number=Double.parseDouble(textfield.getText());
            textfield.setText("");
            lable.setText(str+"+");
            calculation=1;
        }
        else if(source==buttonminus)
        {
            String str=textfield.getText();
            number=Double.parseDouble(textfield.getText());
            textfield.setText("");
            lable.setText(str+"-");
            calculation=2;
        }
        else if(source==buttonmul)
        {
            String str=textfield.getText();
            number=Double.parseDouble(textfield.getText());
            textfield.setText("");
            lable.setText(str+"X");
            calculation=3;
        }
        else if(source==buttondiv)
        {
            String str=textfield.getText();
            number=Double.parseDouble(textfield.getText());
            textfield.setText("");
            lable.setText(str+"/");
            calculation=4;
        }
        else if(source==buttonsqrt)
        {
            // String str=textfield.getText();
            number=Double.parseDouble(textfield.getText());
            Double sqrt=Math.sqrt(number);
            textfield.setText(Double.toString(sqrt));
        }
        else if(source==buttonsquare)
        {
            String str=textfield.getText();
            number=Double.parseDouble(textfield.getText());
            Double square=Math.pow(number,2);
            String string=Double.toString(square);

            if(string.endsWith(".0"))
            {
                textfield.setText((string.replace(".0", "")));
            }
            else
            {
                textfield.setText(string);
            }
            lable.setText("(sqr)"+str);
        }
        else if(source==buttonreciprocal)
        {
            number=Double.parseDouble(textfield.getText());
            Double reiprocal=1/number;
            String string=Double.toString(reiprocal);
            if(string.endsWith(".0"))
            {
                textfield.setText(string.replace(".0",""));
            }
            else 
            {
                textfield.setText(string);
            }
        }
        else if(source==buttonequal)
        {
            //setting functionality for equal(=) button;

            switch(calculation)
            {
                case 1:
                answer=number+Double.parseDouble(textfield.getText());

                if(Double.toString(answer).endsWith(".0"))
                {
                    textfield.setText(Double.toString(answer).replace(".0", ""));
                }
                else  
                {
                    textfield.setText(Double.toString(answer));
                }
                lable.setText("");
                break;

                case 2:
                answer=number-Double.parseDouble(textfield.getText());
                if(Double.toString(answer).endsWith(".0"))
                {
                    textfield.setText(Double.toString(answer).replace(".0", ""));
                }
                else 
                {
                    textfield.setText(Double.toString(answer));
                }
                lable.setText("");
                break;

                case 3:
                answer=number*Double.parseDouble(textfield.getText());

                if(Double.toString(answer).endsWith(".0"))
                {
                    textfield.setText(Double.toString(answer).replace(".0", ""));
                }
                else{
                    textfield.setText(Double.toString(answer));
                }
                lable.setText("");
                break;

                case 4:
                answer=number/Double.parseDouble(textfield.getText());
                if(Double.toString(answer).endsWith(".0"))
                {
                    textfield.setText(Double.toString(answer).replace(".0", ""));
                }
                else
                {
                    textfield.setText(Double.toString(answer));
                }
                lable.setText("");
                break;
            }
        }
    }

    public void enable()
    {
        onRadioButton.setEnabled(false);
        offRadioButton.setEnabled(true);
        textfield.setEnabled(true);
        lable.setEnabled(true);
        buttonequal.setEnabled(true);
        buttonDot.setEnabled(true);
        buttondel.setEnabled(true);


        buttonzero.setEnabled(true);
        buttonone.setEnabled(true);
        buttontwo.setEnabled(true);
        buttonthree.setEnabled(true);
        buttonfour.setEnabled(true);
        buttonfive.setEnabled(true);
        buttonsiven.setEnabled(true);
        buttoneight.setEnabled(true);
        buttonnine.setEnabled(true);


        buttonclr.setEnabled(true);
        buttondiv.setEnabled(true);
        buttonsqrt.setEnabled(true);
        buttonsquare.setEnabled(true);
        buttonminus.setEnabled(true);
        buttonmul.setEnabled(true);
        buttonplus.setEnabled(true);
        buttonminus.setEnabled(true);
        buttondel.setEnabled(true);
        


    }
    public void disable()
    {

    }

    

}
