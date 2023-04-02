package Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;

public class CalculatorController<num> {
    public Label lblDisplay;
    public Label lblNumSet;

    public String crrntnum = "";
    public String function ="";
    int  firstnum;
    String numset = "";
    public void btnSevenOnAction(ActionEvent actionEvent) {

        numValue("7");
    }
    public void btnEightOnAction(ActionEvent actionEvent) {

        numValue("8");
    }
    public void btnNineOnAction(ActionEvent actionEvent) {

        numValue("9");
    }
    public void btnFourOnAction(ActionEvent actionEvent) {

        numValue("4");
    }
    public void btnFiveOnAction(ActionEvent actionEvent) {

        numValue("5");
    }
    public void btnSixOnAction(ActionEvent actionEvent) {

        numValue("6");
    }
    public void btnOneOnAction(ActionEvent actionEvent) {

        numValue("1");
    }
    public void btnTwoOnAction(ActionEvent actionEvent) {

        numValue("2");
    }
    public void btnThreeOnAction(ActionEvent actionEvent) {

        numValue("3");
    }
    public void btnZeroOnAction(ActionEvent actionEvent) {

        numValue("0");
    }

    public void numValue(String keyVal){
        String num = keyVal;
        crrntnum += num;
        lblDisplay.setText(crrntnum);
    }

    public void btnMultiplyOnAction(ActionEvent actionEvent) {
        calculation("*");
    }
    public void btnDevideOnAction(ActionEvent actionEvent) {
        calculation("/");
    }
    public void btnAddOnAction(ActionEvent actionEvent) {
        calculation("+");
    }
    public void btnSubstractOnAction(ActionEvent actionEvent) {
        calculation("-");
    }

    public void calculation(String symbol){
        numset = crrntnum + symbol;
        firstnum = Integer.parseInt(crrntnum);
        function = symbol;
        crrntnum ="";
        lblNumSet.setText(numset);
    }

    public void btnEqualOnAction(ActionEvent actionEvent) {

        numset = numset + crrntnum;
        lblNumSet.setText(numset);
        int secondnum = Integer.parseInt(crrntnum);
        int answer;
        switch (function){
            case "+":
                answer = firstnum + secondnum;
                lblDisplay.setText(String.valueOf(answer));
                break;
            case "-":
                answer = firstnum - secondnum;
                lblDisplay.setText(String.valueOf(answer));
                break;
            case "*":
                answer = firstnum * secondnum;
                lblDisplay.setText(String.valueOf(answer));
                break;
            case "/":
                double devideanswe = (double) firstnum/secondnum;
                lblDisplay.setText(String.valueOf(devideanswe));
                break;
            default:
                System.out.println("");
                
        }

    }

    
    //Clear Button Controller
    public void btnCOnAction(ActionEvent actionEvent) {
        lblDisplay.setText("");
        crrntnum="";
    }

    public void btnACOnAction(ActionEvent actionEvent) {
        lblDisplay.setText("");
        firstnum=0;
        crrntnum="";
        function="";
        numset ="";
        lblNumSet.setText(numset);
    }
}