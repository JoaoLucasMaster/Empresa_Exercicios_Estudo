package model;

public class Gerencia extends Membro{
	private String gestao;
	
	public Gerencia(String pSetor,String pNome,String pGestao)
	{
		super(pSetor,pNome);
		this.gestao = pGestao;
	}
	
	public void setGestao(String tGestao)
	{
		this.gestao = tGestao;
	}
	
	public String getGestao()
	{
		return this.gestao;
	}
	
	@Override
	public String dadosFormatados() 
	{
		String dadosMembro = super.dadosFormatados();
		String dadosGerencia = String.format("Tipo de gestão:%s",this.gestao);
		return dadosMembro+dadosGerencia;
	}
}
