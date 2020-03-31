# ListOfContacts
Задание:
>> №4  Тестовое задание отдела разработки интегрированных систем:  
>> Разработать набор REST API, реализующий функциональность списка контактов.  
>> Использовать стек Spring (предпочтительнее) или Java EE.
 ***
Данная программа предоставляет функционал списка контактов. Реализованные возможности: добавление и вывод контактов.
 ***
Для работы приложения нужна СУБД **PostgreSQL** со следующими настройками:
1. В ней должна быть база данных с названием **'ListOfContacts'**
2. Username: **postgres**
3. Пароль: **qwerasdfzxcv1234**
4. Адрес базы: **localhost:5432**
5. Нужно создать таблицу. Ниже скрипт для её создания:
```sql
CREATE TABLE public.contact
(
    id bigserial NOT NULL,
    name character varying NOT NULL,
    phone_number character varying NOT NULL,
    PRIMARY KEY (id)
);

ALTER TABLE public.contact
    OWNER to postgres;
```
***
Способы работы с приложением:
1) Через браузер:  
   Проходим по ссылке http://localhost:8080/contact/getAll.  
   Данная страница выводит список всех контактов и имеет форму для добавления контакта.  
   ***Примечание: при добавление пользователя выпадает страница с ошибкой, которую я не успел исправить. Но контакт при этом добавляется. Из-за этой ошибки нужно снова перейти на http://localhost:8080/contact/getAll.***
     
2) Через Postman:  
     По ссылке http://localhost:8080/getAllJSON отправляем GET-запроc, чтобы получить список контактов в формате JSON.  
     Для добавления контакта нужно отправить POST-запрос на http://localhost:8080/addJSON, в тело нужно которого поместить JSON следующего        формата:
     ```json
     {
         "name":"name",
         "phoneNumber":"123456789"
     }
     ```
