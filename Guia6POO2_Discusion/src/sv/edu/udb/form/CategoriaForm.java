package sv.edu.udb.form;

import org.apache.struts.action.ActionForm;
public class CategoriaForm extends ActionForm {
/**
*
*/
private static final long serialVersionUID = 1L;
String codigo;
String nombrecat;
public String getCodigo() {
return codigo;
}
public void setCodigo(String codigo) {
this.codigo = codigo;
}
public String getNombrecat() {
return nombrecat;
}
public void setNombrecat(String nombrecat) {
this.nombrecat = nombrecat;
}
}