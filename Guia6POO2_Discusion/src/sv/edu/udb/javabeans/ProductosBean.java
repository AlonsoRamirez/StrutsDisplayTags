package sv.edu.udb.javabeans;

public class ProductosBean {
String codigo_p;
String nombre_p;
String prove;
String cate;
Double prize;
float existencia;


public ProductosBean(String codigo_p, String nombre_p, Double prize, String prove,
		String cate,  float existencia) {
	this.codigo_p = codigo_p;
	this.nombre_p = nombre_p;
	this.prove = prove;
	this.cate = cate;
	this.prize = prize;
	this.existencia = existencia;
}
public String getCodigo_p() {
	return codigo_p;
}
public void setCodigo_p(String codigo_p) {
	this.codigo_p = codigo_p;
}
public String getNombre_p() {
	return nombre_p;
}
public void setNombre_p(String nombre_p) {
	this.nombre_p = nombre_p;
}
public String getProve() {
	return prove;
}
public void setProve(String prove) {
	this.prove = prove;
}
public String getCate() {
	return cate;
}
public void setCate(String cate) {
	this.cate = cate;
}
public Double getPrize() {
	return prize;
}
public void setPrize(Double prize) {
	this.prize = prize;
}
public float getExistencia() {
	return existencia;
}
public void setExistencia(float existencia) {
	this.existencia = existencia;
}





}
