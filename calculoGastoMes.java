/**
 * Atividade
 */
public class calculoGastoMes {

    public static void main(String[] args) {
        //imprime os valores de cada mês
        double janeiro = 15.000 ;
        System.out.println(janeiro);

        double fevereiro = 23.000 ;
        System.out.println(fevereiro);

        double marco = 17.000 ;
        System.out.println(marco);

        //calculo
        double despesaTotal;
        despesaTotal = janeiro + fevereiro + marco;

        //imprime o total
        System.out.printf("%.3f",despesaTotal);

    }
}