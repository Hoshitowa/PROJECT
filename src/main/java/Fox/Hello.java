package Fox;


public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//        new Proma().Hello();
        Proma p = new Proma("fox",66.5f,1.7f);
        p.Hello();
        p.name = "Fox";
        p.weight = 66.5f;
        p.height =  1.7f;

        System.out.println(p.bmi());

       /* int age;
        age = 22;
        char c = 'A';
        byte b = 30;
        float weight = 65.5f;
        boolean enroll = true;
        String s = new String("ABCDE");
        System.out.println(enroll)*/
        }

    }


