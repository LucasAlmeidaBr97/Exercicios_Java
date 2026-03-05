import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class JavaLambdaActionListener {
    
    public static void main(String[] args) throws Exception {

        // Java 8: FUNÇÕES LAMBDA

        JButton jButton = new JButton();
        jButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Olá mundo");
            }
        });


        JButton jButton2 = new JButton();
        jButton2.addActionListener(e -> System.out.println("Olá Mundo!"));


        //SAM - Single Abstract Method
        //Qualquer Interface que tenha apenas um método abstrato.
    }
}
