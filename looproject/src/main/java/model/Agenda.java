package model;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "agenda")
public class Agenda {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "contatos")
	private ArrayList<Contato> contatos;

	public Agenda() {
		contatos = new ArrayList<Contato>();
	}

	public ArrayList<Contato> getContatos() {
		return contatos;
	}

	public void addContatos(Contato contato) {
		this.contatos.add(contato);
	}
}					