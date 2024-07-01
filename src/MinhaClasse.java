public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("Primeira escrita no java depois de muito tempo  ");
        System.out.println("Hello wolrd");

        String primeiroNome = "Gustavo";
        String segundoNome = "Mayer";
        String meuNomeCompleto = MinhaClasse.nomeCompleto(primeiroNome, segundoNome);

        System.out.println("____________________________");

        System.out.println(meuNomeCompleto);

        System.out.println("____________________________");
    }

    public static String nomeCompleto (String nome, String sobrenome){
        return (nome +" " +sobrenome);
    }

    
    
}

