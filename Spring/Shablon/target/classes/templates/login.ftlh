<#import "parts/common.ftlh" as common>

<@common.page>
    <h4><i>Авторизация</i></h4>
    <form action="/login" method="post">
        <input type="text" name="login" placeholder="example@mail.ru">
        <input type="password" name="password" placeholder="password">
        <input type="hidden" name="_csrf" value="${_csrf.token}" />
        <a href="/registration">Регистрация</a>
        <input type="submit" value="Войти">
    </form>
</@common.page>