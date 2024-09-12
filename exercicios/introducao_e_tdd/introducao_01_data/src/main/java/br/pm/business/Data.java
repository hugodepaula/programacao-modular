package br.pm.business;
import java.time.LocalDate;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	private static final int[] NUM_DIAS_MES = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final String[] DIAS_DA_SEMANA = { "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira",
			"Sexta-feira", "Sábado", "Domingo" };
	private static final int[] NUM_MES_SEMANA = { 0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5 };
	private static final String[] NOME_MESES = { "janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho",
			"agosto", "setembro", "outubro", "novembro", "dezembro" };

	public Data() {
		dia = LocalDate.now().getDayOfMonth();
		mes = LocalDate.now().getMonthValue();
		ano = LocalDate.now().getYear();
	}

	public Data(int dia, int mes, int ano) {
		this.setAno(ano);
		this.setMes(mes);
		this.setDia(dia);
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		if ((dia > 0) && (dia <= NUM_DIAS_MES[mes - 1] || (this.anoBisexto() && dia == 29)))
			this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		if ((mes > 0) && (mes <= 12))
			this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if (ano > 1900)
			this.ano = ano;
	}

	public boolean anoBisexto() {
		return (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0));
	}

	public int diasNoMes() {
		return NUM_DIAS_MES[mes - 1];
	}

	public String diaDaSemana() {
		int a = (this.ano - 1900);
		int b = a / 4;
		b = ((this.anoBisexto() && this.mes <= 2) ? b - 1 : b);
		int c = NUM_MES_SEMANA[this.mes - 1];
		int d = (a + b + c + this.dia - 1) % 7;
		return Data.DIAS_DA_SEMANA[d];
	}
	
	public String porExtenso() {
		return this.dia + " de " + Data.NOME_MESES[this.mes-1] + " de " + this.ano;
	}

	public void adicionaDias(int n) {
		this.dia += n;

		while (dia > ((anoBisexto() && mes == 2) ? 29 : NUM_DIAS_MES[mes - 1])) {
			dia -= ((anoBisexto() && mes == 2) ? 29 : NUM_DIAS_MES[mes - 1]);
			mes++;
			if (mes > 12) {
				mes -= 12;
				ano++;
			}
		}
	}

}
