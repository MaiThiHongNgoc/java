package secssion4;

public class Animal implements CanMove {
    @Override//Annotation thay doi tinh chat hoac hanh vi cua phuong thuc
    public void run() {
        System.out.println("Animal can run run run...");
        //trien khai code theo cach Animal muon o day
    }

    @Override
    public void back() {

    }
}
