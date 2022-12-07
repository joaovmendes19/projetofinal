import java.sql.SQLException;
import java.util.Scanner;

import models.*;

public class App {

    public static void main(String[] args) throws Exception {

        System.out.println("Sistema de Gerenciamento do Aeroporto Jatinho Feliz");
        System.out.println("--------------------------------------------------");
        System.out.println(" 1 - Cadastrar Companhia Aérea!");
        System.out.println(" 2 - Cadastrar Aeronave!");
        System.out.println(" 3 - Cadastrar Hangar!");
        System.out.println(" 4 - Cadastrar Pista!");
        System.out.println(" 5 - Cadastrar Voo!");
        System.out.println(" 6 - Listar Companhias Aéreas!");
        System.out.println(" 7 - Listar Aeronaves!");
        System.out.println(" 8 - Listar Hangares!");
        System.out.println(" 9 - Listar Pistas!");
        System.out.println("10 - Listar Voos!");
        System.out.println("11 - Alterar Companhia Aérea!");
        System.out.println("12 - Alterar Aeronave!");
        System.out.println("13 - Alterar Hangar!");
        System.out.println("14 - Alterar Pista!");
        System.out.println("15 - Alterar Voo!");
        System.out.println("16 - Excluir Companhia Aérea!");
        System.out.println("17 - Excluir Aeronave!");
        System.out.println("18 - Excluir Hangar!");
        System.out.println("19 - Excluir Pista!");
        System.out.println("20 - Excluir Voo!");
        System.out.println("21 - Realizar nova operação!");
        System.out.println("22 - Sair!");
        System.out.println("--------------------------------------------------");
        System.out.println("Digite a opção desejada: ");
        int op = scanner.nextInt();
        switch (op) {
            case 1:
                cadastroCompanhia();
                break;
            case 2:
                cadastroAeronave();
                break;
            case 3:
                cadastroHangar();
                break;
            case 4:
                cadastroPista();
                break;
            case 5:
                cadastroVoo();
                break;
            case 6:
                listarCompanhias();
                break;
            case 7:
                listarAeronaves();
                break;
            case 8:
                listarHangares();
                break;

            case 9:
                listarPistas();
                break;
            case 10:
                listarVoos();
                break;
            case 11:
                alterarCompanhia();
                break;

            case 12:
                alterarAeronave();
                break;
            case 13:
                alterarHangar();
                break;
            case 14:
                alterarPista();
                break;
            case 15:
                alterarVoo();
                break;
            case 16:
                excluirCompanhia();
                break;
            case 17:
                excluirAeronave();
                break;
            case 18:
                excluirHangar();
                break;
            case 19:
                excluirPista();
                break;
            case 20:
                excluirVoo();
                break;
            case 21:
                main(args);
                break;
            case 22:
                System.exit(0);
                break;

            default:
                break;
        }

    }

    public static void cadastroCompanhia() throws Exception {
        System.out.println("Digite o nome da companhia: ");
        String nome = scanner.next();
        System.out.println("Digite o CNPJ da companhia: ");
        String cnpj = scanner.next();
        Companhia companhia = new Companhia(nome, cnpj);
        companhia.insert();
        System.out.println("Companhia cadastrada com sucesso!");
    }

    public static void cadastroAeronave() throws Exception {

        System.out.println("Digite qual tipo de aeronave deseja cadastrar: ");
        System.out.println("1 - Avião");
        System.out.println("2 - Helicóptero");
        System.out.println("3 - Jato");

        int tipo = scanner.nextInt();
        switch (tipo) {
            case 1:
                System.out.println("Digite o modelo do avião: ");
                String modelo = scanner.next();
                System.out.println("Digite a marca do avião: ");
                String marca = scanner.next();
               
                System.out.println("Digite as primeiras letras do prefixo do avião:");
                String prefixoS = scanner.next();
                if(prefixoS.length() != 3) {
                    System.out.println("Prefixo inválido!");
                    break;
                }
                System.out.println("Digite o número do prefixo do avião: ");
                int prefixoN = scanner.nextInt();
                if(prefixoN < 0 || prefixoN > 999) {
                    System.out.println("Prefixo inválido!");
                    break;
                }
                System.out.println("Digite a capacidade do avião: ");
                int capacidade = scanner.nextInt();
                System.out.println("Digite o id da companhia: ");
                int idCompanhia = scanner.nextInt();

                Aviao aviao = new Aviao(modelo, marca, prefixoS, prefixoN, capacidade, idCompanhia);

                aviao.insert();
                System.out.println("Avião cadastrado com sucesso!");
                break;
            case 2:
                System.out.println("Digite o marca do helicóptero: ");
                String marcaH = scanner.next();
                System.out.println("Digite a moodelo do helicóptero: ");
                String modeloH = scanner.next();
                System.out.println("Digite a cor do helicoptero: ");
                String cor = scanner.next();
                System.out.println("Digite a capacidade do helicoptero: ");
                int capacidadeH = scanner.nextInt();
                Helicoptero helicoptero = new Helicoptero(marcaH,modeloH,cor,capacidadeH);
                helicoptero.insert();
                System.out.println("Helicóptero cadastrado com sucesso!");
                break;
            case 3:
                System.out.println("Digitea marca do jato: ");
                String marcaJ = scanner.next();
                System.out.println("Digiteo modelo do jato: ");
                String modeloJ = scanner.next();
                System.out.println("Digite a cor do Jato: ");
                String corJ = scanner.next();
                System.out.println("Digite a velocidade do Jato: ");
                int velocidadeJ = scanner.nextInt();
                Jato jato = new Jato(marcaJ,modeloJ,corJ,velocidadeJ);
                jato.insert();
                System.out.println("Jato cadastrado com sucesso!");
                break;
            default:
                break;
        }
    }

    public static void cadastroHangar() throws Exception {
        System.out.println("Digite o nome do hangar: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o id do Avião a ser cadastrado: ");
        int idAviao = scanner.nextInt();
        Hangar hangar = new Hangar(nome, idAviao);
        hangar.insert();
        System.out.println("Hangar cadastrado com sucesso!");
    }

    public static void cadastroPista() throws Exception {
        System.out.println("Digite o nome da pista: ");
        String numeroS = scanner.next();
        System.out.println("Digite a capacidade da pista: ");
        int numeroI = scanner.nextInt();
        Pista pista = new Pista(numeroS,numeroI);
        pista.insert();
        System.out.println("Pista cadastrada com sucesso!");
    }

    public static void cadastroVoo() throws Exception {
        System.out.println("Digite as letras do código do voo: ");
        String codigoS = scanner.next();
        while(codigoS.length() != 3) {
            System.out.println("Código inválido!");
            System.out.println("Digite as letras do código do voo: ");
            codigoS = scanner.next();
        }
        
        System.out.println("Digite o número do código do voo: ");
        int codigoI = scanner.nextInt();
        while(codigoI < 0 || codigoI > 999999) {
            System.out.println("Código inválido!");
            System.out.println("Digite o número do código do voo: ");
            codigoI = scanner.nextInt();
        }
        System.out.println("Digite a data do voo: ");
        String data = scanner.next();
        System.out.println("Digite a hora de saida do voo: ");
        String horaSaida = scanner.next();
        System.out.println("Digite a cidade de origem do voo: ");
        String cidadeOrigem = scanner.next();
        System.out.println("Digite a cidade de destino do voo: ");
        String cidadeDestino = scanner.next();
        System.out.println("Digite o nome do piloto: ");
        String nomePiloto = scanner.next();
        System.out.println("Digite o nome do copiloto: ");
        String nomeCopiloto = scanner.next();
        System.out.println("Digite as observações desse voo: ");
        String observacoes = scanner.next();
        System.out.println("Digite o id da pista: ");
        int codigoPista = scanner.nextInt();
        System.out.println("Digite o id do aviao(caso não seja digite 0): ");
        int codigoAeronave = scanner.nextInt();
        System.out.println("Digite o id do jato (caso não seja digite 0): ");
        int codigoJato = scanner.nextInt();
        System.out.println("Digite o id do helicoptero (caso não seja digite 0): ");
        int codigoHelicoptero = scanner.nextInt();

        Voo voo = new Voo(codigoS, codigoI, data, horaSaida, cidadeOrigem, cidadeDestino, nomePiloto, nomeCopiloto, observacoes, codigoPista, codigoAeronave, codigoJato, codigoHelicoptero);
        voo.insert();
        System.out.println("Voo cadastrado com sucesso!");
    }

    public static void listarCompanhias() throws Exception {
        Companhia companhia = new Companhia();
        companhia.list();
    }

    public static void listarAeronaves() throws Exception {
        Aeronave aeronave = new Aeronave();
        aeronave.list();
    }

    public static void listarHangares() throws Exception {
        Hangar hangar = new Hangar();
        hangar.list();
    }

    public static void listarPistas() throws Exception {
        Pista pista = new Pista();
        pista.list();
    }

    public static void listarVoos() throws Exception {
        Voo voo = new Voo();
        voo.list();
    }

    public static void alterarCompanhia() throws Exception {
        System.out.println("Digite o código da companhia: ");
        int codigo = scanner.nextInt();
        System.out.println("Digite o novo nome da companhia: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o novo CNPJ da companhia: ");
        String cnpj = scanner.nextLine();
        Companhia companhia = new Companhia(codigo, nome, cnpj);
        companhia.update();
        System.out.println("Companhia alterada com sucesso!");
    }

    public static void alterarAeronave() throws Exception {
        System.out.println("Digite o código da aeronave: ");
        int codigo = scanner.nextInt();
        System.out.println("Digite o novo modelo da aeronave: ");
        String modelo = scanner.nextLine();
        System.out.println("Digite a nova capacidade da aeronave: ");
        int capacidade = scanner.nextInt();
        System.out.println("Digite o novo código da companhia: ");
        int codigoCompanhia = scanner.nextInt();
        Aeronave aeronave = new Aeronave(codigo, modelo, capacidade, codigoCompanhia);
        aeronave.update();
        System.out.println("Aeronave alterada com sucesso!");
    }

    public static void alterarHangar() throws Exception {
        System.out.println("Digite o código do hangar: ");
        int codigo = scanner.nextInt();
        System.out.println("Digite o novo nome do hangar: ");
        String nome = scanner.nextLine();
        System.out.println("Digite a nova capacidade do hangar: ");
        int capacidade = scanner.nextInt();
        Hangar hangar = new Hangar(codigo, nome, capacidade);
        hangar.update();
        System.out.println("Hangar alterado com sucesso!");
    }

    public static void alterarPista() throws Exception {
        System.out.println("Digite o código da pista: ");
        int codigo = scanner.nextInt();
        System.out.println("Digite o novo nome da pista: ");
        String nome = scanner.nextLine();
        System.out.println("Digite a nova capacidade da pista: ");
        int capacidade = scanner.nextInt();
        Pista pista = new Pista(codigo, nome, capacidade);
        pista.update();
        System.out.println("Pista alterada com sucesso!");
    }

    public static void alterarVoo() throws Exception {
        System.out.println("Digite o código do voo: ");
        int codigo = scanner.nextInt();
        System.out.println("Digite o novo código da aeronave: ");
        int codigoAeronave = scanner.nextInt();
        System.out.println("Digite o novo código do hangar: ");
        int codigoHangar = scanner.nextInt();
        System.out.println("Digite o novo código da pista: ");
        int codigoPista = scanner.nextInt();
        Voo.update(codigo);
        System.out.println("Voo alterado com sucesso!");
    }

    public static void excluirCompanhia() throws Exception {
        System.out.println("Digite o código da companhia: ");
        int codigo = scanner.nextInt();
        Companhia.delete(codigo);
        System.out.println("Companhia excluída com sucesso!");
    }

    public static void excluirAeronave() throws Exception {
        System.out.println("Digite o código da aeronave: ");
        int codigo = scanner.nextInt();
        Aeronave.delete(codigo);
        System.out.println("Aeronave excluída com sucesso!");
    }

    public static void excluirHangar() throws Exception {
        System.out.println("Digite o código do hangar: ");
        int codigo = scanner.nextInt();
        Hangar.delete(codigo);
        System.out.println("Hangar excluído com sucesso!");
    }

    public static void excluirPista() throws Exception {
        System.out.println("Digite o código da pista: ");
        int codigo = scanner.nextInt();
        Pista.delete(codigo);
        System.out.println("Pista excluída com sucesso!");
    }

    public static void excluirVoo() throws Exception {
        System.out.println("Digite o código do voo: ");
        int codigo = scanner.nextInt();
        Voo.delete(codigo);
        System.out.println("Voo excluído com sucesso!");
    }

    public static Scanner scanner = new Scanner(System.in);
     
    
    }

