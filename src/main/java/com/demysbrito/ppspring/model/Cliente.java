/**os atributos desse modelo foram gerados automaticamente pelo site jsonschema2pojo.org. 
* Para isso, usamos o JSON de retorno da API do ViaCEP.
* 
* @see <a href="https://www.jsonschema2pojo.org/">jsonschema2pojo.org</a>
* @see <a href="https://viacep.com.br/">ViaCEP</a>
*/
package com.demysbrito.ppspring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	@ManyToOne
	private Endereco endereco;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	

}
