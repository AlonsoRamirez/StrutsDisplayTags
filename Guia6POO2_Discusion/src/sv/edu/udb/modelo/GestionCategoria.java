package sv.edu.udb.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import sv.edu.udb.form.CategoriaForm;
public class GestionCategoria {
	
Conexion con=new Conexion();
public boolean ingresoCategoria(CategoriaForm cate){
boolean estado=false;
Connection cn=con.getConnection();
try {
PreparedStatement pt=null;
String query ="insert into categorias values(?,?)";
pt=cn.prepareStatement(query);
pt.setString(1, cate.getCodigo());
pt.setString(2,cate.getNombrecat());
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
public int actualizarCategoria(CategoriaForm cate){
int estado=0;
Connection cn=con.getConnection();
try {
PreparedStatement pt=null;
String query ="update categorias set Nombrecategoria= ? where Idcategoria=?";
pt=cn.prepareStatement(query);
pt.setString(1, cate.getNombrecat());
pt.setString(2,cate.getCodigo());
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
public int eliminarCategoria(CategoriaForm cate){
int estado=0;
Connection cn=con.getConnection();
try {
PreparedStatement pt=null;
String query ="delete from categorias where Idcategoria=?";
pt=cn.prepareStatement(query);
pt.setString(1, cate.getCodigo());
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
