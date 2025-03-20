<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Login Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            margin-top: 100px;
            background-color: #f4f4f4;
        }
        .login-container {
            width: 300px;
            margin: auto;
            background: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0px 0px 10px gray;
        }
        input {
            width: 90%;
            padding: 10px;
            margin: 10px 0;
        }
        button {
            width: 100%;
            padding: 10px;
            background: blue;
            color: white;
            border: none;
            cursor: pointer;
        }
        button:hover {
            background: darkblue;
        }
    </style>
</head>
<body>
    <div class="login-container">
        <h2>Login</h2>
        <form action="LoginServlet" method="post">
            <input type="text" name="username" placeholder="Enter Username" required /><br>
            <input type="password" name="password" placeholder="Enter Password" required /><br>
            <button type="submit">Login</button>
        </form>
    </div>
</body>
</html>

