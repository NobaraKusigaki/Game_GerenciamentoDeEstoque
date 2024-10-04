import java.util.Scanner;

public class GerenciamentoEstoque {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            String [] prod = new String[50];
            int [] qntd = new int[50];
            int numProd = 0;
            boolean find = false;
            
            while (true) {
                System.out.println("1. Adiciona produto");
                System.out.println("2. Remove produto");
                System.out.println("3. Atualiza a quantidade");
                System.out.println("4. Exibi os produtos");
                System.out.println("5. Busque um produto pelo nome");
                System.out.println("6. Sair");
                System.out.println("Porfavor escolha uma opção");
                int choice = input.nextInt();
                input.nextLine();

                switch (choice) {
                    case 1:
                        if (numProd <= 50) {
                            System.out.println("======= Digite o nome do produto que você deseja adicionar =======");
                            String n1 = input.nextLine();
                            System.out.println("======= Quantos dele você pretende adicionar =======");
                            int volume = input.nextInt();
                            input.nextLine();

                            prod[numProd] = n1;
                            qntd[numProd] = volume;
                            numProd++;
                            System.out.println("Realização feita com sucesso!");
                        } else {
                            System.out.println("Estoque cheio, esvazie ele para adicionar este produto");
                        }
                        break;

                    case 2:
                        System.out.println("======= Digite o nome do produto que será removido =======");
                        String n2 = input.nextLine();
                        for (int i = 0; i < numProd; i++) {
                            for (int j = i; j < numProd - 1; j++) {
                                prod[j] = prod[j + 1];
                                qntd[j] = qntd[j + 1];
                            }

                            prod[numProd - 1] = null;
                            qntd[numProd - 1] = 0;
                            numProd--;
                            find = true;
                            System.out.println("======= Remoção feita com sucesso! =======");
                            break;
                        }
                        if (!find) {
                            System.out.println(" ======= Produto não encontrado =======");
                        }
                        break;

                    case 3:
                        System.out.println("======= Digite o nome do produto: ======= ");
                        String n3 = input.nextLine();
                        for (int i = 0; i < numProd; i++) {
                            System.out.println("======= Digite quantos produtos serão adicionados: =======");
                            int newProd = input.nextInt();
                            input.nextLine();

                            qntd[i] = newProd;
                            find = true;
                            System.out.println("======= Quantidade atualizada com sucesso =======");
                        }
                        if (!find) {
                            System.out.println("======= Produto não encontrado =======");
                        }
                        break;
                    case 4:
                        if (numProd == 0) {
                            System.out.println("======= Não há produtos no estoque =======");
                        } else {
                            for (int i = 0; i < numProd; i++) {
                                System.out.println("======= Estes são os prosutos disponíveis: =======");
                                System.out.println("Produto: " + prod[i] + " Quantidade: " + qntd[i]);
                            }
                        }
                        break;
                    case 5:
                        System.out.println("======= Procure pelo nome do produto: =======");
                        String n5 = input.nextLine();
                        for (int i = 0; i < numProd; i++) {
                            System.out.println("Produto: " + prod[i] + " Quantidade: " + qntd[i]);
                        }
                        if (!find) {
                            System.out.println("======= Produto não encontrado =======");
                        }
                        break;
                    case 6:
                        System.out.println("======= Saindo... =======");
                        break;

                    default:
                        System.out.println("Opção inválida");


                }
            }

            }



    }

