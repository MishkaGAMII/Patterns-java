public class Main {
    public static void main(String[] args) {
        StringSequenceBuilder builder = new ConcreteStringSequenceBuilder();

        String result = builder
                .append("Hello")
                .append(", ")
                .append("ld")
                .insert(7, "Wor")
                .build();

        System.out.println(result);

        String secondResult = new ConcreteStringSequenceBuilder()
                .append("Pattern")
                .insert(7, " Design")
                .append(" Builder")
                .build();

        System.out.println(secondResult);
    }
}

interface StringSequenceBuilder {
    StringSequenceBuilder append(String sequence);

    StringSequenceBuilder insert(int index, String sequence);

    String build();
}

class ConcreteStringSequenceBuilder implements StringSequenceBuilder {
    private final StringBuilder stringBuilder;

    public ConcreteStringSequenceBuilder() {
        this.stringBuilder = new StringBuilder();
    }

    @Override
    public StringSequenceBuilder append(String sequence) {
        validateSequence(sequence);
        stringBuilder.append(sequence);
        return this;
    }

    @Override
    public StringSequenceBuilder insert(int index, String sequence) {
        validateSequence(sequence);
        validateIndex(index);
        stringBuilder.insert(index, sequence);
        return this;
    }

    @Override
    public String build() {
        return stringBuilder.toString();
    }

    private void validateSequence(String sequence) {
        if (sequence == null) {
            throw new IllegalArgumentException("Sequence cannot be null.");
        }
    }

    private void validateIndex(int index) {
        if (index < 0 || index > stringBuilder.length()) {
            throw new IllegalArgumentException(
                    "Index must be between 0 and " + stringBuilder.length() + "."
            );
        }
    }
}
