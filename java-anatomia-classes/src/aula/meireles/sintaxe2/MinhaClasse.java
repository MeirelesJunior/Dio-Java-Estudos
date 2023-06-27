package aula.meireles.sintaxe2;

public class MinhaClasse {
    public static void main(String[] args) {
        
        String primeiroNome = "Jorge";
        String segundoNome = "Meireles";
       

        String nomeCompleto = nameCompleto(primeiroNome, segundoNome);
        
        

        System.out.println(nameCompleto(primeiroNome, segundoNome));
        System.out.println(nomeCompleto);
        System.out.println();
        
    }

    public static String nameCompleto(String primeiroNome, String segundoNome) {
    return primeiroNome.concat(" ").concat(segundoNome);
}

    public  int somar(int num1, int num2){
        int soma = num1 +num2;
        return soma;
    }
}   

    
