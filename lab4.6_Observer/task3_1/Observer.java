// 1. Відшукання найдовшого рядка
class LongestLineObserver implements TextObserver {
    private String longestLine = "";

    @Override
    public void onLineRead(String line) {
        if (line.length() > longestLine.length()) {
            longestLine = line;
        }
    }

    @Override
    public void displayResult() {
        System.out.println("Найдовший рядок: " + longestLine);
    }
}

// 2. Підрахунок кількості слів
class WordCounterObserver implements TextObserver {
    private long totalWords = 0;

    @Override
    public void onLineRead(String line) {
        if (!line.trim().isEmpty()) {
            totalWords += line.trim().split("\\s+").length;
        }
    }

    @Override
    public void displayResult() {
        System.out.println("Загальна кількість слів: " + totalWords);
    }
}

// 3. Найдовше слово та рядок, що його містить
class LongestWordObserver implements TextObserver {
    private String longestWord = "";
    private String lineWithLongestWord = "";

    @Override
    public void onLineRead(String line) {
        String[] words = line.split("\\s+");
        for (String word : words) {
            // Очищення від пунктуації за потреби: word.replaceAll("[^a-zA-Zа-яА-Яіїєґ]", "")
            if (word.length() > longestWord.length()) {
                longestWord = word;
                lineWithLongestWord = line;
            }
        }
    }

    @Override
    public void displayResult() {
        System.out.println("Найдовше слово: " + longestWord);
        System.out.println("Рядок з найдовшим словом: " + lineWithLongestWord);
    }
}