Aplication InformacionExtranjera 

package "co.gov.dian.muisca.informacionextranjera"

sufijoPkg "crs"

database 

CREATE TABLE IEX_ARCHIVOS_CRS_ANULADOS @TableDetail( nombreClase "ArchivoCrsAnulado")
(
	IDE_PERSONA_RUT NUMBER(10) NOT NULL,
	IDE_ARCHIVO NUMBER(10) NOT NULL,	
	NUM_ANIO NUMBER(4) NOT NULL,	
	IDE_DOCUMENTO_REPORTE NUMBER(18),	
	NUM_REPETICION_DOC_REPORTE NUMBER(4),	
	FEC_ANULACION NUMBER(8) NOT NULL,	
	COD_PAIS_RECEPTOR VARCHAR2(3) NOT NULL,	
	NUM_CUENTAS NUMBER(8) NOT NULL,	
	DES_MOTIVO VARCHAR2(512) NOT NULL,	
	IDE_USUARIO_CAMBIO NUMBER(10) NOT NULL,	
	FEC_CAMBIO TIMESTAMP NOT NULL,	
	NIV_ESCRITURA NUMBER(8,5) NOT NULL,
	NIV_LECTURA NUMBER(3,4) NOT NULL,
	IDE_UUID VARCHAR2(32) NOT NULL,
	CONSTRAINT ARAN_PK
	PRIMARY KEY (IDE_PERSONA_RUT,IDE_ARCHIVO,NUM_ANIO)
)
;