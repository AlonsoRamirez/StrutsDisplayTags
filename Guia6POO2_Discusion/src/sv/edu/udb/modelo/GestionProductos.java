package sv.edu.udb.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;

import sv.edu.udb.form.ProductosForm;

public class GestionProductos {
	Conexion con=new Conexion();
	public boolean ingresoProducto(ProductosForm prod){
	boolean estado=false;
	Connection cn=con.getConnection();
	try {
	PreparedStatement pt=null;
	String query ="insert into producto values(?,?,?,?,?,?)";
	pt=cn.prepareStatement(query);
	pt.setString(1, prod.getCodigo());
	pt.setString(2,prod.getNombreproducto());
	pt.setDouble(3, prod.getPrecio());
	pt.setString(4,prod.getProvee());
	pt.setString(5, prod.getCat());
	pt.setFloat(6,prod.getExistencia());
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
	public int actualizarProducto(ProductosForm prod){
	int estado=0;
	Connection cn=con.getConnection();
	try {
	PreparedStatement pt=null;
	String query ="update producto set Nombreproducto= ?, Precio=?, Idproveedor=?, Idcategoria=?, Existencias=? where Idproducto=?";
	pt=cn.prepareStatement(query);
	pt.setString(6, prod.getCodigo());
	pt.setString(1,prod.getNombreproducto());
	pt.setDouble(2, prod.getPrecio());
	pt.setString(3,prod.getProvee());
	pt.setString(4, prod.getCat());
	pt.setFloat(5,prod.getExistencia());
	estado=pt.executeUpdate();
	//executeUpdate devuelve 1 si inserta, elimina o actualiza
	//devuelve 0 si no pudo realizar ninguna de las anteriores
	System.out.println(estado);
	} catch (Exception e) {
	System.out.println(e);
	}
	finally{

	con.cierraConexion(cn);
	}
	return estado;
	}
	public int eliminarProducto(ProductosForm prod){
	int estado=0;
	Connection cn=con.getConnection();
	try {
	PreparedStatement pt=null;
	String query ="delete from producto where Idproducto=?";
	pt=cn.prepareStatement(query);
	pt.setString(1, prod.getCodigo());
	estado=pt.executeUpdate();
	//executeUpdate devuelve 1 si inserta, elimina o actualiza
	//devuelve 0 si no pudo realizar ninguna de las anteriores
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
