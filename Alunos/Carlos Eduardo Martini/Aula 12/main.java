import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class main {

    public static void main(String[] args) {
        //ATV1
        List<Integer> nums = Arrays.asList(9, 30, 4, 57, 0, 65, 9, 8, 3, 7);
        List<Integer> numsPares = 
        nums.stream()
            .filter(n -> n % 2 ==0)
            .collect(Collectors.toList());
        
        System.out.println("ATV1: " + numsPares);
        
        //ATV2
        List<String> nomes = Arrays.asList("roberto", "josé", "caio", "vinicius");
        List<String> nomesMaiusculo = nomes.stream()
                                            .map(nome -> nome.toUpperCase())
                                            .collect(Collectors.toList());
        
        System.out.println("ATV2: " + nomesMaiusculo);

        //ATV3
        List<String> palav = Arrays.asList("se", "talvez", "hoje", "sábado", "se", "quarta", "sábado");
        Map<String, Long> contagemPalavras =
                            palav.stream()
                                 .collect(Collectors.groupingBy(p -> p, Collectors.counting()));

        System.out.println("ATV3: " + contagemPalavras);
    }
}
