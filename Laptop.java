public class Laptop {

    public static void main(String[] args) {
        System.out.println("pushing code");
        run();
        customSwitch(); 
        pull();
        debug();
        scan();
        execute();
        customSwitch(); 
        System.out.println("pushing code2");
    }

    static void run() {
        System.out.println("Code is running");
    }

    static void pull() {
        System.out.println("pulling request");
    }

    static void debug() {
        System.out.println("debugging code");
    }

    static void scan() {
        System.out.println("system is being scanned");
    }

    static void execute() {
        System.out.println("Code is executing");
    }

    static void customSwitch() { 
        System.out.println("switching elements");
    }
}
