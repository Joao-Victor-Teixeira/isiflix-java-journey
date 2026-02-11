package com.joaodev.fakeerp.ui;

import com.joaodev.fakeerp.util.CalculadorDeImpostos;
import com.joaodev.fakeerp.util.InterfaceOracleERP;
import com.joaodev.fakeerp.util.InterfaceSAP;
import com.joaodev.fakeerp.util.MSInterface;

public class ERPMainClass {

    public static void main(String[] args) {
        // simulando a chamada da Oracle
        InterfaceOracleERP ioerp = new CalculadorDeImpostos();
        ioerp.calculateTaxes("nf.xml");

        // simular uma chamada da Microsoft
		MSInterface msi = new CalculadorDeImpostos();
		msi.summarizeBill("bill.xml");
		
		// simular uma chamada da SAP
		InterfaceSAP isap = new CalculadorDeImpostos();
		isap.calculateTaxesAndSumarizeBill("nf011912.xml");
    }
}
