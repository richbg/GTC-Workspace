/*
    A basic extension of the java.applet.Applet class
 */
import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TempConvertApplet extends Applet {
	
	TextField CelsiusField = new TextField();
	Label Fahrenheit = new Label();
	TextField Status = new TextField();
	Button FahrenheitKelvin = new Button();
	Button KelvinCelsius = new Button();
	TextField FahrenheitField = new TextField();
	Label Kelvin = new Label();
	Button FahrenheitCelsius = new Button();
	Button CelsiusFahrenheit = new Button();
	TextField KelvinField = new TextField();
	Label Celsius = new Label();
	Button KelvinFahrenheit = new Button();
	Button CelsiusKelvin = new Button();
	
	public void init() {
		setLayout(null);
		setSize(450, 250);
		add(CelsiusField);
		CelsiusField.setBounds(12, 12, 62, 35);
		Fahrenheit.setText("Fahrenheit");
		add(Fahrenheit);
		Fahrenheit.setBounds(84, 132, 66, 29);
		Status.setEditable(false);
		Status.setText("Enter Temperature Value to Convert Then Choose Conversion");
		add(Status);

		Status.setBounds(10, 204, 420, 36);
		FahrenheitKelvin.setLabel("Fahrenheit -> Kelvin");
		add(FahrenheitKelvin);

		FahrenheitKelvin.setBounds(180, 156, 220, 24);
		KelvinCelsius.setLabel("Kelvin -> Celsius");
		add(KelvinCelsius);

		KelvinCelsius.setBounds(180, 72, 220, 24);
		add(FahrenheitField);
		FahrenheitField.setBounds(12, 132, 62, 35);
		Kelvin.setText("Kelvin");
		add(Kelvin);
		Kelvin.setBounds(84, 72, 66, 29);
		FahrenheitCelsius.setLabel("Fahrenheit -> Celsius");
		add(FahrenheitCelsius);

		FahrenheitCelsius.setBounds(180, 132, 220, 24);
		CelsiusFahrenheit.setLabel("Celsius -> Fahrenheit");
		add(CelsiusFahrenheit);

		CelsiusFahrenheit.setBounds(180, 36, 220, 24);
		add(KelvinField);
		KelvinField.setBounds(12, 72, 62, 35);
		Celsius.setText("Celsius");
		add(Celsius);
		Celsius.setBounds(84, 12, 66, 29);
		KelvinFahrenheit.setLabel("Kelvin -> Fahrenheit");
		add(KelvinFahrenheit);

		KelvinFahrenheit.setBounds(180, 96, 220, 24);
		CelsiusKelvin.setLabel("Celsius -> Kelvin");
		add(CelsiusKelvin);

		CelsiusKelvin.setBounds(180, 12, 220, 24);
		SymAction lSymAction = new SymAction();
		CelsiusKelvin.addActionListener(lSymAction);
		CelsiusFahrenheit.addActionListener(lSymAction);
		KelvinCelsius.addActionListener(lSymAction);
		KelvinFahrenheit.addActionListener(lSymAction);
		FahrenheitCelsius.addActionListener(lSymAction);
		FahrenheitKelvin.addActionListener(lSymAction);
	}

	public class SymAction implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			Object object = event.getSource();
			if (object == CelsiusKelvin)
				CelsiusKelvin_ActionPerformed(event);
			else if (object == CelsiusFahrenheit)
				CelsiusFahrenheit_ActionPerformed(event);
			else if (object == KelvinCelsius)
				KelvinCelsius_ActionPerformed(event);
			else if (object == KelvinFahrenheit)
				KelvinFahrenheit_ActionPerformed(event);
			else if (object == FahrenheitCelsius)
				FahrenheitCelsius_ActionPerformed(event);
			else if (object == FahrenheitKelvin)
				FahrenheitKelvin_ActionPerformed(event);
		}
	}

	private void CelsiusKelvin_ActionPerformed(ActionEvent event) {
		double temp = Double.valueOf(CelsiusField.getText()).doubleValue();
		if (temp >= -273) {
			temp += 273;
			FahrenheitField.setText("");
			KelvinField.setText(String.valueOf(temp));
			Status.setText("Enter Temperature Value to Convert Then Choose Conversion");
		} else {    // Enter Temperature Value to Convert Then Choose Conversion
			KelvinField.setText("");
			FahrenheitField.setText("");
			Status.setText("Temperatures below minus 273 degrees Celsius are impossible");
		}
	}

	private void CelsiusFahrenheit_ActionPerformed(ActionEvent event) {
		double temp = Double.valueOf(CelsiusField.getText()).doubleValue();
		if (temp >= -273) {
			temp = 9 * temp / 5 + 32;
			KelvinField.setText("");
			FahrenheitField.setText(String.valueOf(temp));
			Status.setText("Enter Temperature Value to Convert Then Choose Conversion");
		} else {
			KelvinField.setText("");
			FahrenheitField.setText("");
			Status.setText("Temperatures below minus 273 degrees Celsius are impossible");
		}
	}

	private void KelvinCelsius_ActionPerformed(ActionEvent event) {
		double temp = Double.valueOf(KelvinField.getText()).doubleValue();
		if (temp >= 0) {
			temp -= 273;
			FahrenheitField.setText("");
			CelsiusField.setText(String.valueOf(temp));
			Status.setText("Enter Temperature Value to Convert Then Choose Conversion");
		} else {
			FahrenheitField.setText("");
			CelsiusField.setText("");
			Status.setText("Temperatures below zero Kelvin are impossible");
		}
	}

	private void KelvinFahrenheit_ActionPerformed(ActionEvent event) {
		double temp = Double.valueOf(KelvinField.getText()).doubleValue();
		if (temp >= 0) {
			temp -= 273;
			temp = 9 * temp / 5 + 32;
			CelsiusField.setText("");
			FahrenheitField.setText(String.valueOf(temp));
			Status.setText("Enter Temperature Value to Convert Then Choose Conversion");
		} else {
			CelsiusField.setText("");
			FahrenheitField.setText("");
			Status.setText("Temperatures below zero Kelvin are impossible");
		}
	}

	private void FahrenheitCelsius_ActionPerformed(ActionEvent event) {
		double temp = Double.valueOf(FahrenheitField.getText()).doubleValue();
		if (temp >= -459.4) {
			temp -= 32;
			temp = 5 * temp / 9;
			KelvinField.setText("");
			CelsiusField.setText(String.valueOf(temp));
			Status.setText("Enter Temperature Value to Convert Then Choose Conversion");
		} else {
			KelvinField.setText("");
			CelsiusField.setText("");
			Status.setText("Temperatures below minus 459.4 degrees Fahrenheit are impossible");
		}
	}

	private void FahrenheitKelvin_ActionPerformed(ActionEvent event) {
		double temp = Double.valueOf(FahrenheitField.getText()).doubleValue();
		if (temp >= -459.4) {
			temp -= 32;
			temp = 5 * temp / 9;
			temp += 273;
			CelsiusField.setText("");
			KelvinField.setText(String.valueOf(temp));
			Status.setText("Enter Temperature Value to Convert Then Choose Conversion");
		} else {
			KelvinField.setText("");
			CelsiusField.setText("");
			Status.setText("Temperatures below minus 459.4 degrees Fahrenheit are impossible");
		}
	}
}