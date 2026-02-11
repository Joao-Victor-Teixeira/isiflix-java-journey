public class Sistema {

    public static void main(String[] args) {
        
        Pessoa p = new Pessoa();
        p.setNome("Joao");
        p.setEmail("joao@dev.com");
        p.setTelefone("987654321");

        Estudante e = new Estudante();
        e.setNome("Jose");
        e.setEmail("jose@jose.com");
        e.setTelefone("912345678");
        e.setNumeroMatricula(12345);
        e.setCurso("Java");

        System.out.println(p.exibir());
        System.out.println(e.exibir());
    }

}
