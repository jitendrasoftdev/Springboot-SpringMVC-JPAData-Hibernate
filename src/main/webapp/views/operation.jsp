<%-- 
    Document   : newjsf
    Created on : 8 Feb, 2022, 8:39:18 AM
    Author     : JSD
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>Operation Page</title>
    </head>
    <body>
        <h2>Select Update Delete Action</h2>
        <form action="/performOperation">
            User By Id : <input name="uid" /><br/>
            <select name="operation">
                <option value="select">
                    Select Record
                </option>
                <option value="update">
                    Update Record
                </option>
                <option value="delete">
                    Delete Record
                </option>
                <option value="custom">
                    Custom
                </option>
            </select><br/>
            <input type="submit" value="Click for Operation" />
        </form>
        ${UserInfo.username}
    </body>
</html>
