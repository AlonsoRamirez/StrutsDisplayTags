package sv.edu.udb.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import sv.edu.udb.form.ProveedorForm;


public class GestionProveedor {
	Conexion con=new Conexion();
	public boolean ingresoProveedor(ProveedorForm prov){
	boolean estado=false;
	Connection cn=con.getConnection();
	try {
	PreparedStatement pt=null;
	String query ="insert into proveedor values(?,?)";
	pt=cn.prepareStatement(query);
	pt.setString(1, prov.getCodigo());
	pt.setString(2, prov.getNombreprov());
	pt.executeUpdate();
	estado=true;
	} catch (Exception e) {
	System.out.println(e);
	}
	finally{
	con.cierraConexion(cn);
	}
	return estado;
	}
	public int actualizarProveedor(ProveedorForm prov){
	int estado=0;
	Connection cn=con.getConnection();
	try {
	PreparedStatement pt=null;
	String query ="update proveedor set Nombreproveedor= ? where Idproveedor=?";
	pt=cn.prepareStatement(query);
	pt.setString(1, prov.getNombreprov());
	pt.setString(2, prov.getCodigo());
	estado=pt.executeUpdate();
	System.out.println(estado);
	} catch (Exception e) {
	System.out.println(e);
	}
	finally{

	con.cierraConexion(cn);
	}
	return estado;
	}
	public int eliminarCategoria(ProveedorForm prov){
	int estado=0;
	Connection cn=con.getConnection();
	try {
	PreparedStatement pt=null;
	String query ="delete from proveedor where Idproveedor=?";
	pt=cn.prepareStatement(query);
	pt.setString(1, prov.getCodigo());
	estado=pt.executeUpdate();

	System.out.println(estado);
	} catch (Exception e) {
	System.out.println(e);
	}
	finally{
	con.cierraConexion(cn);
	}
	return estado;
	}
}
