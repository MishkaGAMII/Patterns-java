public class Main {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader("resources/input01.txt");

        // Створюємо спостерігачів
        TextObserver lineObs = new LongestLineObserver();
        TextObserver wordCountObs = new WordCounterObserver();
        TextObserver longestWordObs = new LongestWordObserver();

        // Підписуємо їх на оновлення
        fileReader.addObserver(lineObs);
        fileReader.addObserver(wordCountObs);
        fileReader.addObserver(longestWordObs);

        // Запускаємо читання
        fileReader.read();

        // Виводимо результати
        System.out.println("--- Результати аналізу ---");
        lineObs.displayResult();
        wordCountObs.displayResult();
        longestWordObs.displayResult();
    }
}