package br.com.db1.start.classe;

public class Emitente {

	private String nome;
	private String doc; // 93891459025
	private Byte[] assinatura;

	public String getDocumentoFormatado() {

		String documentoFormatado = doc.toString();

		documentoFormatado = documentoFormatado.substring(0, 3) + "." + documentoFormatado.substring(3, 6) + "."
				+ documentoFormatado.substring(6,9) + "-" + documentoFormatado.substring(9,11);

		return documentoFormatado; // 938.914.590-25
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDoc() {
		return doc;
	}

	public void setDoc(String doc) {
		this.doc = doc;
	}

	public Byte[] getAssinatura() {
		return assinatura;
	}

	public void setAssinatura(Byte[] assinatura) {
		this.assinatura = assinatura;
	}

}
