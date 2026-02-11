package com.joaodev.fakedb.sistema;

import com.joaodev.fakedb.fabricantes.OracleBD;
import com.joaodev.fakedb.integracao.InterfaceBD;

public class Sistema {

    public static void main(String[] args) {
        
		InterfaceBD ibd;
		
		//ibd = new MySQLBD();
		ibd = new OracleBD();
		
		ibd.conectar("admin", "1234");
		ibd.executar("SELECT * FROM tbl_clientes");
		ibd.desconectar();
	
    }
}
