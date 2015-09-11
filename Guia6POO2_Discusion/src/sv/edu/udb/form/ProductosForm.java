package sv.edu.udb.form;

import org.apache.struts.action.ActionForm;
public class ProductosForm extends ActionForm{
/**
*
*/
private static final long serialVersionUID = 1L;
String codigo;
String nombreproducto;
Double precio;
String provee;
String cat;
float existencia;

public String getCodigo() {
return codigo;
}
public void setCodigo(String codigo) {
this.codigo = codigo;
}
public String getNombreproducto() {
return nombreproducto;
}
public void setNombreproducto(String nombreproducto) {
this.nombreproducto = nombreproducto;
}
public Double getPrecio() {
return precio;
}
public void setPrecio(Double precio) {
this.precio = precio;
}
public String getProvee() {
return provee;
}
public void setProvee(String provee) {
this.provee = provee;
}
public float getExistencia() {
return existencia;
}
public void setExistencia(float existencia) {
this.existencia = existencia;
}
public String getCat() {
return cat;
}
public void setCat(String cat) {
this.cat = cat;
}
}