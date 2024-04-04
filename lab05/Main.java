package lab05;

public class Main {
    public static void main(String[] args) {
        TaxManager taxManager = new TaxManager();

        Company company1 = new Company();
        Company company2 = new Company();
        FreeLand freeLand1 = new FreeLand();
        Employee employee1 =new Employee();

        taxManager.addTaxpayer(company1);
        taxManager.addTaxpayer(company2);
        taxManager.addTaxpayer(freeLand1);
        taxManager.addTaxpayer(employee1);

        System.out.println("Thông tin về đối tượng TaxManager: " + taxManager);
        System.out.println("Tổng số tiền thuế: "+taxManager.getTax());
        System.out.println("Số người đóng thuế: "+taxManager.getCount());
    }
}
