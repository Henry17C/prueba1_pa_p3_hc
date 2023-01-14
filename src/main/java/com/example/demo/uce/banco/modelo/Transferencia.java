package com.example.demo.uce.banco.modelo;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="cuenta")
public class Transferencia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "trans_seq")
	@SequenceGenerator(name = "trans_seq", sequenceName = "trans_seq", allocationSize = 1)
	@Column(name= "trans_id")
	 private Integer id;
	
	@Column(name= "trans_fecha")
	 private LocalDateTime fecha;
	
	@Column(name= "trans_cuentaOrigen")
	 private  Cuenta cuentaOrigen;
	
	@Column(name= "trans_cuentaDestino")
	 private  Cuenta cuentaDestino;
	
	@Column(name= "trans_montoTrans")
	 private BigDecimal montoTrans;
	
	@Column(name= "trans_comision")
	 private BigDecimal comision;
	 
	 
	 

}
