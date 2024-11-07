public class Polymorphism {
    
}

/*
    * Has-a Relationship

    public class ChildInfo {
        public string firstName;
        public string birthDate;
        public string schoolName;

        ...
    }

    public class MotherInfo {
        public String firstName;
        public String birthDate;
        public String spouseName;
        public ArrayList<ChildInfo> childrenData;
    }

    * Is-a Relationship (Inheritance)

    public class PersonInfo {
        public String firstName;
        public String birthDate;
        
        ...
    }

    public class ChildInfo extends PersonInfo {
        public String schoolName;

        ...
    }

    public class MotherInfo extends PersonInfo {
        public String spouseName;
        public ArrayList<ChildInfo? childrenData;

        ...
    }

    * compile-time polymorphism
    compiler determines which of several identically-named methods to call based on the 
    method's arguments

    * runtime polymorphism
    compiler cannot make the determination but instead the determination is made
    while the program is running

    ParentItem p1 = new ParentItem(); - works
    ParentItem p2 = new ChildItem(); - works
    ChildItem p3 = new ChildItem(); - works
    ChildItem p4 = new ParentItem(); - doesn't work

    
 */
