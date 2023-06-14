package com.trybe.acc.java.controledeacesso;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe principal.
 */
public class Principal {

  /**
   * Método principal.
   */
  public static void main(String[] args) {
    ArrayList<Integer> listaIdades = new ArrayList<Integer>();
    short opcaoEscolhida = 1;

    while (opcaoEscolhida != 2) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Entre com o número correspondente à opção desejada");
      System.out.println("1 - Acessar o estabelecimento");
      System.out.println("2 - Finalizar sistema e mostrar relatório");

      String opcaoEscolhidaString = scanner.next();
      opcaoEscolhida = Short.parseShort(opcaoEscolhidaString);

      if (opcaoEscolhida == 1) {
        System.out.println("1 - Entre com a idade:");
        String idadeString = scanner.next();
        int idade = Integer.parseInt(idadeString);
        listaIdades.add(idade);
        mensagemFaixaEtaria(idade);
      } else if (opcaoEscolhida == 2) {
        int[] totalPorIdade = visitantesPorIdade(listaIdades);
        float[] porcentagemIdade = porcentagemPorIdade(totalPorIdade);

        relatorioFormatado(totalPorIdade, porcentagemIdade);
      } else {
        System.out.println("Entre com uma opção válida!");
      }
    }


  }

  private static void mensagemFaixaEtaria(int idade) {
    if (idade < 18) {
      System.out.println("Pessoa cliente menor de idade, catraca liberada!");
    }
    if (idade >= 18 && idade <= 49) {
      System.out.println("Pessoa adulta, catraca liberada!");
    }
    if (idade >= 50) {
      System.out.println("Pessoa adulta a partir de 50, catraca liberada!");
    }
  }

  private static int[] visitantesPorIdade(ArrayList<Integer> lista) {
    int menorDeIdade = 0;
    int adulto = 0;
    int adultoMaior50 = 0;
    int[] totalPorIdade = new int[4];
    for (int i = 0; i < lista.size(); i++) {
      if (lista.get(i) < 18) {
        menorDeIdade += 1;
      }
      if (lista.get(i) >= 18 && lista.get(i) <= 49) {
        adulto += 1;
      }
      if (lista.get(i) >= 50) {
        adultoMaior50 += 1;
      }
    }
    totalPorIdade[0] = lista.size();
    totalPorIdade[1] = menorDeIdade;
    totalPorIdade[2] = adulto;
    totalPorIdade[3] = adultoMaior50;

    return totalPorIdade;

  }

  private static float[] porcentagemPorIdade(int[] listaTotalPorIdade) {
    int total = listaTotalPorIdade[0];
    int menorDeIdade = listaTotalPorIdade[1];
    int adulto = listaTotalPorIdade[2];
    int adultoMaior50 = listaTotalPorIdade[3];

    float porcentagemMenorDeIdade = (float) menorDeIdade / total * 100;
    float porcentagemAdulto = (float) adulto / total * 100;
    float porcentagemAdultoMaior50 = (float) adultoMaior50 / total * 100;

    DecimalFormat decimalFormat = new DecimalFormat("0.00");
    float[] porcentagens = new float[3];
    porcentagens[0] =
        Float.parseFloat(decimalFormat.format(porcentagemMenorDeIdade).replace(",", "."));
    porcentagens[1] = Float.parseFloat(decimalFormat.format(porcentagemAdulto).replace(",", "."));
    porcentagens[2] =
        Float.parseFloat(decimalFormat.format(porcentagemAdultoMaior50).replace(",", "."));

    return porcentagens;
  }



  private static void relatorioFormatado(int[] listaTotalPorIdade,
      float[] listaTotalPorPorcentagem) {
    int total = listaTotalPorIdade[0];
    int menorDeIdade = listaTotalPorIdade[1];
    int adulta = listaTotalPorIdade[2];
    int adultaMaior50 = listaTotalPorIdade[3];

    float porcentoMenorDeIdade = listaTotalPorPorcentagem[0];
    float porcentoAdulto = listaTotalPorPorcentagem[1];
    float porcentoAdultoMaior50 = listaTotalPorPorcentagem[1];

    System.out.println("----- Quantidade -----");
    System.out.println("menores: " + menorDeIdade);
    System.out.println("adultas: " + adulta);
    System.out.println("a partir de 50: " + adultaMaior50);
    System.out.println();
    System.out.println("----- Percentual -----");
    System.out.println("menores: " + porcentoMenorDeIdade + "%");
    System.out.println("adultas: " + porcentoAdulto + "%");
    System.out.println("a partir de 50: " + porcentoAdultoMaior50 + "%");
    System.out.println();
    System.out.println("TOTAL: " + total);
  }
}
