package view;
import model.Membro;
import model.Funcionario;
import model.Gerencia;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Membro membroTeste = new Membro("TI","Pedro Alves");
		membroTeste.setSalario(1700);
        System.out.println(membroTeste.dadosFormatados());
        
        System.out.print("\n");//Pula linha de uma chamada para outra.
        
        Funcionario funcionarioTeste = new Funcionario("Marketing","Fabiola Mendes","São Paulo");
        funcionarioTeste.setTempoExperiencia("2 Anos.");
        funcionarioTeste.setSalario(5000);
        System.out.println(funcionarioTeste.dadosFormatados());
        
        System.out.print("\n");//Pula linha de uma chamada para outra.
        
       Gerencia gerenteTeste = new Gerencia("Contabilidade","Rodrigo Moura","Administrativa");
       gerenteTeste.setSalario(7000);
       System.out.println(gerenteTeste.dadosFormatados());
  	}

}
