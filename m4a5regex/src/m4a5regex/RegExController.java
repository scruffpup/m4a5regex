/*
 *
 *  Project    :  m4a5regex
 *  Assignment :
 *  File       :  RegExController.java
 *  Name       :  Kelly Tidwell
 *  Date       :  Mar 8, 2018
 *
 *  Description : (Narrative desciption, not code)
 *
 *   controller for the RegEx.fxml file
 *
 ********************************************************/

package m4a5regex;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

public class RegExController {

	@FXML
	private TextField tfCity;

	@FXML
	private TextField tfFirst;

	@FXML
	private TextField tfState;

	@FXML
	private MenuItem menuClose;

	@FXML
	private TextField tfAddress;

	@FXML
	private TextField tfEmail;

	@FXML
	private TextField tfLast;

	@FXML
	private TextField tfZip;

	@FXML
	void menuCloseAction(ActionEvent event) {
		System.exit(0);
	}

	@FXML
	void tfFirstAction(ActionEvent event) {
		boolean isValid = false;

		isValid = tfFirst.getText().matches("[A-Z][a-z]*");

		if (!isValid) {
			JOptionPane.showMessageDialog(null, "first name must be capitalized");
			tfFirst.setText("");
		}
	}

	@FXML
	void tfLastAction(ActionEvent event) {
		boolean isValid = false;

		isValid = tfLast.getText().matches("[A-Z]((['][A-Z][a-z]*)|[a-z]*|[a-z]+[-][A-Z][a-z]*)");

		if (!isValid) {
			JOptionPane.showMessageDialog(null, "last name must be capitalized");
			tfLast.setText("");
		}
	}

	@FXML
	void tfAddressAction(ActionEvent event) {
		boolean isValid = false;

		isValid = tfAddress.getText().matches("\\d+\\s+([A-Za-z]+|[A-Za-z]+\\s[A-Za-z]+)");

		if (!isValid) {
			JOptionPane.showMessageDialog(null, "address must be in the form:  123 main street");
			tfAddress.setText("");
		}
	}

	@FXML
	void tfCityAction(ActionEvent event) {
		boolean isValid = false;

		isValid = tfCity.getText().matches("([A-Za-z]+|[A-Za-z]+\\s[A-Za-z]+|[A-Za-z]+\\s[A-Za-z]+\\s[A-Za-z]+)");

		if (!isValid) {
			JOptionPane.showMessageDialog(null, "city must be capitalized");
			tfCity.setText("");
		}
	}

	@FXML
	void tfStateAction(ActionEvent event) {
		boolean isValid = false;

		isValid = tfState.getText().matches("([A-Z][A-Z]|[A-Z][a-z]+|[A-Z][a-z]*\\s[A-Z][a-z]*)");

		if (!isValid) {
			JOptionPane.showMessageDialog(null, "state must be 2 letter abbreviation, or full name");
			tfState.setText("");
		}
	}

	@FXML
	void tfZipAction(ActionEvent event) {
		boolean isValid = false;

		isValid = tfZip.getText().matches("(\\d{5}|\\d{5}[-]\\d{4})");

		if (!isValid) {
			JOptionPane.showMessageDialog(null, "zip code must be in form 12345 or 12345-1234");
			tfZip.setText("");
		}
	}

	@FXML
	void tfEmailAction(ActionEvent event) {
		boolean isValid = false;

		isValid = tfEmail.getText().matches("[A-Z0-9a-z]+\\@[A-Z0-9a-z]+\\.(com|net|biz|edu|mil|org)");

		if (!isValid) {
			JOptionPane.showMessageDialog(null, "email must be valid");
			tfEmail.setText("");
		}
	}

}
