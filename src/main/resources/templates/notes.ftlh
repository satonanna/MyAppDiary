<!Doctype html>
<html>
<head>
    <title>Мой дневник</title>
</head>
<body>
<h1>Мой дневник эмоций</h1><hr>
<h4>Мои записи</h4>
<#list notes as note>
    <div>
        <p><b>${note.day}</b> ${note.mood} | <a href="/note/${note.id}">Подробнее...</a></p>
    </div>
</#list>
<hr>
<h3>Сделать новую запись</h3>
<form action="/product/create" method="post">
    Какой сегодня день и дата? <input type="text" name="day"><br></br>
    Какое у меня сегодня настроение? <input type="text" name="mood"><br></br>
    Какие положительные эмоции я сегодня испытал? <input type="text" name="positiveEmotion"><br></br>
    Какие негативные эмоции я сегодня испытал? <input type="text" name="negativeEmotion"><br></br>
    В какой части тела у меня были необычные ощущения? <input type="text" name="bodyPart"><br></br>
    <input type="submit" value="Добавить новую запись"/>
</form>
</body>
</html>