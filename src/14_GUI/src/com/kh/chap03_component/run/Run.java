package com.kh.chap03_component.run;

import com.kh.chap03_component.view.A_TextField;
import com.kh.chap03_component.view.B_TextArea;
import com.kh.chap03_component.view.C_RadioButton;
import com.kh.chap03_component.view.D_CheckBox;
import com.kh.chap03_component.view.E_ImageLabel;
import com.kh.chap03_component.view.F_ComboBox;
import com.kh.chap03_component.view.G_List;
import com.kh.chap03_component.view.H_Spinner;
import com.kh.chap03_component.view.I_Slider;
import com.kh.chap03_component.view.J_Dialog;

public class Run {

	public static void main(String[] args) {
		A_TextField a = new A_TextField();
		// a.textFieldTest();
		B_TextArea b = new B_TextArea(); 
		// b.textAreaTest();
		C_RadioButton c = new C_RadioButton();
		// c.radioButtonTest();
		D_CheckBox d = new D_CheckBox();
		// d.checkBoxTest();
		E_ImageLabel e = new E_ImageLabel();
		// e.imageLabelTest();
		F_ComboBox f = new F_ComboBox();
		// f.comboBoxTest();
		G_List g = new G_List();
		// g.listTest();
		H_Spinner h = new H_Spinner();
		// h.spinnerTest();
		I_Slider i = new I_Slider();
		// i.sliderTest();
		J_Dialog j = new J_Dialog();
		j.dialogTest();
	}

}
