package br.com.db1.start.classe;

public class Executadora {
	public static void main(String[] args) {
		exibirCepFormatado(80540150);
		exibirCepFormatado(87083029);
		exibirCepFormatado(80540150);
		exibirDocFormatado("10616116985");
		
	}

	private static void exibirCepFormatado(Integer cepSemFormatacao) {
		Endereco endereco = new Endereco();
		endereco.setCep (cepSemFormatacao);
		System.out.println(endereco.getCepFormatado());
	}
	private static void exibirDocFormatado(String docSemFormatacao) {
		Emitente emitente = new Emitente();
		emitente.setDoc (docSemFormatacao);
		System.out.println(emitente.getDocumentoFormatado());
}
}