<!Doctype html>
<html>
<head>
    <title>Мой дневник</title>
</head>
<body>
<h1>Мой дневник эмоций</h1><hr>
<h4>Моя запись</h4>
<b>День:</b>${note.day}<br>
<b>Мое настроение:</b>${note.mood}<br>
<b>Мои позитивные эмоции:</b>${note.positiveEmotion}<br>
<b>Мои негативные эмоции:</b>${note.negativeEmotion}<br>
<b>Моя часть тела, в которой были необычные ощущения:</b>${note.bodyPart}<br>
<hr>
<h3>Удалить запись</h3>
<form action="/product/delete" ${note.id}method="post">
    <input type="submit" value="Удалить запись"/>
</form>
</body>
</html>