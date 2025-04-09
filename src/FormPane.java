import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;

public class FormPane extends GridPane {

    // Labels
    private Label lblAmount = new Label("Amount ($): ");
    private Label lblRate = new Label("Interest Rate (%): ");
    private Label lblPeriod = new Label("Period (months): ");
    private Label lblPayment = new Label("Payment ($): ");

    // Text Fields
    private TextField txtAmount = new TextField();
    private TextField txtRate = new TextField();
    private TextField txtPeriod = new TextField();
    private TextField txtPayment = new TextField();

    // Buttons
    private Button btnCalculate = new Button("Calculate");
    private Button btnClear = new Button("Clear");


    public FormPane(){

        // column, row
        this.add(lblAmount, 0, 0);
        this.add(txtAmount, 1, 0);

        this.add(lblRate, 0, 1);
        this.add(txtRate, 1, 1);

        this.add(lblPeriod, 0, 2);
        this.add(txtPeriod, 1, 2);

        this.add(lblPayment, 0, 3);
        this.add(txtPayment, 1, 3);
        txtPayment.setEditable(false); // makes it so the input field is not able to be input in

        this.add(new Label(" "), 0, 4);
        this.add(new Label(" "), 1, 4);
        this.add(btnCalculate, 0, 5);
        this.add(btnClear, 1, 5);

        // sets padding around the txt's and input fields
        this.setPadding(new Insets(5,5,5,5));
        // sets gaps in between txt's and input fields
        this.setHgap(5);
        this.setVgap(5);
    }
}
