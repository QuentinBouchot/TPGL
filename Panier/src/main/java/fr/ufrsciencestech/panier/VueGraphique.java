package fr.ufrsciencestech.panier;


import java.awt.FlowLayout;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author qb157136
 */
public class VueGraphique extends JFrame implements Observer{

    @Override
    public void update(Observable o, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private JButton inc;
    private JButton dec;
    private JLabel affiche;
    private JPanel pan;
    
    public VueGraphique(){
        
        super();
        this.setLayout(new FlowLayout());
        pan=new JPanel();
        inc=new JButton();
        dec=new JButton();
        affiche=new JLabel();
        inc.setName("plus");
        dec.setName("moins");
        affiche.setName("label1");
        this.setSize(100, 100);
        inc.setText("+");
        inc.setLocation(0, 0);
        inc.setSize(100, 30);
        this.add(inc);
        affiche.setText("0");
        affiche.setSize(100, 40);
        affiche.setLocation(0, 30);
        this.add(affiche);
        dec.setText("-");
        dec.setLocation(0, 30);
        dec.setSize(100, 70);
        this.add(dec);
        
        this.setVisible(true);
        this.pack();
    }


    
    
    
}
