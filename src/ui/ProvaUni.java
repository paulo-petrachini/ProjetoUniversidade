package ui;

import core.QuestaoComDica;
import core.QuestaoMultiplaEscolha;
import core.QuestaoSimples;
import java.util.Scanner;

public class ProvaUni {
	public static void main(String args[]) {
		QuestaoSimples questao[];

		Scanner teclado = new Scanner(System.in);
		String resposta;

		questao = new QuestaoSimples[3];
		questao[0] = new QuestaoSimples("Quanto � 1 + 1 ?", "2");
		questao[1] = new QuestaoComDica("Qual a capital do Brasil?", "Bras�lia", "Come�a com B");
		questao[2] = new QuestaoMultiplaEscolha("Qual o m�s do Natal?", "12", "01", "06", "09", "12");

		for (QuestaoSimples q : questao) {
			System.out.println(q.aplicarQuestao());
			resposta = teclado.nextLine();
			if (q.corrigir(resposta)) {
				System.out.println("Acertou");
			} else {
				System.out.println("Errou");
			}
		}
		teclado.close();
	}
}
