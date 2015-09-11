package sv.edu.udb.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import sv.edu.udb.javabeans.CategoriaBean;
import sv.edu.udb.javabeans.ProductosBean;
import sv.edu.udb.javabeans.ProveedorBean;

public class LlenarCombos {
Conexion con=new Conexion();
PreparedStatement ps=null;
ResultSet rs=null;
ArrayList<CategoriaBean> listacategoria=new ArrayList<CategoriaBean>();
ArrayList<ProveedorBean> listaproveedor=new ArrayList<ProveedorBean>();
ArrayList<ProductosBean> listaproductos=new ArrayList<ProductosBean>();

public ArrayList<CategoriaBean> llenearComboCategoria() {
String sql="Select * from categorias";
Connection cn=con.getConnection();
try {
ps=cn.prepareStatement(sql);
rs=ps.executeQuery();
while(rs.next()){
CategoriaBean cat=new CategoriaBean(rs.getString(1),rs.getString(2));
listacategoria.add(cat);
System.out.println(rs.getString(1) + " " +rs.getString(2));
}
con.cierraConexion(cn);
} catch (SQLException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
return listacategoria;
}


public ArrayList<ProductosBean> llenearComboProductos() {
	//String sql="Select * from producto";
	String sql="select producto.Idproducto, producto.Nombreproducto, producto.Precio, "
			+ "proveedor.Nombreproveedor, categorias.Nombrecategoria, producto.Existencias"
			+ " from categorias inner join producto on producto.Idcategoria= categorias.Idcategoria"
			+ " INNER JOIN proveedor on producto.Idproveedor= proveedor.Idproveedor";
Connection cn=con.getConnection();
try {
ps=cn.prepareStatement(sql);
rs=ps.executeQuery();
while(rs.next()){
ProductosBean prod=new ProductosBean(rs.getString(1),rs.getString(2), rs.getDouble(3),rs.getString(4),rs.getString(5),rs.getFloat(6));
listaproductos.add(prod);
System.out.println(rs.getString(1) + " " +rs.getString(2)  + " " +rs.getDouble(3)  + " " +rs.getString(4)  + " " +rs.getString(5)  + " " +rs.getFloat(6));
}
con.cierraConexion(cn);
} catch (SQLException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
return listaproductos;
}


public ArrayList<ProveedorBean> llenearComboProveedor() {
String sql="select * from proveedor";
Connection cn=con.getConnection();
try {
ps=cn.prepareStatement(sql);
rs=ps.executeQuery();
while(rs.next()){
ProveedorBean cat=new ProveedorBean(rs.getString(1),rs.getString(2));
listaproveedor.add(cat);
System.out.println(rs.getString(1) + " " +rs.getString(2));
}
con.cierraConexion(cn);
} catch (SQLException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
return listaproveedor;
}
}
