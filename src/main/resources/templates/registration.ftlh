<!DOCTYPE html>
<html>
<head>
    <title>Мой дневник</title>
</head>
<body>
<h1>Мой дневник</h1>
<hr>
<h4>Регистрация</h4>
<form action="/registration" method="post">
    Имя пользователя: <input type="text" name="name"><br><br>
    Пароль: <input type="password" name="password"><br><br>
    <#if csrf??>
        <input type="hidden" name="${csrf.parameterName}" value="${csrf.token}"/>
    </#if>
    <input type="submit" value="Регистрация">
</form>
<#if errorMessage??>
    <h2 style="color: red">${errorMessage}</h2>
</#if>
<a href="/login">Авторизация</a>
</body>
</html>
