package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.DB;
import db.DbException;
import db.DbIntegrityException;
import model.dao.ColaboradorDao;
import model.entities.Colaborador;

public class ColaboradorDaoJDBC implements ColaboradorDao {

	Connection conn = null;
	

	public ColaboradorDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public Colaborador findById(Integer id) {
		conn = DB.getConnection();
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement("SELECT * FROM tb_colaborador WHERE Id = ?");
			st.setInt(1, id);
			rs = st.executeQuery();
			if (rs.next()) {
				Colaborador obj = new Colaborador();
				obj.setId(rs.getInt("Id"));
				obj.setNome(rs.getString("Nome"));obj.setAtivo(rs.getBoolean("ativo"));
				obj.setUsuarioSistema(rs.getBoolean("usuarioSistema"));
				obj.setCpf(rs.getString("cpf"));
				obj.setNacionalidade(rs.getString("nacionalidade"));
				obj.setNaturalidade(rs.getString("naturalidade"));
				obj.setSexo(rs.getString("naturalidade"));
				obj.setDataNascimento(rs.getDate("dataNascimento"));
				obj.setEstadocivil(rs.getString("naturalidade"));
				obj.setRg(rs.getString("naturalidade"));
				obj.setDataemissao(rs.getDate("dataemissao"));
				obj.setTituloeleitor(rs.getString("naturalidade"));
				obj.setCid(rs.getString("naturalidade"));
				obj.setCnh(rs.getString("naturalidade"));
				obj.setCnpj(rs.getString("naturalidade"));
				obj.setRazaosocial(rs.getString("naturalidade"));
				obj.setCts(rs.getString("naturalidade"));
				obj.setSeriects(rs.getString("naturalidade"));
				obj.setEmissaocts(rs.getDate("emissaocts"));
				obj.setNis(rs.getString("naturalidade"));
				obj.setReservista(rs.getString("naturalidade"));
				obj.setCartasus(rs.getString("naturalidade"));
				obj.setEsposa(rs.getString("naturalidade"));
				obj.setDependente(rs.getString("naturalidade"));
				obj.setDependente2(rs.getString("naturalidade"));
				obj.setDependente3(rs.getString("naturalidade"));
				obj.setCargo(rs.getString("naturalidade"));
				obj.setSetor(rs.getString("naturalidade"));
				obj.setAdmissao(rs.getDate("admissao"));
				obj.setGrau(rs.getString("naturalidade"));
				obj.setCurso(rs.getString("naturalidade"));
				obj.setConclusao(rs.getString("naturalidade"));
				obj.setGrau1(rs.getString("naturalidade"));
				obj.setCurso1(rs.getString("naturalidade"));
				obj.setConclusao1(rs.getString("naturalidade"));
				obj.setAfastamento(rs.getDate("afastamento"));
				obj.setMotivoafastamento(rs.getString("naturalidade"));
				obj.setRetorno(rs.getDate("retorno"));
				obj.setVencimentocontrato(rs.getDate("vencimentocontrato"));
				obj.setProrrogacaocontrato(rs.getDate("prorrogacaocontrato"));
				obj.setFormapagamento(rs.getString("naturalidade"));
				obj.setDemissao(rs.getDate("demissao"));
				obj.setTipoconta(rs.getString("naturalidade"));
				obj.setBanco(rs.getString("naturalidade"));
				obj.setAgencia(rs.getString("naturalidade"));
				obj.setConta(rs.getString("naturalidade"));
				obj.setDigito(rs.getString("naturalidade"));
				obj.setTipoPessoa(rs.getString("naturalidade"));
				obj.setIncricaoEstadual(rs.getString("naturalidade"));
				obj.setInscricaoMunicipal(rs.getString("naturalidade"));
				obj.setOrgaoExpedidor(rs.getString("naturalidade"));
				obj.setEmail(rs.getString("naturalidade"));
				obj.setCelular1(rs.getString("naturalidade"));
				obj.setCelular2(rs.getString("naturalidade"));
				obj.setEndereco(rs.getString("naturalidade"));
				obj.setNumero(rs.getString("naturalidade"));
				obj.setComplemento(rs.getString("naturalidade"));
				obj.setBairro(rs.getString("naturalidade"));
				obj.setUf(rs.getString("naturalidade"));
				obj.setCidade(rs.getString("naturalidade"));
				obj.setCEP(rs.getString("naturalidade"));
				obj.setPais(rs.getString("naturalidade"));
				obj.setCnh(rs.getString("naturalidade"));
				obj.setOrgaoemissor(rs.getString("naturalidade"));
				return obj;
			}
			return null;
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
	}

	@Override
	public List<Colaborador> findAll() {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement("SELECT * FROM tb_colaborador ORDER BY Nome");
			rs = st.executeQuery();

			List<Colaborador> list = new ArrayList<>();

			while (rs.next()) {
				Colaborador obj = new Colaborador();
				obj.setId(rs.getInt("Id"));
				obj.setNome(rs.getString("Nome"));
				obj.setAtivo(rs.getBoolean("ativo"));
				obj.setUsuarioSistema(rs.getBoolean("usuarioSistema"));
				obj.setCpf(rs.getString("cpf"));
				obj.setNacionalidade(rs.getString("nacionalidade"));
				obj.setNaturalidade(rs.getString("naturalidade"));
				obj.setSexo(rs.getString("sexo"));
				obj.setDataNascimento(rs.getDate("dataNascimento"));
				obj.setEstadocivil(rs.getString("estadocivil"));
				obj.setRg(rs.getString("rg"));
				obj.setOrgaoemissor(rs.getString("orgaoemissor"));
				obj.setDataemissao(rs.getDate("dataemissao"));
				obj.setTituloeleitor(rs.getString("tituloeleitor"));
				obj.setCid(rs.getString("cid"));
				obj.setCnh(rs.getString("cnh"));
				obj.setCnpj(rs.getString("cnpj"));
				obj.setRazaosocial(rs.getString("razaosocial"));
				obj.setCts(rs.getString("cts"));
				obj.setSeriects(rs.getString("seriects"));
				obj.setEmissaocts(rs.getDate("emissaocts"));
				obj.setNis(rs.getString("nis"));
				obj.setReservista(rs.getString("reservista"));
				obj.setCartasus(rs.getString("cartasus"));
				obj.setEsposa(rs.getString("esposa"));
				obj.setDependente(rs.getString("dependente"));
				obj.setDependente2(rs.getString("dependente2"));
				obj.setDependente3(rs.getString("dependente3"));
				obj.setCargo(rs.getString("cargo"));
				obj.setSetor(rs.getString("setor"));
				obj.setAdmissao(rs.getDate("admissao"));
				obj.setGrau(rs.getString("grau"));
				obj.setCurso(rs.getString("curso"));
				obj.setConclusao(rs.getString("conclusao"));
				obj.setGrau1(rs.getString("grau1"));
				obj.setCurso1(rs.getString("curso1"));
				obj.setConclusao1(rs.getString("conclusao"));
				obj.setAfastamento(rs.getDate("afastamento"));
				obj.setMotivoafastamento(rs.getString("motivoafastamento"));
				obj.setRetorno(rs.getDate("retorno"));
				obj.setVencimentocontrato(rs.getDate("vencimentocontrato"));
				obj.setProrrogacaocontrato(rs.getDate("prorrogacaocontrato"));
				obj.setFormapagamento(rs.getString("formapagamento"));
				obj.setDemissao(rs.getDate("demissao"));
				obj.setTipoconta(rs.getString("tipoconta"));
				obj.setBanco(rs.getString("banco"));
				obj.setAgencia(rs.getString("agencia"));
				obj.setConta(rs.getString("conta"));
				obj.setDigito(rs.getString("digito"));
				obj.setTipoPessoa(rs.getString("tipoPessoa"));
				obj.setIncricaoEstadual(rs.getString("incricaoEstadual"));
				obj.setInscricaoMunicipal(rs.getString("inscricaoMunicipal"));
				obj.setOrgaoExpedidor(rs.getString("orgaoExpedidor"));
				obj.setEmail(rs.getString("email"));
				obj.setCelular1(rs.getString("celular1"));
				obj.setCelular2(rs.getString("celular2"));
				obj.setEndereco(rs.getString("endereco"));
				obj.setNumero(rs.getString("numero"));
				obj.setComplemento(rs.getString("complemento"));
				obj.setBairro(rs.getString("bairro"));
				obj.setUf(rs.getString("uf"));
				obj.setCidade(rs.getString("cidade"));
				obj.setCEP(rs.getString("CEP"));
				obj.setPais(rs.getString("pais"));
				list.add(obj);
			}
			return list;
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
	}

	@Override
	public void insert(Colaborador obj) {
		conn = DB.getConnection();
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement("INSERT INTO tb_colaborador " + "(nome)" + "(ativo)" + "(usuarioSistema)"
					+ "(cpf)" + "(nacionalidade)" + "(naturalidade)" + "(sexo)" + "(dataNascimento)" + "(estadocivil)"
					+ "(rg)" + "(orgaoemissor)" + "(dataemissao)" + "(tituloeleitor)" + "(cid)" + "(cnh)" + "(cnpj)"
					+ "(razaosocial)" + "(cts)" + "(seriects)" + "(emissaocts)" + "(nis)" + "(reservista)"
					+ "(cartasus)" + "(esposa)" + "(dependente)" + "(dependente2)" + "(dependente3)" + "(cargo)"
					+ "(setor)" + "(admissao)" + "(grau)" + "(curso)" + "(conclusao)" + "(grau)" + "(curso)"
					+ "(conclusao)" + "(afastamento )" + "(motivoafastamento)" + "(retorno)" + "(vencimentocontrato)"
					+ "(prorrogacaocontrato )" + "(formapagamento)" + "(demissao )" + "(tipoconta)" + "(banco)"
					+ "(agencia)" + "(conta)" + "(digito)" + "(tipoPessoa)" + "(incricaoEstadual)"
					+ "(inscricaoMunicipal)" + "(orgaoExpedidor  )" + "(email)" + "(celular1)" + "(celular2)"
					+ "(endereco)" + "(numero)" + "(complemento)" + "(bairro)" + "(uf)" + "(cidade)" + "(CEP)"
					+ "(pais)" +

					"VALUES " + "(?)" + "(?)" + "(?)" + "(?)" + "(?)" + "(?)" + "(?)" + "(?)" + "(?)" + "(?)" + "(?)"
					+ "(?)" + "(?)" + "(?)" + "(?)" + "(?)" + "(?)" + "(?)" + "(?)" + "(?)" + "(?)" + "(?)" + "(?)"
					+ "(?)" + "(?)" + "(?)" + "(?)" + "(?)" + "(?)" + "(?)" + "(?)" + "(?)" + "(?)" + "(?)" + "(?)"
					+ "(?)" + "(?)" + "(?)" + "(?)" + "(?)" + "(?)" + "(?)" + "(?)" + "(?)" + "(?)" + "(?)" + "(?)"
					+ "(?)" + "(?)" + "(?)" + "(?)" + "(?)" + "(?)" + "(?)" + "(?)" + "(?)" + "(?)" + "(?)" + "(?)"
					+ "(?)" + "(?)" + "(?)" + "(?)",

					Statement.RETURN_GENERATED_KEYS);

			st.setString(1, obj.getNome());

			int rowsAffected = st.executeUpdate();

			if (rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys();
				if (rs.next()) {
					int id = rs.getInt(1);
					obj.setId(id);
				}
			} else {
				throw new DbException("Unexpected error! No rows affected!");
			}
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(st);
		}
	}

	@Override
	public void update(Colaborador obj) {
		conn = DB.getConnection();
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement("UPDATE tb_colaborador " + "SET nome= ?" + "SET ativo= ?"
					+ "SET usuarioSistema= ?" + "SET cpf= ?" + "SET nacionalidade= ?" + "SET naturalidade= ?"
					+ "SET sexo= ?" + "SET dataNascimento= ?" + "SET estadocivil= ?" + "SET rg= ?"
					+ "SET dataemissao= ?" + "SET tituloeleitor= ?" + "SET cid= ?" + "SET cnh= ?" + "SET cnpj= ?"
					+ "SET razaosocial= ?" + "SET cts= ?" + "SET seriects= ?" + "SET emissaocts= ?" + "SET nis= ?"
					+ "SET reservista= ?" + "SET cartasus= ?" + "SET esposa= ?" + "SET dependente= ?"
					+ "SET dependente2= ?" + "SET dependente3= ?" + "SET cargo= ?" + "SET setor= ?" + "SET admissao= ?"
					+ "SET grau= ?" + "SET curso= ?" + "SET conclusao= ?" + "SET grau= ?" + "SET curso= ?"
					+ "SET conclusao= ?" + "SET afastamento= ?" + "SET motivoafastamento= ?" + "SET retorno= ?"
					+ "SET vencimentocontrato= ?" + "SET prorrogacaocontrato= ?" + "SET formapagamento= ?"
					+ "SET demissao= ?" + "SET tipoconta= ?" + "SET banco= ?" + "SET agencia= ?" + "SET conta= ?"
					+ "SET digito= ?" + "SET tipoPessoa= ?" + "SET incricaoEstadual= ?" + "SET inscricaoMunicipal= ?"
					+ "SET orgaoExpedidor = ?" + "SET email= ?" + "SET celular1= ?" + "SET celular2= ?"
					+ "SET endereco= ?" + "SET numero= ?" + "SET complemento= ?" + "SET bairro= ?" + "SET uf= ?"
					+ "SET cidade= ?" + "SET CEP= ?" + "SET pais= ? " + "SET orgaoemissor= ?" + "WHERE Id = ?");

			st.setString(1, obj.getNome());
			st.setBoolean(2, obj.getAtivo());
			st.setBoolean(3, obj.getUsuarioSistema());
			st.setString(4, obj.getCpf());
			st.setString(5, obj.getNacionalidade());
			st.setString(6, obj.getNaturalidade());
			st.setString(7, obj.getSexo());
			st.setDate(8, new java.sql.Date(obj.getDataNascimento().getTime()));
			st.setString(9, obj.getEstadocivil());
			st.setString(10, obj.getRg());
			st.setDate(11, new java.sql.Date(obj.getDataemissao().getTime()));
			st.setString(12, obj.getTituloeleitor());
			st.setString(13, obj.getCid());
			st.setString(14, obj.getCnh());
			st.setString(15, obj.getCnpj());
			st.setString(16, obj.getRazaosocial());
			st.setString(17, obj.getCts());
			st.setString(18, obj.getSeriects());
			st.setDate(19, new java.sql.Date(obj.getEmissaocts().getTime()));
			st.setString(20, obj.getNis());
			st.setString(21, obj.getReservista());
			st.setString(22, obj.getCartasus());
			st.setString(23, obj.getEsposa());
			st.setString(24, obj.getDependente());
			st.setString(25, obj.getDependente2());
			st.setString(26, obj.getDependente3());
			st.setString(27, obj.getCargo());
			st.setString(28, obj.getSetor());
			st.setDate(29, new java.sql.Date(obj.getAdmissao().getTime()));
			st.setString(30, obj.getGrau());
			st.setString(31, obj.getCurso());
			st.setString(32, obj.getConclusao());
			st.setString(33, obj.getGrau1());
			st.setString(34, obj.getCurso1());
			st.setString(35, obj.getConclusao1());
			st.setDate(36, new java.sql.Date(obj.getAfastamento().getTime()));
			st.setString(37, obj.getMotivoafastamento());
			st.setDate(38, new java.sql.Date(obj.getRetorno().getTime()));
			st.setDate(39, new java.sql.Date(obj.getVencimentocontrato().getTime()));
			st.setDate(40, new java.sql.Date(obj.getProrrogacaocontrato().getTime()));
			st.setString(41, obj.getFormapagamento());
			st.setDate(42, new java.sql.Date(obj.getDemissao().getTime()));
			st.setString(43, obj.getTipoconta());
			st.setString(44, obj.getBanco());
			st.setString(45, obj.getAgencia());
			st.setString(46, obj.getConta());
			st.setString(47, obj.getDigito());
			st.setString(48, obj.getTipoPessoa());
			st.setString(49, obj.getIncricaoEstadual());
			st.setString(50, obj.getInscricaoMunicipal());
			st.setString(51, obj.getOrgaoExpedidor());
			st.setString(52, obj.getEmail());
			st.setString(53, obj.getCelular1());
			st.setString(54, obj.getCelular2());
			st.setString(55, obj.getEndereco());
			st.setString(56, obj.getNumero());
			st.setString(57, obj.getComplemento());
			st.setString(58, obj.getBairro());
			st.setString(59, obj.getUf());
			st.setString(60, obj.getCidade());
			st.setString(61, obj.getCEP());
			st.setString(62, obj.getPais());
			st.setString(63, obj.getCnh());
			st.setString(64, obj.getOrgaoemissor());
			st.setInt(65, obj.getId());

			st.executeUpdate();
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(st);
		}
	}

	@Override
	public void deleteById(Integer id) {
		conn = DB.getConnection();
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement("DELETE FROM tb_colaborador WHERE Id = ?");

			st.setInt(1, id);

			st.executeUpdate();
		} catch (SQLException e) {
			throw new DbIntegrityException(e.getMessage());
		} finally {
			DB.closeStatement(st);
		}
	}

}
