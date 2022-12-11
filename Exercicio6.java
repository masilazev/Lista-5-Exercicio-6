import java.util.Scanner;

public class Exercicio6 {
public static void main(String[] args){
    int horas, minutos;

    horas = 00;
    minutos = 15;
    String opcao;
    Scanner input = new Scanner(System.in);

    do{
        if (horas > 12){
            horas = horas - 12;
            imprimeHorario(horas, minutos, 'P');
        }else if (horas == 12){
            imprimeHorario(horas, minutos, 'P');  
        }else if (horas == 24){
            imprimeHorario(horas, minutos, 'A'); 
        }
        else{
            imprimeHorario(horas, minutos, 'A');
            }
            System.out.println("Deseja converte mais um numero?");
            opcao = input.nextLine();
        } while(opcao != "n");
    }
    static void imprimeHorario(int h, int m, char t){
        System.out.print(h + ":" + m + " " + t + ".M.");
    }
}
