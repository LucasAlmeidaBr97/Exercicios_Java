

public class AbrirBanco {
    public static void main(String[] args) {
        try {
            abrirConexão();
        } catch (Exception e) {
            System.out.println("Erro ao conectar");
        } finally {
            System.out.println("Conexão fechada com sucesso!");
        }    
    }

    public static void abrirConexão(){
        System.out.println("Abrindo...");
        throw new RuntimeException("Erro forçado");   
    }
}
