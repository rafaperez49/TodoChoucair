package com.choucair.formacion.pageobjects;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.spi.TimeZoneNameProvider;

import net.bytebuddy.implementation.bytecode.assign.Assigner.EqualTypesOnly;
import net.serenitybdd.core.pages.PageObject;
import utilities.Sql_Execute;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class BackendAs400db2Page extends PageObject{
	
	public String armar_query(String strDocumento)
	{
		String strQuery="SELECT * FROM GPLILIBRA.TMPCNAME2";
		strQuery=strQuery.replace("<Documento>", strDocumento);
		return strQuery;
	}
	
	public ResultSet ejecutar_query(String query) throws SQLException
	{
		Sql_Execute DAO= new Sql_Execute();
		ResultSet rs=DAO.sql_Execute(query);
		return rs;
		
	}
	
	public void verificar_Consulta(ResultSet rs, List<List<String>> data) throws SQLException
	{
		while(rs.next())
		{
			
			
			String DocumentoRecibido=rs.getString(1).toString();
			String DocumentoEsperado=data.get(0).get(0).toString();
			assertThat(DocumentoRecibido.trim(), equalTo(DocumentoEsperado.trim()));
			
			String tipoDoc_recibido= rs.getString(2).toString();
			String tipoDoc_Esperado=data.get(0).get(1).toString();
			assertThat(tipoDoc_recibido.trim(), equalTo(tipoDoc_Esperado.trim()));
			
			String nombre_recibido= rs.getString(3).toString();
			String nombre_Esperado=data.get(0).get(2).toString();
			assertThat(nombre_recibido.trim(), equalTo(nombre_Esperado.trim()));
			
			String tercero_recibido= rs.getString(4).toString();
			String tercero_Esperado=data.get(0).get(3).toString();
			assertThat(tercero_recibido.trim(), equalTo(tercero_Esperado.trim()));
			
			
		}
		
	}
	
	
	

}
