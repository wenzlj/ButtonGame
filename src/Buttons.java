import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.Timer;


public class Buttons<Button> extends JFrame {


    private final int VERTICAL_BUTTONS = 4;
    private final int HORIZONTAL_BUTTONS = 4;
    private JButton[][] buttons = new JButton[VERTICAL_BUTTONS][HORIZONTAL_BUTTONS];
    static int seconds = 0;
    private int waittime;
    private int buttonnumber;


    Random time = new Random();

    public Buttons() {
        super("ButtonPanel");
        this.setSize(800, 800);
        this.setLayout(new GridLayout(VERTICAL_BUTTONS, HORIZONTAL_BUTTONS));
        for (int i = 0; i < VERTICAL_BUTTONS; i++) {
            for (int g = 0; g < HORIZONTAL_BUTTONS; g++) {
                JButton obj = new JButton();
                buttons[i][g] = obj;
                buttons[i][g].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {

                    }
                });
                add(obj);
                obj.setEnabled(false);
            }
        }
        this.setVisible(true);

    }

    public void ButtonEnablen() {
        waittime = new Random().nextInt(3000) + 3000;
        buttonnumber = new Random().nextInt(4) + 1;


        new Thread() {

            public void run() {
                try {
                    Thread.sleep(waittime);
                } catch (Exception ex) {

                }
                for (int i = 0; i < buttonnumber; i++) {
                    int a = new Random().nextInt(4) + 1;
                    int b = new Random().nextInt(4) + 1;
                    buttons[a][b].setEnabled(true);
                }

            }


        };
    }
}
