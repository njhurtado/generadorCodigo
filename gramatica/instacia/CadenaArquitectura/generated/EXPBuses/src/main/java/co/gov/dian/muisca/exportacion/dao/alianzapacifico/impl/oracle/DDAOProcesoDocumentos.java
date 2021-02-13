
/**
 * Republica de Colombia
 * Copyright (c) 2019 DirecciÃ³n de Impuestos y Aduanas Nacionales.
 * (DIAN - www.dian.gov.co).  Todos los Derechos reservados.
 *
 * $Header:$
 */
package  co.gov.dian.muisca.exportacion.dao.alianzapacifico.impl.oracle;

import java.util.*;
import co.gov.dian.muisca.exportacion.general.to.alianzapacifico.*;
import java.sql.*;
import java.util.*;
import co.gov.dian.muisca.arquitectura.general.excepcion.*;
import co.gov.dian.muisca.arquitectura.general.persistencia.dao.*;
import co.gov.dian.muisca.arquitectura.interfaces.*;
import co.gov.dian.muisca.arquitectura.interfaces.implgenerica.dataset.*;
import co.gov.dian.muisca.arquitectura.mensajes.*;
import co.gov.dian.muisca.exportacion.dao.alianzapacifico.IDDAOProcesoDocumentos;
import co.gov.dian.muisca.arquitectura.general.persistencia.dao.DDAO;


/**
 * <p>Titulo: Proyecto MUISCA</p>
 * <p>Descripcion: Objeto de acceso a datos para ProcesoDocumentos.</p>
 * <p>Copyright: Copyright (c) 2019</p>
 * <p>Company: DIAN</p>
 *
 * @author 
 * @version 
 * <pre>
 
 * </pre>
 */
 
 public class  DDAOProcesoDocumentos extends DDAO implements IDDAOProcesoDocumentos {
 
 /** colecciÃ³n de objetos DProcesoDocumentosTO */
	private Collection<DProcesoDocumentosTO> objetosProcesoDocumentos;
	/** Objeto de transporte de ProcesoDocumentos */
	private DProcesoDocumentosTO toProcesoDocumentos;
	/** Llave primaria de ProcesoDocumentos */
	private DProcesoDocumentosPKTO pkProcesoDocumentos;
	/** Atributos de ProcesoDocumentos */
	private DProcesoDocumentosAttTO attProcesoDocumentos;
	
	;
 
 /**
	 * Inicializa la consulta por llave primaria.
	 * @param pkProcesoDocumentos Llave primaria de ProcesoDocumentos
	 */
	public void inicializarConsultarPorPK(DProcesoDocumentosPKTO pkProcesoDocumentos) {
		setTipoOperacion(CONSULTAR_POR_PK);
		this.pkProcesoDocumentos = pkProcesoDocumentos;
	}

	/**
	 * Inicializa la creaciÃ³nn de ProcesoDocumentos.
	 * @param toProcesoDocumentos Objeto de Transporte de ProcesoDocumentos
	 */
	public void inicializarCrear(DProcesoDocumentosTO toProcesoDocumentos) {
		setTipoOperacion(CREAR);
		this.toProcesoDocumentos = toProcesoDocumentos;
		if (toProcesoDocumentos != null) {
			pkProcesoDocumentos = this.toProcesoDocumentos.getPK();
			attProcesoDocumentos = this.toProcesoDocumentos.getAtt();
		}
	}

	/**
	 * Inicializa la actualizaciÃ³n de ProcesoDocumentos.
	 * @param toProcesoDocumentos Objeto de Transporte de ProcesoDocumentos
	 */
	public void inicializarActualizar(DProcesoDocumentosTO toProcesoDocumentos) {
		setTipoOperacion(ACTUALIZAR);
		this.toProcesoDocumentos = toProcesoDocumentos;
		if (toProcesoDocumentos != null) {
			pkProcesoDocumentos = this.toProcesoDocumentos.getPK();
			attProcesoDocumentos = this.toProcesoDocumentos.getAtt();
		}
	}

	/**
	 * Inicializa la eliminaciÃ³n de ProcesoDocumentos.
	 * @param pkProcesoDocumentos Llave primaria de ProcesoDocumentos
	 */
	public void inicializarEliminar(DProcesoDocumentosPKTO pkProcesoDocumentos) {
		setTipoOperacion(ELIMINAR);
		this.pkProcesoDocumentos = pkProcesoDocumentos;
	}

	/**
	 * Inicializa la consulta genÃ©rica de ProcesoDocumentos.
	 * @param attProcesoDocumentos Atributos de ProcesoDocumentos
	 */
	public void inicializarConsultaGenerica(DProcesoDocumentosTO toProcesoDocumentos) {
		setTipoOperacion(CONSULTA_GENERICA);
		this.toProcesoDocumentos = toProcesoDocumentos;
		if (toProcesoDocumentos != null) {
			pkProcesoDocumentos = this.toProcesoDocumentos.getPK();
			attProcesoDocumentos = this.toProcesoDocumentos.getAtt();
		}
	}
	
	
 
 	/**
	 * Devuelve las sentencias sql a ejecutar, dependiendo del tipo de operaciÃ³n a realizar.
	 * @return Un Map de Strings con la relaciÃ³n de sentencias sql
	 */
	public Map<String, String> getSentenciasSQL() {
		Map<String, String> m = new HashMap<String, String>();
		StringBuffer sql = new StringBuffer();
		switch (getTipoOperacion()) {
			case CREAR:
				sql.append("insert into PROCESO_DOCUMENTOS")
					.append(" (IDE_TIPO_PROCESO,IDE_DOCUMENTO_PROCESADO,COD_ESTADO,VAL_LOG_ERROR,FEC_PRIMERA_EJECUCION,FEC_ULTIMA_EJECUCION,NUM_INTENTOS)")
					.append(" VALUES (:IDE_TIPO_PROCESO,:IDE_DOCUMENTO_PROCESADO,:COD_ESTADO,:VAL_LOG_ERROR,:FEC_PRIMERA_EJECUCION,:FEC_ULTIMA_EJECUCION,:NUM_INTENTOS)");
				m.put("sentencia1", sql.toString());
				break;
			case ACTUALIZAR:
				sql.append("update PROCESO_DOCUMENTOS")
					.append(" set COD_ESTADO=:COD_ESTADO,VAL_LOG_ERROR=:VAL_LOG_ERROR,FEC_PRIMERA_EJECUCION=:FEC_PRIMERA_EJECUCION,FEC_ULTIMA_EJECUCION=:FEC_ULTIMA_EJECUCION,NUM_INTENTOS=:NUM_INTENTOS")
					.append(" where IDE_TIPO_PROCESO=:IDE_TIPO_PROCESO,IDE_DOCUMENTO_PROCESADO=:IDE_DOCUMENTO_PROCESADO");
				m.put("sentencia1", sql.toString());
				break;
			case ELIMINAR:
				sql.append("delete from PROCESO_DOCUMENTOS")
					.append(" where IDE_TIPO_PROCESO=:IDE_TIPO_PROCESO,IDE_DOCUMENTO_PROCESADO=:IDE_DOCUMENTO_PROCESADO");
				m.put("sentencia1", sql.toString());
				break;
			case CONSULTAR_POR_PK:
				sql.append("select * from PROCESO_DOCUMENTOS")
					.append(" where IDE_TIPO_PROCESO=:IDE_TIPO_PROCESO,IDE_DOCUMENTO_PROCESADO=:IDE_DOCUMENTO_PROCESADO");
				m.put("sentencia1", sql.toString());
				break;
			case CONSULTA_GENERICA:
				sql.append("select * from PROCESO_DOCUMENTOS where ")
					.append(generarFiltroGenerico());
				m.put("sentencia1", sql.toString());
				break;
		    
		}
		return m;
	}


	/**
	 * obtenerConsultaGenerica
	 *
	 * @return StringBuffer
	 */
	private String generarFiltroGenerico() {
		StringBuffer condiciones = new StringBuffer();
		String y = " AND ";
		boolean append = false;

		if (pkProcesoDocumentos != null) {
			if (pkProcesoDocumentos.getIdeTipoProceso() != null) {
				if (append) {
					condiciones.append(y);
				}
				condiciones.append("IDE_TIPO_PROCESO=:IDE_TIPO_PROCESO");
				append = true;
			}			if (pkProcesoDocumentos.getIdeDocumentoProcesado() != null) {
				if (append) {
					condiciones.append(y);
				}
				condiciones.append("IDE_DOCUMENTO_PROCESADO=:IDE_DOCUMENTO_PROCESADO");
				append = true;
			}		}

		if (attProcesoDocumentos != null) {
			if (attProcesoDocumentos.getCodEstado() != null) {
				if (append) {
					condiciones.append(y);
				}
				condiciones.append("COD_ESTADO=:COD_ESTADO");
				append = true;
			}
			if (attProcesoDocumentos.getValLogError() != null) {
				if (append) {
					condiciones.append(y);
				}
				condiciones.append("VAL_LOG_ERROR=:VAL_LOG_ERROR");
				append = true;
			}
			if (attProcesoDocumentos.getFecPrimeraEjecucion() != null) {
				if (append) {
					condiciones.append(y);
				}
				condiciones.append("FEC_PRIMERA_EJECUCION=:FEC_PRIMERA_EJECUCION");
				append = true;
			}
			if (attProcesoDocumentos.getFecUltimaEjecucion() != null) {
				if (append) {
					condiciones.append(y);
				}
				condiciones.append("FEC_ULTIMA_EJECUCION=:FEC_ULTIMA_EJECUCION");
				append = true;
			}
			if (attProcesoDocumentos.getNumIntentos() != null) {
				if (append) {
					condiciones.append(y);
				}
				condiciones.append("NUM_INTENTOS=:NUM_INTENTOS");
				append = true;
			}
		}

		return condiciones.toString();
	}

	/**
	 * Asigna los valores no nulos de un objeto.
	 * @param unaSentencia Sentencia para asignaciÃ³n
	 * @throws SQLException Si ocurre un error al asignar los valores
	 */
	private void asignarValoresGenericos(DSentenciaSQL unaSentencia) throws SQLException {
		if (pkProcesoDocumentos != null) {
			if (pkProcesoDocumentos.getIdeTipoProceso() != null) {
				//unaSentencia.setBigInteger("IDE_TIPO_PROCESO", pkProcesoDocumentos.getIdeTipoProceso());				
				unaSentencia.setBigInteger("IDE_TIPO_PROCESO", pkProcesoDocumentos.getIdeTipoProceso());
			}			if (pkProcesoDocumentos.getIdeDocumentoProcesado() != null) {
				//unaSentencia.setBigInteger("IDE_DOCUMENTO_PROCESADO", pkProcesoDocumentos.getIdeDocumentoProcesado());				
				unaSentencia.setBigInteger("IDE_DOCUMENTO_PROCESADO", pkProcesoDocumentos.getIdeDocumentoProcesado());
			}		}

		if (attProcesoDocumentos != null) {
			if (attProcesoDocumentos.getCodEstado() != null) {							
				unaSentencia.setString("COD_ESTADO", attProcesoDocumentos.getCodEstado());
			}
			if (attProcesoDocumentos.getValLogError() != null) {							
				unaSentencia.setString("VAL_LOG_ERROR", attProcesoDocumentos.getValLogError());
			}
			if (attProcesoDocumentos.getFecPrimeraEjecucion() != null) {							
				unaSentencia.setTimestamp("FEC_PRIMERA_EJECUCION", attProcesoDocumentos.getFecPrimeraEjecucion());
			}
			if (attProcesoDocumentos.getFecUltimaEjecucion() != null) {							
				unaSentencia.setTimestamp("FEC_ULTIMA_EJECUCION", attProcesoDocumentos.getFecUltimaEjecucion());
			}
			if (attProcesoDocumentos.getNumIntentos() != null) {							
				unaSentencia.setBigInteger("NUM_INTENTOS", attProcesoDocumentos.getNumIntentos());
			}
											
		}		
	}

	/**
	 * Guarda los datos de ProcesoDocumentos.
	 * @return @return Un int con el nÃºmero de registros guardados
	 * @throws SQLException Si ocurre un error de base de datos al guardar
	 */
	public int guardar() throws SQLException {
		switch (getTipoOperacion()) {
			case CREAR:
				return crear();
			case ACTUALIZAR:
				return actualizar();
		}
		return -1;
	}

	/**
	 * Elimina registros de ProcesoDocumentos.
	 * @return Un int con el nÃºmero de registros eliminados
	 * @throws SQLException Si ocurre un error de base de datos al eliminar
	 */
	public int eliminar() throws SQLException {
		DSentenciaSQL sentencia = getSentenciaSQLPreparada("sentencia1");
		asignarValoresPK(sentencia);
		sentencia.ejecutar();
		return sentencia.getRegistrosAfectados();
	}

	/**
	 * Consulta los datos de ProcesoDocumentos.
	 * @return Un IDDataSet con la colecciÃ³n de registros encontrados
	 * @throws SQLException Si ocurre un error de base de datos al consultar
	 */
	public IDDataSet consultar() throws SQLException {
		switch (getTipoOperacion()) {
			case CONSULTAR_POR_PK:
				return consultarPorPK();
			case CONSULTA_GENERICA:
				return consultaGenerica();
			
		}
		return null;
	}

	/**
	 * Crea un registro de ProcesoDocumentos.
	 * @return Un int con el nÃºmero de registros creados
	 * @throws SQLException Si ocurre un error de base de datos al crear
	 */
	private int crear() throws SQLException {
		DSentenciaSQL sentencia = getSentenciaSQLPreparada("sentencia1");
		asignarValoresObjeto(sentencia);
		asignarValoresPK(sentencia);
		sentencia.ejecutar();
		int resultado = sentencia.getRegistrosAfectados();
		if (resultado <= 0) {
			throw new SQLException("No se ha creado ningÃºn registro");
		}
		if (resultado > 1) {
			throw new SQLException("Se intentÃ³ crear mÃ¡s de un registro");
		}
		return resultado;
	}

	/**
	 * Actualiza los datos de ProcesoDocumentos.
	 * @return Un int con el nÃºmero de registros actualizados
	 * @throws SQLException Si ocurre un error de base de datos al actualizar
	 */
	private int actualizar() throws SQLException {
		DSentenciaSQL sentencia = getSentenciaSQLPreparada("sentencia1");
		asignarValoresObjeto(sentencia);
		asignarValoresPK(sentencia);
		sentencia.ejecutar();
		int resultado = sentencia.getRegistrosAfectados();
		if (resultado <= 0) {
			throw new SQLException("No se ha actualizado ningÃºn registro");
		}
		if (resultado > 1) {
			throw new SQLException("Se intentÃ³ actualizar mÃ¡s de un registro");
		}
		return resultado;
	}

	/**
	 * Actualiza los datos de ProcesoDocumentos.
	 * @return Un IDDataSet con la colecciÃ³n de registros encontrados
	 * @throws SQLException Si ocurre un error de base de datos al consultar
	 */
	private IDDataSet consultarPorPK() throws SQLException {
		DSentenciaSQL sentencia = getSentenciaSQLPreparada("sentencia1");
		asignarValoresPK(sentencia);
		sentencia.ejecutar();
		DDataSet resultado = sentencia.getDataSet();
		cargarProcesoDocumentos(resultado);
		return resultado;
	}

	/**
	 * Consulta genÃ©rica de los datos de ProcesoDocumentos.
	 * @return Un IDDataSet con la colecciÃ³n de registros encontrados
	 * @throws SQLException Si ocurre un error de base de datos al consultar
	 */
	private IDDataSet consultaGenerica() throws SQLException {
		DSentenciaSQL sentencia = getSentenciaSQLPreparada("sentencia1");
		asignarValoresGenericos(sentencia);
		sentencia.ejecutar();
		DDataSet resultado = sentencia.getDataSet();
		cargarObjetosProcesoDocumentos(resultado);
		return resultado;
	}



	/**
	 * Asigna los valores para pk en una sentencia SQL.
	 * @param unaSentencia Sentencia para asignaciÃ³n
	 * @throws SQLException Si ocurre un error al asignar los valores
	 */
	private void asignarValoresPK(DSentenciaSQL unaSentencia) throws SQLException {
		//unaSentencia.setBigInteger("IDE_TIPO_PROCESO", pkProcesoDocumentos.getIdeTipoProceso());	
				unaSentencia.setBigInteger("IDE_TIPO_PROCESO", pkProcesoDocumentos.getIdeTipoProceso());
		
		//unaSentencia.setBigInteger("IDE_DOCUMENTO_PROCESADO", pkProcesoDocumentos.getIdeDocumentoProcesado());	
				unaSentencia.setBigInteger("IDE_DOCUMENTO_PROCESADO", pkProcesoDocumentos.getIdeDocumentoProcesado());
		
		
	}

	/**
	 * Asigna todos los valores de un objeto.
	 * @param unaSentencia Sentencia para asignaciÃ³n
	 * @throws SQLException Si ocurre un error al asignar los valores
	 */
	private void asignarValoresObjeto(DSentenciaSQL unaSentencia) throws SQLException {
		unaSentencia.setString("COD_ESTADO", attProcesoDocumentos.getCodEstado());
		unaSentencia.setString("VAL_LOG_ERROR", attProcesoDocumentos.getValLogError());
		unaSentencia.setTimestamp("FEC_PRIMERA_EJECUCION", attProcesoDocumentos.getFecPrimeraEjecucion());
		unaSentencia.setTimestamp("FEC_ULTIMA_EJECUCION", attProcesoDocumentos.getFecUltimaEjecucion());
		unaSentencia.setBigInteger("NUM_INTENTOS", attProcesoDocumentos.getNumIntentos());
	}

	/**
	 * Construye un objeto ProcesoDocumentos con base en el data set.
	 * @param resultado Contenedor de los datos
	 * @throws SQLException Si ocurre un error de base de datos al cargar el objeto
	 */
	private void cargarProcesoDocumentos(IDDataSet resultado) throws SQLException {
		if (resultado.getNumeroFilas() == 0) {
			return;
		}
		resultado.primero();
		toProcesoDocumentos = completarProcesoDocumentos(resultado);
	}

	/**
	 * Construye objetos ProcesoDocumentos con base en el data set.
	 * @param resultado Contenedor de los datos
	 * @throws SQLException Si ocurre un error de base de datos al cargar los objetos
	 */
	private void cargarObjetosProcesoDocumentos(IDDataSet resultado) throws SQLException {
		objetosProcesoDocumentos = new ArrayList<DProcesoDocumentosTO>();
		toProcesoDocumentos = null;
		if (resultado.getNumeroFilas() == 0) {
			return;
		}
		resultado.primero();
		do {
			DProcesoDocumentosTO objeto = completarProcesoDocumentos(resultado);
			objetosProcesoDocumentos.add(objeto);
		} while (resultado.siguiente());
		resultado.primero();
	}

	/**
	 * Construye un objeto ProcesoDocumentos con base en el data set.
	 * El data set debe contener datos en la posiciÃ³n actual.
	 * @param resultado Contenedor de los datos
	 * @return Un ProcesoDocumentos
	 * @throws SQLException Si ocurre un error de base de datos al cargar el objeto
	 */
	private DProcesoDocumentosTO completarProcesoDocumentos(IDDataSet resultado) throws SQLException {
		// Conformar el objeto PK
		DProcesoDocumentosPKTO pk = new DProcesoDocumentosPKTO();
		//java.lang.Integer
		//pk.setIdeTipoProceso(getBigInteger(resultado.getLongWrapper("IDE_TIPO_PROCESO")));	
		//java.math.BigInteger
		pk.setIdeTipoProceso(getBigInteger(resultado.getLongWrapper("IDE_TIPO_PROCESO")));
				
		//java.lang.Integer
		//pk.setIdeDocumentoProcesado(getBigInteger(resultado.getLongWrapper("IDE_DOCUMENTO_PROCESADO")));	
		//java.math.BigInteger
		pk.setIdeDocumentoProcesado(getBigInteger(resultado.getLongWrapper("IDE_DOCUMENTO_PROCESADO")));
				
					
		// Conformar el objeto Att
		DProcesoDocumentosAttTO att = new DProcesoDocumentosAttTO();
		//java.lang.String
		att.setCodEstado(resultado.getString("COD_ESTADO"));
		//java.lang.String
		att.setValLogError(resultado.getString("VAL_LOG_ERROR"));
		//java.sql.Timestamp
		att.setFecPrimeraEjecucion((Timestamp)resultado.getDate("FEC_PRIMERA_EJECUCION"));
		//java.sql.Timestamp
		att.setFecUltimaEjecucion((Timestamp)resultado.getDate("FEC_ULTIMA_EJECUCION"));
		//java.math.BigInteger
		att.setNumIntentos(getBigInteger(resultado.getLongWrapper("NUM_INTENTOS")));
				
		// Conformar el TO
		DProcesoDocumentosTO to = new DProcesoDocumentosTO();
		to.setPK(pk);
		to.setAtt(att);
		return to;
	}

	/**
	 * Devuelve el objeto ProcesoDocumentos que se haya consultado.
	 * @return Un objeto DProcesoDocumentosTO
	 */
	public DProcesoDocumentosTO getProcesoDocumentos() {
		return toProcesoDocumentos;
	}

	/**
	 * Devuelve la colecciÃ³n de objetos ProcesoDocumentos que se hayan consultado.
	 * @return Un Collection con objetos DProcesoDocumentosTO
	 */
	public Collection<DProcesoDocumentosTO> getColeccionProcesoDocumentos() {
		return objetosProcesoDocumentos;
	}

	/**
	 * Indica si el DAO es de ejecuciÃ³n libre.
	 * @return true si es de ejecuciÃ³n libre; false de lo contrario
	 */
	public boolean isEjecucionLibre() {
		return false;
	}

	/**
	 * MÃ©todo para validar los parÃ¡metros inicializados, invocado por el administrador de persistencia.
	 * @return true si los parÃ¡metros son vÃ¡lidos; false de lo contrario
	 * @throws DValidarExcepcion Si los parÃ¡metros no son vÃ¡lidos
	 * @todo COMPLEMENTAR
	 */
	public boolean validar() throws DValidarExcepcion {
		DManipuladorMensaje manipulador;
		String operacion = null;
		Map<String, Object> parametros=new HashMap<String, Object>();
		switch (getTipoOperacion()) {
			case CREAR: operacion = "la creaciÃ³n"; break;
			case ACTUALIZAR: operacion = "la actualizaciÃ³n"; break;
			case ELIMINAR: operacion = "la eliminaciÃ³n"; break;
			case CONSULTAR_POR_PK: operacion = "la consulta"; break;
			case CONSULTA_GENERICA: operacion = "la consulta"; break;
		}

		if (operacion == null) {
			manipulador = new DManipuladorMensaje(IDArqMensajes.ME_OPER_INVALIDA);
			String mensaje = manipulador.getMensaje();
			throw new DValidarExcepcion(mensaje, mensaje);
		}

		if (tipoOperacion == CREAR || tipoOperacion == ACTUALIZAR) {
			parametros.put(this.getClass().getName()+":validar:toProcesoDocumentos",toProcesoDocumentos);
			parametros.put(this.getClass().getName()+":validar:pkProcesoDocumentos",pkProcesoDocumentos);
			parametros.put(this.getClass().getName()+":validar:attProcesoDocumentos",attProcesoDocumentos);
			
			parametros.put(this.getClass().getName()+":validar:pkProcesoDocumentos.getIdeTipoProceso()",pkProcesoDocumentos.getIdeTipoProceso());
			parametros.put(this.getClass().getName()+":validar:pkProcesoDocumentos.getIdeDocumentoProcesado()",pkProcesoDocumentos.getIdeDocumentoProcesado());
			parametros.put(this.getClass().getName()+":validar:attProcesoDocumentos.getCodEstado()",attProcesoDocumentos.getCodEstado());
			parametros.put(this.getClass().getName()+":validar:attProcesoDocumentos.getValLogError()",attProcesoDocumentos.getValLogError());
			parametros.put(this.getClass().getName()+":validar:attProcesoDocumentos.getFecPrimeraEjecucion()",attProcesoDocumentos.getFecPrimeraEjecucion());
			parametros.put(this.getClass().getName()+":validar:attProcesoDocumentos.getFecUltimaEjecucion()",attProcesoDocumentos.getFecUltimaEjecucion());
			parametros.put(this.getClass().getName()+":validar:attProcesoDocumentos.getNumIntentos()",attProcesoDocumentos.getNumIntentos());
			
		}

		if (tipoOperacion == CONSULTAR_POR_PK || tipoOperacion == ELIMINAR) {
			parametros.put(this.getClass().getName()+":validar:pkProcesoDocumentos",pkProcesoDocumentos);
			parametros.put(this.getClass().getName()+":validar:pkProcesoDocumentos.getIdeTipoProceso()",pkProcesoDocumentos.getIdeTipoProceso());
			parametros.put(this.getClass().getName()+":validar:pkProcesoDocumentos.getIdeDocumentoProcesado()",pkProcesoDocumentos.getIdeDocumentoProcesado());
		}

		if (tipoOperacion == CONSULTA_GENERICA) {
			parametros.put(this.getClass().getName()+":validar:toProcesoDocumentos",toProcesoDocumentos);
		}

		
		
		validarParametros(operacion,parametros);
		return true;
	}
	
	private java.math.BigInteger getBigInteger(Object value) {
		
		if(value!=null ) {
			return new java.math.BigInteger(value.toString());
		}
		
		return null;		
		
	}
}
 
 
