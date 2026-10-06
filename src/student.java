public class student {
    String name;
    int roll ;
    String clgname ;
    public student (String name, int roll , String clgname ) {   // via constructor
        this.name = name;
        this.roll = roll;
        this.clgname = clgname;
    }
        public void printdata() {
            System.out.println(this.name + " ," + this.roll + "," + clgname);
        }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", clgname='" + clgname + '\'' +
                '}';
    }

    /* public void init(String name, int roll , String clgname ){     // via method
        this.name = name;
        this.roll = roll;
        this.clgname = clgname;    */
    }



