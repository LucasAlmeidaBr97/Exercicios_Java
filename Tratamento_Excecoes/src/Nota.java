public class Nota {
    
    public static void main(String[] args) {
        try {
            validarNota(10);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validarNota(double nota) {
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("Não pode ser maior que 10 ou menor que 0");
        }
    }
}
