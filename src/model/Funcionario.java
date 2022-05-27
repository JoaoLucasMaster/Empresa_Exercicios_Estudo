package model;

public class Funcionario extends Membro{
	private String filial;
	private String tempoExperiencia;
	public Funcionario(String pSetor, String pNome, String pFilial)
	{
		super(pSetor,pNome);
		this.filial = pFilial;
	}

	public void setFilial(String tFilial)
	{
		this.filial = tFilial;
	}

	public String getFilial()
	{
		return this.filial;
	}

	public void setTempoExperiencia(String tTempoExperiencia)
	{
		this.tempoExperiencia = tTempoExperiencia;
	}

	public String getTempoExperiencia()
	{
		return this.tempoExperiencia;
	}

	@Override
	public String dadosFormatados() 
	{
		String dadosMembro = super.dadosFormatados();
		String dadosFuncionario = String.format("Filial:%s\nTempo de Experiencia:%s",this.filial,this.tempoExperiencia);
		return dadosMembro+dadosFuncionario;
	}
}
