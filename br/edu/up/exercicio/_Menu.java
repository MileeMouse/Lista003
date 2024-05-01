package br.edu.up.exercicio;

import java.util.Scanner;

public class _Menu {

    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        int op;

        do {
            System.out.println("\nDigite o número da Main que deseja:");
            System.out.println("1. Main1\n" +
                    "2. Main2\n" +
                    "3. Main3\n" +
                    "4. Main4\n" +
                    "5. Main5\n" +
                    "6. Main6\n" +
                    "7. Main7\n" +
                    "8. Main8\n" +
                    "9. Main9\n" +
                    "10. Main10\n" +
                    "11. Main11\n" +
                    "12. Main12\n" +
                    "13. Main13\n" +
                    "14. Main14\n" +
                    "15. Main15\n" +
                    "16. Main16\n" +
                    "17. Main17\n" +
                    "18. Main18\n" +
                    "19. Main19\n" +
                    "20. Main20\n" +
                    "21. Main21\n" +
                    "22. Main22\n" +
                    "23. Main23\n" +
                    "24. Main24\n" +
                    "25. Main25\n" +
                    "26. Main26\n" +
                    "0. Sair\n");

            if (leitor.hasNextInt()) {
                op = leitor.nextInt();
                leitor.nextLine(); 

                switch (op) {
                    case 1:
                        Main1.main(new String[0]);
                        break;
                    case 2:
                        Main2.main(new String[0]);
                        break;
                    case 3:
                        Main3.main(new String[0]);
                        break;
                    case 4:
                        Main4.main(new String[0]);
                        break;
                    case 5:
                        Main5.main(new String[0]);
                        break;
                    case 6:
                        Main6.main(new String[0]);
                        break;
                    case 7:
                        Main7.main(new String[0]);
                        break;
                    case 8:
                        Main8.main(new String[0]);
                        break;
                    case 9:
                        Main9.main(new String[0]);
                        break;
                    case 10:
                        Main10.main(new String[0]);
                        break;
                    case 11:
                        Main11.main(new String[0]);
                        break;
                    case 12:
                        Main12.main(new String[0]);
                        break;
                    case 13:
                        Main13.main(new String[0]);
                        break;
                    case 14:
                        Main14.main(new String[0]);
                        break;
                    case 15:
                        Main15.main(new String[0]);
                        break;
                    case 16:
                        Main16.main(new String[0]);
                        break;
                    case 17:
                        Main17.main(new String[0]);
                        break;
                    case 18:
                        Main18.main(new String[0]);
                        break;
                    case 19:
                        Main19.main(new String[0]);
                        break;
                    case 20:
                        Main20.main(new String[0]);
                        break;
                    case 21:
                        Main21.main(new String[0]);
                        break;
                    case 22:
                        Main22.main(new String[0]);
                        break;
                    case 23:
                        Main23.main(new String[0]);
                        break;
                    case 24:
                        Main24.main(new String[0]);
                        break;
                    case 25:
                        Main25.main(new String[0]);
                        break;
                    case 26:
                        Main26.main(new String[0]);
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida");
                        break;
                }
            } else {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
                leitor.nextLine(); 
                op = -1; 
            }
            
            System.out.println("\nPressione Enter para continuar...");
            leitor.nextLine();

        } while (op != 0);

        leitor.close();
    }
}