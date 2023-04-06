import java.util.Scanner;

public class Lista17 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double area, litrosTinta, precoLata, precoGalao, precoLatas, precoGaloes, qtdLatasFinal, qtdGaloesFinal;
        int latas, galoes;
        
        System.out.print("Digite o tamanho da área em metros quadrados: ");
        area = input.nextDouble();
        
        litrosTinta = area / 6;
        
        latas = (int) Math.ceil(litrosTinta / 18);
        galoes = (int) Math.ceil(litrosTinta / 3.6);
        
        precoLatas = latas * 80;
        precoGaloes = galoes * 25;
        
        qtdLatasFinal = Math.floor(litrosTinta / 18);
        qtdGaloesFinal = Math.ceil((litrosTinta % 18) / 3.6);
        
        precoLata = qtdLatasFinal * 80;
        precoGalao = qtdGaloesFinal * 25;
        
        System.out.printf("Opção 1 - Comprar apenas latas de 18 litros: %d latas de tinta por R$%.2f%n", latas, precoLatas);
        System.out.printf("Opção 2 - Comprar apenas galões de 3,6 litros: %d galões de tinta por R$%.2f%n", galoes, precoGaloes);
        System.out.printf("Opção 3 - Combinar latas e galões de tinta:%n");
        System.out.printf("\t%d latas de 18 litros e %d galões de 3,6 litros por R$%.2f%n", (int)qtdLatasFinal, (int)qtdGaloesFinal, precoLata+precoGalao);
        
        input.close();
    }

}
