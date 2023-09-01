package Cadastros;

import java.util.Iterator;
import java.util.List;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		/*
		 * 	INCLUIR PESSOAS ALTERAR O ID SEMPRE QUE FOR INCLUIR 6,7 EXEMPLO
			PessoaDao pd = new PessoaDao();
			
			try {
			
			//incluir pessoas
			Pessoa p1 = new Pessoa (6, "jose", "jose@gmail.com");
			Pessoa p2 = new Pessoa (7, "Vinicius", "vinicius@gmail.com");
			
			pd.incluirPessoa(p1);
			pd.incluirPessoa(p2);
			
			
			}catch(Exception e) {
				
				System.out.println("error ==> " + e.getMessage());
				
			}
			
		*/
		
		//////////////////////////////////////////////////
		/////// FIM INCLUIR PESSOAS /////////////////////////////
		
		
		/*
		 * ///////////////////////////////////////////////////
		 * LISTA INDIVIDUAL POR PESSOA E CODIGO
		
			PessoaDao pd = new PessoaDao();
		
			try {
			
			
			Pessoa pes1 = pd.consultarPessoaIndividual(1);
			System.out.println("Codigo..." + pes1.getIdPessoa());
			System.out.println("Nome..." + pes1.getNomePessoa());
			System.out.println("Email..." + pes1.getEmail());
			
			}catch(Exception e) {
				
				System.out.println("error ==> " + e.getMessage());
				
			}
			
	     */
		
		/////////////////////////////////////////////
		
		/* LISTAR PESSOAS COM  LIST FUNCIONANDO INDIVIDUAL */
		
		/*
		 * 
		 *  /////////////////////////////////////////////////
		 *  
		PessoaDao pd = new PessoaDao();
		
		try {
			
			List<Pessoa> listaPessoas = pd.ListarPessoas();
			
			for (Pessoa p : listaPessoas) {
				
				//System.out.println(p);
				
				System.out.println("Codigo..." + p.getIdPessoa());
				System.out.println("Nome..." + p.getNomePessoa());
				System.out.println("Email..." + p.getEmail());
				System.out.println("---------------------------");
				
			}
			
			
			}catch(Exception e) {
				
				System.out.println("error ==> " + e.getMessage());
				
			}
		
		/////////////////////////////////////////////
		////////////FIM LISTAR PESSOAS INDIVIDUAL ////////////////////
		*/
		
		////////////////////////////////////////////////////////////
	
		 /////////////////EXCLUIR PESSOAS /////////////////////////
		 
	/*		
           PessoaDao pd = new PessoaDao();
		
		   try {
			  
			   ///excluir pessoas COLOCAR O ID QUE DESEJA EXCLUIR
			   Pessoa pessoa1 = pd.consultarPessoaIndividual(4);
			   //chamar o metodo que contem o comando delete
			   pd.excluirPessoa(pessoa1);
			   
			   //lista pessoas apos a exclusao
			   List<Pessoa> listaPessoas = pd.ListarPessoas();
			   
			   for (Pessoa p : listaPessoas) {
					
					//System.out.println(p);
					
					System.out.println("Codigo..." + p.getIdPessoa());
					System.out.println("Nome..." + p.getNomePessoa());
					System.out.println("Email..." + p.getEmail());
					System.out.println("---------------------------");
			   
			   
				}
				
		   }catch(Exception e) {
					
					System.out.println("error ==> " + e.getMessage());
					
				}
			   
		  
	
	
			////////////FIM EXCLUIR PESSOAS //////////////////////////	   
			/////////////////////LISTAR ////////////////////////////
			 
	    */
		

		////////////////////////////////////////////////////////////
	
		 /////////////////ALTERAR PESSOAS /////////////////////////
		 	PessoaDao pd = new PessoaDao();
			
		 	try {
			 //altera com codigo id 7 e troca o email da pessoa, trocar pelo que deseja trocar e listar. 
			  Pessoa pes = pd.consultarPessoaIndividual(7);
			  if (pes != null) {
				  
				  pes.setEmail("vinny@gmail.com");
				  
			  }
			  
			  pd.alterarPessoa(pes);
			  
			  List<Pessoa> listaPessoas = pd.ListarPessoas();
			  
			  for(Pessoa p : listaPessoas) {
				  
					System.out.println("Codigo..." + p.getIdPessoa());
					System.out.println("Nome..." + p.getNomePessoa());
					System.out.println("Email..." + p.getEmail());
					System.out.println("---------------------------");
			   
			  }
			  
		
			  }catch(Exception e) {
					
					System.out.println("error ==> " + e.getMessage());
					
			  }
	   
		
		////////////////////////////////////////////////////////////
				
		/////////////////FIM ALTERAR PESSOAS /////////////////////////
				
		
	}
	
}
		

