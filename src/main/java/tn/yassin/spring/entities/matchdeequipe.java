package tn.yassin.spring.entities;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class matchdeequipe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long idmatch;
	private Integer score;
	private String nomequipe1;
	private String nomequipe2;
	private String nomarbitre;
	private Timestamp date;
	public Long getIdmatch() {
		return idmatch;
	}
	public void setIdmatch(Long idmatch) {
		this.idmatch = idmatch;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public String getNomequipe1() {
		return nomequipe1;
	}
	public void setNomequipe1(String nomequipe1) {
		this.nomequipe1 = nomequipe1;
	}
	public String getNomequipe2() {
		return nomequipe2;
	}
	public void setNomequipe2(String nomequipe2) {
		this.nomequipe2 = nomequipe2;
	}
	public String getNomarbitre() {
		return nomarbitre;
	}
	public void setNomarbitre(String nomarbitre) {
		this.nomarbitre = nomarbitre;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	
	
	@Override
	public String toString() {
		return "matchdeequipe [idmatch=" + idmatch + ", score=" + score + ", nomequipe1=" + nomequipe1 + ", nomequipe2="
				+ nomequipe2 + ", nomarbitre=" + nomarbitre + ", date=" + date + "]";
	}
	
	
	public matchdeequipe(Long idmatch, Integer score, String nomequipe1, String nomequipe2, String nomarbitre,
			Timestamp date) {
		super();
		this.idmatch = idmatch;
		this.score = score;
		this.nomequipe1 = nomequipe1;
		this.nomequipe2 = nomequipe2;
		this.nomarbitre = nomarbitre;
		this.date = date;
	}
	
	
	public matchdeequipe() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
}
