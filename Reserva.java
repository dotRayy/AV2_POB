package av2_3pob;
import java.util.*;
import java.text.*;

public class Reserva {
	private int id;
	private int idQuarto;
	private int idCama;
	private int idCliente;
	private Date dataEntrada;
	private Date dataSaida;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdQuarto() {
		return idQuarto;
	}
	public void setIdQuarto(int idQuarto) {
		this.idQuarto = idQuarto;
	}
	public int getIdCama() {
		return idCama;
	}
	public void setIdCama(int idCama) {
		this.idCama = idCama;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public Date getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public Date getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}
	public Reserva(int id, int idQuarto, int idCama, int idCliente, Date dataEntrada, Date dataSaida) {
		super();
		this.id = id;
		this.idQuarto = idQuarto;
		this.idCama = idCama;
		this.idCliente = idCliente;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
	}
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return "Id=" + id + "\nidQuarto=" + idQuarto + "\nidCama=" + idCama + "\nidCliente=" + idCliente
				+ "\nData de Entrada=" + sdf.format(dataEntrada) + "\nData de Saida=" + sdf.format(dataSaida);
	}
	
}
