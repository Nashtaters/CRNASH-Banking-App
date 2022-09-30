import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankingApp extends JFrame implements ActionListener {

    private JButton _withdraw = null;
    private JButton _deposit = null;
    private JButton _balance = null;
    private JButton _exit = null;
    private JPanel _display = null;
    private JPanel _widgetPanel = null;
    private JLabel _prompt = null;
    private JTextField _input = null;
    private JButton _submit = null;
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

        _display = new JPanel();
        _display.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        _widgetPanel = new JPanel();
        _widgetPanel.setLayout(new FlowLayout());
        _display.add(_widgetPanel, gbc);

        _prompt = new JLabel("Enter amount to withdraw: ");

        _input = new JTextField("");
        _input.setPreferredSize(new Dimension(100, 25));
        _submit = new JButton("Submit");
        _widgetPanel.setVisible(false);

        _widgetPanel.add(_prompt);
        _widgetPanel.add(_input);
        _widgetPanel.add(_submit);

        setLayout(new BorderLayout());
        add(buttonPanel, BorderLayout.WEST);

        add(_display, BorderLayout.CENTER);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton)e.getSource();
        if (button == _withdraw) {
            performWithdrawal();
        }
        else if (button == _deposit) {
        }
        else if (button == _balance){
        }
        else if (button == _exit) {
            System.exit(0);
        }
    }
    protected void performWithdrawal() {
        _widgetPanel.setVisible(true);
    }
}
