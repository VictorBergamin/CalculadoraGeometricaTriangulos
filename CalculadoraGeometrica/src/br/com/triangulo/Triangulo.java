package br.com.triangulo;

public class Triangulo {

    double lado1;
    double lado2;
    double lado3;

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public double calculePerimetro() {
        return lado1 + lado2 + lado3;
    }

    public double calculeArea() {
        double perimetro = calculePerimetro(); // Recalcula o perímetro
        double semiPerimetro = perimetro / 2;
        return Math.sqrt(semiPerimetro * (semiPerimetro - lado1) * (semiPerimetro - lado2) *
                (semiPerimetro - lado3));
    }

    public void valideTipoTriangulo() {
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            System.out.println("Não existe triângulo com medidas menores ou iguais a 0! " +
                    "Tente outros valores maiores que 0.");
            return;
        }

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("De acordo com as medidas relatadas, o triângulo é 'EQUILÁTERO'.");
        } else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
            System.out.println("De acordo com as medidas relatadas, o triângulo é 'ESCALENO'.");
        } else {
            System.out.println("De acordo com as medidas relatadas, o triângulo é 'ISÓSCELES'.");
        }
    }
}
