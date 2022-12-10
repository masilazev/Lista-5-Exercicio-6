public class Exercicio6 {
public static void main(String[] args){
    int horas, minutos;

    horas = 00;
    minutos = 15;

        if ((horas >= 12) && (horas < 24)){
            horas = horas - 12;
            System.out.print(horas + ":" + minutos + " P.M. ");
        }
        else{
            System.out.print(horas + ":" + minutos + " A.M. ");
        }
    }
}