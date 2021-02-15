package project.configura.entites;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entidad Configuracion que representa un registro de la tabla TP_CONFIGURACION
 * 
 * @author ayesa
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TB_CONFIGURA_PARAMETROS")
public class Configuracion implements Serializable {

	/** SerialVersionUID */
	private static final long serialVersionUID = -8128441780561748012L;

	/** Denominación de la secuencia que generará los identificadores */
	private static final String SEQUENCE_ID = "TB_CONFIGURA_PARAMETROS_SEQ";

	/** Identificador autogenerado del registro */
	@Id
	@SequenceGenerator(name = SEQUENCE_ID, sequenceName = SEQUENCE_ID, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQUENCE_ID)
	@Column(name = "ID")
	private Long id;

	/**
	 * Nombre.
	 */
	@NotNull
	@NotBlank
	@Column(name = "NOMBRE", nullable = false, length = 255)
	private String nombre;

	/**
	 * Valor.
	 */
	@Column(name = "VALOR", length = 4000)
	private String valor;

	/**
	 * Descripcion.
	 */
	@Column(name = "DESCRIPCION", length =255)
	private String descripcion;

}
