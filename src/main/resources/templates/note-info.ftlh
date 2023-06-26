<!Doctype html>
<html>
<head>
    <title>Мой дневник</title>
</head>
<body>
<h1>Мой дневник</h1><hr>
<h4>Моя запись</h4>
<#list images as img>
    <img src="/images/${img.id}" height="60px"/><br><br>
</#list>
<b>День:</b>${note.day}<br>
<b>Мое настроение:</b>${note.mood}<br>
<b>Мои позитивные эмоции:</b>${note.positiveEmotion}<br>
<b>Мои негативные эмоции:</b>${note.negativeEmotion}<br>
<b>Моя часть тела, в которой были необычные ощущения:</b>${note.bodyPart}<br>
<hr>
<form action="/note/delete" ${note.id}method="post">
    <input type="submit" value="Удалить запись"/>
</form>
</body>
</html>