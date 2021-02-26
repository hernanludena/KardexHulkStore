package com.yesh.kardex.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Pago")
public class Payment implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	@Column(name = "Valor", nullable = false, updatable = false)
    private String amount;
	@Column(name = "Num_Tarjeta", nullable = false, updatable = false)
    private String numCard;
	
	

    public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getNumCard() {
		return numCard;
	}

	public void setNumCard(String numCard) {
		this.numCard = numCard;
	}

	@Override
    public String toString() {
        return "Compra{" +
                "id=" + id +
                ", valor='" + amount +
                ", tarjeta='" + numCard +
                '}';
    }
}
