<%@page import="java.util.List"%>
<%@page import="com.example.Employee_management2.employee.domain.model.Employee"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div>
	<c:if test="${employeeList != null}">
		<table>
			<tr>
				<th>従業員名</th>
				<th>稼働先</th>
				<th>所属</th>
			</tr>
			<c:forEach var="employee" value="${result}">
				<tr>
					<td><c:out value="${employee.getUserName()}" /></td>
					<td><c:out value="${employee.getCompanyDepartCode()}" /></td>
					<td><c:out value="${employee.getCompanyCode()}" /></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</div>