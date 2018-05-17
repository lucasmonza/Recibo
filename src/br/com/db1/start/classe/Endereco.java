package br.com.db1.start.classe;

import br.com.db1.start.tipo.TipoLogradouro;

public class Endereco {

	private TipoLogradouro TipoLogradouro;
	private String logradouro;
	private String numero;
	private String bairro;
	private Integer cep; // 80540150
	private Cidade cidade;

	public String getCepFormatado() {
		String cepFormatado = cep.toString();
		
		cepFormatado = cepFormatado.substring(0,5) + "-" + cepFormatado.substring(5,8);
			
		return cepFormatado;
	    //80540-150
	}

	public TipoLogradouro getTipoLogradouro() {
		return TipoLogradouro;
	}

	public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
		TipoLogradouro = tipoLogradouro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

}
