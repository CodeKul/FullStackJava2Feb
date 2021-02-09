package abstraction.abstractdemo;

public abstract class RBI {
    public abstract void interest();
    public void rule(){
        System.out.println("100 rs minimum required");
    }
}

class SBI extends RBI{

    @Override
    public void interest() {
        System.out.println("10 % ");
    }

    public static void main(String[] args) {

        SBI sbi =new SBI();
        sbi.interest();
        sbi.rule();
    }
}

class HDFC extends RBI{

    @Override
    public void interest() {
        System.out.println("12 % ");
    }

    public static void main(String[] args) {
        HDFC hdfc = new HDFC();
        hdfc.interest();
        hdfc.rule();
    }
}

class Kotak extends RBI{

    @Override
    public void interest() {
        System.out.println("7 % ");
    }

    public static void main(String[] args) {
        Kotak kotak=new Kotak();
        kotak.interest();
    }
}