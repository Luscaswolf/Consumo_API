package cep.dominio;

public class dominio {
	
	private String logradouro;
	private String bairro;
	private String localidade;
	
	
	public dominio(String logradouro, String bairro, String localidade) {
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.localidade = localidade;
	}


	public String getLogradouro() {
		return logradouro;
	}


	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getLocalidade() {
		return localidade;
	}


	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}
	
	public String toSting() {
		return "Endereco{" + "logradouro=" + logradouro + ", bairro=" + bairro + ", localidade=" + localidade + '}';
    }

		
	}
	
	


