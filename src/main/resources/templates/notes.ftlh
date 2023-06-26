<!Doctype html>
<html>
<head>
    <title>Мой дневник</title>
</head>
<body>
<h1>Мой дневник эмоций</h1><hr>
<h4>Мои записи</h4>
<form action="/" method="get">
      Найти мою запись: <input type="text" name="day"><br>
        <input type="submit" value="Поиск"/>
</form>
<#list notes as note>
    <div>
        <p><b>${note.day}</b> ${note.mood} | <a href="/note/${note.id}">Открыть...</a></p>
    </div>
    <#else>
    <h3>Записей нет</h3>
</#list>
<hr>
<h3>Сделать новую запись</h3>
<form action="/note/create" method="post" enctype="multipart/form-data">
    Какой сегодня день и дата? <input type="text" name="day"><br></br>
    Какое у меня сегодня настроение? <input type="text" name="mood"><br></br>
    Какие положительные эмоции я сегодня испытал? <input type="text" name="positiveEmotion"><br></br>
    Какие негативные эмоции я сегодня испытал? <input type="text" name="negativeEmotion"><br></br>
    В какой части тела у меня были необычные ощущения? <input type="text" name="bodyPart"><br></br>
    Первое селфи: <input type="file" name="file1"/><br><br>
    Второе селфи: <input type="file" name="file2"/><br><br>
    Третье селфи: <input type="file" name="file3"/><br><br>
    <input type="submit" value="Добавить в дневник новую запись"/>
</form>
</body>
</html>