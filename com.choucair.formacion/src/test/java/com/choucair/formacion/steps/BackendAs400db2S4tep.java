package com.choucair.formacion.steps;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.choucair.formacion.pageobjects.BackendAs400db2Page;

import net.thucydides.core.annotations.Step;
import utilities.ExcelReader;
import utilities.LectorExcel;

public class BackendAs400db2S4tep {
	
	BackendAs400db2Page elBackEndPage;
	
	@Step
	public void consultarCNAME(List<List<String>> data) throws SQLException, IOException
	{
		String strDocumento = data.get(0).get(0).toString();
		String query = elBackEndPage.armar_query(strDocumento);
		ResultSet rs=elBackEndPage.ejecutar_query(query);
		
		ExcelReader.escribeResultSetEnExcel("HojaCreada", rs, "C:\\Users\\Archivo.xlsx");
		
		elBackEndPage.verificar_Consulta(rs, data);
	}
	

	
}
