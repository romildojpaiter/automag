package br.com.automag.entity.usuarios;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import org.hibernate.annotations.Where;

import br.com.paiter.core.entity.BasePersistEntity;

@Data
@EqualsAndHashCode(of = { "id" }, callSuper = false)
@NoArgsConstructor
@Entity
@Where(clause = "removido = 'NAO'")
@SequenceGenerator(name = "nova_classe_seq", sequenceName = "nova_classe_seq", allocationSize = 1)
public class NovaClasse extends BasePersistEntity {

	@Id
	@GeneratedValue(generator = "nova_classe_seq", strategy = GenerationType.SEQUENCE)
	private Long id;

}