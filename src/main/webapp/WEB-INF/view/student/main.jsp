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
            <ul>
                <li><a href="/">홈</a></li>
                <li><a href="/student/addForm">학생 등록</a></li>
            </ul>
            <h1> 학생 목록 페이지 </h1>
            <hr />
            <table border="1">
                <tr>
                    <th>번호</th>
                    <th>학생 이름</th>
                    <th>학년</th>
                    <th>이메일</th>
                </tr>
                <c:forEach items="${studentList}" var="student">
                    <tr>
                        <td>${student.id}</td> <!--톰캣이 알아서 스트링을 해석함. -->
                        <td> <a href="/student/${student.id}">${student.name}</a></td>
                        <td>${student.grade}</td>
                        <td>${student.email}</td>
                    </tr>
                </c:forEach>
                
            </table>
        </body>

        </html>