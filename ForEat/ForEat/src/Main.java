public class Main {
    public static void main(String[] args) {

        String [] vetor = new String[] {"Jucao", "Jucin", "Juci"};

        for (int i = 0; i < vetor.length; i++){ //metodo tradicional
            System.out.println(vetor[i]);
        }

        for (String apelido : vetor){  //com for eat
            System.out.println(apelido);
        }



    }
}



//O FOR EAT É UMA FORMA DE FAZER UM LAÇO DE REPETIÇÃO MAIS CURTO PORÉM SÓ FUNCIONA PARA LISTA DE COLEÇÕES