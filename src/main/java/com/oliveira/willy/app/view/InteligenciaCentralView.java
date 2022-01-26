package com.oliveira.willy.app.view;

import com.oliveira.willy.app.controller.InteligenciaCentral;
import com.oliveira.willy.app.domain.Rebelde;
import lombok.AllArgsConstructor;

import java.util.Scanner;

@AllArgsConstructor
public class InteligenciaCentralView {
    private InteligenciaCentral inteligenciaCentral;
    private RebeldeView rebeldeView;

    public void exibirMenu() {
        System.out.println("#######---MENU---#####");
        System.out.println("[UTILIZE O NÚMERO CORRESPONDENTE A OPÇÃO]");
        System.out.println("[1] - CADASTRAR DADOS.");
        System.out.println("[0] - SAIR.");

        Scanner scanner = new Scanner(System.in);
        String opcao = scanner.next();

        switch (opcao) {
            case "1":
                Rebelde rebelde = this.rebeldeView.cadastrarRebelde();
                boolean solicitarAcesso = this.inteligenciaCentral.solicitarAcesso();
                if (solicitarAcesso) {
                    System.out.println("Acesso PERMITIDO. Bem-vindo novo Rebelde!");
                    this.inteligenciaCentral.cadastrarRebelde(rebelde);
                    this.inteligenciaCentral.imprimirListaDeRebeldes();
                } else {
                    System.out.println("Acesso NEGADO, você não é de confiança!");
                }
                exibirMenu();
                break;
            case "0":
                System.exit(0);
                scanner.close();
                break;
            default:
                System.out.println("Opção inválida, por favor escolha uma opção válida do menu.");
                exibirMenu();
        }
    }
}
