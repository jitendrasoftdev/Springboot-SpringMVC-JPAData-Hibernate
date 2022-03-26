<%-- 
    Document   : registration
    Created on : 8 Feb, 2022, 1:26:10 PM
    Author     : JSD
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">


    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>Registration</title>
        </head>
        <body>
            <div>
                <form action="/register">
                    <input name="username" placeholder="Name"/><br/>
                    <input type="password" name="passwd"  placeholder="Password"/><br/>
                    <input name="email" placeholder="Email"/><br/>
                    Gender : <select name="gender">
                            <option value="male">Male</option>
                            <option value="female">Female</option>
                            <option value="others">Others</option>
                    </select><br/> 
                    
                    Hobbies : <input name="hobbies" type="checkbox" value="Dancing" /> Dancing
                    <input type="checkbox" name="hobbies" value="Singing" /> Singing <br/>
                    
                    <input type="submit" name="register" value="Register"/>
                </form>
            </div>
        </body>
    </html>
