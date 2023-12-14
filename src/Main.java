public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Referat a = new Referat(new Author("Ivan Vazov"), "t",600);
        Referat b = (Referat) a.clone();
        b.setTopic("t2");
        Referat c = (Referat) a.clone();
        c.setTopic("t3");
        Referat d = (Referat) a.clone();
        d.setTopic("t4");

        a.submit();
        b.submit();
        c.submit();
        d.submit();
    }
}

