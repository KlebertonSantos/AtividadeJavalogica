package AtiviadadeJavapoo;

public class TestaCliente {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        c.setNome("Kleberton Ferreira");
        c.setIdade(29);
        c.setSexo("Masculino");
        c.setFone(975072896);
        c.setCidade("Contagem-MG");
        System.out.println(c.getNome());
        System.out.println("idade "+ c.getIdade()+ " anos");
        System.out.println("Sexo " + c.getSexo());
        System.out.println("Telefone (31)" +c.getFone());
        System.out.println("Cidade " + c.getCidade());


    }
}
