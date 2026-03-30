## Структура

- `src/Printable.java` — спільний інтерфейс компонентів і декораторів.
- `src/PrintableString.java` — базовий компонент.
- `src/PrintableStringDecorator.java` — абстрактний базовий декоратор.
- `src/PostComaDecorator.java` — додає `,` в кінець рядка.
- `src/PostEndlDecorator.java` — додає перехід на новий рядок.
- `src/PostSpaceDecorator.java` — додає пробіл.
- `src/PostExclaimDecorator.java` — додає `!`.
- `src/PostWordDecorator.java` — додає слово в кінець рядка.
- `src/PreWordDecorator.java` — додає слово на початок рядка.
- `src/Main.java` — демонстрація побудови виразу `Hello, World!` з порожнього рядка.
