public class TesteGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24225);

        conta.setNumero(1337);

        System.out.println(conta.getNumero());

        Cliente lucas = new Cliente();
        lucas.setNome("Lucas Sales");

        System.out.println(lucas.getNome());

        conta.setTitular(lucas);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("programador");

        System.out.println(conta.getTitular().getProfissao());
    }
}
