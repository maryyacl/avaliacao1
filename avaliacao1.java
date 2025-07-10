import java.util.Scanner;

public class avaliacao1 {


    public class avaliacao1jadson {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite a 1ª nota:");
            double nota1 = scanner.nextDouble();
            System.out.println("Digite a 2ª nota:");
            double nota2 = scanner.nextDouble();
            System.out.println("Digite a 3ª nota:");
            double nota3 = scanner.nextDouble();
            System.out.println("Digite a 4ª nota:");
            double nota4 = scanner.nextDouble();
            System.out.println("Digite a 5ª nota:");
            double nota5 = scanner.nextDouble();
            System.out.println("Digite a 6ª nota:");
            double nota6 = scanner.nextDouble();
            System.out.println("Digite a 7ª nota:");
            double nota7 = scanner.nextDouble();
            System.out.println("Digite a 8ª nota:");
            double nota8 = scanner.nextDouble();
            double bimestre1 = (nota1 + nota2) / 2;
            double bimestre2 = (nota3 + nota4) / 2;
            double bimestre3 = (nota5 + nota6) / 2;
            double bimestre4 = (nota7 + nota8) / 2;
            double semestre1 = bimestre1 + bimestre2;
            double semestre2 = bimestre3 + bimestre4;
            double mediaFinal = (semestre1 + semestre2) / 2;
            System.out.println("1º bimestre: " + bimestre1);
            System.out.println("2º bimestre: " + bimestre2);
            System.out.println("1º semestre: " + semestre1);
            System.out.println("3º bimestre: " + bimestre3);
            System.out.println("4º bimestre: " + bimestre4);
            System.out.println("2º semestre: " + semestre2);
            System.out.println("Média final: " + mediaFinal);
        }
    }
}
