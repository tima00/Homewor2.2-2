public class Main {
    public static void main(String[] args) {



        createObject("iphone");


    }

    public static Object createObject(String className){
        switch (className){
            case "iphone"-> {
                Iphone iphone = new Iphone("14",2022,Color.BLACK);
                iphone.print();
                break;
            }
            case "samsung"->{
                Samsung samsung = new Samsung("Samsung Galaxy",2022,Color.WHITE);
                samsung.print();
                break;
            }
            case "xiaomi"->{
                Xiaomi xiaomi = new Xiaomi("Xiaomi", 2019, Color.YELLOW);
                xiaomi.print();
                break;
            }
        }
        return className;

    }

}