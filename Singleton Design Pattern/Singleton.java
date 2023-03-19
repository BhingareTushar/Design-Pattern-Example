public class Singleton {


        private final String str;

        private static volatile Singleton instance;

        private Singleton(String str) {
            this.str = str;
        }

        public static Singleton getInstance(String data) {
            Singleton result = instance;
            if (result == null) {
                synchronized (Singleton.class) {
                    result = instance;
                    if (result == null) {
                        instance = result = new Singleton(data);
                    }
                }
            }
            return result;
        }

        public String getData() {
            return str;
        }



    public static void main(String[] args) {

        System.out.println(Singleton.getInstance("Hello"));
        Singleton singleton = Singleton.getInstance("Hello World");
        System.out.println(singleton);
        System.out.println(singleton.getData());

    }

}
