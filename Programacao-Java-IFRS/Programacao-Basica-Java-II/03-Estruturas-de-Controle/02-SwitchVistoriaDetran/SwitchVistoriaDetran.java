/*
    2. O Detran deseja realizar uma vistoria geral nos veículos do estado. Para
    isso, elaborou a seguinte distribuição, a partir do último dígito do número na
    placa do automóvel:
     Placas que terminam com 0 devem realizar a vistoria em Janeiro
    do próximo ano
     Placas que terminam com 1 devem realizar a vistoria em
    Fevereiro do próximo ano
     Placas que terminam com 2 devem realizar a vistoria em Março
    do próximo ano
     Placas que terminam com 3 devem realizar a vistoria em Abril do
    próximo ano
     Placas que terminam com 4 devem realizar a vistoria em Maio do
    próximo ano
     Placas que terminam com 5 devem realizar a vistoria em Junho
    do próximo ano
     Placas que terminam com 6 devem realizar a vistoria em
    Setembro deste ano
     Placas que terminam com 7 devem realizar a vistoria em Outubro
    deste ano
     Placas que terminam com 8 devem realizar a vistoria em
    Novembro deste ano
     Placas que terminam com 9 devem realizar a vistoria em
    Dezembro deste ano
*/

public class SwitchVistoriaDetran {
    
    public static void main(String[] args) {
        int placa, placaFim;

        System.out.println("\nPROGRAMA VISTORIA");

        System.out.print("\nDigite a placa(4 digitos): ");
        placa = Integer.parseInt(System.console().readLine());

        placaFim = placa % 10;

        switch (placaFim) {
            case 0:
                System.out.print("\nVistoria em Janeiro do próximo ano\n");
                break;
            case 1:
                System.out.print("\nVistoria em Fevereiro do próximo ano\n");
                break;
            case 2:
                System.out.print("\nVistoria em Março do próximo ano\n");
                break;
            case 3:
                System.out.print("\nVistoria em Abril do próximo ano\n");
                break;
            case 4:
                System.out.print("\nVistoria em Maio do próximo ano\n");
                break;
            case 5:
                System.out.print("\nVistoria em Junho do próximo ano\n");
                break;
            case 6:
                System.out.print("\nVistoria em Setembro deste ano\n");
                break;
            case 7:
                System.out.print("\nVistoria em Outubro deste ano\n");
                break;
            case 8:
                System.out.print("\nVistoria em Novembro deste ano\n");
                break;
            case 9:
                System.out.print("\nVistoria em Dezembro deste ano\n");
                break;
            default:
                break;
        }
    }
}