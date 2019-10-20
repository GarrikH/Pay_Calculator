package edu.citytech.midTerm;

import java.text.DecimalFormat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class midTerm_Controller {

    @FXML
    private AnchorPane ap_main;

    @FXML
    private Label lbl_Title;

    @FXML
    private Label lbl_in1;

    @FXML
    private Label lbl_in2;

    @FXML
    private AnchorPane ap_out;

    @FXML
    private Label lbl_tag1;

    @FXML
    private Label lbl_tag2;

    @FXML
    private Label lbl_tag3;

    @FXML
    private Label lbl_tag4;

    @FXML
    private Label lbl_tag5;

    @FXML
    private Label lbl_tag6;

    @FXML
    private Label lbl_out1;

    @FXML
    private Label lbl_out2;

    @FXML
    private Label lbl_out3;

    @FXML
    private Label lbl_out4;

    @FXML
    private Label lbl_out5;

    @FXML
    private Label lbl_out6;
    
    @FXML
    private Label lbl_tag7;

    @FXML
    private Label lbl_tag8;

    @FXML
    private Label lbl_out8;

    @FXML
    private Label lbl_out7;

    @FXML
    private Button btn_calc;

    @FXML
    private Button btn_reset;

    @FXML
    private TextField txt_1;

    @FXML
    private TextField txt_2;

    @FXML
    private Label lbl_author;
    
    private double hoursIn;
    private double wageIn;
    final private static double OT_RATE = 1.5;
    private static DecimalFormat df2 = new DecimalFormat("#,##0.00");

    @FXML
    void calcClick(ActionEvent event) {
    	hoursIn = Double.parseDouble(txt_1.getText());
		wageIn = Double.parseDouble(txt_2.getText());
    	if(hoursIn > 40)
    	{
    		int regHrs = 40;
    		double otHrs = hoursIn - 40;
    		double otPay = otHrs * (wageIn * OT_RATE);
    		double regPay = regHrs * wageIn;
    		double wkPay = otPay + regPay;
    		double yrPay = wkPay * 52;
    		lbl_out1.setText(String.valueOf(otHrs));
    		lbl_out2.setText(String.valueOf(regHrs));
    		lbl_out3.setText("$" + df2.format(otPay));
    		lbl_out4.setText("$" + df2.format(regPay));
    		lbl_out5.setText("$" + df2.format(wkPay));
    		lbl_out6.setText("$" + df2.format(yrPay));
    		if(yrPay >= 0 && yrPay <= 9699.999)
    		{
    			double mTax = .1 * yrPay;
    			lbl_out7.setText("$" + df2.format(mTax));
    			double netSal = yrPay - mTax;
    			lbl_out8.setText("$" + df2.format(netSal));
    		}
    		else if(yrPay >= 9700 && yrPay <= 39474.999)
    		{
    			double mTax = .12 * yrPay;
    			lbl_out7.setText("$" + df2.format(mTax));
    			double netSal = yrPay - mTax;
    			lbl_out8.setText("$" + df2.format(netSal));    			
    		}
    		// 39,475 – 84,199.99
    		else if (yrPay >= 39574 && yrPay <= 84199.99)
    		{
    			double mTax = .22 * yrPay;
    			lbl_out7.setText("$" + df2.format(mTax));
    			double netSal = yrPay - mTax;
    			lbl_out8.setText("$" + df2.format(netSal));
    		}
    		// 84200 - 160724.99
    		else if(yrPay >= 84200 && yrPay <= 160724.99)
    		{
    			double mTax = .24 * yrPay;
    			lbl_out7.setText("$" + df2.format(mTax));
    			double netSal = yrPay - mTax;
    			lbl_out8.setText("$" + df2.format(netSal));
    		}
    		// 160725 - 20499.99
    		else if(yrPay >= 160725 && yrPay <= 204099.99)
    		{
    			double mTax = .32 * yrPay;
    			lbl_out7.setText("$" + df2.format(mTax));
    			double netSal = yrPay - mTax;
    			lbl_out8.setText("$" + df2.format(netSal));
    		}
    		// 204100 - 510299.99
    		else if(yrPay >= 204100 && yrPay <= 510299.99)
    		{
    			double mTax = .35 * yrPay;
    			lbl_out7.setText("$" + df2.format(mTax));
    			double netSal = yrPay - mTax;
    			lbl_out8.setText("$" + df2.format(netSal));
    		}
    		else if(yrPay >= 510300)
    		{
    			double mTax = .37 * yrPay;
    			lbl_out7.setText("$" + df2.format(mTax));
    			double netSal = yrPay - mTax;
    			lbl_out8.setText("$" + df2.format(netSal));
    		}
    	}
    	else
    	{
    		double regHrs = hoursIn;
    		double regPay;
    		double otPay,otHrs;
    		otPay = otHrs = 0;
    		double wkPay = regPay = regHrs * wageIn;
    		double yrPay = wkPay * 52;
    		lbl_out1.setText(String.valueOf(otHrs));
    		lbl_out2.setText(String.valueOf(regHrs));
    		lbl_out3.setText("$" + df2.format(otPay));
    		lbl_out4.setText("$" + df2.format(regPay));
    		lbl_out5.setText("$" + df2.format(wkPay));
    		lbl_out6.setText("$" + df2.format(yrPay));
    		
    		if(yrPay >= 0 && yrPay <= 9699.999)
    		{
    			double mTax = .1 * yrPay;
    			lbl_out7.setText("$" + df2.format(mTax));
    			double netSal = yrPay - mTax;
    			lbl_out8.setText("$" + df2.format(netSal));
    		}
    		else if(yrPay >= 9700 && yrPay <= 39474.999)
    		{
    			double mTax = .12 * yrPay;
    			lbl_out7.setText("$" + df2.format(mTax));
    			double netSal = yrPay - mTax;
    			lbl_out8.setText("$" + df2.format(netSal));    			
    		}
    		// 39,475 – 84,199.99
    		else if (yrPay >= 39574 && yrPay <= 84199.99)
    		{
    			double mTax = .22 * yrPay;
    			lbl_out7.setText("$" + df2.format(mTax));
    			double netSal = yrPay - mTax;
    			lbl_out8.setText("$" + df2.format(netSal));
    		}
    		// 84200 - 160724.99
    		else if(yrPay >= 84200 && yrPay <= 160724.99)
    		{
    			double mTax = .24 * yrPay;
    			lbl_out7.setText("$" + df2.format(mTax));
    			double netSal = yrPay - mTax;
    			lbl_out8.setText("$" + df2.format(netSal));
    		}
    		// 160725 - 20499.99
    		else if(yrPay >= 160725 && yrPay <= 204099.99)
    		{
    			double mTax = .32 * yrPay;
    			lbl_out7.setText("$" + df2.format(mTax));
    			double netSal = yrPay - mTax;
    			lbl_out8.setText("$" + df2.format(netSal));
    		}
    		// 204100 - 510299.99
    		else if(yrPay >= 204100 && yrPay <= 510299.99)
    		{
    			double mTax = .35 * yrPay;
    			lbl_out7.setText("$" + df2.format(mTax));
    			double netSal = yrPay - mTax;
    			lbl_out8.setText("$" + df2.format(netSal));
    		}
    		else if(yrPay >= 510300)
    		{
    			double mTax = .37 * yrPay;
    			lbl_out7.setText("$" + df2.format(mTax));
    			double netSal = yrPay - mTax;
    			lbl_out8.setText("$" + df2.format(netSal));
    		}
    		
    	}
    }

    @FXML
    void resetClick(ActionEvent event) {
    	Label[] lblArray = new Label[] {lbl_out1,lbl_out2,lbl_out3,lbl_out4,lbl_out5,lbl_out6, lbl_out7, lbl_out8};
    	for(Label i : lblArray)
    	{
    		i.setText("");
    	}
    	txt_1.setText("");
    	txt_2.setText("");
    }
}

