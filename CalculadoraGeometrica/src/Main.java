import br.com.triangulo.Triangulo;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner valor = new Scanner(System.in);
        Triangulo triangulo = new Triangulo();

        System.out.println("**********************************************************");
        System.out.println("Seja bem vindo a calculadora geométrica de triangulos!");
        System.out.println("Preencha as medidas dos lados do seu triângulo: ");
        System.out.println("**********************************************************");

        System.out.println("\n Lado 1:");
        double lado1 = valor.nextDouble();
        triangulo.setLado1(lado1);
        System.out.println("\n Lado 2:");
        double lado2 = valor.nextDouble();
        triangulo.setLado2(lado2);
        System.out.println("\n Lado 3:");
        double lado3 = valor.nextDouble();
        triangulo.setLado3(lado3);

        System.out.println("\n**********************************************************");
        triangulo.valideTipoTriangulo();
        System.out.println("Área: " + triangulo.calculeArea());
        System.out.println("Perimetro: " + triangulo.calculePerimetro());
        System.out.println("\n**********************************************************");
    }
}
