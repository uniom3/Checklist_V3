package model.entities;

import java.util.Date;

public class Remessa {
	
	private Integer codigo;
	private String assunto;
	private Double os;
	private Date data;
	private String remessaCliente;
	private boolean a;
	private boolean b;
	private boolean c;
	private boolean d;
	private boolean e;
	private boolean f; 
	private boolean g;
	private boolean h;
	private boolean i;
	private boolean j;
	private boolean k;
	private boolean l;
	private boolean m;
	private Integer remessaDesenho;
	
	public Remessa() {
		
	}

	public Remessa(Integer codigo, String assunto, Double os, Date data, String remessaCliente, boolean a, boolean b,
			boolean c, boolean d, boolean e, boolean f, boolean g, boolean h, boolean i, boolean j, boolean k,
			boolean l, boolean m, Integer remessaDesenho) {
		this.codigo = codigo;
		this.assunto = assunto;
		this.os = os;
		this.data = data;
		this.remessaCliente = remessaCliente;
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
		this.g = g;
		this.h = h;
		this.i = i;
		this.j = j;
		this.k = k;
		this.l = l;
		this.m = m;
		this.remessaDesenho = remessaDesenho;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public Double getOs() {
		return os;
	}

	public void setOs(Double os) {
		this.os = os;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getRemessaCliente() {
		return remessaCliente;
	}

	public void setRemessaCliente(String remessaCliente) {
		this.remessaCliente = remessaCliente;
	}

	public boolean isA() {
		return a;
	}

	public void setA(boolean a) {
		this.a = a;
	}

	public boolean isB() {
		return b;
	}

	public void setB(boolean b) {
		this.b = b;
	}

	public boolean isC() {
		return c;
	}

	public void setC(boolean c) {
		this.c = c;
	}

	public boolean isD() {
		return d;
	}

	public void setD(boolean d) {
		this.d = d;
	}

	public boolean isE() {
		return e;
	}

	public void setE(boolean e) {
		this.e = e;
	}

	public boolean isF() {
		return f;
	}

	public void setF(boolean f) {
		this.f = f;
	}

	public boolean isG() {
		return g;
	}

	public void setG(boolean g) {
		this.g = g;
	}

	public boolean isH() {
		return h;
	}

	public void setH(boolean h) {
		this.h = h;
	}

	public boolean isI() {
		return i;
	}

	public void setI(boolean i) {
		this.i = i;
	}

	public boolean isJ() {
		return j;
	}

	public void setJ(boolean j) {
		this.j = j;
	}

	public boolean isK() {
		return k;
	}

	public void setK(boolean k) {
		this.k = k;
	}

	public boolean isL() {
		return l;
	}

	public void setL(boolean l) {
		this.l = l;
	}

	public boolean isM() {
		return m;
	}

	public void setM(boolean m) {
		this.m = m;
	}

	public Integer getRemessaDesenho() {
		return remessaDesenho;
	}

	public void setRemessaDesenho(Integer remessaDesenho) {
		this.remessaDesenho = remessaDesenho;
	}
	
	

}
