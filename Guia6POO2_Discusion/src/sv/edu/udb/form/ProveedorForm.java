package sv.edu.udb.form;

import org.apache.struts.action.ActionForm;
public class ProveedorForm extends ActionForm {
/**
*
*/
private static final long serialVersionUID = 1L;
String codigo;
String nombreprov;
public String getCodigo() {
return codigo;
}
public void setCodigo(String codigo) {
this.codigo = codigo;
}
public String getNombreprov() {
	return nombreprov;
}
public void setNombreprov(String nombreprov) {
	this.nombreprov = nombreprov;
}

}