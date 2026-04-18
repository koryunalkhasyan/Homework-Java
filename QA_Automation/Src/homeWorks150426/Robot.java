package homeWorks150426;

public class Robot {
        public static void performMorningRoutine(Cleaner c, Talker t) {
            c.clean();
            t.speak();
        }
        public static void main(String[] args) {

            Android android = new Android();
            VacuumCleaner vacuum = new VacuumCleaner();
            Human human = new Human();

            performMorningRoutine(android, android);

            System.out.println("-----");
            vacuum.clean();

            System.out.println("-----");
            human.speak();
        }
    }

interface Walker {
    void walk();
}

interface Talker {
    void speak();
}

interface Cleaner {
    void clean();
}

class Human implements Walker, Talker {

    @Override
    public void walk() {
        System.out.println("Human is walking");
    }

    @Override
    public void speak() {
        System.out.println("Human is speaking");
    }
}

class VacuumCleaner implements Walker, Cleaner {

    @Override
    public void walk() {
        System.out.println("VacuumCleaner is moving");
    }

    @Override
    public void clean() {
        System.out.println("VacuumCleaner is cleaning");
    }
}

class Android implements Walker, Talker, Cleaner {

    @Override
    public void walk() {
        System.out.println("Android is walking");
    }

    @Override
    public void speak() {
        System.out.println("Android is speaking");
    }

    @Override
    public void clean() {
        System.out.println("Android is cleaning");
    }
}

