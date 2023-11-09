
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeGUI extends JFrame {

    
    private JTextField firstNameField, lastNameField, addressField, telephoneField, 
        idField, salaryField, summerCourseField;
    private JButton calculateButton;
    private JTextArea detailsArea;
    private JComboBox<String> employeeTypeComboBox;

    public EmployeeGUI() {
        
        createGUI();
    }

    private void createGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Input panel setup
        JPanel inputPanel = new JPanel(new GridLayout(0, 2));

        inputPanel.add(new JLabel("First Name:"));
        firstNameField = new JTextField(20);
        inputPanel.add(firstNameField);

        inputPanel.add(new JLabel("Last Name:"));
        lastNameField = new JTextField(20);
        inputPanel.add(lastNameField);

        inputPanel.add(new JLabel("Address:"));
        addressField = new JTextField(20);
        inputPanel.add(addressField);

        inputPanel.add(new JLabel("Telephone:"));
        telephoneField = new JTextField(20);
        inputPanel.add(telephoneField);

        inputPanel.add(new JLabel("ID:"));
        idField = new JTextField(20);
        inputPanel.add(idField);

        inputPanel.add(new JLabel("Monthly Salary:"));
        salaryField = new JTextField(20);
        inputPanel.add(salaryField);

        inputPanel.add(new JLabel("Summer Course Title:"));
        summerCourseField = new JTextField(20);
        inputPanel.add(summerCourseField);

        inputPanel.add(new JLabel("Employee Type:"));
        employeeTypeComboBox = new JComboBox<>(new String[]{"Lecturer", "Assistant Professor", "Professor"});
        inputPanel.add(employeeTypeComboBox);

        // Setup button and its panel
        calculateButton = new JButton("Calculate Payment");
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(calculateButton);

        // Details area setup
        detailsArea = new JTextArea(10, 30);
        detailsArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(detailsArea);

        // Add panels to frame
        add(inputPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(scrollPane, BorderLayout.SOUTH);

        // Button action
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatePayment();
            }
        });

        // Final frame setup
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void calculatePayment() {
        // Retrieve user inputs
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String address = addressField.getText();
        String telephone = telephoneField.getText();
        int id = Integer.parseInt(idField.getText());
        double salary = Double.parseDouble(salaryField.getText());

        // Create the correct type of employee and calculate payments
        ABCEmployee employee;
        String employeeType = (String) employeeTypeComboBox.getSelectedItem();
        switch (employeeType) {
            case "Lecturer":
                employee = new Lecturer(firstName, lastName, address, telephone, id, salary);
                break;
            case "Assistant Professor":
                double summerPayment = Double.parseDouble(summerPaymentField.getText());
                employee = new AssistantProfessor(firstName, lastName, address, telephone, id, salary);
                ((AssistantProfessor) employee).setSummerCourseName("Summer Course"); // You would actually retrieve this from a user input
                ((AssistantProfessor) employee).setSummerPayment(summerPayment);
                break;
            case "Professor":
                double bonusPayment = Double.parseDouble(bonusPaymentField.getText());
                employee = new Professor(firstName, lastName, address, telephone, id, salary);
                ((Professor) employee).setBonusPayment(bonusPayment);
                break;
            default:
                employee = new ABCEmployee(firstName, lastName, address, telephone, id, salary);
        }

        // Display the details
        detailsArea.setText(employee.getDetails());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EmployeeGUI();
            }
        });
    }
}