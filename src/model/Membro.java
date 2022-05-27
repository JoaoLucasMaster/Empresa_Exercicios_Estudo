package model;

public class Membro {
	private String Setores;
	private String nome;
	private double salario;

	public Membro(String pSetor, String pNome)
	{
		this.Setores = pSetor;
		this.nome = pNome;
	}

	public void setSetor(String tSetor)
	{
		this.Setores = tSetor;
	}

	public String getSetor()
	{
		return this.Setores;
	}

	public void setNome(String tNome)
	{
		this.nome = tNome;
	}

	public String getNome()
	{
		return this.nome;
	}

	public void setSalario(double tSalario)
	{
		this.salario = tSalario;
	}

	public double getSalario()
	{
		return this.salario;
	}

	public String dadosFormatados() 
	{
		String dados = String.format("Nome:%s\nSetor:%s\nSalario:R$%.2f\n",this.nome,this.Setores,this.salario);
		return dados;
	}
}
