public class Inversor {
    static int inverterNumero(int numero) {
        int invertido = 0;

        while (numero > 0) {
            int resto = numero % 10;           // Pega o último dígito
            invertido = (invertido * 10) + resto; // Adiciona o dígito ao novo número
            numero = numero / 10;              // Remove o último dígito do original
        }

        return invertido;
    }


}