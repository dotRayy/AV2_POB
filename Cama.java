package av2_3pob;

public class Cama {
	
	private int id;
	private int codigoCama;
	private boolean ehBeliche;
	private String posicao;
	private String descricao;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCodigoCama() {
		return codigoCama;
	}
	public void setCodigoCama(int codigoCama) {
		this.codigoCama = codigoCama;
	}
	public boolean isEhBeliche() {
		return ehBeliche;
	}
	public void setEhBeliche(boolean ehBeliche) {
		this.ehBeliche = ehBeliche;
	}
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Cama(int id, int codigoCama, boolean ehBeliche, String posicao, String descricao) {
		super();
		this.id = id;
		this.codigoCama = codigoCama;
		this.ehBeliche = ehBeliche;
		this.posicao = posicao;
		this.descricao = descricao;
	}
	@Override
	public String toString() {
		return "Id=" + id + "\nCodigo de Cama=" + codigoCama + "\nÉ Beliche=" + ehBeliche + "\nPosição=" + posicao
				+ "\nDescrição=" + descricao;
	}
	
}
