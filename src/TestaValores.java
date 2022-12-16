public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(133, 15567);

        Conta conta2 = new Conta(143, 15567);

        Conta conta3 = new Conta(123, 15567);

        System.out.println(conta.getAgencia());
        System.out.println(conta2.getAgencia());
        System.out.println(conta3.getAgencia());

        System.out.println(Conta.getTotal());
    }
}
