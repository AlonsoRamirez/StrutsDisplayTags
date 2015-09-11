<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/top-tags.jsp"%>
<html:html>
<head>
<title>Categoria</title>
<script type="text/javascript" language="JavaScript">
function nuevo(){
document.forms[0].method.value ="agregar"
document.forms[0].submit();
}
function update(){
document.forms[0].method.value ="actualizar"
document.forms[0].submit();
}
function remove(){
document.forms[0].method.value ="eliminar"
document.forms[0].submit();
}
function show(){
document.forms[0].method.value ="mostrar"
document.forms[0].submit();
}
</script>
</head>
<body>
<center>
<html:form action="/Categoria" method="get">
<table>
<tr>
<td><bean:message
key="label.codigo"/></td><td><html:text property="codigo"/></td>
</tr>
<tr><td><bean:message
key="label.categoria"/></td><td><html:text property="nombrecat"/></td>
</tr>
<tr>
<td colspan="2">
<html:button property="ingresar"
onclick="nuevo()"><bean:message key="label.agregar"/></html:button>
<html:button property="actualizar"
onclick="update()"><bean:message key="label.actualizar"/></html:button>
<html:button property="eliminar"
onclick="remove()"><bean:message key="label.eliminar"/></html:button>
<html:button property="mostrar"
onclick="show()"><bean:message key="label.mostrar"/></html:button>
<html:hidden property="method" value=""/>
</td>
</tr>
</table>
</html:form>
<logic:present name="mensaje">
<logic:equal name="mensaje" value="Exito">
<bean:message key="label.insert"/>
</logic:equal>
<logic:equal name="mensaje" value="Fracaso">
<font color="red">
<bean:message key="error.insert"/>
</font>
</logic:equal>
</logic:present>
<logic:present name="update">
<logic:equal name="update" value="Exito">
<bean:message key="label.update"/>
</logic:equal>
<logic:equal name="update" value="Fracaso">
<font color="red">
<bean:message key="error.update"/>
</font>
</logic:equal>
</logic:present>
<logic:present name="delete">
<logic:equal name="delete" value="Exito">
<bean:message key="label.delete"/>
</logic:equal>
<logic:equal name="delete" value="Fracaso">
<font color="red">
<bean:message key="error.delete"/>
</font>
</logic:equal>
</logic:present>
</center>
<center>
<logic:present name="categoria">
<display:table name="categoria">
<display:column property="codigo" title="Destino" />
<display:column property="nombre" title="Remitente"/>
</display:table>
</logic:present>
</center>
<center>
<html:link forward="menu">Regresar al Menu</html:link>
</center>
</body>
</html:html>