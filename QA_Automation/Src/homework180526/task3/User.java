package homework180526.task3;

class User implements Identifiable<Integer> {
    private Integer id;

    public User(Integer id) {
        this.id = id;
    }

    @Override
    public Integer getId() {
        return id;
    }
}
