import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Vamos fazer uma brincadeira. Iremos criar duas listas com palavras quaisquer e eu irei identificar todas as palavras que forem repetidas entre as duas listas.");

        List<String> array1 = new ArrayList<>();
        List<String> array2 = new ArrayList<>();

        Scanner input1 = new Scanner(System.in);
        System.out.println("Insira a primeira palavra da primeira : ");
        String word = input1.nextLine();
        array1.add(word);

        while (!word.equals("")){
            System.out.println("Insira a próxima palavra ou encerre o conteúdo da primeira lista teclando enter sem escrever nada: ");
            word = input1.nextLine();
            array1.add(word);
        }

        System.out.println("Agora vamos criar a segunda lista, insira a primeira palavra: ");
        word = input1.nextLine();
        array2.add(word);

        while (!word.equals("")){
            System.out.println("Insira a próxima palavra ou encerre o conteúdo da segunda lista teclando enter sem escrever nada: ");
            word = input1.nextLine();
            array2.add(word);
        }

        List<String> repeatedStrings = new ArrayList<>();
        
        for (int i = 0; i < array1.size(); i++){
            String element = array1.get(i);
            if (array2.contains(element)){
                repeatedStrings.add(element);
            }
        }   

        if (repeatedStrings.get(0) == ""){
            System.out.println("Não há palavras repetidas entre as listas :(, brincou errado.");
            return;
        }

        System.out.println("As palavras repetidas entre as duas listas são as seguintes: ");

        for (int j = 0; j < repeatedStrings.size(); j++){
            System.out.println(repeatedStrings.get(j));
        }

        

    }
}
