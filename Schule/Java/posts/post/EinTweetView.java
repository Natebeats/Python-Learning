/*
 * Created by JFormDesigner on Fri Mar 07 11:01:56 CET 2025
 */

package posts.post;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

/**
 * @author helge
 */
public class EinTweetView extends JPanel {
    public EinTweetView() {
        initComponents();
    }

    public JLabel getLabel1() {
        return label1;
    }

    public JLabel getLabel2() {
        return label2;
    }
    public JLabel getLabel3() {
        return label3;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Helge
        panel1 = new JPanel();
        label1 = new JLabel();
        label3 = new JLabel();
        label2 = new JLabel();

        //======== this ========
        setBorder(new TitledBorder("text"));
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax
        . swing. border. EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing
        . border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .
        Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ), java. awt. Color. red
        ) , getBorder( )) );  addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override
        public void propertyChange (java .beans .PropertyChangeEvent e) {if ("bord\u0065r" .equals (e .getPropertyName (
        ) )) throw new RuntimeException( ); }} );
        setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]" +
            "[grow,fill]" +
            "[fill]",
            // rows
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]"));

        //======== panel1 ========
        {
            panel1.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[grow,fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]"));

            //---- label1 ----
            label1.setText("belibiegten Text");
            label1.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
            panel1.add(label1, "cell 0 0 3 1");

            //---- label3 ----
            label3.setText("text");
            label3.setFont(new Font("Helvetica Neue", Font.PLAIN, 8));
            panel1.add(label3, "cell 0 1 2 1,alignx right,growx 0");

            //---- label2 ----
            label2.setText("Datum");
            label2.setFont(new Font("Helvetica Neue", Font.PLAIN, 8));
            panel1.add(label2, "cell 2 1");
        }
        add(panel1, "cell 1 5");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Helge
    private JPanel panel1;
    private JLabel label1;
    private JLabel label3;
    private JLabel label2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
