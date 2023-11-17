public class GoodStudentDriver {
    public static void main (String args[])
    {
        GoodStudent Alan = new GoodStudent("Alan", "Turing", "Big Al", 191254, 3.56, "Yes");
        GoodStudent Florence = new GoodStudent("Florence", "Nightingale", 182010, 3.89, "No");
        GoodStudent Grace = new GoodStudent("Grace", "Hopper", "Queen Bee", 190692, 3.99, "Yes");

        System.out.println(Alan.toString());

        System.out.println("\n");

        //Calling setters
        Florence.setNickname("Flo-No");
        Florence.setGpa(3.92);

        //Calling getters
        System.out.println(Florence.getNickname());
        System.out.println(Florence.getGpa());

        System.out.println("\n");

        System.out.println(Grace.getFirstName());
        System.out.println(Grace.getCSStatus());

        System.out.println("\n");

        System.out.println(Alan.CreateID());
        System.out.println(Florence.CreateID());
        System.out.println(Grace.CreateID());

        System.out.println("\n");

        System.out.println(Alan.CSGPA());
        System.out.println(Florence.CSGPA());
        System.out.println(Grace.CSGPA());
    }
}
