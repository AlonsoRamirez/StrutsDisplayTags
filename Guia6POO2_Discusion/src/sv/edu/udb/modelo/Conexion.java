package sv.edu.udb.modelo;

import java.sql.*;
public class Conexion {
public Conexion(){}
public Connection getConnection(){
Connection cn=null;
try{
Class.forName("com.mysql.jdbc.Driver");
// Se obtiene una conexión con la base de datos.
cn = DriverManager.getConnection (
"jdbc:mysql://localhost:3306/controldeproductos","root", "");
}
catch(Exception e){e.printStackTrace();}
return cn;
}
public void cierraConexion(Connection cn){
try{
if(cn!=null && !cn.isClosed()){
cn.close();

}
}
catch (SQLException e) {
e.printStackTrace();
}
}
}