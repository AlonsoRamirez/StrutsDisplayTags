package sv.edu.udb.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import sv.edu.udb.form.ProveedorForm;
import sv.edu.udb.javabeans.ProveedorBean;
import sv.edu.udb.modelo.GestionProveedor;
import sv.edu.udb.modelo.LlenarCombos;

public class ProveedorAction extends DispatchAction{
	public ActionForward agregar(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)
			throws Exception {
			/*
			Instrucciones para el tratamiento de la petici�n
			*/
			ProveedorForm prov=(ProveedorForm) form;
			GestionProveedor gest=new GestionProveedor();
			if(gest.ingresoProveedor(prov)){
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
			ProveedorForm cate=(ProveedorForm) form;
			GestionProveedor gest=new GestionProveedor();
			if(gest.actualizarProveedor(cate)==1){
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
			ProveedorForm cate=(ProveedorForm) form;
			GestionProveedor gest=new GestionProveedor();
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
			ArrayList<ProveedorBean>
			listaproveedor=llenar.llenearComboProveedor();
			request.setAttribute("proveedor", listaproveedor);
			return mapping.findForward("inicio");
			}
}
