<#import "parts/common.ftlh" as common>

<@common.page>
    <h4><i>Регистрация</i></h4>
    <form action="/registration" method="post">
        <input type="text" name="login" placeholder="Логин">
        <input type="password" name="password" placeholder="Пароль">
        <input type="hidden" name="_csrf" value="${_csrf.token}" />
        <input type="submit" value="Зарегистрироваться">
    </form>
</@common.page>