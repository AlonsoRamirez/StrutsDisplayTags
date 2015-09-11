package sv.edu.udb.action;


import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import sv.edu.udb.form.CategoriaForm;
import sv.edu.udb.javabeans.CategoriaBean;
import sv.edu.udb.modelo.GestionCategoria;
import sv.edu.udb.modelo.LlenarCombos;


public class CategoriaAction extends DispatchAction{
public ActionForward agregar(ActionMapping mapping,
ActionForm form,
HttpServletRequest request,
HttpServletResponse response)
throws Exception {
/*
Instrucciones para el tratamiento de la petici�n
*/
CategoriaForm cate=(CategoriaForm) form;
GestionCategoria gest=new GestionCategoria();
if(gest.ingresoCategoria(cate)){
request.setAttribute("mensaje", "Exito");
return mapping.findForward("inicio");
}
else{
request.setAttribute("mensaje", "Fracaso");
return mapping.findForward("inicio");
}
}
public ActionForward actualizar(ActionMapping mapping,
ActionForm form,
HttpServletRequest request,
HttpServletResponse response)
throws Exception {
CategoriaForm cate=(CategoriaForm) form;
GestionCategoria gest=new GestionCategoria();
if(gest.actualizarCategoria(cate)==1){
request.setAttribute("update", "Exito");
return mapping.findForward("inicio");
}
else{
request.setAttribute("update", "Fracaso");
return mapping.findForward("inicio");
}
}
public ActionForward eliminar(ActionMapping mapping,
ActionForm form,
HttpServletRequest request,
HttpServletResponse response)
throws Exception {
/*
Instrucciones para el tratamiento de la petición
*/
CategoriaForm cate=(CategoriaForm) form;
GestionCategoria gest=new GestionCategoria();
if(gest.eliminarCategoria(cate)==1){
request.setAttribute("delete", "Exito");

return mapping.findForward("inicio");
}
else{
request.setAttribute("delete", "Fracaso");
return mapping.findForward("inicio");
}
}
public ActionForward mostrar(ActionMapping mapping,
ActionForm form,
HttpServletRequest request,
HttpServletResponse response)
throws Exception {
/*
Instrucciones para el tratamiento de la petición
*/
LlenarCombos llenar=new LlenarCombos();
ArrayList<CategoriaBean>
listacategoria=llenar.llenearComboCategoria();
request.setAttribute("categoria", listacategoria);
return mapping.findForward("inicio");
}
}