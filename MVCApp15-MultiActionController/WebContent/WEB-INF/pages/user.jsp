<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<h2 style="color: navy;text-align: center;">Admission Form</h2>

 
 <form name="frm"  method="POST">
      name :: <input type="text" name="name"><br>
      address :: <input type="text" name="address"><br>
      branch :: <input type="text" name="branch"><br>
      city :: <input type="text" name="city"><br>
      <input type="button"  value="register"  name="operation" onclick="send(this.value)">
      <input type="button"  value="modify"  name="operation" onclick="send(this.value)">
      <input type="button"  value="remove"  name="operation" onclick="send(this.value)">
      <input type="button"  value="search"  name="operation" onclick="send(this.value)">
 </form>
 <hr>
 <c:if test="${!empty operation }">
    <b>${operation }  is done <b> <br>
  </c:if>
   <c:if test="${!empty cmdData }">
  command object Data :: ${cmdData }
  </c:if>
  
  <script language="JavaScript">
     function send(cap){
      var uid=frm.name.value;
      var uname=frm.address.value;
      var addrs=frm.branch.value;
      var email=frm.city.value;
       if(cap=="register")
             frm.action="insert.htm";
        else if(cap=="modify")
            frm.action="update.htm"; 
        else if(cap=="remove")
            frm.action="delete.htm";
         else if(cap=="search")
            frm.action="find.htm";
          else 
                frm.action="invalid.htm";
           
           frm.submit();
     }
  </script>
