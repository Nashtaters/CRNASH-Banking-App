import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankingApp extends JFrame implements ActionListener {

    private JButton _withdraw = null;
    private JButton _deposit = null;
    private JButton _balance = null;
    private JButton _exit = null;
    private JTextArea _display = null;
    private JTextField _withdrawInput = null;
    private Account _account = new Account(1000);

    public static void main(String[] args) {

        BankingApp app = new BankingApp();
        app.createGUI();
        //System.exit(0);
    }

    protected void createGUI() {

        setSize(600, 400);
        setTitle("Banking App");
        setVisible(true);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 1));

        _withdraw = new JButton("Withdraw");
        _withdraw.setAlignmentX(Component.LEFT_ALIGNMENT);
        _withdraw.addActionListener(this);
        buttonPanel.add(_withdraw);

        _deposit = new JButton("Deposit");
        _deposit.setAlignmentX(Component.LEFT_ALIGNMENT);
        _deposit.addActionListener(this);
        buttonPanel.add(_deposit);

        _balance = new JButton("Check Balance");
        _balance.setAlignmentX(Component.LEFT_ALIGNMENT);
        _balance.addActionListener(this);
        buttonPanel.add(_balance);

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
            performWithrawl();
        }
        else if (button == _deposit){
            System.out.println("Enter amount to deposit: ");
        }
        else if (button == _balance){
            System.out.println("Your current balance is " + _account.getBalance());
        }
        else if (button == _exit) {
            System.exit(0);
        }
    }
    protected float performWithrawl() {
        return 0.0f;
    }
}
