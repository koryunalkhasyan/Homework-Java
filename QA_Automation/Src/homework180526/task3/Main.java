package homework180526.task3;

public class Main {
    public static void main(String[] args) {
        User[] users = {new User(1), new User(5), new User(10)};
        Object[] userIds = GenericUtils.extractIds(users);

        Document[] docs = {new Document("A-1"), new Document("B-5")};
        Object[] docIds = GenericUtils.extractIds(docs);
    }
}
