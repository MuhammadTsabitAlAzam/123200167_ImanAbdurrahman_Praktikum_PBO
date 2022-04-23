import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class User {
    LoginView view;
    Connector user;

    public User(LoginView view) {
        this.view = view;
        try {
            this.user = new Connector();
        }catch (SQLException | ClassNotFoundException throwables){
            throwables.printStackTrace();
        }
    }
    public void insert(){
        try{
            user.insert(getInput());
            JOptionPane.showMessageDialog(null,
                    "Register Berhasil",
                    "Register Berhasil",
                    JOptionPane.PLAIN_MESSAGE);
            for (JTextField textField : view.getAllTextField()) {
                textField.setText("");
            }
        }catch (SQLException throwables){
            throwables.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "Username Sudah Dipakai!",
                    "Register Gagal",
                    JOptionPane.WARNING_MESSAGE);
        }
    }
    public void login(){
        try {
            ArrayList<String> data = getInput();
            ArrayList<JTextField> data2 = view.getAllTextField();
            final String[] errorMsg ={
                    "Username Tidak Cocok!",
                    "Password Tidak Cocok!"
            };
            ResultSet dataLogin = user.search(data);
            if (dataLogin.next()){
                JOptionPane.showMessageDialog(null, "Login Berhasil");
            }else {
                if (data2.get(1).getText().equals(data.get(1))) {
                    JOptionPane.showMessageDialog(null, errorMsg[1],
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }else {
                    JOptionPane.showMessageDialog(null, errorMsg[2],
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
                for (JTextField textField : view.getAllTextField()) {
                    textField.setText("");
                }
            }
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
    }
    public boolean validateInput() {
        ArrayList<JTextField> data = view.getAllTextField();
        final String[] errorMsg = {
                "Mohon isi username!",
                "Mohon isi password!"
        };
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getText().equals("")) {
                JOptionPane.showMessageDialog(null, errorMsg[i],
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }
    private ArrayList<String> getInput() {
        ArrayList<String> data = new ArrayList<>();
        for (int i = 0; i < view.getAllTextField().size(); i++) {
            data.add(view.getAllTextField().get(i).getText());
        }
        return data;
    }
}
