<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>     
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<style>
    
    th{
        text-align: left;
        color: red;
        font-size: 20px;
    }
    td{
        text-align: left;
        color: green;
        font-size: 20px;
    }
</style>  
<center> 
<h1 style="color:blue">Welcome ${eid.name}</h1>   
<table  width="70%" cellpadding="2">   
<tr> 
    <th>Account Number</th> 
    <th>Name</th> 
    <th>Amount</th> 
    <th>Address</th> 
      <th>Mobile Number</th>
    </tr>   
   <tr>   
   <td>${eid.acno}</td>   
   <td>${eid.name}</td>  
   <td>${eid.amount}</td>    
   <td>${eid.address}</td>   
   <td>${eid.mno}</td>  
    </tr>    
   </table>  
</center> 
