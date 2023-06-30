<!DOCTYPE html>
<html xmlns:th="http://www.w3.org/1999/xhtml">
<head>
    <title>Мой дневник</title>
</head>
<body>
<h1>Мой дневник</h1>
<hr>
<h4>Авторизация</h4>
<form th:action="@{/login}" method="post">
    Логин: <input type="text" name="username"><br><br>
    Пароль: <input type="password" name="password"><br><br>
    <input type="hidden" name="_csrf" value="${_csrf.token}">
    <input type="submit" value="Вход">
</form><br>
<a href="/registration">Зарегистрироваться</a>
</body>
</html>
