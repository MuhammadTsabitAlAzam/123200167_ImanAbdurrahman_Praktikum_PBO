import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class LoginView extends JFrame implements ActionListener {
    private JButton btn_Login;
    private JButton btn_Register;
    private JPanel MainPanel;
    User user;
    private JTextField et_Username;
    private JTextField et_Password;
    private ArrayList<JTextField> textFields = new ArrayList<>(Arrays.asList(
            et_Username,
            et_Password
    ));

    public LoginView(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MainPanel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        this.setContentPane(MainPanel);
        this.pack();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        user = new User(this);
        ArrayList<JButton> buttons = new ArrayList<>(
                Arrays.asList(
                        btn_Login,
                        btn_Register
                )
        );
        for (JButton button : buttons){
            button.addActionListener(this);
        }
    }
    public ArrayList<JTextField> getAllTextField(){return textFields;}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(!user.validateInput())
            return;
        if (btn_Login.equals(e.getSource())){
            user.login();
        }else if(btn_Register.equals(e.getSource())){
            user.insert();
        }
    }
}
