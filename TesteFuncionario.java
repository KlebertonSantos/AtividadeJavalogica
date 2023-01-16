package AtiviadadeJavapoo;

public class TesteFuncionario {
    public static void main(String[] args) {
            Funcionario f = new Funcionario();
            f.setNome("Hiltom");
            f.setId(17719);
            f.setSexo("Masculino");
            f.setSetor("Backend");
            f.setCargo("Desenvolvedor");
            System.out.println("Nome do Funcionario: "+f.getNome());
            System.out.println("Id: "+ f.getId());
            System.out.println("Sexo: " + f.getSexo());
            System.out.println("O Setor: " +f.getSetor());
            System.out.println("o Cargo:  " + f.getCargo());
    }
}
