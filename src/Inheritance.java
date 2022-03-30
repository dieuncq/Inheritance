public class Inheritance {
    Product prod_Item = new Product();
    Book book_Item = new Book();
    Bag bag_Item = new Bag();
    Pen pen_Item = new Pen();
}

class Inheritance_Exercise {
    public static void Exercise() {
        Inheritance inher_Item = new Inheritance();
        inher_Item.prod_Item.set_s_Name("How to coding Java - prod_Item");
        inher_Item.prod_Item.set_s_Branch("ITSJ-Group - prod_Item");
        inher_Item.prod_Item.set_d_Price(999.999);

        inher_Item.book_Item.set_s_Name("How to coding Java - book_Item");
        inher_Item.book_Item.set_s_Branch("ITSJ-Group - book_Item");
        inher_Item.book_Item.set_d_Price(888.888);
        inher_Item.book_Item.set_s_Author("Dieu Nguyen - book_Item");

        inher_Item.pen_Item.set_s_Name("How to coding Java - pen_Item");
        inher_Item.pen_Item.set_s_Branch("ITSJ-Group - pen_Item");
        inher_Item.pen_Item.set_d_Price(777.777);
        inher_Item.pen_Item.set_s_Color("White - pen_Item");

        System.out.println("\nThe value foreach element in prod_Item:");
        System.out.println(inher_Item.prod_Item.get_s_Name());
        System.out.println(inher_Item.prod_Item.get_s_Branch());
        System.out.println(inher_Item.prod_Item.get_d_Price());

        System.out.println("\nThe value foreach element in book_Item:");
        System.out.println(inher_Item.book_Item.get_s_Name());
        System.out.println(inher_Item.book_Item.get_s_Branch());
        System.out.println(inher_Item.book_Item.get_d_Price());
        System.out.println(inher_Item.book_Item.get_s_Author());

        System.out.println("\nThe value foreach element in pen_Item:");
        System.out.println(inher_Item.pen_Item.get_s_Name());
        System.out.println(inher_Item.pen_Item.get_s_Branch());
        System.out.println(inher_Item.pen_Item.get_d_Price());
        System.out.println(inher_Item.pen_Item.get_s_Color());
    }
}