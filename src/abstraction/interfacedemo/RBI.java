package abstraction.interfacedemo;

public interface RBI {

    void interest();

    void rule();

}

class SBI implements RBI{

    @Override
    public void interest() {
        System.out.println("10%");
    }

    @Override
    public void rule() {

    }

    public static void main(String[] args) {
        RBI sbi =new SBI();
        sbi.interest();
        sbi.rule();
    }

}