import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankingApp extends JFrame implements ActionListener {

    private JButton _withdraw = null;
    private JButton _exit = null;
    private JTextArea _display = null;

    public static void main(String[] args) {

        BankingApp app = new BankingApp();
        app.createGUI();
        //System.exit(0);
    }

    protected void createGUI() {

        setSize(600, 400);
        setTitle("Banking App");
        setVisible(true);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
        buttonPanel.setMaximumSize(new Dimension(200, 400));

        _withdraw = new JButton("Withdraw");
        _withdraw.setAlignmentX(Component.LEFT_ALIGNMENT);
        _withdraw.addActionListener(this);
        buttonPanel.add(_withdraw);

        //TODO: Make deposit and check balance buttons

        _exit = new JButton("Exit");
        _exit.setAlignmentX(Component.LEFT_ALIGNMENT);
        _exit.addActionListener(this);
        buttonPanel.add(_exit);

        _display = new JTextArea();
        _display.setAlignmentX(Component.LEFT_ALIGNMENT);
        _display.setEditable(false);
        _display.setText("Hello All");

        setLayout(new BorderLayout());
        add(buttonPanel, BorderLayout.WEST);

        add(_display, BorderLayout.CENTER);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // TODO make new text field and hide it until it needs to be displayed

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton)e.getSource();

        if (button == _withdraw) {
            System.out.println("Enter amount to withdraw: ");
        } else if (button == _exit) {
            System.exit(0);
        }
    }
}

// TODO: create account class, regular POJO class