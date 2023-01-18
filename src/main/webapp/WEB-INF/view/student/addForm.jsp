<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Document</title>
        </head>

        <body>
            <ul> <!-- 네비게이션 -->
                <li><a href="/">홈</a></li>
                <li><a href="/student/addForm">학생 등록</a></li>
            </ul>
            <h1>학생 등록 페이지</h1>
            <hr>
            <form action="/student/add" method="post">
                <input type="text" name="name" placeholder="Enter name" /> <br>
                <input type="number" name="grade" placeholder="Enter grade" /> <br>
                <input type="text" name="email" placeholder="Enter email" /> <br>
                <button type="submit"> 학생 등록 </button>
            </form>
        </body>

        </html>