/*
 * Created by JFormDesigner on Wed Feb 19 18:01:46 CET 2025
 */

package posts.post;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;
import org.jdesktop.beansbinding.*;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.swingx.*;

/**
 * @author helge
 */
public class PostView extends JPanel {
    InterfacePost interfacePost;

    public PostView(InterfacePost interfacePost) {
        this.interfacePost = interfacePost;
        initComponents();
    }

    public PostModel getObservableList1() {
        return observableList1;
    }

    private void button1(ActionEvent e) {
        interfacePost.newTweet();
    }

    public JPanel getPanel1() {
        return panel1;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Eric
        textField1 = new JTextField();
        button1 = new JButton();
        scrollPane1 = new JScrollPane();
        panel1 = new JPanel();
        observableList1 = new PostModel();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax
        . swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax. swing
        . border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .
        Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ), java. awt. Color. red
        ) , getBorder( )) );  addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override
        public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062ord\u0065r" .equals (e .getPropertyName (
        ) )) throw new RuntimeException( ); }} );
        setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]" +
            "[200,grow,fill]" +
            "[fill]",
            // rows
            "[40]" +
            "[]" +
            "[200,grow]"));
        add(textField1, "cell 1 0");

        //---- button1 ----
        button1.setText("Tweet");
        button1.addActionListener(e -> button1(e));
        add(button1, "cell 2 0");

        //======== scrollPane1 ========
        {

            //======== panel1 ========
            {
                panel1.setLayout(new VerticalLayout(5));
            }
            scrollPane1.setViewportView(panel1);
        }
        add(scrollPane1, "cell 1 2 2 1,growy");

        //---- bindings ----
        bindingGroup = new BindingGroup();
        bindingGroup.addBinding(Bindings.createAutoBinding(UpdateStrategy.READ_WRITE,
            observableList1, BeanProperty.create("text"),
            textField1, BeanProperty.create("text")));
        bindingGroup.bind();
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Eric
    private JTextField textField1;
    private JButton button1;
    private JScrollPane scrollPane1;
    private JPanel panel1;
    private PostModel observableList1;
    private BindingGroup bindingGroup;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
