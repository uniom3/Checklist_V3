package model.entities;

public class Grupo {

	private Integer codigo;
	private String grupo;
	private boolean ativo;
	private boolean alterarSenhaColaborador; 
	private boolean alterarDesenho;
	private boolean alterarUsuario;
	private boolean alterarClasse;
	private boolean alterarCliente;
	private boolean alterarColaborador;
	private boolean alterarRelatorio;
	private boolean alterarAdministrador;
	private boolean alterarDocumento;
	private boolean alterarRemessa;
	private boolean visualizarSenhaColaborador; 
	private boolean visualizarDesenho;
	private boolean visualizarUsuario;
	private boolean visualizarClasse;
	private boolean visualizarCliente;
	private boolean visualizarColaborador;
	private boolean visualizarRelatorio;
	private boolean visualizarAdministrador;
	private boolean visualizarDocumento;
	private boolean visualizarRemessa;
	
	public Grupo() {
		
	}

	public Grupo(Integer codigo, String grupo, boolean ativo, boolean alterarSenhaColaborador, boolean alterarDesenho,
			boolean alterarUsuario, boolean alterarClasse, boolean alterarCliente, boolean alterarColaborador,
			boolean alterarRelatorio, boolean alterarAdministrador, boolean alterarDocumento, boolean alterarRemessa,
			boolean visualizarSenhaColaborador, boolean visualizarDesenho, boolean visualizarUsuario,
			boolean visualizarClasse, boolean visualizarCliente, boolean visualizarColaborador,
			boolean visualizarRelatorio, boolean visualizarAdministrador, boolean visualizarDocumento,
			boolean visualizarRemessa) {
		this.codigo = codigo;
		this.grupo = grupo;
		this.ativo = ativo;
		this.alterarSenhaColaborador = alterarSenhaColaborador;
		this.alterarDesenho = alterarDesenho;
		this.alterarUsuario = alterarUsuario;
		this.alterarClasse = alterarClasse;
		this.alterarCliente = alterarCliente;
		this.alterarColaborador = alterarColaborador;
		this.alterarRelatorio = alterarRelatorio;
		this.alterarAdministrador = alterarAdministrador;
		this.alterarDocumento = alterarDocumento;
		this.alterarRemessa = alterarRemessa;
		this.visualizarSenhaColaborador = visualizarSenhaColaborador;
		this.visualizarDesenho = visualizarDesenho;
		this.visualizarUsuario = visualizarUsuario;
		this.visualizarClasse = visualizarClasse;
		this.visualizarCliente = visualizarCliente;
		this.visualizarColaborador = visualizarColaborador;
		this.visualizarRelatorio = visualizarRelatorio;
		this.visualizarAdministrador = visualizarAdministrador;
		this.visualizarDocumento = visualizarDocumento;
		this.visualizarRemessa = visualizarRemessa;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public boolean isAlterarSenhaColaborador() {
		return alterarSenhaColaborador;
	}

	public void setAlterarSenhaColaborador(boolean alterarSenhaColaborador) {
		this.alterarSenhaColaborador = alterarSenhaColaborador;
	}

	public boolean isAlterarDesenho() {
		return alterarDesenho;
	}

	public void setAlterarDesenho(boolean alterarDesenho) {
		this.alterarDesenho = alterarDesenho;
	}

	public boolean isAlterarUsuario() {
		return alterarUsuario;
	}

	public void setAlterarUsuario(boolean alterarUsuario) {
		this.alterarUsuario = alterarUsuario;
	}

	public boolean isAlterarClasse() {
		return alterarClasse;
	}

	public void setAlterarClasse(boolean alterarClasse) {
		this.alterarClasse = alterarClasse;
	}

	public boolean isAlterarCliente() {
		return alterarCliente;
	}

	public void setAlterarCliente(boolean alterarCliente) {
		this.alterarCliente = alterarCliente;
	}

	public boolean isAlterarColaborador() {
		return alterarColaborador;
	}

	public void setAlterarColaborador(boolean alterarColaborador) {
		this.alterarColaborador = alterarColaborador;
	}

	public boolean isAlterarRelatorio() {
		return alterarRelatorio;
	}

	public void setAlterarRelatorio(boolean alterarRelatorio) {
		this.alterarRelatorio = alterarRelatorio;
	}

	public boolean isAlterarAdministrador() {
		return alterarAdministrador;
	}

	public void setAlterarAdministrador(boolean alterarAdministrador) {
		this.alterarAdministrador = alterarAdministrador;
	}

	public boolean isAlterarDocumento() {
		return alterarDocumento;
	}

	public void setAlterarDocumento(boolean alterarDocumento) {
		this.alterarDocumento = alterarDocumento;
	}

	public boolean isAlterarRemessa() {
		return alterarRemessa;
	}

	public void setAlterarRemessa(boolean alterarRemessa) {
		this.alterarRemessa = alterarRemessa;
	}

	public boolean isVisualizarSenhaColaborador() {
		return visualizarSenhaColaborador;
	}

	public void setVisualizarSenhaColaborador(boolean visualizarSenhaColaborador) {
		this.visualizarSenhaColaborador = visualizarSenhaColaborador;
	}

	public boolean isVisualizarDesenho() {
		return visualizarDesenho;
	}

	public void setVisualizarDesenho(boolean visualizarDesenho) {
		this.visualizarDesenho = visualizarDesenho;
	}

	public boolean isVisualizarUsuario() {
		return visualizarUsuario;
	}

	public void setVisualizarUsuario(boolean visualizarUsuario) {
		this.visualizarUsuario = visualizarUsuario;
	}

	public boolean isVisualizarClasse() {
		return visualizarClasse;
	}

	public void setVisualizarClasse(boolean visualizarClasse) {
		this.visualizarClasse = visualizarClasse;
	}

	public boolean isVisualizarCliente() {
		return visualizarCliente;
	}

	public void setVisualizarCliente(boolean visualizarCliente) {
		this.visualizarCliente = visualizarCliente;
	}

	public boolean isVisualizarColaborador() {
		return visualizarColaborador;
	}

	public void setVisualizarColaborador(boolean visualizarColaborador) {
		this.visualizarColaborador = visualizarColaborador;
	}

	public boolean isVisualizarRelatorio() {
		return visualizarRelatorio;
	}

	public void setVisualizarRelatorio(boolean visualizarRelatorio) {
		this.visualizarRelatorio = visualizarRelatorio;
	}

	public boolean isVisualizarAdministrador() {
		return visualizarAdministrador;
	}

	public void setVisualizarAdministrador(boolean visualizarAdministrador) {
		this.visualizarAdministrador = visualizarAdministrador;
	}

	public boolean isVisualizarDocumento() {
		return visualizarDocumento;
	}

	public void setVisualizarDocumento(boolean visualizarDocumento) {
		this.visualizarDocumento = visualizarDocumento;
	}

	public boolean isVisualizarRemessa() {
		return visualizarRemessa;
	}

	public void setVisualizarRemessa(boolean visualizarRemessa) {
		this.visualizarRemessa = visualizarRemessa;
	}
	
	
	
	
	
}
