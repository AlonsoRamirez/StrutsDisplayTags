package sv.edu.udb.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import sv.edu.udb.form.ProductosForm;
import sv.edu.udb.javabeans.CategoriaBean;
import sv.edu.udb.javabeans.ProductosBean;
import sv.edu.udb.javabeans.ProveedorBean;
import sv.edu.udb.modelo.GestionProductos;
import sv.edu.udb.modelo.LlenarCombos;
public class CargarCombosAction extends DispatchAction{
	public ActionForward agregar(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)
			throws Exception {
			/*
			Instrucciones para el tratamiento de la petici�n
			*/
			ProductosForm cate=(ProductosForm) form;
			GestionProductos gest=new GestionProductos();
			if(gest.ingresoProducto(cate)){
				LlenarCombos llenar=new LlenarCombos();
				ArrayList<CategoriaBean> listacategoria=llenar.llenearComboCategoria();
				request.setAttribute("categoria", listacategoria);

				ArrayList<ProveedorBean> listaproveedor=llenar.llenearComboProveedor();
				request.setAttribute("proveedor", listaproveedor);
			request.setAttribute("mensaje", "Exito");
			return mapping.findForward("ingresado");
			}
			else{
				LlenarCombos llenar=new LlenarCombos();
				ArrayList<CategoriaBean> listacategoria=llenar.llenearComboCategoria();
				request.setAttribute("categoria", listacategoria);

				ArrayList<ProveedorBean> listaproveedor=llenar.llenearComboProveedor();
				request.setAttribute("proveedor", listaproveedor);
			request.setAttribute("mensaje", "Fracaso");
			return mapping.findForward("ingresado");
			}
			}
			public ActionForward actualizar(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)
			throws Exception {
				ProductosForm cate=(ProductosForm) form;
				GestionProductos gest=new GestionProductos();
			if(gest.actualizarProducto(cate)==1){
				LlenarCombos llenar=new LlenarCombos();
				ArrayList<CategoriaBean> listacategoria=llenar.llenearComboCategoria();
				request.setAttribute("categoria", listacategoria);

				ArrayList<ProveedorBean> listaproveedor=llenar.llenearComboProveedor();
				request.setAttribute("proveedor", listaproveedor);
			request.setAttribute("update", "Exito");
			return mapping.findForward("ingresado");
			}
			else{
			request.setAttribute("update", "Fracaso");
			return mapping.findForward("ingresado");
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
				ProductosForm cate=(ProductosForm) form;
				GestionProductos gest=new GestionProductos();
			if(gest.eliminarProducto(cate)==1){
				LlenarCombos llenar=new LlenarCombos();
				ArrayList<CategoriaBean> listacategoria=llenar.llenearComboCategoria();
				request.setAttribute("categoria", listacategoria);

				ArrayList<ProveedorBean> listaproveedor=llenar.llenearComboProveedor();
				request.setAttribute("proveedor", listaproveedor);
			request.setAttribute("delete", "Exito");

			return mapping.findForward("ingresado");
			}
			else{
				LlenarCombos llenar=new LlenarCombos();
				ArrayList<CategoriaBean> listacategoria=llenar.llenearComboCategoria();
				request.setAttribute("categoria", listacategoria);

				ArrayList<ProveedorBean> listaproveedor=llenar.llenearComboProveedor();
				request.setAttribute("proveedor", listaproveedor);
			request.setAttribute("delete", "Fracaso");
			return mapping.findForward("ingresado");
			}
			}
			
			public ActionForward mostrar(ActionMapping mapping,
					ActionForm form,
					HttpServletRequest request,
					HttpServletResponse response)
					throws Exception {
				
				LlenarCombos llenar=new LlenarCombos();
				
				ArrayList<ProductosBean>listaproductos=llenar.llenearComboProductos();
				request.setAttribute("producto", listaproductos);
				
				
				ArrayList<CategoriaBean> listacategoria=llenar.llenearComboCategoria();
				request.setAttribute("categoria", listacategoria);

				ArrayList<ProveedorBean> listaproveedor=llenar.llenearComboProveedor();
				request.setAttribute("proveedor", listaproveedor);
				
					return mapping.findForward("ingresado");
				}
	
public ActionForward llenar(ActionMapping mapping,
ActionForm form,
HttpServletRequest request,
HttpServletResponse response)
throws Exception {
/*
Instrucciones para el tratamiento de la petición
*/
LlenarCombos llenar=new LlenarCombos();
ArrayList<ProductosBean>listaproductos=llenar.llenearComboProductos();
request.setAttribute("producto", listaproductos);


ArrayList<CategoriaBean> listacategoria=llenar.llenearComboCategoria();
request.setAttribute("categoria", listacategoria);

ArrayList<ProveedorBean> listaproveedor=llenar.llenearComboProveedor();
request.setAttribute("proveedor", listaproveedor);
return mapping.findForward("ingresado");
}
}