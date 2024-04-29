class Result {
    public void result() {
        System.out.println("This is the result of the exam.");
    }
}

class UGResult extends Result {
    @Override
    public void result() {
        System.out.println("This is the result of the UG exam.");
    }
}

class PGResult extends Result {
    @Override
    public void result() {
        System.out.println("This is the result of the PG exam.");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Result r = new Result();
        UGResult ugr = new UGResult();
        PGResult pgr = new PGResult();
        r.result();
        ugr.result();
        pgr.result();
    }
}