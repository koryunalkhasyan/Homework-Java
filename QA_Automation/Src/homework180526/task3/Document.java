package homework180526.task3;

class Document implements Identifiable<String> {
    private String id;

    public Document(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }
}
