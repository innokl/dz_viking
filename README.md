# Viking Demo

Минимальный демонстрационный Maven-проект для практического занятия по связке **Spring Web + REST API + Swagger/OpenAPI**.

## Что делает приложение

Приложение запускает:

1. **GUI на Swing** с одной кнопкой **Create random viking**.
2. **Таблицу**, где отображаются созданные викинги.
3. **REST API** с методом:
   - `GET /api/vikings` — вернуть список уже созданных викингов.
4. **Swagger UI** для просмотра и тестирования API:
   - `http://localhost:8080/swagger-ui.html`

В начале работы список пустой. Каждый клик по кнопке создаёт нового случайного викинга.

## Модель викинга

У викинга есть:
- `name`
- `age`
- `heightCm`
- `hairColor`
- `beardStyle` (`enum`)
- `equipment` (`List<EquipmentItem>`)

## Технологии

- Java 24
- Maven
- Spring Boot
- Spring Web MVC
- springdoc-openapi + Swagger UI
- DataFaker (современная замена Java Faker)
- Swing

## Сборка и запуск

```bash
mvn clean spring-boot:run
```

или

```bash
mvn clean package
java -jar target/viking-demo-1.0.0.jar
```

## Что показать студентам на занятии

1. Как GUI и REST API могут жить в одном приложении.
2. Как Spring создаёт REST-контроллер.
3. Как Swagger автоматически документирует метод `GET /api/vikings`.
4. Как доменная модель сериализуется в JSON.
5. Как сервис хранит состояние приложения в памяти.

## Возможное развитие примера

- добавить `POST /api/vikings`;
- вынести хранение данных в БД;
- заменить Swing на web-интерфейс;
- добавить DTO и mapper;
- показать различие между entity, DTO и API schema.
