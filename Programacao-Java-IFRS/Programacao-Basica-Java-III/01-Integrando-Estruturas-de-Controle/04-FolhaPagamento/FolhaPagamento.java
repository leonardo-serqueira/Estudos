public class FolhaPagamento {

    public static void main(String[] args) {
        double salarioBruto = 0;
        double descontoIR = 0;
        double descontoINSS = 0;
        double descontoSaude = 0;
        double salarioLiquido = 0;
        double totalFolha = 0;
        double totalIR = 0;

        System.out.println("\n====|PROGRAMA FOLHA DE PAGAMENTO|====");

        for (int cont = 1; cont <= 58; cont++) {
            System.out.printf("\n%dº Funcionario", cont);
            System.out.print("\nDigite o salario bruto: ");
            salarioBruto = Double.parseDouble(System.console().readLine());

            if (salarioBruto <= 1693.72) {
                descontoINSS = salarioBruto * 0.08;
            } else if (salarioBruto <= 2822.90) {
                descontoINSS = salarioBruto * 0.09;
            } else {
                descontoINSS = salarioBruto * 0.11;
            }
            
            if (salarioBruto <= 1903.98) {
                descontoIR = 0;
            } else if (salarioBruto <= 2826.65) {
                descontoIR = salarioBruto * 0.075;
            } else if (salarioBruto <= 3751.05) {
                descontoIR = salarioBruto * 0.15;
            } else if (salarioBruto <= 4664.68) {
                descontoIR = salarioBruto * 0.225;
            } else {
                descontoIR = salarioBruto * 0.275;
            }

            descontoSaude = salarioBruto * 0.045;

            salarioLiquido = salarioBruto - descontoINSS - descontoIR - descontoSaude;

            totalFolha += salarioBruto;
            totalIR += descontoIR;

            System.out.printf("Salario Liquido: %.2f\n", salarioLiquido);
        }

        System.out.println("\n====|RESULTADO TOTAL DA EMPRESA|====\n");
        System.out.printf("Valor total da folha de pagamento      : %.2f\n", totalFolha);
        System.out.printf("Valor total de imposto de renda retido : %.2f\n", totalIR);
    }
}